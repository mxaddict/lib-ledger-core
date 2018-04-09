// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

#ifndef DJINNI_GENERATED_WEBSOCKETCONNECTION_HPP_JNI_
#define DJINNI_GENERATED_WEBSOCKETCONNECTION_HPP_JNI_

#include "../../api/WebSocketConnection.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class WebSocketConnection final : ::djinni::JniInterface<::ledger::core::api::WebSocketConnection, WebSocketConnection> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::WebSocketConnection>;
    using CppOptType = std::shared_ptr<::ledger::core::api::WebSocketConnection>;
    using JniType = jobject;

    using Boxed = WebSocketConnection;

    ~WebSocketConnection();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<WebSocketConnection>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<WebSocketConnection>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    WebSocketConnection();
    friend ::djinni::JniClass<WebSocketConnection>;
    friend ::djinni::JniInterface<::ledger::core::api::WebSocketConnection, WebSocketConnection>;

};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_WEBSOCKETCONNECTION_HPP_JNI_
