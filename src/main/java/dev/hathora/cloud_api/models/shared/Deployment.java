/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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
import dev.hathora.cloud_api.utils.LazySingletonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * Deployment - Deployment is a versioned configuration for a build that describes runtime behavior.
 */

public class Deployment {

    /**
     * Additional ports your server listens on.
     */
    @JsonProperty("additionalContainerPorts")
    private java.util.List<ContainerPort> additionalContainerPorts;

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

    /**
     * UserId or email address for the user that created the deployment.
     */
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
    private java.util.List<Env> env;

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("idleTimeoutEnabled")
    private Optional<? extends Boolean> idleTimeoutEnabled;

    /**
     * A plan defines how much CPU and memory is required to run an instance of your game server.
     * 
     * `tiny`: shared core, 1gb memory
     * 
     * `small`: 1 core, 2gb memory
     * 
     * `medium`: 2 core, 4gb memory
     * 
     * `large`: 4 core, 8gb memory
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
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("transportType")
    @Deprecated
    private DeploymentTransportType transportType;

    @JsonCreator
    public Deployment(
            @JsonProperty("additionalContainerPorts") java.util.List<ContainerPort> additionalContainerPorts,
            @JsonProperty("appId") String appId,
            @JsonProperty("buildId") int buildId,
            @JsonProperty("containerPort") double containerPort,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("defaultContainerPort") ContainerPort defaultContainerPort,
            @JsonProperty("deploymentId") int deploymentId,
            @JsonProperty("env") java.util.List<Env> env,
            @JsonProperty("idleTimeoutEnabled") Optional<? extends Boolean> idleTimeoutEnabled,
            @JsonProperty("planName") PlanName planName,
            @JsonProperty("requestedCPU") double requestedCPU,
            @JsonProperty("requestedMemoryMB") int requestedMemoryMB,
            @JsonProperty("roomsPerProcess") int roomsPerProcess,
            @JsonProperty("transportType") DeploymentTransportType transportType) {
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
    
    public Deployment(
            java.util.List<ContainerPort> additionalContainerPorts,
            String appId,
            int buildId,
            double containerPort,
            OffsetDateTime createdAt,
            String createdBy,
            ContainerPort defaultContainerPort,
            int deploymentId,
            java.util.List<Env> env,
            PlanName planName,
            double requestedCPU,
            int requestedMemoryMB,
            int roomsPerProcess,
            DeploymentTransportType transportType) {
        this(additionalContainerPorts, appId, buildId, containerPort, createdAt, createdBy, defaultContainerPort, deploymentId, env, Optional.empty(), planName, requestedCPU, requestedMemoryMB, roomsPerProcess, transportType);
    }

    /**
     * Additional ports your server listens on.
     */
    @JsonIgnore
    public java.util.List<ContainerPort> additionalContainerPorts() {
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

    /**
     * UserId or email address for the user that created the deployment.
     */
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
    public java.util.List<Env> env() {
        return env;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> idleTimeoutEnabled() {
        return (Optional<Boolean>) idleTimeoutEnabled;
    }

    /**
     * A plan defines how much CPU and memory is required to run an instance of your game server.
     * 
     * `tiny`: shared core, 1gb memory
     * 
     * `small`: 1 core, 2gb memory
     * 
     * `medium`: 2 core, 4gb memory
     * 
     * `large`: 4 core, 8gb memory
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
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public DeploymentTransportType transportType() {
        return transportType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Additional ports your server listens on.
     */
    public Deployment withAdditionalContainerPorts(java.util.List<ContainerPort> additionalContainerPorts) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        this.additionalContainerPorts = additionalContainerPorts;
        return this;
    }

    /**
     * System generated unique identifier for an application.
     */
    public Deployment withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    public Deployment withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Deployment withContainerPort(double containerPort) {
        Utils.checkNotNull(containerPort, "containerPort");
        this.containerPort = containerPort;
        return this;
    }

    /**
     * When the deployment was created.
     */
    public Deployment withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * UserId or email address for the user that created the deployment.
     */
    public Deployment withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * A container port object represents the transport configruations for how your server will listen.
     */
    public Deployment withDefaultContainerPort(ContainerPort defaultContainerPort) {
        Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
        this.defaultContainerPort = defaultContainerPort;
        return this;
    }

    /**
     * System generated id for a deployment. Increments by 1.
     */
    public Deployment withDeploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    public Deployment withEnv(java.util.List<Env> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    public Deployment withIdleTimeoutEnabled(boolean idleTimeoutEnabled) {
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        this.idleTimeoutEnabled = Optional.ofNullable(idleTimeoutEnabled);
        return this;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    public Deployment withIdleTimeoutEnabled(Optional<? extends Boolean> idleTimeoutEnabled) {
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        this.idleTimeoutEnabled = idleTimeoutEnabled;
        return this;
    }

    /**
     * A plan defines how much CPU and memory is required to run an instance of your game server.
     * 
     * `tiny`: shared core, 1gb memory
     * 
     * `small`: 1 core, 2gb memory
     * 
     * `medium`: 2 core, 4gb memory
     * 
     * `large`: 4 core, 8gb memory
     */
    public Deployment withPlanName(PlanName planName) {
        Utils.checkNotNull(planName, "planName");
        this.planName = planName;
        return this;
    }

    /**
     * The number of cores allocated to your process.
     */
    public Deployment withRequestedCPU(double requestedCPU) {
        Utils.checkNotNull(requestedCPU, "requestedCPU");
        this.requestedCPU = requestedCPU;
        return this;
    }

    /**
     * The amount of memory allocated to your process.
     */
    public Deployment withRequestedMemoryMB(int requestedMemoryMB) {
        Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
        this.requestedMemoryMB = requestedMemoryMB;
        return this;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public Deployment withRoomsPerProcess(int roomsPerProcess) {
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.roomsPerProcess = roomsPerProcess;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Deployment withTransportType(DeploymentTransportType transportType) {
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
        Deployment other = (Deployment) o;
        return 
            java.util.Objects.deepEquals(this.additionalContainerPorts, other.additionalContainerPorts) &&
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.buildId, other.buildId) &&
            java.util.Objects.deepEquals(this.containerPort, other.containerPort) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.createdBy, other.createdBy) &&
            java.util.Objects.deepEquals(this.defaultContainerPort, other.defaultContainerPort) &&
            java.util.Objects.deepEquals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.deepEquals(this.env, other.env) &&
            java.util.Objects.deepEquals(this.idleTimeoutEnabled, other.idleTimeoutEnabled) &&
            java.util.Objects.deepEquals(this.planName, other.planName) &&
            java.util.Objects.deepEquals(this.requestedCPU, other.requestedCPU) &&
            java.util.Objects.deepEquals(this.requestedMemoryMB, other.requestedMemoryMB) &&
            java.util.Objects.deepEquals(this.roomsPerProcess, other.roomsPerProcess) &&
            java.util.Objects.deepEquals(this.transportType, other.transportType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
        return Utils.toString(Deployment.class,
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
 
        private java.util.List<ContainerPort> additionalContainerPorts;
 
        private String appId;
 
        private Integer buildId;
 
        @Deprecated
        private Double containerPort;
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private ContainerPort defaultContainerPort;
 
        private Integer deploymentId;
 
        private java.util.List<Env> env;
 
        private Optional<? extends Boolean> idleTimeoutEnabled;
 
        private PlanName planName;
 
        private Double requestedCPU;
 
        private Integer requestedMemoryMB;
 
        private Integer roomsPerProcess;
 
        @Deprecated
        private DeploymentTransportType transportType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Additional ports your server listens on.
         */
        public Builder additionalContainerPorts(java.util.List<ContainerPort> additionalContainerPorts) {
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

        /**
         * UserId or email address for the user that created the deployment.
         */
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
        public Builder env(java.util.List<Env> env) {
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
        public Builder idleTimeoutEnabled(Optional<? extends Boolean> idleTimeoutEnabled) {
            Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
            this.idleTimeoutEnabled = idleTimeoutEnabled;
            return this;
        }

        /**
         * A plan defines how much CPU and memory is required to run an instance of your game server.
         * 
         * `tiny`: shared core, 1gb memory
         * 
         * `small`: 1 core, 2gb memory
         * 
         * `medium`: 2 core, 4gb memory
         * 
         * `large`: 4 core, 8gb memory
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
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder transportType(DeploymentTransportType transportType) {
            Utils.checkNotNull(transportType, "transportType");
            this.transportType = transportType;
            return this;
        }
        
        public Deployment build() {
            if (idleTimeoutEnabled == null) {
                idleTimeoutEnabled = _SINGLETON_VALUE_IdleTimeoutEnabled.value();
            }
            return new Deployment(
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

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IdleTimeoutEnabled =
                new LazySingletonValue<>(
                        "idleTimeoutEnabled",
                        "\"true\"",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

