// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from core.djinni

#ifndef DJINNI_GENERATED_LEDGERCORE_HPP_JNI_
#define DJINNI_GENERATED_LEDGERCORE_HPP_JNI_

#include "../../api/LedgerCore.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class LedgerCore final : ::djinni::JniInterface<::ledger::core::api::LedgerCore, LedgerCore> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::LedgerCore>;
    using CppOptType = std::shared_ptr<::ledger::core::api::LedgerCore>;
    using JniType = jobject;

    using Boxed = LedgerCore;

    ~LedgerCore();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<LedgerCore>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<LedgerCore>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    LedgerCore();
    friend ::djinni::JniClass<LedgerCore>;
    friend ::djinni::JniInterface<::ledger::core::api::LedgerCore, LedgerCore>;

};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_LEDGERCORE_HPP_JNI_
