/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * RoomConnectionData - Connection information for the default and additional ports.
 */

public class RoomConnectionData {

    @JsonProperty("additionalExposedPorts")
    private List<ExposedPort> additionalExposedPorts;

    /**
     * Connection details for an active process.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exposedPort")
    private Optional<? extends ExposedPort> exposedPort;

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonProperty("processId")
    private String processId;

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonProperty("roomId")
    private String roomId;

    @JsonProperty("status")
    private RoomReadyStatus status;

    @JsonCreator
    public RoomConnectionData(
            @JsonProperty("additionalExposedPorts") List<ExposedPort> additionalExposedPorts,
            @JsonProperty("exposedPort") Optional<? extends ExposedPort> exposedPort,
            @JsonProperty("processId") String processId,
            @JsonProperty("roomId") String roomId,
            @JsonProperty("status") RoomReadyStatus status) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        Utils.checkNotNull(exposedPort, "exposedPort");
        Utils.checkNotNull(processId, "processId");
        Utils.checkNotNull(roomId, "roomId");
        Utils.checkNotNull(status, "status");
        this.additionalExposedPorts = additionalExposedPorts;
        this.exposedPort = exposedPort;
        this.processId = processId;
        this.roomId = roomId;
        this.status = status;
    }
    
    public RoomConnectionData(
            List<ExposedPort> additionalExposedPorts,
            String processId,
            String roomId,
            RoomReadyStatus status) {
        this(additionalExposedPorts, Optional.empty(), processId, roomId, status);
    }

    @JsonIgnore
    public List<ExposedPort> additionalExposedPorts() {
        return additionalExposedPorts;
    }

    /**
     * Connection details for an active process.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ExposedPort> exposedPort() {
        return (Optional<ExposedPort>) exposedPort;
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonIgnore
    public String processId() {
        return processId;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonIgnore
    public String roomId() {
        return roomId;
    }

    @JsonIgnore
    public RoomReadyStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RoomConnectionData withAdditionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        this.additionalExposedPorts = additionalExposedPorts;
        return this;
    }

    /**
     * Connection details for an active process.
     */
    public RoomConnectionData withExposedPort(ExposedPort exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = Optional.ofNullable(exposedPort);
        return this;
    }

    /**
     * Connection details for an active process.
     */
    public RoomConnectionData withExposedPort(Optional<? extends ExposedPort> exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = exposedPort;
        return this;
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    public RoomConnectionData withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    public RoomConnectionData withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public RoomConnectionData withStatus(RoomReadyStatus status) {
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
        RoomConnectionData other = (RoomConnectionData) o;
        return 
            Objects.deepEquals(this.additionalExposedPorts, other.additionalExposedPorts) &&
            Objects.deepEquals(this.exposedPort, other.exposedPort) &&
            Objects.deepEquals(this.processId, other.processId) &&
            Objects.deepEquals(this.roomId, other.roomId) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalExposedPorts,
            exposedPort,
            processId,
            roomId,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RoomConnectionData.class,
                "additionalExposedPorts", additionalExposedPorts,
                "exposedPort", exposedPort,
                "processId", processId,
                "roomId", roomId,
                "status", status);
    }
    
    public final static class Builder {
 
        private List<ExposedPort> additionalExposedPorts;
 
        private Optional<? extends ExposedPort> exposedPort = Optional.empty();
 
        private String processId;
 
        private String roomId;
 
        private RoomReadyStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
            Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
            this.additionalExposedPorts = additionalExposedPorts;
            return this;
        }

        /**
         * Connection details for an active process.
         */
        public Builder exposedPort(ExposedPort exposedPort) {
            Utils.checkNotNull(exposedPort, "exposedPort");
            this.exposedPort = Optional.ofNullable(exposedPort);
            return this;
        }

        /**
         * Connection details for an active process.
         */
        public Builder exposedPort(Optional<? extends ExposedPort> exposedPort) {
            Utils.checkNotNull(exposedPort, "exposedPort");
            this.exposedPort = exposedPort;
            return this;
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
         * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
         * Note: error will be returned if `roomId` is not globally unique.
         */
        public Builder roomId(String roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
            return this;
        }

        public Builder status(RoomReadyStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public RoomConnectionData build() {
            return new RoomConnectionData(
                additionalExposedPorts,
                exposedPort,
                processId,
                roomId,
                status);
        }
    }
}
