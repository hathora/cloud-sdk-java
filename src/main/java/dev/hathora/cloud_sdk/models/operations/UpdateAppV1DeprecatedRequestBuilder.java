/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class UpdateAppV1DeprecatedRequestBuilder {

    private AppConfig appConfig;
    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateAppV1Deprecated sdk;

    public UpdateAppV1DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAppV1Deprecated sdk) {
        this.sdk = sdk;
    }

    public UpdateAppV1DeprecatedRequestBuilder appConfig(AppConfig appConfig) {
        Utils.checkNotNull(appConfig, "appConfig");
        this.appConfig = appConfig;
        return this;
    }
                
    public UpdateAppV1DeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public UpdateAppV1DeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public UpdateAppV1DeprecatedResponse call() throws Exception {

        return sdk.updateAppV1Deprecated(
            appConfig,
            appId);
    }
}
