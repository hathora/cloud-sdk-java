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
 * DeploymentConfig - User specified deployment configuration for your application at runtime.
 */

public class DeploymentConfig {

    /**
     * Additional ports your server listens on.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additionalContainerPorts")
    private Optional<? extends java.util.List<ContainerPort>> additionalContainerPorts;

    /**
     * Default port the server listens on.
     */
    @JsonProperty("containerPort")
    private int containerPort;

    /**
     * The environment variable that our process will have access to at runtime.
     */
    @JsonProperty("env")
    private java.util.List<DeploymentConfigEnv> env;

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
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonProperty("roomsPerProcess")
    private int roomsPerProcess;

    /**
     * Transport type specifies the underlying communication protocol to the exposed port.
     */
    @JsonProperty("transportType")
    private TransportType transportType;

    public DeploymentConfig(
            @JsonProperty("additionalContainerPorts") Optional<? extends java.util.List<ContainerPort>> additionalContainerPorts,
            @JsonProperty("containerPort") int containerPort,
            @JsonProperty("env") java.util.List<DeploymentConfigEnv> env,
            @JsonProperty("planName") PlanName planName,
            @JsonProperty("roomsPerProcess") int roomsPerProcess,
            @JsonProperty("transportType") TransportType transportType) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        Utils.checkNotNull(containerPort, "containerPort");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(planName, "planName");
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        Utils.checkNotNull(transportType, "transportType");
        this.additionalContainerPorts = additionalContainerPorts;
        this.containerPort = containerPort;
        this.env = env;
        this.planName = planName;
        this.roomsPerProcess = roomsPerProcess;
        this.transportType = transportType;
    }

    /**
     * Additional ports your server listens on.
     */
    public Optional<? extends java.util.List<ContainerPort>> additionalContainerPorts() {
        return additionalContainerPorts;
    }

    /**
     * Default port the server listens on.
     */
    public int containerPort() {
        return containerPort;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    public java.util.List<DeploymentConfigEnv> env() {
        return env;
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
    public PlanName planName() {
        return planName;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public int roomsPerProcess() {
        return roomsPerProcess;
    }

    /**
     * Transport type specifies the underlying communication protocol to the exposed port.
     */
    public TransportType transportType() {
        return transportType;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Additional ports your server listens on.
     */
    public DeploymentConfig withAdditionalContainerPorts(java.util.List<ContainerPort> additionalContainerPorts) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        this.additionalContainerPorts = Optional.ofNullable(additionalContainerPorts);
        return this;
    }
    
    /**
     * Additional ports your server listens on.
     */
    public DeploymentConfig withAdditionalContainerPorts(Optional<? extends java.util.List<ContainerPort>> additionalContainerPorts) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        this.additionalContainerPorts = additionalContainerPorts;
        return this;
    }

    /**
     * Default port the server listens on.
     */
    public DeploymentConfig withContainerPort(int containerPort) {
        Utils.checkNotNull(containerPort, "containerPort");
        this.containerPort = containerPort;
        return this;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    public DeploymentConfig withEnv(java.util.List<DeploymentConfigEnv> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
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
    public DeploymentConfig withPlanName(PlanName planName) {
        Utils.checkNotNull(planName, "planName");
        this.planName = planName;
        return this;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public DeploymentConfig withRoomsPerProcess(int roomsPerProcess) {
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.roomsPerProcess = roomsPerProcess;
        return this;
    }

    /**
     * Transport type specifies the underlying communication protocol to the exposed port.
     */
    public DeploymentConfig withTransportType(TransportType transportType) {
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
        DeploymentConfig other = (DeploymentConfig) o;
        return 
            java.util.Objects.deepEquals(this.additionalContainerPorts, other.additionalContainerPorts) &&
            java.util.Objects.deepEquals(this.containerPort, other.containerPort) &&
            java.util.Objects.deepEquals(this.env, other.env) &&
            java.util.Objects.deepEquals(this.planName, other.planName) &&
            java.util.Objects.deepEquals(this.roomsPerProcess, other.roomsPerProcess) &&
            java.util.Objects.deepEquals(this.transportType, other.transportType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            additionalContainerPorts,
            containerPort,
            env,
            planName,
            roomsPerProcess,
            transportType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeploymentConfig.class,
                "additionalContainerPorts", additionalContainerPorts,
                "containerPort", containerPort,
                "env", env,
                "planName", planName,
                "roomsPerProcess", roomsPerProcess,
                "transportType", transportType);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<ContainerPort>> additionalContainerPorts = Optional.empty();
 
        private Integer containerPort;
 
        private java.util.List<DeploymentConfigEnv> env;
 
        private PlanName planName;
 
        private Integer roomsPerProcess;
 
        private TransportType transportType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Additional ports your server listens on.
         */
        public Builder additionalContainerPorts(java.util.List<ContainerPort> additionalContainerPorts) {
            Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
            this.additionalContainerPorts = Optional.ofNullable(additionalContainerPorts);
            return this;
        }
        
        /**
         * Additional ports your server listens on.
         */
        public Builder additionalContainerPorts(Optional<? extends java.util.List<ContainerPort>> additionalContainerPorts) {
            Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
            this.additionalContainerPorts = additionalContainerPorts;
            return this;
        }

        /**
         * Default port the server listens on.
         */
        public Builder containerPort(int containerPort) {
            Utils.checkNotNull(containerPort, "containerPort");
            this.containerPort = containerPort;
            return this;
        }

        /**
         * The environment variable that our process will have access to at runtime.
         */
        public Builder env(java.util.List<DeploymentConfigEnv> env) {
            Utils.checkNotNull(env, "env");
            this.env = env;
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
         * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
         */
        public Builder roomsPerProcess(int roomsPerProcess) {
            Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
            this.roomsPerProcess = roomsPerProcess;
            return this;
        }

        /**
         * Transport type specifies the underlying communication protocol to the exposed port.
         */
        public Builder transportType(TransportType transportType) {
            Utils.checkNotNull(transportType, "transportType");
            this.transportType = transportType;
            return this;
        }
        
        public DeploymentConfig build() {
            return new DeploymentConfig(
                additionalContainerPorts,
                containerPort,
                env,
                planName,
                roomsPerProcess,
                transportType);
        }
    }
}

