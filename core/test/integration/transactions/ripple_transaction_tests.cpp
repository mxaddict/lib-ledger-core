/*
 *
 * ripple_transaction_tests
 *
 * Created by El Khalil Bellakrid on 14/07/2018.
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Ledger
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

#include "../BaseFixture.h"
#include "../../fixtures/xrp_fixtures.h"
#include <api/KeychainEngines.hpp>
#include "transaction_test_helper.h"
#include <utils/hex.h>
#include <utils/DateUtils.hpp>
#include <wallet/ripple/database/RippleLikeAccountDatabaseHelper.h>
#include <wallet/ripple/api_impl/RippleLikeTransactionApi.h>
#include <wallet/currencies.hpp>
#include <iostream>
using namespace std;

struct RippleMakeTransaction : public RippleMakeBaseTransaction {
    void SetUpConfig() override {
        auto configuration = DynamicObject::newInstance();
        testData.configuration = configuration;
        testData.walletName = "my_wallet";
        testData.currencyName = "ripple";
        testData.inflate_xrp = ledger::testing::xrp::inflate;
    }
};

TEST_F(RippleMakeTransaction, CreateTx) {
    auto builder = tx_builder();

    auto receiver = make_receiver([=](const std::shared_ptr<api::Event> &event) {
        fmt::print("Received event {}\n", api::to_string(event->getCode()));
        if (event->getCode() == api::EventCode::SYNCHRONIZATION_STARTED)
            return;
        EXPECT_NE(event->getCode(), api::EventCode::SYNCHRONIZATION_FAILED);
        EXPECT_EQ(event->getCode(),
                  api::EventCode::SYNCHRONIZATION_SUCCEED);

        auto balance = wait(account->getBalance());
        std::cout << "Balance: " << balance->toString() << std::endl;
        auto txBuilder = std::dynamic_pointer_cast<RippleLikeTransactionBuilder>(account->buildTransaction());
        dispatcher->stop();
    });

    account->synchronize()->subscribe(dispatcher->getMainExecutionContext(), receiver);

    dispatcher->waitUntilStopped();

    auto balance = wait(account->getBalance());
    auto fromDate = "2018-01-01T13:38:23Z";
    auto toDate = DateUtils::toJSON(DateUtils::now());
    auto balanceHistory = wait(account->getBalanceHistory(fromDate, toDate, api::TimePeriod::MONTH));

    EXPECT_EQ(balanceHistory[balanceHistory.size() - 1]->toLong(), balance->toLong());

    builder->setFees(api::Amount::fromLong(currency, 10));
    builder->sendToAddress(api::Amount::fromLong(currency, 220000), "rMspb4Kxa3EwdF4uN5TMqhHfsAkBit6w7k");
    auto f = builder->build();
    auto tx = ::wait(f);
    auto serializedTx = tx->serialize();
    auto parsedTx = RippleLikeTransactionBuilder::parseRawUnsignedTransaction(wallet->getCurrency(), serializedTx);
    auto serializedParsedTx = parsedTx->serialize();
    EXPECT_EQ(serializedTx, serializedParsedTx);

    auto date = "2000-03-27T09:10:22Z";
    auto formatedDate = DateUtils::fromJSON(date);

    //Delete account
    auto code = wait(wallet->eraseDataSince(formatedDate));
    EXPECT_EQ(code, api::ErrorCode::FUTURE_WAS_SUCCESSFULL);

    //Check if account was successfully deleted
    auto newAccountCount = wait(wallet->getAccountCount());
    EXPECT_EQ(newAccountCount, 0);
    {
        soci::session sql(pool->getDatabaseSessionPool()->getPool());
        RippleLikeAccountDatabaseEntry entry;
        auto result = RippleLikeAccountDatabaseHelper::queryAccount(sql, account->getAccountUid(), entry);
        EXPECT_EQ(result, false);
    }

    //Delete wallet
    auto walletCode = wait(pool->eraseDataSince(formatedDate));
    EXPECT_EQ(walletCode, api::ErrorCode::FUTURE_WAS_SUCCESSFULL);

    //Check if wallet was successfully deleted
    auto walletCount = wait(pool->getWalletCount());
    EXPECT_EQ(walletCount, 0);

}

TEST_F(RippleMakeTransaction, ParseSignedRawTransaction) {
    // round-trip
    //Tx hash AF4BB95DE86A640B90B2AF3C696EF26EFE7DD71864CC959D8030B448DD48E756
    auto strTx = "12000022800000002400000001201b02a2618f6140000000014fb18068400000000000000a73210215a9ee08a4b4747e27f348365f93beb5897fa7e8776bedae2cb56917dcdbbf2f74473045022100f2ab61ec941462d692514bfddb00bc0d31ba7da66981193e67a04e90578c18b1022064a2375ecb5a68c22ee3038b783be6a9e1f2c882a8e8bbee43c4cfa93b536926811420237754a1727016188a1b7e52f2060f94339d128314dbc4ad4f38b60fa5624d0ddeddac209babbaa9d7";
    auto txBytes = hex::toByteArray(strTx);
    auto tx = api::RippleLikeTransactionBuilder::parseRawSignedTransaction(ledger::core::currencies::RIPPLE, txBytes);

    EXPECT_EQ(hex::toString(tx->serialize()), strTx);

    // ensure the values are correct
    EXPECT_EQ(tx->getLedgerSequence()->intValue(), 44196239);
    EXPECT_EQ(tx->getSequence()->intValue(), 1);
    EXPECT_EQ(tx->getHash(), "af4bb95de86a640b90b2af3c696ef26efe7dd71864cc959d8030b448dd48e756");
    EXPECT_EQ(tx->getSender()->toBase58(), "rsvAf4P8Tx6tBUdWPNesMngXDmbZ2LMVF8");
    EXPECT_EQ(tx->getReceiver()->toBase58(), "rMspb4Kxa3EwdF4uN5TMqhHfsAkBit6w7k");
    EXPECT_EQ(tx->getValue()->toLong(), 22000000L);
    EXPECT_EQ(tx->getFees()->toLong(), 10L);
}

TEST_F(RippleMakeTransaction, ParseSignedRawTransactionWithMemo) {
    // round-trip
    // TX hash BB7B32E859BFA9B9620D62CD89057FD0E0E396416799FCFE71AEB9201372A130
    auto strTx = "12000022800000002400000002201b02a096316140000000000186a068400000000000000c732102ed9b4f4e73ea076b90b62ebd4863e71edaf255df611d8268c32fef525a6aa72e74463044022074e53eb13b15cc9b876bbb752913a4aab6dfdb330e83110a54eb2f7eb128f51202205ccf6885a77b2c5af6d5132c1417338447226fce1509e223dfdad613f42748d581140d53c4229ab611e29d3207e87b8a5851b63487978314550fc62003e785dc231a1058a05e56e3f09cf4e6f9ea7c06636c69656e747d08726d2d312e322e34e1f1";
    auto txBytes = hex::toByteArray(strTx);
    auto tx = api::RippleLikeTransactionBuilder::parseRawSignedTransaction(ledger::core::currencies::RIPPLE, txBytes);

    EXPECT_EQ(hex::toString(tx->serialize()), strTx);

    // ensure the values are correct
    EXPECT_EQ(tx->getLedgerSequence()->intValue(), 44078641);
    EXPECT_EQ(tx->getSequence()->intValue(), 2);
    EXPECT_EQ(tx->getHash(), "bb7b32e859bfa9b9620d62cd89057fd0e0e396416799fcfe71aeb9201372a130");
    EXPECT_EQ(tx->getSender()->toBase58(), "rpD73CkdVDYNbpm6r7Cn2ug2C8ZqNVZeeG");
    EXPECT_EQ(tx->getReceiver()->toBase58(), "r3kmLJN5D28dHuH8vZNUZpMC43pEHpaocV");
    EXPECT_EQ(tx->getValue()->toLong(), 100000L);
    EXPECT_EQ(tx->getFees()->toLong(), 12L);

    auto memos = tx->getMemos();
    EXPECT_EQ(memos.size(), 1);

    auto memo = memos[0];

    EXPECT_EQ(memo.data, "rm-1.2.4");
    EXPECT_EQ(memo.ty,  "client");
}
