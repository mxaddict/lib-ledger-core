// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#ifndef DJINNI_GENERATED_WALLETPOOLCALLBACK_HPP_JNI_
#define DJINNI_GENERATED_WALLETPOOLCALLBACK_HPP_JNI_

#include "../../api/WalletPoolCallback.hpp"
#include "djinni_support.hpp"
#include <fmt/format.h>

namespace djinni_generated {

class WalletPoolCallback final : ::djinni::JniInterface<::ledger::core::api::WalletPoolCallback, WalletPoolCallback> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::WalletPoolCallback>;
    using CppOptType = std::shared_ptr<::ledger::core::api::WalletPoolCallback>;
    using JniType = jobject;

    using Boxed = WalletPoolCallback;

    ~WalletPoolCallback();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<WalletPoolCallback>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<WalletPoolCallback>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    WalletPoolCallback();
    friend ::djinni::JniClass<WalletPoolCallback>;
    friend ::djinni::JniInterface<::ledger::core::api::WalletPoolCallback, WalletPoolCallback>;

    class JavaProxy final : ::djinni::JavaProxyHandle<JavaProxy>, public ::ledger::core::api::WalletPoolCallback
    {
    public:
        JavaProxy(JniType j);
        ~JavaProxy();

        void onCallback(const std::shared_ptr<::ledger::core::api::WalletPool> & result, const std::experimental::optional<::ledger::core::api::Error> & error) override;

    private:
        friend ::djinni::JniInterface<::ledger::core::api::WalletPoolCallback, ::djinni_generated::WalletPoolCallback>;
    };

    const ::djinni::GlobalRef<jclass> clazz { ::djinni::jniFindClass("co/ledger/core/WalletPoolCallback") };
    const jmethodID method_onCallback { ::djinni::jniGetMethodID(clazz.get(), "onCallback", "(Lco/ledger/core/WalletPool;Lco/ledger/core/Error;)V") };
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_WALLETPOOLCALLBACK_HPP_JNI_
