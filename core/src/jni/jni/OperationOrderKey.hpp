// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#ifndef DJINNI_GENERATED_OPERATIONORDERKEY_HPP_JNI_
#define DJINNI_GENERATED_OPERATIONORDERKEY_HPP_JNI_

#include "../../api/OperationOrderKey.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class OperationOrderKey final : ::djinni::JniEnum {
public:
    using CppType = ::ledger::core::api::OperationOrderKey;
    using JniType = jobject;

    using Boxed = OperationOrderKey;

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return static_cast<CppType>(::djinni::JniClass<OperationOrderKey>::get().ordinal(jniEnv, j)); }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, CppType c) { return ::djinni::JniClass<OperationOrderKey>::get().create(jniEnv, static_cast<jint>(c)); }

private:
    OperationOrderKey() : JniEnum("co/ledger/core/OperationOrderKey") {}
    friend ::djinni::JniClass<OperationOrderKey>;
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_OPERATIONORDERKEY_HPP_JNI_
