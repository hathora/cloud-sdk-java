/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.hathora.cloud_api.utils.DateTimeDeserializer;
import dev.hathora.cloud_api.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * ProcessWithRooms - A process object represents a runtime instance of your game server and its metadata.
 */

public class ProcessWithRooms {
    /**
     * Tracks the number of active connections to a process.
     */
    @JsonProperty("activeConnections")
    public Double activeConnections;

    public ProcessWithRooms withActiveConnections(Double activeConnections) {
        this.activeConnections = activeConnections;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("activeConnectionsUpdatedAt")
    public OffsetDateTime activeConnectionsUpdatedAt;

    public ProcessWithRooms withActiveConnectionsUpdatedAt(OffsetDateTime activeConnectionsUpdatedAt) {
        this.activeConnectionsUpdatedAt = activeConnectionsUpdatedAt;
        return this;
    }
    
    @JsonProperty("additionalExposedPorts")
    public ExposedPort[] additionalExposedPorts;

    public ProcessWithRooms withAdditionalExposedPorts(ExposedPort[] additionalExposedPorts) {
        this.additionalExposedPorts = additionalExposedPorts;
        return this;
    }
    
    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    public String appId;

    public ProcessWithRooms withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * System generated id for a deployment. Increments by 1.
     */
    @JsonProperty("deploymentId")
    public Integer deploymentId;

    public ProcessWithRooms withDeploymentId(Integer deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    
    /**
     * Process in drain will not accept any new rooms.
     */
    @JsonProperty("draining")
    public Boolean draining;

    public ProcessWithRooms withDraining(Boolean draining) {
        this.draining = draining;
        return this;
    }
    
    /**
     * Measures network traffic leaving the process in bytes.
     */
    @JsonProperty("egressedBytes")
    public Double egressedBytes;

    public ProcessWithRooms withEgressedBytes(Double egressedBytes) {
        this.egressedBytes = egressedBytes;
        return this;
    }
    
    /**
     * Connection information to an exposed port on an active process.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exposedPort")
    public ExposedPort exposedPort;

    public ProcessWithRooms withExposedPort(ExposedPort exposedPort) {
        this.exposedPort = exposedPort;
        return this;
    }
    
    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("host")
    @Deprecated
    public String host;

    @Deprecated
    public ProcessWithRooms withHost(String host) {
        this.host = host;
        return this;
    }
    
    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("idleSince")
    @Deprecated
    public OffsetDateTime idleSince;

    @Deprecated
    public ProcessWithRooms withIdleSince(OffsetDateTime idleSince) {
        this.idleSince = idleSince;
        return this;
    }
    
    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("port")
    @Deprecated
    public Double port;

    @Deprecated
    public ProcessWithRooms withPort(Double port) {
        this.port = port;
        return this;
    }
    
    /**
     * System generated unique identifier to a runtime instance of your game server.
     */
    @JsonProperty("processId")
    public String processId;

    public ProcessWithRooms withProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    
    /**
     * Available regions to request a game server.
     */
    @JsonProperty("region")
    public Region region;

    public ProcessWithRooms withRegion(Region region) {
        this.region = region;
        return this;
    }
    
    /**
     * Tracks the number of room slots available on the process.
     */
    @JsonProperty("roomSlotsAvailable")
    public Double roomSlotsAvailable;

    public ProcessWithRooms withRoomSlotsAvailable(Double roomSlotsAvailable) {
        this.roomSlotsAvailable = roomSlotsAvailable;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("roomSlotsAvailableUpdatedAt")
    public OffsetDateTime roomSlotsAvailableUpdatedAt;

    public ProcessWithRooms withRoomSlotsAvailableUpdatedAt(OffsetDateTime roomSlotsAvailableUpdatedAt) {
        this.roomSlotsAvailableUpdatedAt = roomSlotsAvailableUpdatedAt;
        return this;
    }
    
    @JsonProperty("rooms")
    public RoomWithoutAllocations[] rooms;

    public ProcessWithRooms withRooms(RoomWithoutAllocations[] rooms) {
        this.rooms = rooms;
        return this;
    }
    
    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonProperty("roomsPerProcess")
    public Integer roomsPerProcess;

    public ProcessWithRooms withRoomsPerProcess(Integer roomsPerProcess) {
        this.roomsPerProcess = roomsPerProcess;
        return this;
    }
    
    /**
     * When the process bound to the specified port. We use this to determine when we should start billing.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("startedAt")
    public OffsetDateTime startedAt;

    public ProcessWithRooms withStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    
    /**
     * When the process started being provisioned.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("startingAt")
    public OffsetDateTime startingAt;

    public ProcessWithRooms withStartingAt(OffsetDateTime startingAt) {
        this.startingAt = startingAt;
        return this;
    }
    
    /**
     * When the process is issued to stop. We use this to determine when we should stop billing.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("stoppingAt")
    public OffsetDateTime stoppingAt;

    public ProcessWithRooms withStoppingAt(OffsetDateTime stoppingAt) {
        this.stoppingAt = stoppingAt;
        return this;
    }
    
    /**
     * When the process has been terminated.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("terminatedAt")
    public OffsetDateTime terminatedAt;

    public ProcessWithRooms withTerminatedAt(OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }
    
    @JsonProperty("totalRooms")
    public Double totalRooms;

    public ProcessWithRooms withTotalRooms(Double totalRooms) {
        this.totalRooms = totalRooms;
        return this;
    }
    
    public ProcessWithRooms(@JsonProperty("activeConnections") Double activeConnections, @JsonProperty("activeConnectionsUpdatedAt") OffsetDateTime activeConnectionsUpdatedAt, @JsonProperty("additionalExposedPorts") ExposedPort[] additionalExposedPorts, @JsonProperty("appId") String appId, @JsonProperty("deploymentId") Integer deploymentId, @JsonProperty("draining") Boolean draining, @JsonProperty("egressedBytes") Double egressedBytes, @JsonProperty("host") String host, @JsonProperty("idleSince") OffsetDateTime idleSince, @JsonProperty("port") Double port, @JsonProperty("processId") String processId, @JsonProperty("region") Region region, @JsonProperty("roomSlotsAvailable") Double roomSlotsAvailable, @JsonProperty("roomSlotsAvailableUpdatedAt") OffsetDateTime roomSlotsAvailableUpdatedAt, @JsonProperty("rooms") RoomWithoutAllocations[] rooms, @JsonProperty("roomsPerProcess") Integer roomsPerProcess, @JsonProperty("startedAt") OffsetDateTime startedAt, @JsonProperty("startingAt") OffsetDateTime startingAt, @JsonProperty("stoppingAt") OffsetDateTime stoppingAt, @JsonProperty("terminatedAt") OffsetDateTime terminatedAt, @JsonProperty("totalRooms") Double totalRooms) {
        this.activeConnections = activeConnections;
        this.activeConnectionsUpdatedAt = activeConnectionsUpdatedAt;
        this.additionalExposedPorts = additionalExposedPorts;
        this.appId = appId;
        this.deploymentId = deploymentId;
        this.draining = draining;
        this.egressedBytes = egressedBytes;
        this.host = host;
        this.idleSince = idleSince;
        this.port = port;
        this.processId = processId;
        this.region = region;
        this.roomSlotsAvailable = roomSlotsAvailable;
        this.roomSlotsAvailableUpdatedAt = roomSlotsAvailableUpdatedAt;
        this.rooms = rooms;
        this.roomsPerProcess = roomsPerProcess;
        this.startedAt = startedAt;
        this.startingAt = startingAt;
        this.stoppingAt = stoppingAt;
        this.terminatedAt = terminatedAt;
        this.totalRooms = totalRooms;
  }
}
