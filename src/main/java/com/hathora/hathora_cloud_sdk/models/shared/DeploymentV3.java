/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class DeploymentV3 {

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
     * System generated id for a build. Can also be user defined when creating a build.
     */
    @JsonProperty("buildId")
    private String buildId;

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("buildTag")
    private Optional<String> buildTag;

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
     * System generated id for a deployment.
     */
    @JsonProperty("deploymentId")
    private String deploymentId;

    /**
     * The environment variable that our process will have access to at runtime.
     */
    @JsonProperty("env")
    private List<DeploymentV3Env> env;

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
    public DeploymentV3(
            @JsonProperty("additionalContainerPorts") List<ContainerPort> additionalContainerPorts,
            @JsonProperty("appId") String appId,
            @JsonProperty("buildId") String buildId,
            @JsonProperty("buildTag") Optional<String> buildTag,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("defaultContainerPort") ContainerPort defaultContainerPort,
            @JsonProperty("deploymentId") String deploymentId,
            @JsonProperty("env") List<DeploymentV3Env> env,
            @JsonProperty("idleTimeoutEnabled") boolean idleTimeoutEnabled,
            @JsonProperty("requestedCPU") double requestedCPU,
            @JsonProperty("requestedMemoryMB") double requestedMemoryMB,
            @JsonProperty("roomsPerProcess") int roomsPerProcess) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(buildTag, "buildTag");
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
        this.buildId = buildId;
        this.buildTag = buildTag;
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
    
    public DeploymentV3(
            List<ContainerPort> additionalContainerPorts,
            String appId,
            String buildId,
            OffsetDateTime createdAt,
            String createdBy,
            ContainerPort defaultContainerPort,
            String deploymentId,
            List<DeploymentV3Env> env,
            boolean idleTimeoutEnabled,
            double requestedCPU,
            double requestedMemoryMB,
            int roomsPerProcess) {
        this(additionalContainerPorts, appId, buildId, Optional.empty(), createdAt, createdBy, defaultContainerPort, deploymentId, env, idleTimeoutEnabled, requestedCPU, requestedMemoryMB, roomsPerProcess);
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
     * System generated id for a build. Can also be user defined when creating a build.
     */
    @JsonIgnore
    public String buildId() {
        return buildId;
    }

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    @JsonIgnore
    public Optional<String> buildTag() {
        return buildTag;
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
     * System generated id for a deployment.
     */
    @JsonIgnore
    public String deploymentId() {
        return deploymentId;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    @JsonIgnore
    public List<DeploymentV3Env> env() {
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
    public DeploymentV3 withAdditionalContainerPorts(List<ContainerPort> additionalContainerPorts) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        this.additionalContainerPorts = additionalContainerPorts;
        return this;
    }

    /**
     * System generated unique identifier for an application.
     */
    public DeploymentV3 withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * System generated id for a build. Can also be user defined when creating a build.
     */
    public DeploymentV3 withBuildId(String buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    public DeploymentV3 withBuildTag(String buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = Optional.ofNullable(buildTag);
        return this;
    }

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    public DeploymentV3 withBuildTag(Optional<String> buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = buildTag;
        return this;
    }

    /**
     * When the deployment was created.
     */
    public DeploymentV3 withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public DeploymentV3 withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * A container port object represents the transport configruations for how your server will listen.
     */
    public DeploymentV3 withDefaultContainerPort(ContainerPort defaultContainerPort) {
        Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
        this.defaultContainerPort = defaultContainerPort;
        return this;
    }

    /**
     * System generated id for a deployment.
     */
    public DeploymentV3 withDeploymentId(String deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    public DeploymentV3 withEnv(List<DeploymentV3Env> env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    /**
     * Option to shut down processes that have had no new connections or rooms
     * for five minutes.
     */
    public DeploymentV3 withIdleTimeoutEnabled(boolean idleTimeoutEnabled) {
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        this.idleTimeoutEnabled = idleTimeoutEnabled;
        return this;
    }

    /**
     * The number of cores allocated to your process.
     */
    public DeploymentV3 withRequestedCPU(double requestedCPU) {
        Utils.checkNotNull(requestedCPU, "requestedCPU");
        this.requestedCPU = requestedCPU;
        return this;
    }

    /**
     * The amount of memory allocated to your process.
     */
    public DeploymentV3 withRequestedMemoryMB(double requestedMemoryMB) {
        Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
        this.requestedMemoryMB = requestedMemoryMB;
        return this;
    }

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    public DeploymentV3 withRoomsPerProcess(int roomsPerProcess) {
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
        DeploymentV3 other = (DeploymentV3) o;
        return 
            Objects.deepEquals(this.additionalContainerPorts, other.additionalContainerPorts) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.buildTag, other.buildTag) &&
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
            buildId,
            buildTag,
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
        return Utils.toString(DeploymentV3.class,
                "additionalContainerPorts", additionalContainerPorts,
                "appId", appId,
                "buildId", buildId,
                "buildTag", buildTag,
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
 
        private String buildId;
 
        private Optional<String> buildTag = Optional.empty();
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private ContainerPort defaultContainerPort;
 
        private String deploymentId;
 
        private List<DeploymentV3Env> env;
 
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
         * System generated id for a build. Can also be user defined when creating a build.
         */
        public Builder buildId(String buildId) {
            Utils.checkNotNull(buildId, "buildId");
            this.buildId = buildId;
            return this;
        }

        /**
         * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
         */
        public Builder buildTag(String buildTag) {
            Utils.checkNotNull(buildTag, "buildTag");
            this.buildTag = Optional.ofNullable(buildTag);
            return this;
        }

        /**
         * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
         */
        public Builder buildTag(Optional<String> buildTag) {
            Utils.checkNotNull(buildTag, "buildTag");
            this.buildTag = buildTag;
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
         * System generated id for a deployment.
         */
        public Builder deploymentId(String deploymentId) {
            Utils.checkNotNull(deploymentId, "deploymentId");
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * The environment variable that our process will have access to at runtime.
         */
        public Builder env(List<DeploymentV3Env> env) {
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
        
        public DeploymentV3 build() {
            return new DeploymentV3(
                additionalContainerPorts,
                appId,
                buildId,
                buildTag,
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
