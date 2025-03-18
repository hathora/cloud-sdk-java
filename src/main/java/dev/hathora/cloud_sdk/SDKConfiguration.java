/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk;

import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.Hooks;
import dev.hathora.cloud_sdk.utils.RetryConfig;
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
    
    public String resolvedServerUrl() {
        return serverUrl;
    }
    public int serverIdx = 0;
    private static final String LANGUAGE = "java";
    public static final String OPENAPI_DOC_VERSION = "0.0.1";
    public static final String SDK_VERSION = "2.15.0";
    public static final String GEN_VERSION = "2.552.1";
    private static final String BASE_PACKAGE = "dev.hathora.cloud_sdk";
    public static final String USER_AGENT = 
            String.format("speakeasy-sdk/%s %s %s %s %s",
                LANGUAGE, SDK_VERSION, GEN_VERSION, OPENAPI_DOC_VERSION, BASE_PACKAGE);

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
