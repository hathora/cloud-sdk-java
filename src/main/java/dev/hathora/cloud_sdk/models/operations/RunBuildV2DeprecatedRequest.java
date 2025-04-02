/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class RunBuildV2DeprecatedRequest {

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private RunBuildV2DeprecatedRequestBody requestBody;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buildId")
    private int buildId;

    @JsonCreator
    public RunBuildV2DeprecatedRequest(
            RunBuildV2DeprecatedRequestBody requestBody,
            Optional<String> appId,
            int buildId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        this.requestBody = requestBody;
        this.appId = appId;
        this.buildId = buildId;
    }
    
    public RunBuildV2DeprecatedRequest(
            RunBuildV2DeprecatedRequestBody requestBody,
            int buildId) {
        this(requestBody, Optional.empty(), buildId);
    }

    @JsonIgnore
    public RunBuildV2DeprecatedRequestBody requestBody() {
        return requestBody;
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

    public RunBuildV2DeprecatedRequest withRequestBody(RunBuildV2DeprecatedRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public RunBuildV2DeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public RunBuildV2DeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public RunBuildV2DeprecatedRequest withBuildId(int buildId) {
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
        RunBuildV2DeprecatedRequest other = (RunBuildV2DeprecatedRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.buildId, other.buildId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            appId,
            buildId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunBuildV2DeprecatedRequest.class,
                "requestBody", requestBody,
                "appId", appId,
                "buildId", buildId);
    }
    
    public final static class Builder {
 
        private RunBuildV2DeprecatedRequestBody requestBody;
 
        private Optional<String> appId = Optional.empty();
 
        private Integer buildId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(RunBuildV2DeprecatedRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
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
        
        public RunBuildV2DeprecatedRequest build() {
            return new RunBuildV2DeprecatedRequest(
                requestBody,
                appId,
                buildId);
        }
    }
}
