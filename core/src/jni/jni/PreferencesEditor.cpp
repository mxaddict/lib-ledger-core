// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

#include "PreferencesEditor.hpp"  // my header
#include "Marshal.hpp"

namespace djinni_generated {

PreferencesEditor::PreferencesEditor() : ::djinni::JniInterface<::ledger::core::api::PreferencesEditor, PreferencesEditor>("co/ledger/core/PreferencesEditor$CppProxy") {}

PreferencesEditor::~PreferencesEditor() = default;


CJNIEXPORT void JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_nativeDestroy(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        delete reinterpret_cast<::djinni::CppProxyHandle<::ledger::core::api::PreferencesEditor>*>(nativeRef);
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1putString(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_key, jstring j_value)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::putString\n");
        auto r = ref->putString(::djinni::String::toCpp(jniEnv, j_key),
                                ::djinni::String::toCpp(jniEnv, j_value));
        return ::djinni::release(::djinni_generated::PreferencesEditor::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1putInt(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_key, jint j_value)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::putInt\n");
        auto r = ref->putInt(::djinni::String::toCpp(jniEnv, j_key),
                             ::djinni::I32::toCpp(jniEnv, j_value));
        return ::djinni::release(::djinni_generated::PreferencesEditor::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1putLong(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_key, jlong j_value)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::putLong\n");
        auto r = ref->putLong(::djinni::String::toCpp(jniEnv, j_key),
                              ::djinni::I64::toCpp(jniEnv, j_value));
        return ::djinni::release(::djinni_generated::PreferencesEditor::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1putBoolean(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_key, jboolean j_value)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::putBoolean\n");
        auto r = ref->putBoolean(::djinni::String::toCpp(jniEnv, j_key),
                                 ::djinni::Bool::toCpp(jniEnv, j_value));
        return ::djinni::release(::djinni_generated::PreferencesEditor::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1putStringArray(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_key, jobject j_value)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::putStringArray\n");
        auto r = ref->putStringArray(::djinni::String::toCpp(jniEnv, j_key),
                                     ::djinni::List<::djinni::String>::toCpp(jniEnv, j_value));
        return ::djinni::release(::djinni_generated::PreferencesEditor::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1putData(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_key, jbyteArray j_value)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::putData\n");
        auto r = ref->putData(::djinni::String::toCpp(jniEnv, j_key),
                              ::djinni::Binary::toCpp(jniEnv, j_value));
        return ::djinni::release(::djinni_generated::PreferencesEditor::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT jobject JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1remove(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef, jstring j_key)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::remove\n");
        auto r = ref->remove(::djinni::String::toCpp(jniEnv, j_key));
        return ::djinni::release(::djinni_generated::PreferencesEditor::fromCpp(jniEnv, r));
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, 0 /* value doesn't matter */)
}

CJNIEXPORT void JNICALL Java_co_ledger_core_PreferencesEditor_00024CppProxy_native_1commit(JNIEnv* jniEnv, jobject /*this*/, jlong nativeRef)
{
    try {
        DJINNI_FUNCTION_PROLOGUE1(jniEnv, nativeRef);
        const auto& ref = ::djinni::objectFromHandleAddress<::ledger::core::api::PreferencesEditor>(nativeRef);
        fmt::print("::ledger::core::api::PreferencesEditor::commit\n");
        ref->commit();
    } JNI_TRANSLATE_EXCEPTIONS_RETURN(jniEnv, )
}

}  // namespace djinni_generated
