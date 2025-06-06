/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.AppConfigWithServiceConfig;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class UpdateAppRequestBuilder {

    private AppConfigWithServiceConfig appConfigWithServiceConfig;
    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateApp sdk;

    public UpdateAppRequestBuilder(SDKMethodInterfaces.MethodCallUpdateApp sdk) {
        this.sdk = sdk;
    }

    public UpdateAppRequestBuilder appConfigWithServiceConfig(AppConfigWithServiceConfig appConfigWithServiceConfig) {
        Utils.checkNotNull(appConfigWithServiceConfig, "appConfigWithServiceConfig");
        this.appConfigWithServiceConfig = appConfigWithServiceConfig;
        return this;
    }
                
    public UpdateAppRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public UpdateAppRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public UpdateAppResponse call() throws Exception {

        return sdk.updateApp(
            appConfigWithServiceConfig,
            appId);
    }
}
