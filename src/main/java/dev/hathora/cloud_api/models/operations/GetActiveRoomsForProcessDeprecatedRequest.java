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

public class GetActiveRoomsForProcessDeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=processId")
    private String processId;

    @JsonCreator
    public GetActiveRoomsForProcessDeprecatedRequest(
            Optional<? extends String> appId,
            String processId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(processId, "processId");
        this.appId = appId;
        this.processId = processId;
    }
    
    public GetActiveRoomsForProcessDeprecatedRequest(
            String processId) {
        this(Optional.empty(), processId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    @JsonIgnore
    public String processId() {
        return processId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetActiveRoomsForProcessDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetActiveRoomsForProcessDeprecatedRequest withProcessId(String processId) {
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
        GetActiveRoomsForProcessDeprecatedRequest other = (GetActiveRoomsForProcessDeprecatedRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.processId, other.processId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            processId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetActiveRoomsForProcessDeprecatedRequest.class,
                "appId", appId,
                "processId", processId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private String processId;  
        
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

        public Builder processId(String processId) {
            Utils.checkNotNull(processId, "processId");
            this.processId = processId;
            return this;
        }
        
        public GetActiveRoomsForProcessDeprecatedRequest build() {
            return new GetActiveRoomsForProcessDeprecatedRequest(
                appId,
                processId);
        }
    }
}

