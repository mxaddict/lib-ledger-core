// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

package com.ledger.reactnative;

import co.ledger.core.DynamicObject;
import co.ledger.core.Event;
import co.ledger.core.EventCode;
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

/**Class representing an event */
public class RCTCoreEvent extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, Event> javaObjects;
    public Map<String, Event> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreEvent(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Event>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreEvent";
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
            promise.reject("Failed to release instance of RCTCoreEvent", "First parameter of RCTCoreEvent::release should be an instance of RCTCoreEvent");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, Event> elem : this.javaObjects.entrySet())
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
     *Get event code (for more details, please refer to EventCode enum)
     *@return EventCode enum entry
     */
    @ReactMethod
    public void getCode(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Event currentInstanceObj = this.javaObjects.get(sUid);

            EventCode javaResult = currentInstanceObj.getCode();
            Map<String, EventCode> result = new HashMap<String, EventCode>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get payload of event
     *@return DynamicObject object
     */
    @ReactMethod
    public void getPayload(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Event currentInstanceObj = this.javaObjects.get(sUid);

            DynamicObject javaResult = currentInstanceObj.getPayload();

            String uuid = UUID.randomUUID().toString();
            RCTCoreDynamicObject rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDynamicObject.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreDynamicObject");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Know if event is sticky one
     *@return bool
     */
    @ReactMethod
    public void isSticky(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Event currentInstanceObj = this.javaObjects.get(sUid);

            boolean javaResult = currentInstanceObj.isSticky();
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
     *If event is sticky, return sticky tag
     *@return 32 bits integer
     */
    @ReactMethod
    public void getStickyTag(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            Event currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getStickyTag();
            Map<String, Integer> result = new HashMap<String, Integer>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Create a new instance of Event class
     *@param code, EventCode enum entry
     *@param payload, DynamicObject object
     *@return Event instance
     */
    @ReactMethod
    public void newInstance(EventCode code, HashMap <String, String> payload, Promise promise) {
        try
        {
            RCTCoreDynamicObject rctParam_payload = this.reactContext.getNativeModule(RCTCoreDynamicObject.class);
            DynamicObject javaParam_1 = rctParam_payload.getJavaObjects().get(payload.get("uid"));
            Event javaResult = Event.newInstance(code, javaParam_1);

            String uuid = UUID.randomUUID().toString();
            RCTCoreEvent rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEvent.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreEvent");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
