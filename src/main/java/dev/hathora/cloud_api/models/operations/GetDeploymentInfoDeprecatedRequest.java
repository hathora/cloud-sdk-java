/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class GetDeploymentInfoDeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=deploymentId")
    private int deploymentId;

    @JsonCreator
    public GetDeploymentInfoDeprecatedRequest(
            Optional<? extends String> appId,
            int deploymentId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.appId = appId;
        this.deploymentId = deploymentId;
    }
    
    public GetDeploymentInfoDeprecatedRequest(
            int deploymentId) {
        this(Optional.empty(), deploymentId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    @JsonIgnore
    public int deploymentId() {
        return deploymentId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetDeploymentInfoDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetDeploymentInfoDeprecatedRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetDeploymentInfoDeprecatedRequest withDeploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
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
        GetDeploymentInfoDeprecatedRequest other = (GetDeploymentInfoDeprecatedRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.deploymentId, other.deploymentId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            deploymentId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDeploymentInfoDeprecatedRequest.class,
                "appId", appId,
                "deploymentId", deploymentId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Integer deploymentId;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder deploymentId(int deploymentId) {
            Utils.checkNotNull(deploymentId, "deploymentId");
            this.deploymentId = deploymentId;
            return this;
        }
        
        public GetDeploymentInfoDeprecatedRequest build() {
            return new GetDeploymentInfoDeprecatedRequest(
                appId,
                deploymentId);
        }
    }
}

