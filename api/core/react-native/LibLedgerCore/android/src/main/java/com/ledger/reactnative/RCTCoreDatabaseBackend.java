// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

package com.ledger.reactnative;

import co.ledger.core.DatabaseBackend;
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

/**Class representing a database */
public class RCTCoreDatabaseBackend extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, DatabaseBackend> javaObjects;
    public Map<String, DatabaseBackend> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreDatabaseBackend(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, DatabaseBackend>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreDatabaseBackend";
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
            promise.reject("Failed to release instance of RCTCoreDatabaseBackend", "First parameter of RCTCoreDatabaseBackend::release should be an instance of RCTCoreDatabaseBackend");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, DatabaseBackend> elem : this.javaObjects.entrySet())
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
     *Set database's user name
     *@param username, string
     *@return DatabaseBackend object, databse with user name set
     */
    @ReactMethod
    public void setUsername(Map<String, String> currentInstance, String username, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setUsername(username);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Set database's password
     *@param password, string
     *@return DatabaseBackend object, database with password set
     */
    @ReactMethod
    public void setPassword(Map<String, String> currentInstance, String pwd, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setPassword(pwd);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Set database's host which storing database
     *@param host, string
     *@return DatabaseBackend object, database with host set
     */
    @ReactMethod
    public void setHost(Map<String, String> currentInstance, String host, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setHost(host);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Set database's host's address
     *@param hostAddr, string, host's address
     *@return DatabaseBackend object, database with host's address set
     */
    @ReactMethod
    public void setHostAddr(Map<String, String> currentInstance, String hostAddr, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setHostAddr(hostAddr);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Set database's port on which it connects to host
     *@param port, string
     *@return DatabaseBackend object, database with port set
     */
    @ReactMethod
    public void setPort(Map<String, String> currentInstance, String port, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setPort(port);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Set database's specific options
     *@param opts, string
     *@return DatabaseBackend object, database with options set
     */
    @ReactMethod
    public void setOptions(Map<String, String> currentInstance, String opts, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setOptions(opts);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Set database's mode (SSL) of security interaction of type databse/server
     *@param mode, string
     *@return DatabaseBackend object, database with mode set
     */
    @ReactMethod
    public void setSslMode(Map<String, String> currentInstance, String mode, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setSslMode(mode);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Set database's Kerberos name used to secure (authentication) user/databse interaction
     *@param name, string
     *@return DatabaseBackend object, database with Kerberos name set
     */
    @ReactMethod
    public void setKerberosName(Map<String, String> currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setKerberosName(name);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void setService(Map<String, String> currentInstance, String service, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setService(service);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void setConnectionPoolSize(Map<String, String> currentInstance, int size, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.setConnectionPoolSize(size);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void enableQueryLogging(Map<String, String> currentInstance, boolean enable, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            DatabaseBackend javaResult = currentInstanceObj.enableQueryLogging(enable);

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return database's name
     *@return string
     */
    @ReactMethod
    public void getUsername(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getUsername();
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
     *Return database's password
     *@return string
     */
    @ReactMethod
    public void getPassword(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getPassword();
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
     *Return database's host
     *@return string
     */
    @ReactMethod
    public void getHost(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getHost();
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
     *Return database's host's address
     *@return string
     */
    @ReactMethod
    public void getHostAddr(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getHostAddr();
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
     *Return database's port
     *@return string
     */
    @ReactMethod
    public void getPort(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getPort();
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
     *Return database's options
     *@return string
     */
    @ReactMethod
    public void getOptions(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getOptions();
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
     *Return database's SSL mode
     *@return string
     */
    @ReactMethod
    public void getSslMode(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getSslMode();
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
     *Return database's Kerberos name
     *@return string
     */
    @ReactMethod
    public void getKerberosName(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getKerberosName();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**TODO */
    @ReactMethod
    public void getService(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getService();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void getConnectionPoolSize(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getConnectionPoolSize();
            Map<String, Integer> result = new HashMap<String, Integer>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void isLoggingEnabled(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            DatabaseBackend currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isLoggingEnabled();
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
     *Create an instance of SQLite3 database
     *@return DatabaseBackend object
     */
    @ReactMethod
    public void getSqlite3Backend(Promise promise) {
        try
        {
            DatabaseBackend javaResult = DatabaseBackend.getSqlite3Backend();

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Create an instance of PostgreSQL database
     *@return DatabaseBackend object
     */
    @ReactMethod
    public void getPostgreSQLBackend(Promise promise) {
        try
        {
            DatabaseBackend javaResult = DatabaseBackend.getPostgreSQLBackend();

            String uuid = UUID.randomUUID().toString();
            RCTCoreDatabaseBackend rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDatabaseBackend");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
