// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

#include "Event.hpp"  // my header
#include "DynamicObject.hpp"
#include "EventCode.hpp"
#include "Marshal.hpp"

namespace djinni_generated {

Event::Event() : ::djinni::JniInterface<::ledger::core::api::Event, Event>("co/ledger/core/Event$CppProxy") {}

Event::~Event() = default;


CJNIEXPORT void JNICALL Java_co_ledger_core_Event_00024CppProxy_nativeDestroy(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        delete reinterpret_cast<::djinni::CppProxyHandle<::ledger::core::api::Event>*>(nativeRef);
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Event_00024CppProxy_native_1getCode(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Event>(nativeRef);
        fmt::print("::ledger::core::api::Event::getCode\n");
        auto r = ref->getCode();
        return ::djinni::release(::djinni_generated::EventCode::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Event_00024CppProxy_native_1getPayload(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Event>(nativeRef);
        fmt::print("::ledger::core::api::Event::getPayload\n");
        auto r = ref->getPayload();
        return ::djinni::release(::djinni_generated::DynamicObject::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jboolean JNICALL Java_co_ledger_core_Event_00024CppProxy_native_1isSticky(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Event>(nativeRef);
        fmt::print("::ledger::core::api::Event::isSticky\n");
        auto r = ref->isSticky();
        return ::djinni::release(::djinni::Bool::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jint JNICALL Java_co_ledger_core_Event_00024CppProxy_native_1getStickyTag(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::Event>(nativeRef);
        fmt::print("::ledger::core::api::Event::getStickyTag\n");
        auto r = ref->getStickyTag();
        return ::djinni::release(::djinni::I32::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_Event_newInstance(JNIEnv* jniEnv, jobject /*this*/, jobject j_code, jobject j_payload)
{
    try {
        DJINNI_FUNCTION_PROLOGUE0(jniEnv);
        fmt::print("::ledger::core::api::Event::newInstance\n");
        auto r = ::ledger::core::api::Event::newInstance(::djinni_generated::EventCode::toCpp(jniEnv, j_code),
                                                         ::djinni_generated::DynamicObject::toCpp(jniEnv, j_payload));
        return ::djinni::release(::djinni_generated::Event::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

}  // namespace djinni_generated
