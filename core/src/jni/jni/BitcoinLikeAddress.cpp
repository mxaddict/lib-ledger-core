// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#include "BitcoinLikeAddress.hpp"  // my header
#include "BitcoinLikeNetworkParameters.hpp"
#include "Marshal.hpp"

namespace djinni_generated {

BitcoinLikeAddress::BitcoinLikeAddress() : ::djinni::JniInterface<::ledger::core::api::BitcoinLikeAddress, BitcoinLikeAddress>("co/ledger/core/BitcoinLikeAddress$CppProxy") {}

BitcoinLikeAddress::~BitcoinLikeAddress() = default;


CJNIEXPORT void JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_nativeDestroy(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        delete reinterpret_cast<::djinni::CppProxyHandle<::ledger::core::api::BitcoinLikeAddress>*>(nativeRef);
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jbyteArray JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_native_1getVersion(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::BitcoinLikeAddress>(nativeRef);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::getVersion\n");
        auto r = ref->getVersion();
        return ::djinni::release(::djinni::Binary::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jbyteArray JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_native_1getHash160(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::BitcoinLikeAddress>(nativeRef);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::getHash160\n");
        auto r = ref->getHash160();
        return ::djinni::release(::djinni::Binary::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_native_1getNetworkParameters(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::BitcoinLikeAddress>(nativeRef);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::getNetworkParameters\n");
        auto r = ref->getNetworkParameters();
        return ::djinni::release(::djinni_generated::BitcoinLikeNetworkParameters::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jstring JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_native_1toBase58(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::BitcoinLikeAddress>(nativeRef);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::toBase58\n");
        auto r = ref->toBase58();
        return ::djinni::release(::djinni::String::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_native_1isP2SH(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::BitcoinLikeAddress>(nativeRef);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::isP2SH\n");
        auto r = ref->isP2SH();
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_native_1isP2PKH(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::BitcoinLikeAddress>(nativeRef);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::isP2PKH\n");
        auto r = ref->isP2PKH();
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jstring JNICALL Java_co_ledger_core_BitcoinLikeAddress_00024CppProxy_native_1getDerivationPath(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::BitcoinLikeAddress>(nativeRef);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::getDerivationPath\n");
        auto r = ref->getDerivationPath();
        return ::djinni::release(::djinni::Optional<std::experimental::optional, ::djinni::String>::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_BitcoinLikeAddress_fromBase58(JNIEnv* jniEnv, jobject /*this*/, jobject j_params, jstring j_address)
{
    try {
        DJINNI_FUNCTION_PROLOGUE0(jniEnv);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::fromBase58\n");
        auto r = ::ledger::core::api::BitcoinLikeAddress::fromBase58(::djinni_generated::BitcoinLikeNetworkParameters::toCpp(jniEnv, j_params),
                                                                     ::djinni::String::toCpp(jniEnv, j_address));
        return ::djinni::release(::djinni_generated::BitcoinLikeAddress::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_BitcoinLikeAddress_isAddressValid(JNIEnv* jniEnv, jobject /*this*/, jobject j_params, jstring j_address)
{
    try {
        DJINNI_FUNCTION_PROLOGUE0(jniEnv);
        fmt::print("::ledger::core::api::BitcoinLikeAddress::isAddressValid\n");
        auto r = ::ledger::core::api::BitcoinLikeAddress::isAddressValid(::djinni_generated::BitcoinLikeNetworkParameters::toCpp(jniEnv, j_params),
                                                                         ::djinni::String::toCpp(jniEnv, j_address));
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

}  // namespace djinni_generated
