/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ConnectionInfoV2
 * 
 * <p>Connection information for the default and additional ports.
 */
public class ConnectionInfoV2 {

    @JsonProperty("additionalExposedPorts")
    private List<ExposedPort> additionalExposedPorts;

    /**
     * Connection details for an active process.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exposedPort")
    private Optional<? extends ExposedPort> exposedPort;

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    @JsonProperty("roomId")
    private String roomId;

    @JsonProperty("status")
    private RoomReadyStatus status;

    @JsonCreator
    public ConnectionInfoV2(
            @JsonProperty("additionalExposedPorts") List<ExposedPort> additionalExposedPorts,
            @JsonProperty("exposedPort") Optional<? extends ExposedPort> exposedPort,
            @JsonProperty("roomId") String roomId,
            @JsonProperty("status") RoomReadyStatus status) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        Utils.checkNotNull(exposedPort, "exposedPort");
        Utils.checkNotNull(roomId, "roomId");
        Utils.checkNotNull(status, "status");
        this.additionalExposedPorts = additionalExposedPorts;
        this.exposedPort = exposedPort;
        this.roomId = roomId;
        this.status = status;
    }
    
    public ConnectionInfoV2(
            List<ExposedPort> additionalExposedPorts,
            String roomId,
            RoomReadyStatus status) {
        this(additionalExposedPorts, Optional.empty(), roomId, status);
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

    public ConnectionInfoV2 withAdditionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        this.additionalExposedPorts = additionalExposedPorts;
        return this;
    }

    /**
     * Connection details for an active process.
     */
    public ConnectionInfoV2 withExposedPort(ExposedPort exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = Optional.ofNullable(exposedPort);
        return this;
    }

    /**
     * Connection details for an active process.
     */
    public ConnectionInfoV2 withExposedPort(Optional<? extends ExposedPort> exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = exposedPort;
        return this;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    public ConnectionInfoV2 withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public ConnectionInfoV2 withStatus(RoomReadyStatus status) {
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
        ConnectionInfoV2 other = (ConnectionInfoV2) o;
        return 
            Objects.deepEquals(this.additionalExposedPorts, other.additionalExposedPorts) &&
            Objects.deepEquals(this.exposedPort, other.exposedPort) &&
            Objects.deepEquals(this.roomId, other.roomId) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalExposedPorts,
            exposedPort,
            roomId,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionInfoV2.class,
                "additionalExposedPorts", additionalExposedPorts,
                "exposedPort", exposedPort,
                "roomId", roomId,
                "status", status);
    }
    
    public final static class Builder {
 
        private List<ExposedPort> additionalExposedPorts;
 
        private Optional<? extends ExposedPort> exposedPort = Optional.empty();
 
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
        
        public ConnectionInfoV2 build() {
            return new ConnectionInfoV2(
                additionalExposedPorts,
                exposedPort,
                roomId,
                status);
        }
    }
}
