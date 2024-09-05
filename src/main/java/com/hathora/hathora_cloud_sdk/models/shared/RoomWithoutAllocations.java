/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class RoomWithoutAllocations {

    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    private String appId;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("currentAllocation")
    private Optional<? extends RoomWithoutAllocationsCurrentAllocation> currentAllocation;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("roomConfig")
    private JsonNullable<String> roomConfig;

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonProperty("roomId")
    private String roomId;

    /**
     * The allocation status of a room.
     * 
     * `scheduling`: a process is not allocated yet and the room is waiting to be scheduled
     * 
     * `active`: ready to accept connections
     * 
     * `destroyed`: all associated metadata is deleted
     */
    @JsonProperty("status")
    private RoomStatus status;

    @JsonCreator
    public RoomWithoutAllocations(
            @JsonProperty("appId") String appId,
            @JsonProperty("currentAllocation") Optional<? extends RoomWithoutAllocationsCurrentAllocation> currentAllocation,
            @JsonProperty("roomConfig") JsonNullable<String> roomConfig,
            @JsonProperty("roomId") String roomId,
            @JsonProperty("status") RoomStatus status) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(currentAllocation, "currentAllocation");
        Utils.checkNotNull(roomConfig, "roomConfig");
        Utils.checkNotNull(roomId, "roomId");
        Utils.checkNotNull(status, "status");
        this.appId = appId;
        this.currentAllocation = currentAllocation;
        this.roomConfig = roomConfig;
        this.roomId = roomId;
        this.status = status;
    }
    
    public RoomWithoutAllocations(
            String appId,
            String roomId,
            RoomStatus status) {
        this(appId, Optional.empty(), JsonNullable.undefined(), roomId, status);
    }

    /**
     * System generated unique identifier for an application.
     */
    @JsonIgnore
    public String appId() {
        return appId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RoomWithoutAllocationsCurrentAllocation> currentAllocation() {
        return (Optional<RoomWithoutAllocationsCurrentAllocation>) currentAllocation;
    }

    @JsonIgnore
    public JsonNullable<String> roomConfig() {
        return roomConfig;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonIgnore
    public String roomId() {
        return roomId;
    }

    /**
     * The allocation status of a room.
     * 
     * `scheduling`: a process is not allocated yet and the room is waiting to be scheduled
     * 
     * `active`: ready to accept connections
     * 
     * `destroyed`: all associated metadata is deleted
     */
    @JsonIgnore
    public RoomStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * System generated unique identifier for an application.
     */
    public RoomWithoutAllocations withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public RoomWithoutAllocations withCurrentAllocation(RoomWithoutAllocationsCurrentAllocation currentAllocation) {
        Utils.checkNotNull(currentAllocation, "currentAllocation");
        this.currentAllocation = Optional.ofNullable(currentAllocation);
        return this;
    }

    public RoomWithoutAllocations withCurrentAllocation(Optional<? extends RoomWithoutAllocationsCurrentAllocation> currentAllocation) {
        Utils.checkNotNull(currentAllocation, "currentAllocation");
        this.currentAllocation = currentAllocation;
        return this;
    }

    public RoomWithoutAllocations withRoomConfig(String roomConfig) {
        Utils.checkNotNull(roomConfig, "roomConfig");
        this.roomConfig = JsonNullable.of(roomConfig);
        return this;
    }

    public RoomWithoutAllocations withRoomConfig(JsonNullable<String> roomConfig) {
        Utils.checkNotNull(roomConfig, "roomConfig");
        this.roomConfig = roomConfig;
        return this;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    public RoomWithoutAllocations withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    /**
     * The allocation status of a room.
     * 
     * `scheduling`: a process is not allocated yet and the room is waiting to be scheduled
     * 
     * `active`: ready to accept connections
     * 
     * `destroyed`: all associated metadata is deleted
     */
    public RoomWithoutAllocations withStatus(RoomStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        RoomWithoutAllocations other = (RoomWithoutAllocations) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.currentAllocation, other.currentAllocation) &&
            Objects.deepEquals(this.roomConfig, other.roomConfig) &&
            Objects.deepEquals(this.roomId, other.roomId) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            currentAllocation,
            roomConfig,
            roomId,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RoomWithoutAllocations.class,
                "appId", appId,
                "currentAllocation", currentAllocation,
                "roomConfig", roomConfig,
                "roomId", roomId,
                "status", status);
    }
    
    public final static class Builder {
 
        private String appId;
 
        private Optional<? extends RoomWithoutAllocationsCurrentAllocation> currentAllocation = Optional.empty();
 
        private JsonNullable<String> roomConfig = JsonNullable.undefined();
 
        private String roomId;
 
        private RoomStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * System generated unique identifier for an application.
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        public Builder currentAllocation(RoomWithoutAllocationsCurrentAllocation currentAllocation) {
            Utils.checkNotNull(currentAllocation, "currentAllocation");
            this.currentAllocation = Optional.ofNullable(currentAllocation);
            return this;
        }

        public Builder currentAllocation(Optional<? extends RoomWithoutAllocationsCurrentAllocation> currentAllocation) {
            Utils.checkNotNull(currentAllocation, "currentAllocation");
            this.currentAllocation = currentAllocation;
            return this;
        }

        public Builder roomConfig(String roomConfig) {
            Utils.checkNotNull(roomConfig, "roomConfig");
            this.roomConfig = JsonNullable.of(roomConfig);
            return this;
        }

        public Builder roomConfig(JsonNullable<String> roomConfig) {
            Utils.checkNotNull(roomConfig, "roomConfig");
            this.roomConfig = roomConfig;
            return this;
        }

        /**
         * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
         * Note: error will be returned if `roomId` is not globally unique.
         */
        public Builder roomId(String roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
            return this;
        }

        /**
         * The allocation status of a room.
         * 
         * `scheduling`: a process is not allocated yet and the room is waiting to be scheduled
         * 
         * `active`: ready to accept connections
         * 
         * `destroyed`: all associated metadata is deleted
         */
        public Builder status(RoomStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public RoomWithoutAllocations build() {
            return new RoomWithoutAllocations(
                appId,
                currentAllocation,
                roomConfig,
                roomId,
                status);
        }
    }
}
