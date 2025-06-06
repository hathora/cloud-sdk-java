/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.DeploymentConfigV2;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class CreateDeploymentV2DeprecatedRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private DeploymentConfigV2 deploymentConfigV2;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buildId")
    private int buildId;

    @JsonCreator
    public CreateDeploymentV2DeprecatedRequest(
            DeploymentConfigV2 deploymentConfigV2,
            Optional<String> appId,
            int buildId) {
        Utils.checkNotNull(deploymentConfigV2, "deploymentConfigV2");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        this.deploymentConfigV2 = deploymentConfigV2;
        this.appId = appId;
        this.buildId = buildId;
    }
    
    public CreateDeploymentV2DeprecatedRequest(
            DeploymentConfigV2 deploymentConfigV2,
            int buildId) {
        this(deploymentConfigV2, Optional.empty(), buildId);
    }

    @JsonIgnore
    public DeploymentConfigV2 deploymentConfigV2() {
        return deploymentConfigV2;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public int buildId() {
        return buildId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public CreateDeploymentV2DeprecatedRequest withDeploymentConfigV2(DeploymentConfigV2 deploymentConfigV2) {
        Utils.checkNotNull(deploymentConfigV2, "deploymentConfigV2");
        this.deploymentConfigV2 = deploymentConfigV2;
        return this;
    }

    public CreateDeploymentV2DeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateDeploymentV2DeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateDeploymentV2DeprecatedRequest withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeploymentV2DeprecatedRequest other = (CreateDeploymentV2DeprecatedRequest) o;
        return 
            Objects.deepEquals(this.deploymentConfigV2, other.deploymentConfigV2) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.buildId, other.buildId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            deploymentConfigV2,
            appId,
            buildId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDeploymentV2DeprecatedRequest.class,
                "deploymentConfigV2", deploymentConfigV2,
                "appId", appId,
                "buildId", buildId);
    }
    
    public final static class Builder {
 
        private DeploymentConfigV2 deploymentConfigV2;
 
        private Optional<String> appId = Optional.empty();
 
        private Integer buildId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder deploymentConfigV2(DeploymentConfigV2 deploymentConfigV2) {
            Utils.checkNotNull(deploymentConfigV2, "deploymentConfigV2");
            this.deploymentConfigV2 = deploymentConfigV2;
            return this;
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        public Builder buildId(int buildId) {
            Utils.checkNotNull(buildId, "buildId");
            this.buildId = buildId;
            return this;
        }
        
        public CreateDeploymentV2DeprecatedRequest build() {
            return new CreateDeploymentV2DeprecatedRequest(
                deploymentConfigV2,
                appId,
                buildId);
        }
    }
}
