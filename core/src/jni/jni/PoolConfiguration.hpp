// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#ifndef DJINNI_GENERATED_POOLCONFIGURATION_HPP_JNI_
#define DJINNI_GENERATED_POOLCONFIGURATION_HPP_JNI_

#include "../../api/PoolConfiguration.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class PoolConfiguration final : ::djinni::JniInterface<::ledger::core::api::PoolConfiguration, PoolConfiguration> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::PoolConfiguration>;
    using CppOptType = std::shared_ptr<::ledger::core::api::PoolConfiguration>;
    using JniType = jobject;

    using Boxed = PoolConfiguration;

    ~PoolConfiguration();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<PoolConfiguration>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<PoolConfiguration>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    PoolConfiguration();
    friend ::djinni::JniClass<PoolConfiguration>;
    friend ::djinni::JniInterface<::ledger::core::api::PoolConfiguration, PoolConfiguration>;

};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_POOLCONFIGURATION_HPP_JNI_
