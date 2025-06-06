/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreateAppRequestBuilder {

    private AppConfig appConfig;
    private Optional<String> orgId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateApp sdk;

    public CreateAppRequestBuilder(SDKMethodInterfaces.MethodCallCreateApp sdk) {
        this.sdk = sdk;
    }

    public CreateAppRequestBuilder appConfig(AppConfig appConfig) {
        Utils.checkNotNull(appConfig, "appConfig");
        this.appConfig = appConfig;
        return this;
    }
                
    public CreateAppRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.of(orgId);
        return this;
    }

    public CreateAppRequestBuilder orgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public CreateAppResponse call() throws Exception {

        return sdk.createApp(
            appConfig,
            orgId);
    }
}
