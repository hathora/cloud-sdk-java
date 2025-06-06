/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

public class ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment {

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
     * A build represents a game server artifact and its associated metadata.
     */
    @JsonProperty("build")
    private Build build;

    /**
     * System generated id for a build. Increments by 1.
     */
    @JsonProperty("buildId")
    private int buildId;

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
    private List<ApplicationWithLatestDeploymentAndBuildDeprecatedEnv> env;

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    @JsonProperty("idleTimeoutEnabled")
    private boolean idleTimeoutEnabled;

    /**
     * The number of cores allocated to your process.
     */
    @JsonProperty("requestedCPU")
    private double requestedCPU;

    /**
     * The amount of memory allocated to your process.
     */
    @JsonProperty("requestedMemoryMB")
    private double requestedMemoryMB;

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonProperty("roomsPerProcess")
    private int roomsPerProcess;

    @JsonCreator
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment(
            @JsonProperty("additionalContainerPorts") List<ContainerPort> additionalContainerPorts,
            @JsonProperty("appId") String appId,
            @JsonProperty("build") Build build,
            @JsonProperty("buildId") int buildId,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("defaultContainerPort") ContainerPort defaultContainerPort,
            @JsonProperty("deploymentId") int deploymentId,
            @JsonProperty("env") List<ApplicationWithLatestDeploymentAndBuildDeprecatedEnv> env,
            @JsonProperty("idleTimeoutEnabled") boolean idleTimeoutEnabled,
            @JsonProperty("requestedCPU") double requestedCPU,
            @JsonProperty("requestedMemoryMB") double requestedMemoryMB,
            @JsonProperty("roomsPerProcess") int roomsPerProcess) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(build, "build");
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
        Utils.checkNotNull(deploymentId, "deploymentId");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        Utils.checkNotNull(requestedCPU, "requestedCPU");
        Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.additionalContainerPorts = additionalContainerPorts;
        this.appId = appId;
        this.build = build;
        this.buildId = buildId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.defaultContainerPort = defaultContainerPort;
        this.deploymentId = deploymentId;
        this.env = env;
        this.idleTimeoutEnabled = idleTimeoutEnabled;
        this.requestedCPU = requestedCPU;
        this.requestedMemoryMB = requestedMemoryMB;
        this.roomsPerProcess = roomsPerProcess;
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
     * A build represents a game server artifact and its associated metadata.
     */
    @JsonIgnore
    public Build build() {
        return build;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    @JsonIgnore
    public int buildId() {
        return buildId;
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
    public List<ApplicationWithLatestDeploymentAndBuildDeprecatedEnv> env() {
        return env;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    @JsonIgnore
    public boolean idleTimeoutEnabled() {
        return idleTimeoutEnabled;
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
    public double requestedMemoryMB() {
        return requestedMemoryMB;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonIgnore
    public int roomsPerProcess() {
        return roomsPerProcess;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Additional ports your server listens on.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withAdditionalContainerPorts(List<ContainerPort> additionalContainerPorts) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        this.additionalContainerPorts = additionalContainerPorts;
        return this;
    }

    /**
     * System generated unique identifier for an application.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * A build represents a game server artifact and its associated metadata.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withBuild(Build build) {
        Utils.checkNotNull(build, "build");
        this.build = build;
        return this;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    /**
     * When the deployment was created.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * A container port object represents the transport configruations for how your server will listen.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withDefaultContainerPort(ContainerPort defaultContainerPort) {
        Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
        this.defaultContainerPort = defaultContainerPort;
        return this;
    }

    /**
     * System generated id for a deployment. Increments by 1.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withDeploymentId(int deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withEnv(List<ApplicationWithLatestDeploymentAndBuildDeprecatedEnv> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withIdleTimeoutEnabled(boolean idleTimeoutEnabled) {
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        this.idleTimeoutEnabled = idleTimeoutEnabled;
        return this;
    }

    /**
     * The number of cores allocated to your process.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withRequestedCPU(double requestedCPU) {
        Utils.checkNotNull(requestedCPU, "requestedCPU");
        this.requestedCPU = requestedCPU;
        return this;
    }

    /**
     * The amount of memory allocated to your process.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withRequestedMemoryMB(double requestedMemoryMB) {
        Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
        this.requestedMemoryMB = requestedMemoryMB;
        return this;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment withRoomsPerProcess(int roomsPerProcess) {
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.roomsPerProcess = roomsPerProcess;
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
        ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment other = (ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment) o;
        return 
            Objects.deepEquals(this.additionalContainerPorts, other.additionalContainerPorts) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.build, other.build) &&
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.defaultContainerPort, other.defaultContainerPort) &&
            Objects.deepEquals(this.deploymentId, other.deploymentId) &&
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.idleTimeoutEnabled, other.idleTimeoutEnabled) &&
            Objects.deepEquals(this.requestedCPU, other.requestedCPU) &&
            Objects.deepEquals(this.requestedMemoryMB, other.requestedMemoryMB) &&
            Objects.deepEquals(this.roomsPerProcess, other.roomsPerProcess);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            additionalContainerPorts,
            appId,
            build,
            buildId,
            createdAt,
            createdBy,
            defaultContainerPort,
            deploymentId,
            env,
            idleTimeoutEnabled,
            requestedCPU,
            requestedMemoryMB,
            roomsPerProcess);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment.class,
                "additionalContainerPorts", additionalContainerPorts,
                "appId", appId,
                "build", build,
                "buildId", buildId,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "defaultContainerPort", defaultContainerPort,
                "deploymentId", deploymentId,
                "env", env,
                "idleTimeoutEnabled", idleTimeoutEnabled,
                "requestedCPU", requestedCPU,
                "requestedMemoryMB", requestedMemoryMB,
                "roomsPerProcess", roomsPerProcess);
    }
    
    public final static class Builder {
 
        private List<ContainerPort> additionalContainerPorts;
 
        private String appId;
 
        private Build build;
 
        private Integer buildId;
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private ContainerPort defaultContainerPort;
 
        private Integer deploymentId;
 
        private List<ApplicationWithLatestDeploymentAndBuildDeprecatedEnv> env;
 
        private Boolean idleTimeoutEnabled;
 
        private Double requestedCPU;
 
        private Double requestedMemoryMB;
 
        private Integer roomsPerProcess;
        
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
         * A build represents a game server artifact and its associated metadata.
         */
        public Builder build(Build build) {
            Utils.checkNotNull(build, "build");
            this.build = build;
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
        public Builder env(List<ApplicationWithLatestDeploymentAndBuildDeprecatedEnv> env) {
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
            this.idleTimeoutEnabled = idleTimeoutEnabled;
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
        public Builder requestedMemoryMB(double requestedMemoryMB) {
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
        
        public ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment build() {
            return new ApplicationWithLatestDeploymentAndBuildDeprecatedDeployment(
                additionalContainerPorts,
                appId,
                build,
                buildId,
                createdAt,
                createdBy,
                defaultContainerPort,
                deploymentId,
                env,
                idleTimeoutEnabled,
                requestedCPU,
                requestedMemoryMB,
                roomsPerProcess);
        }
    }
}
