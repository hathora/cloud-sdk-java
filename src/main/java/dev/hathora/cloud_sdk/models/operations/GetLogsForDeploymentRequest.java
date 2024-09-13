/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.utils.LazySingletonValue;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetLogsForDeploymentRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=deploymentId")
    private int deploymentId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=follow")
    private Optional<Boolean> follow;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tailLines")
    private Optional<Integer> tailLines;

    @JsonCreator
    public GetLogsForDeploymentRequest(
            Optional<String> appId,
            int deploymentId,
            Optional<Boolean> follow,
            Optional<Integer> tailLines) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(deploymentId, "deploymentId");
        Utils.checkNotNull(follow, "follow");
        Utils.checkNotNull(tailLines, "tailLines");
        this.appId = appId;
        this.deploymentId = deploymentId;
        this.follow = follow;
        this.tailLines = tailLines;
    }
    
    public GetLogsForDeploymentRequest(
            int deploymentId) {
        this(Optional.empty(), deploymentId, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public int deploymentId() {
        return deploymentId;
    }

    @JsonIgnore
    public Optional<Boolean> follow() {
        return follow;
    }

    @JsonIgnore
    public Optional<Integer> tailLines() {
        return tailLines;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLogsForDeploymentRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetLogsForDeploymentRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetLogsForDeploymentRequest withDeploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    public GetLogsForDeploymentRequest withFollow(boolean follow) {
        Utils.checkNotNull(follow, "follow");
        this.follow = Optional.ofNullable(follow);
        return this;
    }

    public GetLogsForDeploymentRequest withFollow(Optional<Boolean> follow) {
        Utils.checkNotNull(follow, "follow");
        this.follow = follow;
        return this;
    }

    public GetLogsForDeploymentRequest withTailLines(int tailLines) {
        Utils.checkNotNull(tailLines, "tailLines");
        this.tailLines = Optional.ofNullable(tailLines);
        return this;
    }

    public GetLogsForDeploymentRequest withTailLines(Optional<Integer> tailLines) {
        Utils.checkNotNull(tailLines, "tailLines");
        this.tailLines = tailLines;
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
        GetLogsForDeploymentRequest other = (GetLogsForDeploymentRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.deploymentId, other.deploymentId) &&
            Objects.deepEquals(this.follow, other.follow) &&
            Objects.deepEquals(this.tailLines, other.tailLines);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            deploymentId,
            follow,
            tailLines);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLogsForDeploymentRequest.class,
                "appId", appId,
                "deploymentId", deploymentId,
                "follow", follow,
                "tailLines", tailLines);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private Integer deploymentId;
 
        private Optional<Boolean> follow = Optional.empty();
 
        private Optional<Integer> tailLines;  
        
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

        public Builder deploymentId(int deploymentId) {
            Utils.checkNotNull(deploymentId, "deploymentId");
            this.deploymentId = deploymentId;
            return this;
        }

        public Builder follow(boolean follow) {
            Utils.checkNotNull(follow, "follow");
            this.follow = Optional.ofNullable(follow);
            return this;
        }

        public Builder follow(Optional<Boolean> follow) {
            Utils.checkNotNull(follow, "follow");
            this.follow = follow;
            return this;
        }

        public Builder tailLines(int tailLines) {
            Utils.checkNotNull(tailLines, "tailLines");
            this.tailLines = Optional.ofNullable(tailLines);
            return this;
        }

        public Builder tailLines(Optional<Integer> tailLines) {
            Utils.checkNotNull(tailLines, "tailLines");
            this.tailLines = tailLines;
            return this;
        }
        
        public GetLogsForDeploymentRequest build() {
            if (tailLines == null) {
                tailLines = _SINGLETON_VALUE_TailLines.value();
            }            return new GetLogsForDeploymentRequest(
                appId,
                deploymentId,
                follow,
                tailLines);
        }

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_TailLines =
                new LazySingletonValue<>(
                        "tailLines",
                        "100",
                        new TypeReference<Optional<Integer>>() {});
    }
}
