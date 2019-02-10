
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import android.provider.Settings.Secure;

public class RNReactNativeGetSsaidModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeGetSsaidModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeGetSsaid";
  }

  @ReactMethod
  public void getID(Promise promise) {
  	try {
  		String android_id = Secure.getString(this.reactContext.getContentResolver(), Secure.ANDROID_ID); 
  		promise.resolve(android_id);
  	}catch (Exception e) {
      promise.reject(e);
    }
  	
  }

}