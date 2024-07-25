/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class UpdateRoomConfigRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private dev.hathora.cloud_api.models.shared.UpdateRoomConfigParams updateRoomConfigParams;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<? extends String> appId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=roomId")
    private String roomId;

    @JsonCreator
    public UpdateRoomConfigRequest(
            dev.hathora.cloud_api.models.shared.UpdateRoomConfigParams updateRoomConfigParams,
            Optional<? extends String> appId,
            String roomId) {
        Utils.checkNotNull(updateRoomConfigParams, "updateRoomConfigParams");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(roomId, "roomId");
        this.updateRoomConfigParams = updateRoomConfigParams;
        this.appId = appId;
        this.roomId = roomId;
    }
    
    public UpdateRoomConfigRequest(
            dev.hathora.cloud_api.models.shared.UpdateRoomConfigParams updateRoomConfigParams,
            String roomId) {
        this(updateRoomConfigParams, Optional.empty(), roomId);
    }

    @JsonIgnore
    public dev.hathora.cloud_api.models.shared.UpdateRoomConfigParams updateRoomConfigParams() {
        return updateRoomConfigParams;
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

    public UpdateRoomConfigRequest withUpdateRoomConfigParams(dev.hathora.cloud_api.models.shared.UpdateRoomConfigParams updateRoomConfigParams) {
        Utils.checkNotNull(updateRoomConfigParams, "updateRoomConfigParams");
        this.updateRoomConfigParams = updateRoomConfigParams;
        return this;
    }

    public UpdateRoomConfigRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public UpdateRoomConfigRequest withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public UpdateRoomConfigRequest withRoomId(String roomId) {
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
        UpdateRoomConfigRequest other = (UpdateRoomConfigRequest) o;
        return 
            java.util.Objects.deepEquals(this.updateRoomConfigParams, other.updateRoomConfigParams) &&
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.roomId, other.roomId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            updateRoomConfigParams,
            appId,
            roomId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateRoomConfigRequest.class,
                "updateRoomConfigParams", updateRoomConfigParams,
                "appId", appId,
                "roomId", roomId);
    }
    
    public final static class Builder {
 
        private dev.hathora.cloud_api.models.shared.UpdateRoomConfigParams updateRoomConfigParams;
 
        private Optional<? extends String> appId = Optional.empty();
 
        private String roomId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateRoomConfigParams(dev.hathora.cloud_api.models.shared.UpdateRoomConfigParams updateRoomConfigParams) {
            Utils.checkNotNull(updateRoomConfigParams, "updateRoomConfigParams");
            this.updateRoomConfigParams = updateRoomConfigParams;
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

        public Builder roomId(String roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
            return this;
        }
        
        public UpdateRoomConfigRequest build() {
            return new UpdateRoomConfigRequest(
                updateRoomConfigParams,
                appId,
                roomId);
        }
    }
}

