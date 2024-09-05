/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public class GetBuildInfoDeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Integer buildId;
    private final SDKMethodInterfaces.MethodCallGetBuildInfoDeprecated sdk;

    public GetBuildInfoDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetBuildInfoDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetBuildInfoDeprecatedRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetBuildInfoDeprecatedRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetBuildInfoDeprecatedRequestBuilder buildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    public GetBuildInfoDeprecatedResponse call() throws Exception {

        return sdk.getBuildInfoDeprecated(
            appId,
            buildId);
    }
}
