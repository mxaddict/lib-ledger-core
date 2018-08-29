// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BitcoinLikePickingStrategy;
import co.ledger.core.BitcoinLikeScript;
import co.ledger.core.BitcoinLikeTransaction;
import co.ledger.core.BitcoinLikeTransactionBuilder;
import co.ledger.core.BitcoinLikeTransactionCallback;
import co.ledger.core.Currency;
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

public class RCTCoreBitcoinLikeTransactionBuilder extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeTransactionBuilder> javaObjects;
    public Map<String, BitcoinLikeTransactionBuilder> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeTransactionBuilder(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeTransactionBuilder>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeTransactionBuilder";
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
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeTransactionBuilder", "First parameter of RCTCoreBitcoinLikeTransactionBuilder::release should be an instance of RCTCoreBitcoinLikeTransactionBuilder");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, BitcoinLikeTransactionBuilder> elem : this.javaObjects.entrySet())
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
     * Add the given input to the final transaction.
     * @param transactionhash The hash of the transaction in where the UTXO can be located.
     * @params index Index of the UTXO in the previous transaction
     * @params sequence Sequence number to add at the end of the input serialization. This can be used for RBF transaction
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void addInput(Map<String, String> currentInstance, String transactionHash, int index, int sequence, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.addInput(transactionHash, index, sequence);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Add the given output to the final transaction
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void addOutput(Map<String, String> currentInstance, HashMap <String, String> amount, HashMap <String, String> script, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.get("uid"));
            RCTCoreBitcoinLikeScript rctParam_script = this.reactContext.getNativeModule(RCTCoreBitcoinLikeScript.class);
            BitcoinLikeScript javaParam_1 = rctParam_script.getJavaObjects().get(script.get("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.addOutput(javaParam_0, javaParam_1);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * If needed the transaction will send its change to the given path. It is possible to add multiple change path.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void addChangePath(Map<String, String> currentInstance, String path, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.addChangePath(path);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Exclude UTXO from the coin selection (alias UTXO picking). You can call this method multiple times to exclude multiple
     * UTXO.
     * @param transactionHash The hash of the transaction in which this UTXO can be found.
     * @param outputIndex The position of the output in the previous transaction,
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void excludeUtxo(Map<String, String> currentInstance, String transactionHash, int outputIndex, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.excludeUtxo(transactionHash, outputIndex);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** @return A reference on the same builder in order to chain calls. */
    @ReactMethod
    public void setNumberOfChangeAddresses(Map<String, String> currentInstance, int count, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setNumberOfChangeAddresses(count);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the maximum amount per change output. By default there is no max amount.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setMaxAmountOnChange(Map<String, String> currentInstance, HashMap <String, String> amount, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.get("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setMaxAmountOnChange(javaParam_0);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the minimum amount per change output. By default this value is the dust value of the currency.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setMinAmountOnChange(Map<String, String> currentInstance, HashMap <String, String> amount, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.get("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setMinAmountOnChange(javaParam_0);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the UTXO picking strategy (see [[BitcoinLikePickingStrategy]]).
     * @param strategy The strategy to adopt in order to select which input to use in the transaction.
     * @param sequence The sequence value serialized at the end of the raw transaction. If you don't know what to put here
     * just use 0xFFFFFF
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void pickInputs(Map<String, String> currentInstance, BitcoinLikePickingStrategy strategy, int sequence, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.pickInputs(strategy, sequence);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
     * @param amount The value to send
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void sendToAddress(Map<String, String> currentInstance, HashMap <String, String> amount, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.get("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.sendToAddress(javaParam_0, address);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Send all available funds to the given address.
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void wipeToAddress(Map<String, String> currentInstance, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.wipeToAddress(address);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set the amount of fees per byte (of the raw transaction).
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setFeesPerByte(Map<String, String> currentInstance, HashMap <String, String> fees, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_fees = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_fees.getJavaObjects().get(fees.get("uid"));
            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.setFeesPerByte(javaParam_0);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Build a transaction from the given builder parameters. */
    @ReactMethod
    public void build(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBitcoinLikeTransactionCallback javaParam_0 = RCTCoreBitcoinLikeTransactionCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.build(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Creates a clone of this builder.
     * @return A copy of the current builder instance.
     */
    @ReactMethod
    public void clone(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.clone();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Reset the current instance to its initial state */
    @ReactMethod
    public void reset(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.reset();
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void parseRawUnsignedTransaction(HashMap <String, String> currency, byte[] rawTransaction, Promise promise) {
        try
        {
            RCTCoreCurrency rctParam_currency = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            Currency javaParam_0 = rctParam_currency.getJavaObjects().get(currency.get("uid"));
            BitcoinLikeTransaction javaResult = BitcoinLikeTransactionBuilder.parseRawUnsignedTransaction(javaParam_0, rawTransaction);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransaction rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransaction.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransaction");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
