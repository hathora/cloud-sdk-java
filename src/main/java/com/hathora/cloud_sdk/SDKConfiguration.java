/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk;

import com.hathora.cloud_sdk.utils.HTTPClient;
import com.hathora.cloud_sdk.utils.Hooks;
import com.hathora.cloud_sdk.utils.RetryConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
    public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "0.0.1";
    public String sdkVersion = "2.9.6";
    public String genVersion = "2.409.8";
    public String userAgent = "speakeasy-sdk/java 2.9.6 2.409.8 0.0.1 com.hathora.cloud_sdk";

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {

    }

    @SuppressWarnings("serial")
    public Map<String, Map<String, Map<String,Object>>> globals = new HashMap<>(){ {
        put("parameters", new HashMap<>());
    } };
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
