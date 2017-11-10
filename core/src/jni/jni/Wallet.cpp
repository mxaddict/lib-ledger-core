// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#include "Wallet.hpp"  // my header
#include "AccountCallback.hpp"
#include "AccountCreationInfo.hpp"
#include "AccountCreationInfoCallback.hpp"
#include "AccountListCallback.hpp"
#include "BitcoinLikeWallet.hpp"
#include "BlockCallback.hpp"
#include "Currency.hpp"
#include "EventBus.hpp"
#include "ExtendedKeyAccountCreationInfo.hpp"
#include "ExtendedKeyAccountCreationInfoCallback.hpp"
#include "I32Callback.hpp"
#include "Logger.hpp"
#include "Marshal.hpp"
#include "Preferences.hpp"
#include "WalletType.hpp"

namespace djinni_generated {

Wallet::Wallet() : ::djinni::JniInterface<::ledger::core::api::Wallet, Wallet>("co/ledger/core/Wallet$CppProxy") {}

Wallet::~Wallet() = default;


CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_nativeDestroy(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        delete reinterpret_cast<::djinni::CppProxyHandle<::ledger::core::api::Wallet>*>(nativeRef);
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jstring JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getName(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getName\n");
        auto r = ref->getName();
        return ::djinni::release(::djinni::String::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getAccount(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jint j_index, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getAccount\n");
        ref->getAccount(::djinni::I32::toCpp(jniEnv, j_index),
                        ::djinni_generated::AccountCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getAccountCount(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getAccountCount\n");
        ref->getAccountCount(::djinni_generated::I32Callback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getAccounts(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jint j_offset, jint j_count, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getAccounts\n");
        ref->getAccounts(::djinni::I32::toCpp(jniEnv, j_offset),
                         ::djinni::I32::toCpp(jniEnv, j_count),
                         ::djinni_generated::AccountListCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getNextAccountIndex(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getNextAccountIndex\n");
        ref->getNextAccountIndex(::djinni_generated::I32Callback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getEventBus(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getEventBus\n");
        auto r = ref->getEventBus();
        return ::djinni::release(::djinni_generated::EventBus::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1isSynchronizing(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::isSynchronizing\n");
        auto r = ref->isSynchronizing();
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1synchronize(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::synchronize\n");
        auto r = ref->synchronize();
        return ::djinni::release(::djinni_generated::EventBus::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getPreferences(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getPreferences\n");
        auto r = ref->getPreferences();
        return ::djinni::release(::djinni_generated::Preferences::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getLogger(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getLogger\n");
        auto r = ref->getLogger();
        return ::djinni::release(::djinni_generated::Logger::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getAccountPreferences(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jint j_index)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getAccountPreferences\n");
        auto r = ref->getAccountPreferences(::djinni::I32::toCpp(jniEnv, j_index));
        return ::djinni::release(::djinni_generated::Preferences::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1asBitcoinLikeWallet(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::asBitcoinLikeWallet\n");
        auto r = ref->asBitcoinLikeWallet();
        return ::djinni::release(::djinni_generated::BitcoinLikeWallet::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getCurrency(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getCurrency\n");
        auto r = ref->getCurrency();
        return ::djinni::release(::djinni_generated::Currency::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1isInstanceOfBitcoinLikeWallet(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::isInstanceOfBitcoinLikeWallet\n");
        auto r = ref->isInstanceOfBitcoinLikeWallet();
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1isInstanceOfEthereumLikeWallet(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::isInstanceOfEthereumLikeWallet\n");
        auto r = ref->isInstanceOfEthereumLikeWallet();
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1isInstanceOfRippleLikeWallet(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::isInstanceOfRippleLikeWallet\n");
        auto r = ref->isInstanceOfRippleLikeWallet();
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getWalletType(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getWalletType\n");
        auto r = ref->getWalletType();
        return ::djinni::release(::djinni_generated::WalletType::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getLastBlock(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getLastBlock\n");
        ref->getLastBlock(::djinni_generated::BlockCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getAccountCreationInfo(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jint j_accountIndex, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getAccountCreationInfo\n");
        ref->getAccountCreationInfo(::djinni::I32::toCpp(jniEnv, j_accountIndex),
                                    ::djinni_generated::AccountCreationInfoCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getExtendedKeyAccountCreationInfo(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jint j_accountIndex, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getExtendedKeyAccountCreationInfo\n");
        ref->getExtendedKeyAccountCreationInfo(::djinni::I32::toCpp(jniEnv, j_accountIndex),
                                               ::djinni_generated::ExtendedKeyAccountCreationInfoCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getNextAccountCreationInfo(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getNextAccountCreationInfo\n");
        ref->getNextAccountCreationInfo(::djinni_generated::AccountCreationInfoCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1getNextExtendedKeyAccountCreationInfo(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::getNextExtendedKeyAccountCreationInfo\n");
        ref->getNextExtendedKeyAccountCreationInfo(::djinni_generated::ExtendedKeyAccountCreationInfoCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1newAccountWithInfo(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_accountCreationInfo, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::newAccountWithInfo\n");
        ref->newAccountWithInfo(::djinni_generated::AccountCreationInfo::toCpp(jniEnv, j_accountCreationInfo),
                                ::djinni_generated::AccountCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT void JNICALL Java_co_ledger_core_Wallet_00024CppProxy_native_1newAccountWithExtendedKeyInfo(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jobject j_extendedKeyAccountCreationInfo, jobject j_callback)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Wallet>(nativeRef);
        fmt::print("::ledger::core::api::Wallet::newAccountWithExtendedKeyInfo\n");
        ref->newAccountWithExtendedKeyInfo(::djinni_generated::ExtendedKeyAccountCreationInfo::toCpp(jniEnv, j_extendedKeyAccountCreationInfo),
                                           ::djinni_generated::AccountCallback::toCpp(jniEnv, j_callback));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

}  // namespace djinni_generated
