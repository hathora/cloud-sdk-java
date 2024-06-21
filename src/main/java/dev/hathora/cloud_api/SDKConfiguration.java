/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api;

import dev.hathora.cloud_api.utils.Hook.SdkInitData;
import dev.hathora.cloud_api.utils.HTTPClient;
import dev.hathora.cloud_api.utils.RetryConfig;
import dev.hathora.cloud_api.models.shared.Security;
import java.util.Map;
import java.util.HashMap;
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
    public String sdkVersion = "2.4.1";
    public String genVersion = "2.347.8";
    public String userAgent = "speakeasy-sdk/java 2.4.1 2.347.8 0.0.1 dev.hathora.cloud_api";

    private dev.hathora.cloud_api.utils.Hooks _hooks = createHooks();

    private static dev.hathora.cloud_api.utils.Hooks createHooks() {
        dev.hathora.cloud_api.utils.Hooks hooks = new dev.hathora.cloud_api.utils.Hooks();
        return hooks;
    }
    
    public dev.hathora.cloud_api.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(dev.hathora.cloud_api.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {

    }

    public Map<String, Map<String, Map<String, java.lang.Object>>> globals = new HashMap<>(){{
        put("parameters", new HashMap<>());
    }};
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
