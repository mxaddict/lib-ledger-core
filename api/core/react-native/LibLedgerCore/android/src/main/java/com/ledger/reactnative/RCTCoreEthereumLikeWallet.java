// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.EthereumLikeWallet;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RCTCoreEthereumLikeWallet extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, EthereumLikeWallet> javaObjects;
    public Map<String, EthereumLikeWallet> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreEthereumLikeWallet(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, EthereumLikeWallet>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreEthereumLikeWallet";
    }
    @ReactMethod
    public void release(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreEthereumLikeWallet", "First parameter of RCTCoreEthereumLikeWallet::release should be an instance of RCTCoreEthereumLikeWallet");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, EthereumLikeWallet> elem : this.javaObjects.entrySet())
        {
            result.add(elem.getKey());
        }
        promise.resolve(0);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }

}
