// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#ifndef DJINNI_GENERATED_NJSWALLETLISTCALLBACK_HPP
#define DJINNI_GENERATED_NJSWALLETLISTCALLBACK_HPP


#include "../../../core/src/api/../utils/optional.hpp"
#include "../../../core/src/api/Error.hpp"
#include "../../../core/src/api/Wallet.hpp"
#include "NJSWalletCpp.hpp"
#include <memory>
#include <vector>

#include <nan.h>
#include <node.h>
#include "../../../core/src/api/WalletListCallback.hpp"

using namespace v8;
using namespace node;
using namespace std;
using namespace ledger::core::api;

class NJSWalletListCallback: public Nan::ObjectWrap, public ledger::core::api::WalletListCallback {
public:

    static void Initialize(Local<Object> target);
    ~NJSWalletListCallback()
    {
        persistent().Reset();
        pers_resolver.Reset();
    };
    NJSWalletListCallback(Local<Promise::Resolver> resolver){pers_resolver.Reset(resolver);};

    void onCallback(const std::experimental::optional<std::vector<std::shared_ptr<Wallet>>> & result, const std::experimental::optional<Error> & error);

private:
    static NAN_METHOD(onCallback);

    static NAN_METHOD(New);

    static NAN_METHOD(addRef);
    static NAN_METHOD(removeRef);
    Nan::Persistent<Promise::Resolver> pers_resolver;
};
#endif //DJINNI_GENERATED_NJSWALLETLISTCALLBACK_HPP
