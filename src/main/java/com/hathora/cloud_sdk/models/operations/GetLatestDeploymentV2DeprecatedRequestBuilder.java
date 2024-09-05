/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetLatestDeploymentV2DeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetLatestDeploymentV2Deprecated sdk;

    public GetLatestDeploymentV2DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetLatestDeploymentV2Deprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetLatestDeploymentV2DeprecatedRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetLatestDeploymentV2DeprecatedRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLatestDeploymentV2DeprecatedResponse call() throws Exception {

        return sdk.getLatestDeploymentV2Deprecated(
            appId);
    }
}
