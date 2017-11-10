// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

#ifndef DJINNI_GENERATED_CURRENCYUNIT_HPP_JNI_
#define DJINNI_GENERATED_CURRENCYUNIT_HPP_JNI_

#include "../../api/CurrencyUnit.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class CurrencyUnit final {
public:
    using CppType = ::ledger::core::api::CurrencyUnit;
    using JniType = jobject;

    using Boxed = CurrencyUnit;

    ~CurrencyUnit();

    static CppType toCpp(JNIEnv* jniEnv, JniType j);
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c);

private:
    CurrencyUnit();
    friend ::djinni::JniClass<CurrencyUnit>;

    const ::djinni::GlobalRef<jclass> clazz { ::djinni::jniFindClass("co/ledger/core/CurrencyUnit") };
    const jmethodID jconstructor { ::djinni::jniGetMethodID(clazz.get(), "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V") };
    const jfieldID field_name { ::djinni::jniGetFieldID(clazz.get(), "name", "Ljava/lang/String;") };
    const jfieldID field_symbol { ::djinni::jniGetFieldID(clazz.get(), "symbol", "Ljava/lang/String;") };
    const jfieldID field_code { ::djinni::jniGetFieldID(clazz.get(), "code", "Ljava/lang/String;") };
    const jfieldID field_numberOfDecimal { ::djinni::jniGetFieldID(clazz.get(), "numberOfDecimal", "I") };
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_CURRENCYUNIT_HPP_JNI_
