/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DeleteAppV1DeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteAppV1Deprecated sdk;

    public DeleteAppV1DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallDeleteAppV1Deprecated sdk) {
        this.sdk = sdk;
    }
                
    public DeleteAppV1DeprecatedRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public DeleteAppV1DeprecatedRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public DeleteAppV1DeprecatedResponse call() throws Exception {

        return sdk.deleteAppV1Deprecated(
            appId);
    }
}