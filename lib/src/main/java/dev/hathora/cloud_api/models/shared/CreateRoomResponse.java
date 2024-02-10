/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.util.Optional;

/**
 * CreateRoomResponse - Connection information for the default and additional ports.
 */

public class CreateRoomResponse {

    @JsonProperty("additionalExposedPorts")
    private java.util.List<ExposedPort> additionalExposedPorts;

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

    /**
     * `exposedPort` will only be available when the `status` of a room is "active".
     */
    @JsonProperty("status")
    private CreateRoomResponseStatus status;

    public CreateRoomResponse(
            @JsonProperty("additionalExposedPorts") java.util.List<ExposedPort> additionalExposedPorts,
            @JsonProperty("exposedPort") Optional<? extends ExposedPort> exposedPort,
            @JsonProperty("processId") String processId,
            @JsonProperty("roomId") String roomId,
            @JsonProperty("status") CreateRoomResponseStatus status) {
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

    public java.util.List<ExposedPort> additionalExposedPorts() {
        return additionalExposedPorts;
    }

    /**
     * Connection details for an active process.
     */
    public Optional<? extends ExposedPort> exposedPort() {
        return exposedPort;
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    public String processId() {
        return processId;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    public String roomId() {
        return roomId;
    }

    /**
     * `exposedPort` will only be available when the `status` of a room is "active".
     */
    public CreateRoomResponseStatus status() {
        return status;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreateRoomResponse withAdditionalExposedPorts(java.util.List<ExposedPort> additionalExposedPorts) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        this.additionalExposedPorts = additionalExposedPorts;
        return this;
    }

    /**
     * Connection details for an active process.
     */
    public CreateRoomResponse withExposedPort(ExposedPort exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = Optional.ofNullable(exposedPort);
        return this;
    }
    
    /**
     * Connection details for an active process.
     */
    public CreateRoomResponse withExposedPort(Optional<? extends ExposedPort> exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = exposedPort;
        return this;
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    public CreateRoomResponse withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    /**
     * Unique identifier to a game session or match. Use the default system generated ID or overwrite it with your own.
     * Note: error will be returned if `roomId` is not globally unique.
     */
    public CreateRoomResponse withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    /**
     * `exposedPort` will only be available when the `status` of a room is "active".
     */
    public CreateRoomResponse withStatus(CreateRoomResponseStatus status) {
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
        CreateRoomResponse other = (CreateRoomResponse) o;
        return 
            java.util.Objects.deepEquals(this.additionalExposedPorts, other.additionalExposedPorts) &&
            java.util.Objects.deepEquals(this.exposedPort, other.exposedPort) &&
            java.util.Objects.deepEquals(this.processId, other.processId) &&
            java.util.Objects.deepEquals(this.roomId, other.roomId) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            additionalExposedPorts,
            exposedPort,
            processId,
            roomId,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRoomResponse.class,
                "additionalExposedPorts", additionalExposedPorts,
                "exposedPort", exposedPort,
                "processId", processId,
                "roomId", roomId,
                "status", status);
    }
    
    public final static class Builder {
 
        private java.util.List<ExposedPort> additionalExposedPorts;
 
        private Optional<? extends ExposedPort> exposedPort = Optional.empty();
 
        private String processId;
 
        private String roomId;
 
        private CreateRoomResponseStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalExposedPorts(java.util.List<ExposedPort> additionalExposedPorts) {
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

        /**
         * `exposedPort` will only be available when the `status` of a room is "active".
         */
        public Builder status(CreateRoomResponseStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public CreateRoomResponse build() {
            return new CreateRoomResponse(
                additionalExposedPorts,
                exposedPort,
                processId,
                roomId,
                status);
        }
    }
}

