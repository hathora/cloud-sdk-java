/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UpdateRoomConfigParams {

    /**
     * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [`GetRoomInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
     */
    @JsonProperty("roomConfig")
    private String roomConfig;

    @JsonCreator
    public UpdateRoomConfigParams(
            @JsonProperty("roomConfig") String roomConfig) {
        Utils.checkNotNull(roomConfig, "roomConfig");
        this.roomConfig = roomConfig;
    }

    /**
     * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [`GetRoomInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
     */
    @JsonIgnore
    public String roomConfig() {
        return roomConfig;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [`GetRoomInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
     */
    public UpdateRoomConfigParams withRoomConfig(String roomConfig) {
        Utils.checkNotNull(roomConfig, "roomConfig");
        this.roomConfig = roomConfig;
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
        UpdateRoomConfigParams other = (UpdateRoomConfigParams) o;
        return 
            java.util.Objects.deepEquals(this.roomConfig, other.roomConfig);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            roomConfig);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateRoomConfigParams.class,
                "roomConfig", roomConfig);
    }
    
    public final static class Builder {
 
        private String roomConfig;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Optional configuration parameters for the room. Can be any string including stringified JSON. It is accessible from the room via [`GetRoomInfo()`](https://hathora.dev/api#tag/RoomV2/operation/GetRoomInfo).
         */
        public Builder roomConfig(String roomConfig) {
            Utils.checkNotNull(roomConfig, "roomConfig");
            this.roomConfig = roomConfig;
            return this;
        }
        
        public UpdateRoomConfigParams build() {
            return new UpdateRoomConfigParams(
                roomConfig);
        }
    }
}
