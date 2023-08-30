/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RoomWithoutAllocations - From T, pick a set of properties whose keys are in the union K
 */

public class RoomWithoutAllocations {
    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    public String appId;

    public RoomWithoutAllocations withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @JsonProperty("currentAllocation")
    public RoomWithoutAllocationsCurrentAllocation currentAllocation;

    public RoomWithoutAllocations withCurrentAllocation(RoomWithoutAllocationsCurrentAllocation currentAllocation) {
        this.currentAllocation = currentAllocation;
        return this;
    }
    
    /**
     * Unique identifier to a game session or match. Use either a system generated ID or pass in your own.
     */
    @JsonProperty("roomId")
    public String roomId;

    public RoomWithoutAllocations withRoomId(String roomId) {
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
     * `suspended`: room is unallocated from the process but can be rescheduled later with the same `roomId`
     * 
     * `destroyed`: all associated metadata is deleted
     */
    @JsonProperty("status")
    public RoomStatus status;

    public RoomWithoutAllocations withStatus(RoomStatus status) {
        this.status = status;
        return this;
    }
    
    public RoomWithoutAllocations(@JsonProperty("appId") String appId, @JsonProperty("currentAllocation") RoomWithoutAllocationsCurrentAllocation currentAllocation, @JsonProperty("roomId") String roomId, @JsonProperty("status") RoomStatus status) {
        this.appId = appId;
        this.currentAllocation = currentAllocation;
        this.roomId = roomId;
        this.status = status;
  }
}
