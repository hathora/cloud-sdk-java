/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;

public class GetDeploymentInfoV1DeprecatedRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Integer deploymentId;
    private final SDKMethodInterfaces.MethodCallGetDeploymentInfoV1Deprecated sdk;

    public GetDeploymentInfoV1DeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetDeploymentInfoV1Deprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetDeploymentInfoV1DeprecatedRequestBuilder appId(java.lang.String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetDeploymentInfoV1DeprecatedRequestBuilder appId(java.util.Optional<java.lang.String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetDeploymentInfoV1DeprecatedRequestBuilder deploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    public GetDeploymentInfoV1DeprecatedResponse call() throws Exception {

        return sdk.getDeploymentInfoV1Deprecated(
            appId,
            deploymentId);
    }
}