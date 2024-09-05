/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.hathora_cloud_sdk.models.shared.DeploymentConfigV3;
import com.hathora.hathora_cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateDeploymentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private DeploymentConfigV3 deploymentConfigV3;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @JsonCreator
    public CreateDeploymentRequest(
            DeploymentConfigV3 deploymentConfigV3,
            Optional<String> appId) {
        Utils.checkNotNull(deploymentConfigV3, "deploymentConfigV3");
        Utils.checkNotNull(appId, "appId");
        this.deploymentConfigV3 = deploymentConfigV3;
        this.appId = appId;
    }
    
    public CreateDeploymentRequest(
            DeploymentConfigV3 deploymentConfigV3) {
        this(deploymentConfigV3, Optional.empty());
    }

    @JsonIgnore
    public DeploymentConfigV3 deploymentConfigV3() {
        return deploymentConfigV3;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateDeploymentRequest withDeploymentConfigV3(DeploymentConfigV3 deploymentConfigV3) {
        Utils.checkNotNull(deploymentConfigV3, "deploymentConfigV3");
        this.deploymentConfigV3 = deploymentConfigV3;
        return this;
    }

    public CreateDeploymentRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateDeploymentRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
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
        CreateDeploymentRequest other = (CreateDeploymentRequest) o;
        return 
            Objects.deepEquals(this.deploymentConfigV3, other.deploymentConfigV3) &&
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            deploymentConfigV3,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDeploymentRequest.class,
                "deploymentConfigV3", deploymentConfigV3,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private DeploymentConfigV3 deploymentConfigV3;
 
        private Optional<String> appId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder deploymentConfigV3(DeploymentConfigV3 deploymentConfigV3) {
            Utils.checkNotNull(deploymentConfigV3, "deploymentConfigV3");
            this.deploymentConfigV3 = deploymentConfigV3;
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
        
        public CreateDeploymentRequest build() {
            return new CreateDeploymentRequest(
                deploymentConfigV3,
                appId);
        }
    }
}
