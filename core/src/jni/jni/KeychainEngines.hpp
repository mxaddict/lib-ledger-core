// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#ifndef DJINNI_GENERATED_KEYCHAINENGINES_HPP_JNI_
#define DJINNI_GENERATED_KEYCHAINENGINES_HPP_JNI_

#include "../../api/KeychainEngines.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class KeychainEngines final : ::djinni::JniInterface<::ledger::core::api::KeychainEngines, KeychainEngines> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::KeychainEngines>;
    using CppOptType = std::shared_ptr<::ledger::core::api::KeychainEngines>;
    using JniType = jobject;

    using Boxed = KeychainEngines;

    ~KeychainEngines();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<KeychainEngines>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<KeychainEngines>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    KeychainEngines();
    friend ::djinni::JniClass<KeychainEngines>;
    friend ::djinni::JniInterface<::ledger::core::api::KeychainEngines, KeychainEngines>;

};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_KEYCHAINENGINES_HPP_JNI_
