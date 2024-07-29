/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.models.errors.SDKError;
import dev.hathora.cloud_api.utils.LazySingletonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateDeploymentRequestBuilder {

    private dev.hathora.cloud_api.models.shared.DeploymentConfigV2 deploymentConfigV2;
    private Optional<? extends String> appId = Optional.empty();
    private Integer buildId;
    private final SDKMethodInterfaces.MethodCallCreateDeployment sdk;

    public CreateDeploymentRequestBuilder(SDKMethodInterfaces.MethodCallCreateDeployment sdk) {
        this.sdk = sdk;
    }

    public CreateDeploymentRequestBuilder deploymentConfigV2(dev.hathora.cloud_api.models.shared.DeploymentConfigV2 deploymentConfigV2) {
        Utils.checkNotNull(deploymentConfigV2, "deploymentConfigV2");
        this.deploymentConfigV2 = deploymentConfigV2;
        return this;
    }
                
    public CreateDeploymentRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateDeploymentRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateDeploymentRequestBuilder buildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    public CreateDeploymentResponse call() throws Exception {

        return sdk.createDeployment(
            deploymentConfigV2,
            appId,
            buildId);
    }
}
