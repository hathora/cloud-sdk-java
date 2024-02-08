/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.util.Optional;


public class CreateDeploymentRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buildId")
    private int buildId;

    public CreateDeploymentRequest(
            dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig,
            Optional<? extends String> appId,
            int buildId) {
        Utils.checkNotNull(deploymentConfig, "deploymentConfig");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        this.deploymentConfig = deploymentConfig;
        this.appId = appId;
        this.buildId = buildId;
    }

    public dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig() {
        return deploymentConfig;
    }

    public Optional<? extends String> appId() {
        return appId;
    }

    public int buildId() {
        return buildId;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreateDeploymentRequest withDeploymentConfig(dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig) {
        Utils.checkNotNull(deploymentConfig, "deploymentConfig");
        this.deploymentConfig = deploymentConfig;
        return this;
    }

    public CreateDeploymentRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }
    
    public CreateDeploymentRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public CreateDeploymentRequest withBuildId(int buildId) {
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
        CreateDeploymentRequest other = (CreateDeploymentRequest) o;
        return 
            java.util.Objects.deepEquals(this.deploymentConfig, other.deploymentConfig) &&
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.buildId, other.buildId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            deploymentConfig,
            appId,
            buildId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDeploymentRequest.class,
                "deploymentConfig", deploymentConfig,
                "appId", appId,
                "buildId", buildId);
    }
    
    public final static class Builder {
 
        private dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig;
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Integer buildId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder deploymentConfig(dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig) {
            Utils.checkNotNull(deploymentConfig, "deploymentConfig");
            this.deploymentConfig = deploymentConfig;
            return this;
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }
        
        public Builder appId(Optional<? extends String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        public Builder buildId(int buildId) {
            Utils.checkNotNull(buildId, "buildId");
            this.buildId = buildId;
            return this;
        }        
        
        public CreateDeploymentRequest build() {
            return new CreateDeploymentRequest(
                deploymentConfig,
                appId,
                buildId);
        }
    }
}

