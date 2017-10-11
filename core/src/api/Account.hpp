// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#ifndef DJINNI_GENERATED_ACCOUNT_HPP
#define DJINNI_GENERATED_ACCOUNT_HPP

#include <cstdint>
#include <memory>
#include <string>
#include <vector>

namespace ledger { namespace core { namespace api {

class Amount;
class AmountCallback;
class EventBus;
class Logger;
class OperationQuery;
class Preferences;
class StringListCallback;
enum class WalletType;

class Account {
public:
    virtual ~Account() {}

    /**
     * Key of the synchronization duration time in the synchronize event payload.
     * The value is stored in a int 64 time expressed in miliseconds.
     */
    static std::string const EV_SYNC_DURATION_MS;

    /** Key of the synchronization error code. The code is a stringified version of the value in the ErrorCode enum. */
    static std::string const EV_SYNC_ERROR_CODE;

    /** Key of the synchronization error message. The message is stored as a string. */
    static std::string const EV_SYNC_ERROR_MESSAGE;

    static std::string const EV_NEW_BLOCK_CURRENCY_NAME;

    static std::string const EV_NEW_BLOCK_HASH;

    static std::string const EV_NEW_BLOCK_HEIGHT;

    static std::string const EV_NEW_OP_WALLET_NAME;

    static std::string const EV_NEW_OP_ACCOUNT_INDEX;

    static std::string const EV_NEW_OP_UID;

    virtual int32_t getIndex() = 0;

    virtual std::shared_ptr<OperationQuery> queryOperations() = 0;

    virtual void getBalance(const std::shared_ptr<AmountCallback> & callback) = 0;

    virtual bool isSynchronizing() = 0;

    virtual std::shared_ptr<EventBus> synchronize() = 0;

    virtual std::shared_ptr<Preferences> getPreferences() = 0;

    virtual std::shared_ptr<Logger> getLogger() = 0;

    virtual std::shared_ptr<Preferences> getOperationPreferences(const std::string & uid) = 0;

    /**
     * asBitcoinLikeAccount(): Callback<BitcoinLikeAccount>;
     * asEthereumLikeAccount(): Callback<EthereumLikeAccount>;
     * asRippleLikeAccount(): Callback<RippleLikeAccount>;
     */
    virtual bool isInstanceOfBitcoinLikeAccount() = 0;

    virtual bool isInstanceOfEthereumLikeAccount() = 0;

    virtual bool isInstanceOfRippleLikeAccount() = 0;

    virtual void getFreshPublicAddresses(const std::shared_ptr<StringListCallback> & callback) = 0;

    virtual WalletType getWalletType() = 0;

    virtual std::shared_ptr<EventBus> getEventBus() = 0;

    virtual void startBlockchainObservation() = 0;

    virtual void stopBlockchainObservation() = 0;

    virtual bool isObservingBlockchain() = 0;

    virtual void computeFees(const std::shared_ptr<Amount> & amount, int32_t priority, const std::vector<std::string> & recipients, const std::vector<std::vector<uint8_t>> & data, const std::shared_ptr<AmountCallback> & callback) = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_ACCOUNT_HPP
