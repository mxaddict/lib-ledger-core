// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#ifndef DJINNI_GENERATED_CONFIGURATIONDEFAULTS_HPP_JNI_
#define DJINNI_GENERATED_CONFIGURATIONDEFAULTS_HPP_JNI_

#include "../../api/ConfigurationDefaults.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class ConfigurationDefaults final : ::djinni::JniInterface<::ledger::core::api::ConfigurationDefaults, ConfigurationDefaults> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::ConfigurationDefaults>;
    using CppOptType = std::shared_ptr<::ledger::core::api::ConfigurationDefaults>;
    using JniType = jobject;

    using Boxed = ConfigurationDefaults;

    ~ConfigurationDefaults();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<ConfigurationDefaults>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<ConfigurationDefaults>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    ConfigurationDefaults();
    friend ::djinni::JniClass<ConfigurationDefaults>;
    friend ::djinni::JniInterface<::ledger::core::api::ConfigurationDefaults, ConfigurationDefaults>;

};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_CONFIGURATIONDEFAULTS_HPP_JNI_
