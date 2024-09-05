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


public class GetInactiveRoomsForProcessDeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=processId")
    private String processId;

    @JsonCreator
    public GetInactiveRoomsForProcessDeprecatedRequest(
            Optional<String> appId,
            String processId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(processId, "processId");
        this.appId = appId;
        this.processId = processId;
    }
    
    public GetInactiveRoomsForProcessDeprecatedRequest(
            String processId) {
        this(Optional.empty(), processId);
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public String processId() {
        return processId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetInactiveRoomsForProcessDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetInactiveRoomsForProcessDeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetInactiveRoomsForProcessDeprecatedRequest withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
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
        GetInactiveRoomsForProcessDeprecatedRequest other = (GetInactiveRoomsForProcessDeprecatedRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.processId, other.processId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            processId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetInactiveRoomsForProcessDeprecatedRequest.class,
                "appId", appId,
                "processId", processId);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private String processId;  
        
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

        public Builder processId(String processId) {
            Utils.checkNotNull(processId, "processId");
            this.processId = processId;
            return this;
        }
        
        public GetInactiveRoomsForProcessDeprecatedRequest build() {
            return new GetInactiveRoomsForProcessDeprecatedRequest(
                appId,
                processId);
        }
    }
}

