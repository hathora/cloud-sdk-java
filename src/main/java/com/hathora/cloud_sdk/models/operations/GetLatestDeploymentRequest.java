/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetLatestDeploymentRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @JsonCreator
    public GetLatestDeploymentRequest(
            Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
    }
    
    public GetLatestDeploymentRequest() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLatestDeploymentRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetLatestDeploymentRequest withAppId(Optional<String> appId) {
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
        GetLatestDeploymentRequest other = (GetLatestDeploymentRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLatestDeploymentRequest.class,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        
        public GetLatestDeploymentRequest build() {
            return new GetLatestDeploymentRequest(
                appId);
        }
    }
}

