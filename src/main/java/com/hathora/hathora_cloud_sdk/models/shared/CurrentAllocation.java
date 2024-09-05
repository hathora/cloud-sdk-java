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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * CurrentAllocation - Metadata on an allocated instance of a room.
 */

public class CurrentAllocation {

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonProperty("processId")
    private String processId;

    /**
     * System generated unique identifier to an allocated instance of a room.
     */
    @JsonProperty("roomAllocationId")
    private String roomAllocationId;

    @JsonProperty("scheduledAt")
    private OffsetDateTime scheduledAt;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("unscheduledAt")
    private Optional<OffsetDateTime> unscheduledAt;

    @JsonCreator
    public CurrentAllocation(
            @JsonProperty("processId") String processId,
            @JsonProperty("roomAllocationId") String roomAllocationId,
            @JsonProperty("scheduledAt") OffsetDateTime scheduledAt,
            @JsonProperty("unscheduledAt") Optional<OffsetDateTime> unscheduledAt) {
        Utils.checkNotNull(processId, "processId");
        Utils.checkNotNull(roomAllocationId, "roomAllocationId");
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        Utils.checkNotNull(unscheduledAt, "unscheduledAt");
        this.processId = processId;
        this.roomAllocationId = roomAllocationId;
        this.scheduledAt = scheduledAt;
        this.unscheduledAt = unscheduledAt;
    }
    
    public CurrentAllocation(
            String processId,
            String roomAllocationId,
            OffsetDateTime scheduledAt) {
        this(processId, roomAllocationId, scheduledAt, Optional.empty());
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonIgnore
    public String processId() {
        return processId;
    }

    /**
     * System generated unique identifier to an allocated instance of a room.
     */
    @JsonIgnore
    public String roomAllocationId() {
        return roomAllocationId;
    }

    @JsonIgnore
    public OffsetDateTime scheduledAt() {
        return scheduledAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> unscheduledAt() {
        return unscheduledAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    public CurrentAllocation withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    /**
     * System generated unique identifier to an allocated instance of a room.
     */
    public CurrentAllocation withRoomAllocationId(String roomAllocationId) {
        Utils.checkNotNull(roomAllocationId, "roomAllocationId");
        this.roomAllocationId = roomAllocationId;
        return this;
    }

    public CurrentAllocation withScheduledAt(OffsetDateTime scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = scheduledAt;
        return this;
    }

    public CurrentAllocation withUnscheduledAt(OffsetDateTime unscheduledAt) {
        Utils.checkNotNull(unscheduledAt, "unscheduledAt");
        this.unscheduledAt = Optional.ofNullable(unscheduledAt);
        return this;
    }

    public CurrentAllocation withUnscheduledAt(Optional<OffsetDateTime> unscheduledAt) {
        Utils.checkNotNull(unscheduledAt, "unscheduledAt");
        this.unscheduledAt = unscheduledAt;
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
        CurrentAllocation other = (CurrentAllocation) o;
        return 
            Objects.deepEquals(this.processId, other.processId) &&
            Objects.deepEquals(this.roomAllocationId, other.roomAllocationId) &&
            Objects.deepEquals(this.scheduledAt, other.scheduledAt) &&
            Objects.deepEquals(this.unscheduledAt, other.unscheduledAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            processId,
            roomAllocationId,
            scheduledAt,
            unscheduledAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CurrentAllocation.class,
                "processId", processId,
                "roomAllocationId", roomAllocationId,
                "scheduledAt", scheduledAt,
                "unscheduledAt", unscheduledAt);
    }
    
    public final static class Builder {
 
        private String processId;
 
        private String roomAllocationId;
 
        private OffsetDateTime scheduledAt;
 
        private Optional<OffsetDateTime> unscheduledAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * System generated unique identifier to a runtime instance of your game server.
         */
        public Builder processId(String processId) {
            Utils.checkNotNull(processId, "processId");
            this.processId = processId;
            return this;
        }

        /**
         * System generated unique identifier to an allocated instance of a room.
         */
        public Builder roomAllocationId(String roomAllocationId) {
            Utils.checkNotNull(roomAllocationId, "roomAllocationId");
            this.roomAllocationId = roomAllocationId;
            return this;
        }

        public Builder scheduledAt(OffsetDateTime scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = scheduledAt;
            return this;
        }

        public Builder unscheduledAt(OffsetDateTime unscheduledAt) {
            Utils.checkNotNull(unscheduledAt, "unscheduledAt");
            this.unscheduledAt = Optional.ofNullable(unscheduledAt);
            return this;
        }

        public Builder unscheduledAt(Optional<OffsetDateTime> unscheduledAt) {
            Utils.checkNotNull(unscheduledAt, "unscheduledAt");
            this.unscheduledAt = unscheduledAt;
            return this;
        }
        
        public CurrentAllocation build() {
            return new CurrentAllocation(
                processId,
                roomAllocationId,
                scheduledAt,
                unscheduledAt);
        }
    }
}
