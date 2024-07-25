/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;
/**
 * RoomWithoutAllocationsCurrentAllocation - Metadata on an allocated instance of a room.
 */

public class RoomWithoutAllocationsCurrentAllocation {

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
    private Optional<? extends OffsetDateTime> unscheduledAt;

    @JsonCreator
    public RoomWithoutAllocationsCurrentAllocation(
            @JsonProperty("processId") String processId,
            @JsonProperty("roomAllocationId") String roomAllocationId,
            @JsonProperty("scheduledAt") OffsetDateTime scheduledAt,
            @JsonProperty("unscheduledAt") Optional<? extends OffsetDateTime> unscheduledAt) {
        Utils.checkNotNull(processId, "processId");
        Utils.checkNotNull(roomAllocationId, "roomAllocationId");
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        Utils.checkNotNull(unscheduledAt, "unscheduledAt");
        this.processId = processId;
        this.roomAllocationId = roomAllocationId;
        this.scheduledAt = scheduledAt;
        this.unscheduledAt = unscheduledAt;
    }
    
    public RoomWithoutAllocationsCurrentAllocation(
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> unscheduledAt() {
        return (Optional<OffsetDateTime>) unscheduledAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    public RoomWithoutAllocationsCurrentAllocation withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    /**
     * System generated unique identifier to an allocated instance of a room.
     */
    public RoomWithoutAllocationsCurrentAllocation withRoomAllocationId(String roomAllocationId) {
        Utils.checkNotNull(roomAllocationId, "roomAllocationId");
        this.roomAllocationId = roomAllocationId;
        return this;
    }

    public RoomWithoutAllocationsCurrentAllocation withScheduledAt(OffsetDateTime scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = scheduledAt;
        return this;
    }

    public RoomWithoutAllocationsCurrentAllocation withUnscheduledAt(OffsetDateTime unscheduledAt) {
        Utils.checkNotNull(unscheduledAt, "unscheduledAt");
        this.unscheduledAt = Optional.ofNullable(unscheduledAt);
        return this;
    }

    public RoomWithoutAllocationsCurrentAllocation withUnscheduledAt(Optional<? extends OffsetDateTime> unscheduledAt) {
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
        RoomWithoutAllocationsCurrentAllocation other = (RoomWithoutAllocationsCurrentAllocation) o;
        return 
            java.util.Objects.deepEquals(this.processId, other.processId) &&
            java.util.Objects.deepEquals(this.roomAllocationId, other.roomAllocationId) &&
            java.util.Objects.deepEquals(this.scheduledAt, other.scheduledAt) &&
            java.util.Objects.deepEquals(this.unscheduledAt, other.unscheduledAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            processId,
            roomAllocationId,
            scheduledAt,
            unscheduledAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RoomWithoutAllocationsCurrentAllocation.class,
                "processId", processId,
                "roomAllocationId", roomAllocationId,
                "scheduledAt", scheduledAt,
                "unscheduledAt", unscheduledAt);
    }
    
    public final static class Builder {
 
        private String processId;
 
        private String roomAllocationId;
 
        private OffsetDateTime scheduledAt;
 
        private Optional<? extends OffsetDateTime> unscheduledAt = Optional.empty();  
        
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

        public Builder unscheduledAt(Optional<? extends OffsetDateTime> unscheduledAt) {
            Utils.checkNotNull(unscheduledAt, "unscheduledAt");
            this.unscheduledAt = unscheduledAt;
            return this;
        }
        
        public RoomWithoutAllocationsCurrentAllocation build() {
            return new RoomWithoutAllocationsCurrentAllocation(
                processId,
                roomAllocationId,
                scheduledAt,
                unscheduledAt);
        }
    }
}

