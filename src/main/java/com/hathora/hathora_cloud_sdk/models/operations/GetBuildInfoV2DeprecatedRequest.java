/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.hathora_cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetBuildInfoV2DeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buildId")
    private int buildId;

    @JsonCreator
    public GetBuildInfoV2DeprecatedRequest(
            Optional<String> appId,
            int buildId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        this.appId = appId;
        this.buildId = buildId;
    }
    
    public GetBuildInfoV2DeprecatedRequest(
            int buildId) {
        this(Optional.empty(), buildId);
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

    public GetBuildInfoV2DeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetBuildInfoV2DeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetBuildInfoV2DeprecatedRequest withBuildId(int buildId) {
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
        GetBuildInfoV2DeprecatedRequest other = (GetBuildInfoV2DeprecatedRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.buildId, other.buildId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            buildId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBuildInfoV2DeprecatedRequest.class,
                "appId", appId,
                "buildId", buildId);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private Integer buildId;  
        
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

        public Builder buildId(int buildId) {
            Utils.checkNotNull(buildId, "buildId");
            this.buildId = buildId;
            return this;
        }
        
        public GetBuildInfoV2DeprecatedRequest build() {
            return new GetBuildInfoV2DeprecatedRequest(
                appId,
                buildId);
        }
    }
}
