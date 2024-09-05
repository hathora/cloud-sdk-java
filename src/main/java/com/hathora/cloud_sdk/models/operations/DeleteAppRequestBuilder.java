/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DeleteAppRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteApp sdk;

    public DeleteAppRequestBuilder(SDKMethodInterfaces.MethodCallDeleteApp sdk) {
        this.sdk = sdk;
    }
                
    public DeleteAppRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public DeleteAppRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public DeleteAppResponse call() throws Exception {

        return sdk.deleteApp(
            appId);
    }
}
