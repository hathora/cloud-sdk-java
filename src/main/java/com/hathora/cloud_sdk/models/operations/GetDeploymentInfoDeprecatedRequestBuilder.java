/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.utils.LazySingletonValue;
import com.hathora.cloud_sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetDeploymentInfoDeprecatedRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private Integer deploymentId;
    private final SDKMethodInterfaces.MethodCallGetDeploymentInfoDeprecated sdk;

    public GetDeploymentInfoDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallGetDeploymentInfoDeprecated sdk) {
        this.sdk = sdk;
    }
                
    public GetDeploymentInfoDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetDeploymentInfoDeprecatedRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetDeploymentInfoDeprecatedRequestBuilder deploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    public GetDeploymentInfoDeprecatedResponse call() throws Exception {

        return sdk.getDeploymentInfoDeprecated(
            appId,
            deploymentId);
    }
}