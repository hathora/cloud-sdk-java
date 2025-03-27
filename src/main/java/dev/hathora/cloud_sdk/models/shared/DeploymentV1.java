/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.utils.LazySingletonValue;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * DeploymentV1
 * 
 * <p>Deployment is a versioned configuration for a build that describes runtime behavior.
 */

public class DeploymentV1 {

    /**
     * Additional ports your server listens on.
     */
    @JsonProperty("additionalContainerPorts")
    private List<ContainerPort> additionalContainerPorts;

    /**
     * System generated unique identifier for an application.
     */
    @JsonProperty("appId")
    private String appId;

    /**
     * System generated id for a build. Increments by 1.
     */
    @JsonProperty("buildId")
    private int buildId;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("containerPort")
    @Deprecated
    private double containerPort;

    /**
     * When the deployment was created.
     */
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("createdBy")
    private String createdBy;

    /**
     * A container port object represents the transport configruations for how your server will listen.
     */
    @JsonProperty("defaultContainerPort")
    private ContainerPort defaultContainerPort;

    /**
     * System generated id for a deployment. Increments by 1.
     */
    @JsonProperty("deploymentId")
    private int deploymentId;

    /**
     * The environment variable that our process will have access to at runtime.
     */
    @JsonProperty("env")
    private List<DeploymentV1Env> env;

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("idleTimeoutEnabled")
    private Optional<Boolean> idleTimeoutEnabled;

    /**
     * A plan defines how much CPU and memory is required to run an instance of your game server.
     * 
     * <p>`tiny`: shared core, 1gb memory
     * 
     * <p>`small`: 1 core, 2gb memory
     * 
     * <p>`medium`: 2 core, 4gb memory
     * 
     * <p>`large`: 4 core, 8gb memory
     */
    @JsonProperty("planName")
    private PlanName planName;

    /**
     * The number of cores allocated to your process.
     */
    @JsonProperty("requestedCPU")
    private double requestedCPU;

    /**
     * The amount of memory allocated to your process.
     */
    @JsonProperty("requestedMemoryMB")
    private int requestedMemoryMB;

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonProperty("roomsPerProcess")
    private int roomsPerProcess;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("transportType")
    @Deprecated
    private DeploymentV1TransportType transportType;

    @JsonCreator
    public DeploymentV1(
            @JsonProperty("additionalContainerPorts") List<ContainerPort> additionalContainerPorts,
            @JsonProperty("appId") String appId,
            @JsonProperty("buildId") int buildId,
            @JsonProperty("containerPort") double containerPort,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("defaultContainerPort") ContainerPort defaultContainerPort,
            @JsonProperty("deploymentId") int deploymentId,
            @JsonProperty("env") List<DeploymentV1Env> env,
            @JsonProperty("idleTimeoutEnabled") Optional<Boolean> idleTimeoutEnabled,
            @JsonProperty("planName") PlanName planName,
            @JsonProperty("requestedCPU") double requestedCPU,
            @JsonProperty("requestedMemoryMB") int requestedMemoryMB,
            @JsonProperty("roomsPerProcess") int roomsPerProcess,
            @JsonProperty("transportType") DeploymentV1TransportType transportType) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(containerPort, "containerPort");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
        Utils.checkNotNull(deploymentId, "deploymentId");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        Utils.checkNotNull(planName, "planName");
        Utils.checkNotNull(requestedCPU, "requestedCPU");
        Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        Utils.checkNotNull(transportType, "transportType");
        this.additionalContainerPorts = additionalContainerPorts;
        this.appId = appId;
        this.buildId = buildId;
        this.containerPort = containerPort;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.defaultContainerPort = defaultContainerPort;
        this.deploymentId = deploymentId;
        this.env = env;
        this.idleTimeoutEnabled = idleTimeoutEnabled;
        this.planName = planName;
        this.requestedCPU = requestedCPU;
        this.requestedMemoryMB = requestedMemoryMB;
        this.roomsPerProcess = roomsPerProcess;
        this.transportType = transportType;
    }
    
    public DeploymentV1(
            List<ContainerPort> additionalContainerPorts,
            String appId,
            int buildId,
            double containerPort,
            OffsetDateTime createdAt,
            String createdBy,
            ContainerPort defaultContainerPort,
            int deploymentId,
            List<DeploymentV1Env> env,
            PlanName planName,
            double requestedCPU,
            int requestedMemoryMB,
            int roomsPerProcess,
            DeploymentV1TransportType transportType) {
        this(additionalContainerPorts, appId, buildId, containerPort, createdAt, createdBy, defaultContainerPort, deploymentId, env, Optional.empty(), planName, requestedCPU, requestedMemoryMB, roomsPerProcess, transportType);
    }

    /**
     * Additional ports your server listens on.
     */
    @JsonIgnore
    public List<ContainerPort> additionalContainerPorts() {
        return additionalContainerPorts;
    }

    /**
     * System generated unique identifier for an application.
     */
    @JsonIgnore
    public String appId() {
        return appId;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    @JsonIgnore
    public int buildId() {
        return buildId;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public double containerPort() {
        return containerPort;
    }

    /**
     * When the deployment was created.
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String createdBy() {
        return createdBy;
    }

    /**
     * A container port object represents the transport configruations for how your server will listen.
     */
    @JsonIgnore
    public ContainerPort defaultContainerPort() {
        return defaultContainerPort;
    }

    /**
     * System generated id for a deployment. Increments by 1.
     */
    @JsonIgnore
    public int deploymentId() {
        return deploymentId;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    @JsonIgnore
    public List<DeploymentV1Env> env() {
        return env;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    @JsonIgnore
    public Optional<Boolean> idleTimeoutEnabled() {
        return idleTimeoutEnabled;
    }

    /**
     * A plan defines how much CPU and memory is required to run an instance of your game server.
     * 
     * <p>`tiny`: shared core, 1gb memory
     * 
     * <p>`small`: 1 core, 2gb memory
     * 
     * <p>`medium`: 2 core, 4gb memory
     * 
     * <p>`large`: 4 core, 8gb memory
     */
    @JsonIgnore
    public PlanName planName() {
        return planName;
    }

    /**
     * The number of cores allocated to your process.
     */
    @JsonIgnore
    public double requestedCPU() {
        return requestedCPU;
    }

    /**
     * The amount of memory allocated to your process.
     */
    @JsonIgnore
    public int requestedMemoryMB() {
        return requestedMemoryMB;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonIgnore
    public int roomsPerProcess() {
        return roomsPerProcess;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public DeploymentV1TransportType transportType() {
        return transportType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Additional ports your server listens on.
     */
    public DeploymentV1 withAdditionalContainerPorts(List<ContainerPort> additionalContainerPorts) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        this.additionalContainerPorts = additionalContainerPorts;
        return this;
    }

    /**
     * System generated unique identifier for an application.
     */
    public DeploymentV1 withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    public DeploymentV1 withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public DeploymentV1 withContainerPort(double containerPort) {
        Utils.checkNotNull(containerPort, "containerPort");
        this.containerPort = containerPort;
        return this;
    }

    /**
     * When the deployment was created.
     */
    public DeploymentV1 withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public DeploymentV1 withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * A container port object represents the transport configruations for how your server will listen.
     */
    public DeploymentV1 withDefaultContainerPort(ContainerPort defaultContainerPort) {
        Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
        this.defaultContainerPort = defaultContainerPort;
        return this;
    }

    /**
     * System generated id for a deployment. Increments by 1.
     */
    public DeploymentV1 withDeploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    public DeploymentV1 withEnv(List<DeploymentV1Env> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    public DeploymentV1 withIdleTimeoutEnabled(boolean idleTimeoutEnabled) {
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        this.idleTimeoutEnabled = Optional.ofNullable(idleTimeoutEnabled);
        return this;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    public DeploymentV1 withIdleTimeoutEnabled(Optional<Boolean> idleTimeoutEnabled) {
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        this.idleTimeoutEnabled = idleTimeoutEnabled;
        return this;
    }

    /**
     * A plan defines how much CPU and memory is required to run an instance of your game server.
     * 
     * <p>`tiny`: shared core, 1gb memory
     * 
     * <p>`small`: 1 core, 2gb memory
     * 
     * <p>`medium`: 2 core, 4gb memory
     * 
     * <p>`large`: 4 core, 8gb memory
     */
    public DeploymentV1 withPlanName(PlanName planName) {
        Utils.checkNotNull(planName, "planName");
        this.planName = planName;
        return this;
    }

    /**
     * The number of cores allocated to your process.
     */
    public DeploymentV1 withRequestedCPU(double requestedCPU) {
        Utils.checkNotNull(requestedCPU, "requestedCPU");
        this.requestedCPU = requestedCPU;
        return this;
    }

    /**
     * The amount of memory allocated to your process.
     */
    public DeploymentV1 withRequestedMemoryMB(int requestedMemoryMB) {
        Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
        this.requestedMemoryMB = requestedMemoryMB;
        return this;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public DeploymentV1 withRoomsPerProcess(int roomsPerProcess) {
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.roomsPerProcess = roomsPerProcess;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public DeploymentV1 withTransportType(DeploymentV1TransportType transportType) {
        Utils.checkNotNull(transportType, "transportType");
        this.transportType = transportType;
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
        DeploymentV1 other = (DeploymentV1) o;
        return 
            Objects.deepEquals(this.additionalContainerPorts, other.additionalContainerPorts) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.containerPort, other.containerPort) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.defaultContainerPort, other.defaultContainerPort) &&
            Objects.deepEquals(this.deploymentId, other.deploymentId) &&
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.idleTimeoutEnabled, other.idleTimeoutEnabled) &&
            Objects.deepEquals(this.planName, other.planName) &&
            Objects.deepEquals(this.requestedCPU, other.requestedCPU) &&
            Objects.deepEquals(this.requestedMemoryMB, other.requestedMemoryMB) &&
            Objects.deepEquals(this.roomsPerProcess, other.roomsPerProcess) &&
            Objects.deepEquals(this.transportType, other.transportType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalContainerPorts,
            appId,
            buildId,
            containerPort,
            createdAt,
            createdBy,
            defaultContainerPort,
            deploymentId,
            env,
            idleTimeoutEnabled,
            planName,
            requestedCPU,
            requestedMemoryMB,
            roomsPerProcess,
            transportType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeploymentV1.class,
                "additionalContainerPorts", additionalContainerPorts,
                "appId", appId,
                "buildId", buildId,
                "containerPort", containerPort,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "defaultContainerPort", defaultContainerPort,
                "deploymentId", deploymentId,
                "env", env,
                "idleTimeoutEnabled", idleTimeoutEnabled,
                "planName", planName,
                "requestedCPU", requestedCPU,
                "requestedMemoryMB", requestedMemoryMB,
                "roomsPerProcess", roomsPerProcess,
                "transportType", transportType);
    }
    
    public final static class Builder {
 
        private List<ContainerPort> additionalContainerPorts;
 
        private String appId;
 
        private Integer buildId;
 
        @Deprecated
        private Double containerPort;
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private ContainerPort defaultContainerPort;
 
        private Integer deploymentId;
 
        private List<DeploymentV1Env> env;
 
        private Optional<Boolean> idleTimeoutEnabled;
 
        private PlanName planName;
 
        private Double requestedCPU;
 
        private Integer requestedMemoryMB;
 
        private Integer roomsPerProcess;
 
        @Deprecated
        private DeploymentV1TransportType transportType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Additional ports your server listens on.
         */
        public Builder additionalContainerPorts(List<ContainerPort> additionalContainerPorts) {
            Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
            this.additionalContainerPorts = additionalContainerPorts;
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
         * System generated id for a build. Increments by 1.
         */
        public Builder buildId(int buildId) {
            Utils.checkNotNull(buildId, "buildId");
            this.buildId = buildId;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder containerPort(double containerPort) {
            Utils.checkNotNull(containerPort, "containerPort");
            this.containerPort = containerPort;
            return this;
        }

        /**
         * When the deployment was created.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * A container port object represents the transport configruations for how your server will listen.
         */
        public Builder defaultContainerPort(ContainerPort defaultContainerPort) {
            Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
            this.defaultContainerPort = defaultContainerPort;
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
         * The environment variable that our process will have access to at runtime.
         */
        public Builder env(List<DeploymentV1Env> env) {
            Utils.checkNotNull(env, "env");
            this.env = env;
            return this;
        }

        /**
         * Option to shut down processes that have had no new connections or rooms
         * for five minutes.
         */
        public Builder idleTimeoutEnabled(boolean idleTimeoutEnabled) {
            Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
            this.idleTimeoutEnabled = Optional.ofNullable(idleTimeoutEnabled);
            return this;
        }

        /**
         * Option to shut down processes that have had no new connections or rooms
         * for five minutes.
         */
        public Builder idleTimeoutEnabled(Optional<Boolean> idleTimeoutEnabled) {
            Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
            this.idleTimeoutEnabled = idleTimeoutEnabled;
            return this;
        }

        /**
         * A plan defines how much CPU and memory is required to run an instance of your game server.
         * 
         * <p>`tiny`: shared core, 1gb memory
         * 
         * <p>`small`: 1 core, 2gb memory
         * 
         * <p>`medium`: 2 core, 4gb memory
         * 
         * <p>`large`: 4 core, 8gb memory
         */
        public Builder planName(PlanName planName) {
            Utils.checkNotNull(planName, "planName");
            this.planName = planName;
            return this;
        }

        /**
         * The number of cores allocated to your process.
         */
        public Builder requestedCPU(double requestedCPU) {
            Utils.checkNotNull(requestedCPU, "requestedCPU");
            this.requestedCPU = requestedCPU;
            return this;
        }

        /**
         * The amount of memory allocated to your process.
         */
        public Builder requestedMemoryMB(int requestedMemoryMB) {
            Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
            this.requestedMemoryMB = requestedMemoryMB;
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
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder transportType(DeploymentV1TransportType transportType) {
            Utils.checkNotNull(transportType, "transportType");
            this.transportType = transportType;
            return this;
        }
        
        public DeploymentV1 build() {
            if (idleTimeoutEnabled == null) {
                idleTimeoutEnabled = _SINGLETON_VALUE_IdleTimeoutEnabled.value();
            }            return new DeploymentV1(
                additionalContainerPorts,
                appId,
                buildId,
                containerPort,
                createdAt,
                createdBy,
                defaultContainerPort,
                deploymentId,
                env,
                idleTimeoutEnabled,
                planName,
                requestedCPU,
                requestedMemoryMB,
                roomsPerProcess,
                transportType);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_IdleTimeoutEnabled =
                new LazySingletonValue<>(
                        "idleTimeoutEnabled",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

