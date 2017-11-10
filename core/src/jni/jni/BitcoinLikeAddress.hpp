// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#ifndef DJINNI_GENERATED_BITCOINLIKEADDRESS_HPP_JNI_
#define DJINNI_GENERATED_BITCOINLIKEADDRESS_HPP_JNI_

#include "../../api/BitcoinLikeAddress.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class BitcoinLikeAddress final : ::djinni::JniInterface<::ledger::core::api::BitcoinLikeAddress, BitcoinLikeAddress> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::BitcoinLikeAddress>;
    using CppOptType = std::shared_ptr<::ledger::core::api::BitcoinLikeAddress>;
    using JniType = jobject;

    using Boxed = BitcoinLikeAddress;

    ~BitcoinLikeAddress();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<BitcoinLikeAddress>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<BitcoinLikeAddress>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    BitcoinLikeAddress();
    friend ::djinni::JniClass<BitcoinLikeAddress>;
    friend ::djinni::JniInterface<::ledger::core::api::BitcoinLikeAddress, BitcoinLikeAddress>;

};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_BITCOINLIKEADDRESS_HPP_JNI_
