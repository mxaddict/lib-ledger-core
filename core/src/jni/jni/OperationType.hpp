// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#ifndef DJINNI_GENERATED_OPERATIONTYPE_HPP_JNI_
#define DJINNI_GENERATED_OPERATIONTYPE_HPP_JNI_

#include "../../api/OperationType.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class OperationType final : ::djinni::JniEnum {
public:
    using CppType = ::ledger::core::api::OperationType;
    using JniType = jobject;

    using Boxed = OperationType;

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return static_cast<CppType>(::djinni::JniClass<OperationType>::get().ordinal(jniEnv, j)); }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, CppType c) { return ::djinni::JniClass<OperationType>::get().create(jniEnv, static_cast<jint>(c)); }

private:
    OperationType() : JniEnum("co/ledger/core/OperationType") {}
    friend ::djinni::JniClass<OperationType>;
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_OPERATIONTYPE_HPP_JNI_
