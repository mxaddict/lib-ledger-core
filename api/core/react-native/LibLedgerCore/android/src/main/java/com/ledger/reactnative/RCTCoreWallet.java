// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.AccountCallback;
import co.ledger.core.AccountCreationInfo;
import co.ledger.core.AccountCreationInfoCallback;
import co.ledger.core.AccountListCallback;
import co.ledger.core.BitcoinLikeWallet;
import co.ledger.core.BlockCallback;
import co.ledger.core.Currency;
import co.ledger.core.ErrorCodeCallback;
import co.ledger.core.EventBus;
import co.ledger.core.ExtendedKeyAccountCreationInfo;
import co.ledger.core.ExtendedKeyAccountCreationInfoCallback;
import co.ledger.core.I32Callback;
import co.ledger.core.Logger;
import co.ledger.core.Preferences;
import co.ledger.core.Wallet;
import co.ledger.core.WalletType;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing a wallet */
public class RCTCoreWallet extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Wallet> javaObjects;
    public Map<String, Wallet> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreWallet(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Wallet>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreWallet";
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
            promise.reject("Failed to release instance of RCTCoreWallet", "First parameter of RCTCoreWallet::release should be an instance of RCTCoreWallet");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, Wallet> elem : this.javaObjects.entrySet())
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

    /**
     *Get name of wallet
     *@return string
     */
    @ReactMethod
    public void getName(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getName();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get account with specific index
     *@param index, 32 bits integer, index of account in wallet
     *@param callback, Callback returning, if getAccount succeed, an Account object with given index
     */
    @ReactMethod
    public void getAccount(Map<String, String> currentInstance, int index, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAccountCallback javaParam_1 = RCTCoreAccountCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getAccount(index, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get number of accounts instanciated under wallet
     *@param callback, Callback returning, if getAccountCount succeed, a 32 bits integer representing number of accounts
     */
    @ReactMethod
    public void getAccountCount(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreI32Callback javaParam_0 = RCTCoreI32Callback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getAccountCount(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get list of accounts instanciated under wallet in a given range
     *@param offset, 32 bits integer from which we retrieve accounts
     *@param count, 32 bits integer, number of accounts to retrieve
     *@param callback, ListCallback returning, if getAccounts succeed, list of Accounts object
     */
    @ReactMethod
    public void getAccounts(Map<String, String> currentInstance, int offset, int count, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAccountListCallback javaParam_2 = RCTCoreAccountListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getAccounts(offset, count, javaParam_2);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get index of next account to create
     *@return callback, Callback returning a 32 bits integer
     */
    @ReactMethod
    public void getNextAccountIndex(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreI32Callback javaParam_0 = RCTCoreI32Callback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getNextAccountIndex(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return event bus through which wallet synchronizes it's accounts and interact with blockchain
     *@return EventBus object
     */
    @ReactMethod
    public void getEventBus(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            EventBus javaResult = currentInstanceObj.getEventBus();

            String uuid = UUID.randomUUID().toString();
            RCTCoreEventBus rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEventBus.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreEventBus");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return synchronization status wallet, true if at least one of accounts is synchronizing
     *@return bool
     */
    @ReactMethod
    public void isSynchronizing(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isSynchronizing();
            Map<String, Boolean> result = new HashMap<String, Boolean>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Start synchronization of all accounts under wallet
     *@return EventBus object through which wallet get notified of account's synchronization status
     */
    @ReactMethod
    public void synchronize(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            EventBus javaResult = currentInstanceObj.synchronize();

            String uuid = UUID.randomUUID().toString();
            RCTCoreEventBus rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEventBus.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreEventBus");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get wallet preferences
     *@return Preferences object
     */
    @ReactMethod
    public void getPreferences(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            Preferences javaResult = currentInstanceObj.getPreferences();

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferences rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferences.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCorePreferences");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return account's logger which provides all needed (e.g. database) logs
     *@return Logger Object
     */
    @ReactMethod
    public void getLogger(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            Logger javaResult = currentInstanceObj.getLogger();

            String uuid = UUID.randomUUID().toString();
            RCTCoreLogger rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreLogger.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreLogger");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get preferences of specific account
     *@param index, 32 bits integer, account's index
     *@return Preferences object
     */
    @ReactMethod
    public void getAccountPreferences(Map<String, String> currentInstance, int index, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            Preferences javaResult = currentInstanceObj.getAccountPreferences(index);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferences rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferences.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCorePreferences");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * asBitcoinLikeWallet(): Callback<BitcoinLikeWallet>;
     * asEthereumLikeWallet(): Callback<EthereumLikeWallet>;
     * asRippleLikeWallet(): Callback<RippleLikeWallet>;
     *Convert wallet to a Bitcoin one
     *@return BitcoinWallet object
     */
    @ReactMethod
    public void asBitcoinLikeWallet(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeWallet javaResult = currentInstanceObj.asBitcoinLikeWallet();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeWallet rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeWallet.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeWallet");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get currency of wallet
     *@return Currency object
     */
    @ReactMethod
    public void getCurrency(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            Currency javaResult = currentInstanceObj.getCurrency();

            String uuid = UUID.randomUUID().toString();
            RCTCoreCurrency rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreCurrency");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Know if wallet is a Bitcoin one
     *@return bool
     */
    @ReactMethod
    public void isInstanceOfBitcoinLikeWallet(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfBitcoinLikeWallet();
            Map<String, Boolean> result = new HashMap<String, Boolean>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Know if wallet is a Ethereum one
     *@return bool
     */
    @ReactMethod
    public void isInstanceOfEthereumLikeWallet(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfEthereumLikeWallet();
            Map<String, Boolean> result = new HashMap<String, Boolean>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Know if wallet is a Ripple one
     *@return bool
     */
    @ReactMethod
    public void isInstanceOfRippleLikeWallet(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isInstanceOfRippleLikeWallet();
            Map<String, Boolean> result = new HashMap<String, Boolean>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get wallet type
     *@return WalletType object
     */
    @ReactMethod
    public void getWalletType(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            WalletType javaResult = currentInstanceObj.getWalletType();
            Map<String, WalletType> result = new HashMap<String, WalletType>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get last block of blockchain the wallet operates on
     *@param callback, Callback returning a Block object
     */
    @ReactMethod
    public void getLastBlock(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBlockCallback javaParam_0 = RCTCoreBlockCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getLastBlock(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return infos about the creation of specific account
     *@param accountIndex, 32 bits account, index of account in wallet
     *@param callback, Callback returning an AccountCreationInfo
     */
    @ReactMethod
    public void getAccountCreationInfo(Map<String, String> currentInstance, int accountIndex, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAccountCreationInfoCallback javaParam_1 = RCTCoreAccountCreationInfoCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getAccountCreationInfo(accountIndex, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void getExtendedKeyAccountCreationInfo(Map<String, String> currentInstance, int accountIndex, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreExtendedKeyAccountCreationInfoCallback javaParam_1 = RCTCoreExtendedKeyAccountCreationInfoCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getExtendedKeyAccountCreationInfo(accountIndex, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return infos about the next created account
     *@param callback, Callback returning an AccountCreationInfo
     */
    @ReactMethod
    public void getNextAccountCreationInfo(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAccountCreationInfoCallback javaParam_0 = RCTCoreAccountCreationInfoCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getNextAccountCreationInfo(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void getNextExtendedKeyAccountCreationInfo(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreExtendedKeyAccountCreationInfoCallback javaParam_0 = RCTCoreExtendedKeyAccountCreationInfoCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getNextExtendedKeyAccountCreationInfo(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get account from given account creation infos
     *@param accountCreationInfo, AccountCreationInfo object
     *@param callback, Callback returning an Account object with given creation infos
     */
    @ReactMethod
    public void newAccountWithInfo(Map<String, String> currentInstance, HashMap <String, String> accountCreationInfo, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAccountCreationInfo rctParam_accountCreationInfo = this.reactContext.getNativeModule(RCTCoreAccountCreationInfo.class);
            AccountCreationInfo javaParam_0 = rctParam_accountCreationInfo.getJavaObjects().get(accountCreationInfo.get("uid"));
            RCTCoreAccountCallback javaParam_1 = RCTCoreAccountCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.newAccountWithInfo(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void newAccountWithExtendedKeyInfo(Map<String, String> currentInstance, HashMap <String, String> extendedKeyAccountCreationInfo, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreExtendedKeyAccountCreationInfo rctParam_extendedKeyAccountCreationInfo = this.reactContext.getNativeModule(RCTCoreExtendedKeyAccountCreationInfo.class);
            ExtendedKeyAccountCreationInfo javaParam_0 = rctParam_extendedKeyAccountCreationInfo.getJavaObjects().get(extendedKeyAccountCreationInfo.get("uid"));
            RCTCoreAccountCallback javaParam_1 = RCTCoreAccountCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.newAccountWithExtendedKeyInfo(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Erase data (in user's DB) relative to wallet since given date
     *@param date, start date of data deletion
     */
    @ReactMethod
    public void eraseDataSince(Map<String, String> currentInstance, Date date, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Wallet currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreErrorCodeCallback javaParam_1 = RCTCoreErrorCodeCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.eraseDataSince(date, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
