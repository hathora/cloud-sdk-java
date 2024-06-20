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

public class GetConnectionInfoDeprecatedRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=roomId")
    private String roomId;

    @JsonCreator
    public GetConnectionInfoDeprecatedRequest(
            Optional<? extends String> appId,
            String roomId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(roomId, "roomId");
        this.appId = appId;
        this.roomId = roomId;
    }
    
    public GetConnectionInfoDeprecatedRequest(
            String roomId) {
        this(Optional.empty(), roomId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    @JsonIgnore
    public String roomId() {
        return roomId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetConnectionInfoDeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public GetConnectionInfoDeprecatedRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public GetConnectionInfoDeprecatedRequest withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
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
        GetConnectionInfoDeprecatedRequest other = (GetConnectionInfoDeprecatedRequest) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.roomId, other.roomId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            roomId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConnectionInfoDeprecatedRequest.class,
                "appId", appId,
                "roomId", roomId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private String roomId;  
        
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

        public Builder roomId(String roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
            return this;
        }
        
        public GetConnectionInfoDeprecatedRequest build() {
            return new GetConnectionInfoDeprecatedRequest(
                appId,
                roomId);
        }
    }
}

