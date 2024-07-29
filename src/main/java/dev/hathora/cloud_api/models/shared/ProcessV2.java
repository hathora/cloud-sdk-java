/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class ProcessV2 {

    @JsonProperty("additionalExposedPorts")
    private java.util.List<ExposedPort> additionalExposedPorts;

    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    private String appId;

    /**
     * When the process started being provisioned.
     */
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    /**
     * System generated id for a deployment. Increments by 1.
     */
    @JsonProperty("deploymentId")
    private int deploymentId;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("exposedPort")
    private Optional<? extends ProcessV2ExposedPort> exposedPort;

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonProperty("processId")
    private String processId;

    @JsonProperty("region")
    private Region region;

    /**
     * Tracks the number of rooms that have been allocated to the process.
     */
    @JsonProperty("roomsAllocated")
    private int roomsAllocated;

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonProperty("roomsPerProcess")
    private int roomsPerProcess;

    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("startedAt")
    private Optional<? extends OffsetDateTime> startedAt;

    @JsonProperty("status")
    private ProcessStatus status;

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("stoppingAt")
    private Optional<? extends OffsetDateTime> stoppingAt;

    /**
     * When the process has been terminated.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("terminatedAt")
    private Optional<? extends OffsetDateTime> terminatedAt;

    @JsonCreator
    public ProcessV2(
            @JsonProperty("additionalExposedPorts") java.util.List<ExposedPort> additionalExposedPorts,
            @JsonProperty("appId") String appId,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("deploymentId") int deploymentId,
            @JsonProperty("exposedPort") Optional<? extends ProcessV2ExposedPort> exposedPort,
            @JsonProperty("processId") String processId,
            @JsonProperty("region") Region region,
            @JsonProperty("roomsAllocated") int roomsAllocated,
            @JsonProperty("roomsPerProcess") int roomsPerProcess,
            @JsonProperty("startedAt") Optional<? extends OffsetDateTime> startedAt,
            @JsonProperty("status") ProcessStatus status,
            @JsonProperty("stoppingAt") Optional<? extends OffsetDateTime> stoppingAt,
            @JsonProperty("terminatedAt") Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(deploymentId, "deploymentId");
        Utils.checkNotNull(exposedPort, "exposedPort");
        Utils.checkNotNull(processId, "processId");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(roomsAllocated, "roomsAllocated");
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(stoppingAt, "stoppingAt");
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.additionalExposedPorts = additionalExposedPorts;
        this.appId = appId;
        this.createdAt = createdAt;
        this.deploymentId = deploymentId;
        this.exposedPort = exposedPort;
        this.processId = processId;
        this.region = region;
        this.roomsAllocated = roomsAllocated;
        this.roomsPerProcess = roomsPerProcess;
        this.startedAt = startedAt;
        this.status = status;
        this.stoppingAt = stoppingAt;
        this.terminatedAt = terminatedAt;
    }
    
    public ProcessV2(
            java.util.List<ExposedPort> additionalExposedPorts,
            String appId,
            OffsetDateTime createdAt,
            int deploymentId,
            String processId,
            Region region,
            int roomsAllocated,
            int roomsPerProcess,
            ProcessStatus status) {
        this(additionalExposedPorts, appId, createdAt, deploymentId, Optional.empty(), processId, region, roomsAllocated, roomsPerProcess, Optional.empty(), status, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public java.util.List<ExposedPort> additionalExposedPorts() {
        return additionalExposedPorts;
    }

    /**
     * System generated unique identifier for an application.
     */
    @JsonIgnore
    public String appId() {
        return appId;
    }

    /**
     * When the process started being provisioned.
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * System generated id for a deployment. Increments by 1.
     */
    @JsonIgnore
    public int deploymentId() {
        return deploymentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ProcessV2ExposedPort> exposedPort() {
        return (Optional<ProcessV2ExposedPort>) exposedPort;
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonIgnore
    public String processId() {
        return processId;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    /**
     * Tracks the number of rooms that have been allocated to the process.
     */
    @JsonIgnore
    public int roomsAllocated() {
        return roomsAllocated;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonIgnore
    public int roomsPerProcess() {
        return roomsPerProcess;
    }

    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startedAt() {
        return (Optional<OffsetDateTime>) startedAt;
    }

    @JsonIgnore
    public ProcessStatus status() {
        return status;
    }

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> stoppingAt() {
        return (Optional<OffsetDateTime>) stoppingAt;
    }

    /**
     * When the process has been terminated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> terminatedAt() {
        return (Optional<OffsetDateTime>) terminatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ProcessV2 withAdditionalExposedPorts(java.util.List<ExposedPort> additionalExposedPorts) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        this.additionalExposedPorts = additionalExposedPorts;
        return this;
    }

    /**
     * System generated unique identifier for an application.
     */
    public ProcessV2 withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * When the process started being provisioned.
     */
    public ProcessV2 withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * System generated id for a deployment. Increments by 1.
     */
    public ProcessV2 withDeploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    public ProcessV2 withExposedPort(ProcessV2ExposedPort exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = Optional.ofNullable(exposedPort);
        return this;
    }

    public ProcessV2 withExposedPort(Optional<? extends ProcessV2ExposedPort> exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = exposedPort;
        return this;
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    public ProcessV2 withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public ProcessV2 withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * Tracks the number of rooms that have been allocated to the process.
     */
    public ProcessV2 withRoomsAllocated(int roomsAllocated) {
        Utils.checkNotNull(roomsAllocated, "roomsAllocated");
        this.roomsAllocated = roomsAllocated;
        return this;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public ProcessV2 withRoomsPerProcess(int roomsPerProcess) {
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.roomsPerProcess = roomsPerProcess;
        return this;
    }

    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     */
    public ProcessV2 withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = Optional.ofNullable(startedAt);
        return this;
    }

    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     */
    public ProcessV2 withStartedAt(Optional<? extends OffsetDateTime> startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public ProcessV2 withStatus(ProcessStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    public ProcessV2 withStoppingAt(OffsetDateTime stoppingAt) {
        Utils.checkNotNull(stoppingAt, "stoppingAt");
        this.stoppingAt = Optional.ofNullable(stoppingAt);
        return this;
    }

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    public ProcessV2 withStoppingAt(Optional<? extends OffsetDateTime> stoppingAt) {
        Utils.checkNotNull(stoppingAt, "stoppingAt");
        this.stoppingAt = stoppingAt;
        return this;
    }

    /**
     * When the process has been terminated.
     */
    public ProcessV2 withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    /**
     * When the process has been terminated.
     */
    public ProcessV2 withTerminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = terminatedAt;
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
        ProcessV2 other = (ProcessV2) o;
        return 
            java.util.Objects.deepEquals(this.additionalExposedPorts, other.additionalExposedPorts) &&
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.deepEquals(this.exposedPort, other.exposedPort) &&
            java.util.Objects.deepEquals(this.processId, other.processId) &&
            java.util.Objects.deepEquals(this.region, other.region) &&
            java.util.Objects.deepEquals(this.roomsAllocated, other.roomsAllocated) &&
            java.util.Objects.deepEquals(this.roomsPerProcess, other.roomsPerProcess) &&
            java.util.Objects.deepEquals(this.startedAt, other.startedAt) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.stoppingAt, other.stoppingAt) &&
            java.util.Objects.deepEquals(this.terminatedAt, other.terminatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            additionalExposedPorts,
            appId,
            createdAt,
            deploymentId,
            exposedPort,
            processId,
            region,
            roomsAllocated,
            roomsPerProcess,
            startedAt,
            status,
            stoppingAt,
            terminatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProcessV2.class,
                "additionalExposedPorts", additionalExposedPorts,
                "appId", appId,
                "createdAt", createdAt,
                "deploymentId", deploymentId,
                "exposedPort", exposedPort,
                "processId", processId,
                "region", region,
                "roomsAllocated", roomsAllocated,
                "roomsPerProcess", roomsPerProcess,
                "startedAt", startedAt,
                "status", status,
                "stoppingAt", stoppingAt,
                "terminatedAt", terminatedAt);
    }
    
    public final static class Builder {
 
        private java.util.List<ExposedPort> additionalExposedPorts;
 
        private String appId;
 
        private OffsetDateTime createdAt;
 
        private Integer deploymentId;
 
        private Optional<? extends ProcessV2ExposedPort> exposedPort = Optional.empty();
 
        private String processId;
 
        private Region region;
 
        private Integer roomsAllocated;
 
        private Integer roomsPerProcess;
 
        private Optional<? extends OffsetDateTime> startedAt = Optional.empty();
 
        private ProcessStatus status;
 
        private Optional<? extends OffsetDateTime> stoppingAt = Optional.empty();
 
        private Optional<? extends OffsetDateTime> terminatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder additionalExposedPorts(java.util.List<ExposedPort> additionalExposedPorts) {
            Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
            this.additionalExposedPorts = additionalExposedPorts;
            return this;
        }

        /**
         * System generated unique identifier for an application.
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * When the process started being provisioned.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * System generated id for a deployment. Increments by 1.
         */
        public Builder deploymentId(int deploymentId) {
            Utils.checkNotNull(deploymentId, "deploymentId");
            this.deploymentId = deploymentId;
            return this;
        }

        public Builder exposedPort(ProcessV2ExposedPort exposedPort) {
            Utils.checkNotNull(exposedPort, "exposedPort");
            this.exposedPort = Optional.ofNullable(exposedPort);
            return this;
        }

        public Builder exposedPort(Optional<? extends ProcessV2ExposedPort> exposedPort) {
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

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * Tracks the number of rooms that have been allocated to the process.
         */
        public Builder roomsAllocated(int roomsAllocated) {
            Utils.checkNotNull(roomsAllocated, "roomsAllocated");
            this.roomsAllocated = roomsAllocated;
            return this;
        }

        /**
         * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
         */
        public Builder roomsPerProcess(int roomsPerProcess) {
            Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
            this.roomsPerProcess = roomsPerProcess;
            return this;
        }

        /**
         * When the process bound to the specified port. We use this to determine when we should start billing.
         */
        public Builder startedAt(OffsetDateTime startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = Optional.ofNullable(startedAt);
            return this;
        }

        /**
         * When the process bound to the specified port. We use this to determine when we should start billing.
         */
        public Builder startedAt(Optional<? extends OffsetDateTime> startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
            return this;
        }

        public Builder status(ProcessStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * When the process is issued to stop. We use this to determine when we should stop billing.
         */
        public Builder stoppingAt(OffsetDateTime stoppingAt) {
            Utils.checkNotNull(stoppingAt, "stoppingAt");
            this.stoppingAt = Optional.ofNullable(stoppingAt);
            return this;
        }

        /**
         * When the process is issued to stop. We use this to determine when we should stop billing.
         */
        public Builder stoppingAt(Optional<? extends OffsetDateTime> stoppingAt) {
            Utils.checkNotNull(stoppingAt, "stoppingAt");
            this.stoppingAt = stoppingAt;
            return this;
        }

        /**
         * When the process has been terminated.
         */
        public Builder terminatedAt(OffsetDateTime terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = Optional.ofNullable(terminatedAt);
            return this;
        }

        /**
         * When the process has been terminated.
         */
        public Builder terminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = terminatedAt;
            return this;
        }
        
        public ProcessV2 build() {
            return new ProcessV2(
                additionalExposedPorts,
                appId,
                createdAt,
                deploymentId,
                exposedPort,
                processId,
                region,
                roomsAllocated,
                roomsPerProcess,
                startedAt,
                status,
                stoppingAt,
                terminatedAt);
        }
    }
}

