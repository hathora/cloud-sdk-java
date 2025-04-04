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
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ProcessWithRooms
 * 
 * <p>A process object represents a runtime instance of your game server and its metadata.
 */
public class ProcessWithRooms {

    /**
     * Tracks the number of active connections to a process.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("activeConnections")
    @Deprecated
    private int activeConnections;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("activeConnectionsUpdatedAt")
    @Deprecated
    private OffsetDateTime activeConnectionsUpdatedAt;

    @JsonProperty("additionalExposedPorts")
    private List<ExposedPort> additionalExposedPorts;

    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    private String appId;

    /**
     * System generated id for a deployment. Increments by 1.
     */
    @JsonProperty("deploymentId")
    private int deploymentId;

    /**
     * Process in drain will not accept any new rooms.
     */
    @JsonProperty("draining")
    private boolean draining;

    /**
     * Measures network traffic leaving the process in bytes.
     */
    @JsonProperty("egressedBytes")
    private int egressedBytes;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("exposedPort")
    private Optional<? extends ProcessWithRoomsExposedPort> exposedPort;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("host")
    @Deprecated
    private String host;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("idleSince")
    @Deprecated
    private Optional<OffsetDateTime> idleSince;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("port")
    @Deprecated
    private double port;

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonProperty("processId")
    private String processId;

    @JsonProperty("region")
    private Region region;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("roomSlotsAvailable")
    @Deprecated
    private double roomSlotsAvailable;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("roomSlotsAvailableUpdatedAt")
    @Deprecated
    private OffsetDateTime roomSlotsAvailableUpdatedAt;

    @JsonProperty("rooms")
    private List<RoomWithoutAllocations> rooms;

    /**
     * Tracks the number of rooms that have been allocated to the process.
     */
    @JsonProperty("roomsAllocated")
    private int roomsAllocated;

    @JsonProperty("roomsAllocatedUpdatedAt")
    private OffsetDateTime roomsAllocatedUpdatedAt;

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
    private Optional<OffsetDateTime> startedAt;

    /**
     * When the process started being provisioned.
     */
    @JsonProperty("startingAt")
    private OffsetDateTime startingAt;

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("stoppingAt")
    private Optional<OffsetDateTime> stoppingAt;

    /**
     * When the process has been terminated.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("terminatedAt")
    private Optional<OffsetDateTime> terminatedAt;

    @JsonProperty("totalRooms")
    private int totalRooms;

    @JsonCreator
    public ProcessWithRooms(
            @JsonProperty("activeConnections") int activeConnections,
            @JsonProperty("activeConnectionsUpdatedAt") OffsetDateTime activeConnectionsUpdatedAt,
            @JsonProperty("additionalExposedPorts") List<ExposedPort> additionalExposedPorts,
            @JsonProperty("appId") String appId,
            @JsonProperty("deploymentId") int deploymentId,
            @JsonProperty("draining") boolean draining,
            @JsonProperty("egressedBytes") int egressedBytes,
            @JsonProperty("exposedPort") Optional<? extends ProcessWithRoomsExposedPort> exposedPort,
            @JsonProperty("host") String host,
            @JsonProperty("idleSince") Optional<OffsetDateTime> idleSince,
            @JsonProperty("port") double port,
            @JsonProperty("processId") String processId,
            @JsonProperty("region") Region region,
            @JsonProperty("roomSlotsAvailable") double roomSlotsAvailable,
            @JsonProperty("roomSlotsAvailableUpdatedAt") OffsetDateTime roomSlotsAvailableUpdatedAt,
            @JsonProperty("rooms") List<RoomWithoutAllocations> rooms,
            @JsonProperty("roomsAllocated") int roomsAllocated,
            @JsonProperty("roomsAllocatedUpdatedAt") OffsetDateTime roomsAllocatedUpdatedAt,
            @JsonProperty("roomsPerProcess") int roomsPerProcess,
            @JsonProperty("startedAt") Optional<OffsetDateTime> startedAt,
            @JsonProperty("startingAt") OffsetDateTime startingAt,
            @JsonProperty("stoppingAt") Optional<OffsetDateTime> stoppingAt,
            @JsonProperty("terminatedAt") Optional<OffsetDateTime> terminatedAt,
            @JsonProperty("totalRooms") int totalRooms) {
        Utils.checkNotNull(activeConnections, "activeConnections");
        Utils.checkNotNull(activeConnectionsUpdatedAt, "activeConnectionsUpdatedAt");
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(deploymentId, "deploymentId");
        Utils.checkNotNull(draining, "draining");
        Utils.checkNotNull(egressedBytes, "egressedBytes");
        Utils.checkNotNull(exposedPort, "exposedPort");
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(idleSince, "idleSince");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(processId, "processId");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(roomSlotsAvailable, "roomSlotsAvailable");
        Utils.checkNotNull(roomSlotsAvailableUpdatedAt, "roomSlotsAvailableUpdatedAt");
        Utils.checkNotNull(rooms, "rooms");
        Utils.checkNotNull(roomsAllocated, "roomsAllocated");
        Utils.checkNotNull(roomsAllocatedUpdatedAt, "roomsAllocatedUpdatedAt");
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(startingAt, "startingAt");
        Utils.checkNotNull(stoppingAt, "stoppingAt");
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        Utils.checkNotNull(totalRooms, "totalRooms");
        this.activeConnections = activeConnections;
        this.activeConnectionsUpdatedAt = activeConnectionsUpdatedAt;
        this.additionalExposedPorts = additionalExposedPorts;
        this.appId = appId;
        this.deploymentId = deploymentId;
        this.draining = draining;
        this.egressedBytes = egressedBytes;
        this.exposedPort = exposedPort;
        this.host = host;
        this.idleSince = idleSince;
        this.port = port;
        this.processId = processId;
        this.region = region;
        this.roomSlotsAvailable = roomSlotsAvailable;
        this.roomSlotsAvailableUpdatedAt = roomSlotsAvailableUpdatedAt;
        this.rooms = rooms;
        this.roomsAllocated = roomsAllocated;
        this.roomsAllocatedUpdatedAt = roomsAllocatedUpdatedAt;
        this.roomsPerProcess = roomsPerProcess;
        this.startedAt = startedAt;
        this.startingAt = startingAt;
        this.stoppingAt = stoppingAt;
        this.terminatedAt = terminatedAt;
        this.totalRooms = totalRooms;
    }
    
    public ProcessWithRooms(
            int activeConnections,
            OffsetDateTime activeConnectionsUpdatedAt,
            List<ExposedPort> additionalExposedPorts,
            String appId,
            int deploymentId,
            boolean draining,
            int egressedBytes,
            String host,
            double port,
            String processId,
            Region region,
            double roomSlotsAvailable,
            OffsetDateTime roomSlotsAvailableUpdatedAt,
            List<RoomWithoutAllocations> rooms,
            int roomsAllocated,
            OffsetDateTime roomsAllocatedUpdatedAt,
            int roomsPerProcess,
            OffsetDateTime startingAt,
            int totalRooms) {
        this(activeConnections, activeConnectionsUpdatedAt, additionalExposedPorts, appId, deploymentId, draining, egressedBytes, Optional.empty(), host, Optional.empty(), port, processId, region, roomSlotsAvailable, roomSlotsAvailableUpdatedAt, rooms, roomsAllocated, roomsAllocatedUpdatedAt, roomsPerProcess, Optional.empty(), startingAt, Optional.empty(), Optional.empty(), totalRooms);
    }

    /**
     * Tracks the number of active connections to a process.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public int activeConnections() {
        return activeConnections;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public OffsetDateTime activeConnectionsUpdatedAt() {
        return activeConnectionsUpdatedAt;
    }

    @JsonIgnore
    public List<ExposedPort> additionalExposedPorts() {
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
     * System generated id for a deployment. Increments by 1.
     */
    @JsonIgnore
    public int deploymentId() {
        return deploymentId;
    }

    /**
     * Process in drain will not accept any new rooms.
     */
    @JsonIgnore
    public boolean draining() {
        return draining;
    }

    /**
     * Measures network traffic leaving the process in bytes.
     */
    @JsonIgnore
    public int egressedBytes() {
        return egressedBytes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ProcessWithRoomsExposedPort> exposedPort() {
        return (Optional<ProcessWithRoomsExposedPort>) exposedPort;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public String host() {
        return host;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public Optional<OffsetDateTime> idleSince() {
        return idleSince;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public double port() {
        return port;
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
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public double roomSlotsAvailable() {
        return roomSlotsAvailable;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public OffsetDateTime roomSlotsAvailableUpdatedAt() {
        return roomSlotsAvailableUpdatedAt;
    }

    @JsonIgnore
    public List<RoomWithoutAllocations> rooms() {
        return rooms;
    }

    /**
     * Tracks the number of rooms that have been allocated to the process.
     */
    @JsonIgnore
    public int roomsAllocated() {
        return roomsAllocated;
    }

    @JsonIgnore
    public OffsetDateTime roomsAllocatedUpdatedAt() {
        return roomsAllocatedUpdatedAt;
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
    @JsonIgnore
    public Optional<OffsetDateTime> startedAt() {
        return startedAt;
    }

    /**
     * When the process started being provisioned.
     */
    @JsonIgnore
    public OffsetDateTime startingAt() {
        return startingAt;
    }

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> stoppingAt() {
        return stoppingAt;
    }

    /**
     * When the process has been terminated.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> terminatedAt() {
        return terminatedAt;
    }

    @JsonIgnore
    public int totalRooms() {
        return totalRooms;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Tracks the number of active connections to a process.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withActiveConnections(int activeConnections) {
        Utils.checkNotNull(activeConnections, "activeConnections");
        this.activeConnections = activeConnections;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withActiveConnectionsUpdatedAt(OffsetDateTime activeConnectionsUpdatedAt) {
        Utils.checkNotNull(activeConnectionsUpdatedAt, "activeConnectionsUpdatedAt");
        this.activeConnectionsUpdatedAt = activeConnectionsUpdatedAt;
        return this;
    }

    public ProcessWithRooms withAdditionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
        Utils.checkNotNull(additionalExposedPorts, "additionalExposedPorts");
        this.additionalExposedPorts = additionalExposedPorts;
        return this;
    }

    /**
     * System generated unique identifier for an application.
     */
    public ProcessWithRooms withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * System generated id for a deployment. Increments by 1.
     */
    public ProcessWithRooms withDeploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Process in drain will not accept any new rooms.
     */
    public ProcessWithRooms withDraining(boolean draining) {
        Utils.checkNotNull(draining, "draining");
        this.draining = draining;
        return this;
    }

    /**
     * Measures network traffic leaving the process in bytes.
     */
    public ProcessWithRooms withEgressedBytes(int egressedBytes) {
        Utils.checkNotNull(egressedBytes, "egressedBytes");
        this.egressedBytes = egressedBytes;
        return this;
    }

    public ProcessWithRooms withExposedPort(ProcessWithRoomsExposedPort exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = Optional.ofNullable(exposedPort);
        return this;
    }

    public ProcessWithRooms withExposedPort(Optional<? extends ProcessWithRoomsExposedPort> exposedPort) {
        Utils.checkNotNull(exposedPort, "exposedPort");
        this.exposedPort = exposedPort;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withIdleSince(OffsetDateTime idleSince) {
        Utils.checkNotNull(idleSince, "idleSince");
        this.idleSince = Optional.ofNullable(idleSince);
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withIdleSince(Optional<OffsetDateTime> idleSince) {
        Utils.checkNotNull(idleSince, "idleSince");
        this.idleSince = idleSince;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withPort(double port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    public ProcessWithRooms withProcessId(String processId) {
        Utils.checkNotNull(processId, "processId");
        this.processId = processId;
        return this;
    }

    public ProcessWithRooms withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withRoomSlotsAvailable(double roomSlotsAvailable) {
        Utils.checkNotNull(roomSlotsAvailable, "roomSlotsAvailable");
        this.roomSlotsAvailable = roomSlotsAvailable;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ProcessWithRooms withRoomSlotsAvailableUpdatedAt(OffsetDateTime roomSlotsAvailableUpdatedAt) {
        Utils.checkNotNull(roomSlotsAvailableUpdatedAt, "roomSlotsAvailableUpdatedAt");
        this.roomSlotsAvailableUpdatedAt = roomSlotsAvailableUpdatedAt;
        return this;
    }

    public ProcessWithRooms withRooms(List<RoomWithoutAllocations> rooms) {
        Utils.checkNotNull(rooms, "rooms");
        this.rooms = rooms;
        return this;
    }

    /**
     * Tracks the number of rooms that have been allocated to the process.
     */
    public ProcessWithRooms withRoomsAllocated(int roomsAllocated) {
        Utils.checkNotNull(roomsAllocated, "roomsAllocated");
        this.roomsAllocated = roomsAllocated;
        return this;
    }

    public ProcessWithRooms withRoomsAllocatedUpdatedAt(OffsetDateTime roomsAllocatedUpdatedAt) {
        Utils.checkNotNull(roomsAllocatedUpdatedAt, "roomsAllocatedUpdatedAt");
        this.roomsAllocatedUpdatedAt = roomsAllocatedUpdatedAt;
        return this;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public ProcessWithRooms withRoomsPerProcess(int roomsPerProcess) {
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.roomsPerProcess = roomsPerProcess;
        return this;
    }

    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     */
    public ProcessWithRooms withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = Optional.ofNullable(startedAt);
        return this;
    }

    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     */
    public ProcessWithRooms withStartedAt(Optional<OffsetDateTime> startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    /**
     * When the process started being provisioned.
     */
    public ProcessWithRooms withStartingAt(OffsetDateTime startingAt) {
        Utils.checkNotNull(startingAt, "startingAt");
        this.startingAt = startingAt;
        return this;
    }

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    public ProcessWithRooms withStoppingAt(OffsetDateTime stoppingAt) {
        Utils.checkNotNull(stoppingAt, "stoppingAt");
        this.stoppingAt = Optional.ofNullable(stoppingAt);
        return this;
    }

    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    public ProcessWithRooms withStoppingAt(Optional<OffsetDateTime> stoppingAt) {
        Utils.checkNotNull(stoppingAt, "stoppingAt");
        this.stoppingAt = stoppingAt;
        return this;
    }

    /**
     * When the process has been terminated.
     */
    public ProcessWithRooms withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    /**
     * When the process has been terminated.
     */
    public ProcessWithRooms withTerminatedAt(Optional<OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = terminatedAt;
        return this;
    }

    public ProcessWithRooms withTotalRooms(int totalRooms) {
        Utils.checkNotNull(totalRooms, "totalRooms");
        this.totalRooms = totalRooms;
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
        ProcessWithRooms other = (ProcessWithRooms) o;
        return 
            Objects.deepEquals(this.activeConnections, other.activeConnections) &&
            Objects.deepEquals(this.activeConnectionsUpdatedAt, other.activeConnectionsUpdatedAt) &&
            Objects.deepEquals(this.additionalExposedPorts, other.additionalExposedPorts) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.deploymentId, other.deploymentId) &&
            Objects.deepEquals(this.draining, other.draining) &&
            Objects.deepEquals(this.egressedBytes, other.egressedBytes) &&
            Objects.deepEquals(this.exposedPort, other.exposedPort) &&
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.idleSince, other.idleSince) &&
            Objects.deepEquals(this.port, other.port) &&
            Objects.deepEquals(this.processId, other.processId) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.roomSlotsAvailable, other.roomSlotsAvailable) &&
            Objects.deepEquals(this.roomSlotsAvailableUpdatedAt, other.roomSlotsAvailableUpdatedAt) &&
            Objects.deepEquals(this.rooms, other.rooms) &&
            Objects.deepEquals(this.roomsAllocated, other.roomsAllocated) &&
            Objects.deepEquals(this.roomsAllocatedUpdatedAt, other.roomsAllocatedUpdatedAt) &&
            Objects.deepEquals(this.roomsPerProcess, other.roomsPerProcess) &&
            Objects.deepEquals(this.startedAt, other.startedAt) &&
            Objects.deepEquals(this.startingAt, other.startingAt) &&
            Objects.deepEquals(this.stoppingAt, other.stoppingAt) &&
            Objects.deepEquals(this.terminatedAt, other.terminatedAt) &&
            Objects.deepEquals(this.totalRooms, other.totalRooms);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            activeConnections,
            activeConnectionsUpdatedAt,
            additionalExposedPorts,
            appId,
            deploymentId,
            draining,
            egressedBytes,
            exposedPort,
            host,
            idleSince,
            port,
            processId,
            region,
            roomSlotsAvailable,
            roomSlotsAvailableUpdatedAt,
            rooms,
            roomsAllocated,
            roomsAllocatedUpdatedAt,
            roomsPerProcess,
            startedAt,
            startingAt,
            stoppingAt,
            terminatedAt,
            totalRooms);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProcessWithRooms.class,
                "activeConnections", activeConnections,
                "activeConnectionsUpdatedAt", activeConnectionsUpdatedAt,
                "additionalExposedPorts", additionalExposedPorts,
                "appId", appId,
                "deploymentId", deploymentId,
                "draining", draining,
                "egressedBytes", egressedBytes,
                "exposedPort", exposedPort,
                "host", host,
                "idleSince", idleSince,
                "port", port,
                "processId", processId,
                "region", region,
                "roomSlotsAvailable", roomSlotsAvailable,
                "roomSlotsAvailableUpdatedAt", roomSlotsAvailableUpdatedAt,
                "rooms", rooms,
                "roomsAllocated", roomsAllocated,
                "roomsAllocatedUpdatedAt", roomsAllocatedUpdatedAt,
                "roomsPerProcess", roomsPerProcess,
                "startedAt", startedAt,
                "startingAt", startingAt,
                "stoppingAt", stoppingAt,
                "terminatedAt", terminatedAt,
                "totalRooms", totalRooms);
    }
    
    public final static class Builder {
 
        @Deprecated
        private Integer activeConnections;
 
        @Deprecated
        private OffsetDateTime activeConnectionsUpdatedAt;
 
        private List<ExposedPort> additionalExposedPorts;
 
        private String appId;
 
        private Integer deploymentId;
 
        private Boolean draining;
 
        private Integer egressedBytes;
 
        private Optional<? extends ProcessWithRoomsExposedPort> exposedPort = Optional.empty();
 
        @Deprecated
        private String host;
 
        @Deprecated
        private Optional<OffsetDateTime> idleSince = Optional.empty();
 
        @Deprecated
        private Double port;
 
        private String processId;
 
        private Region region;
 
        @Deprecated
        private Double roomSlotsAvailable;
 
        @Deprecated
        private OffsetDateTime roomSlotsAvailableUpdatedAt;
 
        private List<RoomWithoutAllocations> rooms;
 
        private Integer roomsAllocated;
 
        private OffsetDateTime roomsAllocatedUpdatedAt;
 
        private Integer roomsPerProcess;
 
        private Optional<OffsetDateTime> startedAt = Optional.empty();
 
        private OffsetDateTime startingAt;
 
        private Optional<OffsetDateTime> stoppingAt = Optional.empty();
 
        private Optional<OffsetDateTime> terminatedAt = Optional.empty();
 
        private Integer totalRooms;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Tracks the number of active connections to a process.
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder activeConnections(int activeConnections) {
            Utils.checkNotNull(activeConnections, "activeConnections");
            this.activeConnections = activeConnections;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder activeConnectionsUpdatedAt(OffsetDateTime activeConnectionsUpdatedAt) {
            Utils.checkNotNull(activeConnectionsUpdatedAt, "activeConnectionsUpdatedAt");
            this.activeConnectionsUpdatedAt = activeConnectionsUpdatedAt;
            return this;
        }

        public Builder additionalExposedPorts(List<ExposedPort> additionalExposedPorts) {
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
         * System generated id for a deployment. Increments by 1.
         */
        public Builder deploymentId(int deploymentId) {
            Utils.checkNotNull(deploymentId, "deploymentId");
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * Process in drain will not accept any new rooms.
         */
        public Builder draining(boolean draining) {
            Utils.checkNotNull(draining, "draining");
            this.draining = draining;
            return this;
        }

        /**
         * Measures network traffic leaving the process in bytes.
         */
        public Builder egressedBytes(int egressedBytes) {
            Utils.checkNotNull(egressedBytes, "egressedBytes");
            this.egressedBytes = egressedBytes;
            return this;
        }

        public Builder exposedPort(ProcessWithRoomsExposedPort exposedPort) {
            Utils.checkNotNull(exposedPort, "exposedPort");
            this.exposedPort = Optional.ofNullable(exposedPort);
            return this;
        }

        public Builder exposedPort(Optional<? extends ProcessWithRoomsExposedPort> exposedPort) {
            Utils.checkNotNull(exposedPort, "exposedPort");
            this.exposedPort = exposedPort;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder idleSince(OffsetDateTime idleSince) {
            Utils.checkNotNull(idleSince, "idleSince");
            this.idleSince = Optional.ofNullable(idleSince);
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder idleSince(Optional<OffsetDateTime> idleSince) {
            Utils.checkNotNull(idleSince, "idleSince");
            this.idleSince = idleSince;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder port(double port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
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
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder roomSlotsAvailable(double roomSlotsAvailable) {
            Utils.checkNotNull(roomSlotsAvailable, "roomSlotsAvailable");
            this.roomSlotsAvailable = roomSlotsAvailable;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder roomSlotsAvailableUpdatedAt(OffsetDateTime roomSlotsAvailableUpdatedAt) {
            Utils.checkNotNull(roomSlotsAvailableUpdatedAt, "roomSlotsAvailableUpdatedAt");
            this.roomSlotsAvailableUpdatedAt = roomSlotsAvailableUpdatedAt;
            return this;
        }

        public Builder rooms(List<RoomWithoutAllocations> rooms) {
            Utils.checkNotNull(rooms, "rooms");
            this.rooms = rooms;
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

        public Builder roomsAllocatedUpdatedAt(OffsetDateTime roomsAllocatedUpdatedAt) {
            Utils.checkNotNull(roomsAllocatedUpdatedAt, "roomsAllocatedUpdatedAt");
            this.roomsAllocatedUpdatedAt = roomsAllocatedUpdatedAt;
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
        public Builder startedAt(Optional<OffsetDateTime> startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
            return this;
        }

        /**
         * When the process started being provisioned.
         */
        public Builder startingAt(OffsetDateTime startingAt) {
            Utils.checkNotNull(startingAt, "startingAt");
            this.startingAt = startingAt;
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
        public Builder stoppingAt(Optional<OffsetDateTime> stoppingAt) {
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
        public Builder terminatedAt(Optional<OffsetDateTime> terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = terminatedAt;
            return this;
        }

        public Builder totalRooms(int totalRooms) {
            Utils.checkNotNull(totalRooms, "totalRooms");
            this.totalRooms = totalRooms;
            return this;
        }
        
        public ProcessWithRooms build() {
            return new ProcessWithRooms(
                activeConnections,
                activeConnectionsUpdatedAt,
                additionalExposedPorts,
                appId,
                deploymentId,
                draining,
                egressedBytes,
                exposedPort,
                host,
                idleSince,
                port,
                processId,
                region,
                roomSlotsAvailable,
                roomSlotsAvailableUpdatedAt,
                rooms,
                roomsAllocated,
                roomsAllocatedUpdatedAt,
                roomsPerProcess,
                startedAt,
                startingAt,
                stoppingAt,
                terminatedAt,
                totalRooms);
        }
    }
}
