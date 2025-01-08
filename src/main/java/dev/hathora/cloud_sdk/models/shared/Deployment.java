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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Deployment {

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
    private BuildV3 build;

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
     * Arbitrary metadata associated with a deployment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deploymentTag")
    private Optional<String> deploymentTag;

    /**
     * The environment variable that our process will have access to at runtime.
     */
    @JsonProperty("env")
    private List<ApplicationWithLatestDeploymentAndBuildEnv> env;

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
     * The amount of memory allocated to your process. By default, this is capped
     * at 8192 MB, but can be increased further on the Enterprise tier.
     */
    @JsonProperty("requestedMemoryMB")
    private double requestedMemoryMB;

    /**
     * Governs how many [rooms](https://hathora.dev/docs/concepts/hathora-entities#room) can be scheduled in a process.
     */
    @JsonProperty("roomsPerProcess")
    private int roomsPerProcess;

    @JsonCreator
    public Deployment(
            @JsonProperty("additionalContainerPorts") List<ContainerPort> additionalContainerPorts,
            @JsonProperty("appId") String appId,
            @JsonProperty("build") BuildV3 build,
            @JsonProperty("buildId") String buildId,
            @JsonProperty("buildTag") Optional<String> buildTag,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("defaultContainerPort") ContainerPort defaultContainerPort,
            @JsonProperty("deploymentId") String deploymentId,
            @JsonProperty("deploymentTag") Optional<String> deploymentTag,
            @JsonProperty("env") List<ApplicationWithLatestDeploymentAndBuildEnv> env,
            @JsonProperty("idleTimeoutEnabled") boolean idleTimeoutEnabled,
            @JsonProperty("requestedCPU") double requestedCPU,
            @JsonProperty("requestedMemoryMB") double requestedMemoryMB,
            @JsonProperty("roomsPerProcess") int roomsPerProcess) {
        Utils.checkNotNull(additionalContainerPorts, "additionalContainerPorts");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(build, "build");
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(buildTag, "buildTag");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(defaultContainerPort, "defaultContainerPort");
        Utils.checkNotNull(deploymentId, "deploymentId");
        Utils.checkNotNull(deploymentTag, "deploymentTag");
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(idleTimeoutEnabled, "idleTimeoutEnabled");
        Utils.checkNotNull(requestedCPU, "requestedCPU");
        Utils.checkNotNull(requestedMemoryMB, "requestedMemoryMB");
        Utils.checkNotNull(roomsPerProcess, "roomsPerProcess");
        this.additionalContainerPorts = additionalContainerPorts;
        this.appId = appId;
        this.build = build;
        this.buildId = buildId;
        this.buildTag = buildTag;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.defaultContainerPort = defaultContainerPort;
        this.deploymentId = deploymentId;
        this.deploymentTag = deploymentTag;
        this.env = env;
        this.idleTimeoutEnabled = idleTimeoutEnabled;
        this.requestedCPU = requestedCPU;
        this.requestedMemoryMB = requestedMemoryMB;
        this.roomsPerProcess = roomsPerProcess;
    }
    
    public Deployment(
            List<ContainerPort> additionalContainerPorts,
            String appId,
            BuildV3 build,
            String buildId,
            OffsetDateTime createdAt,
            String createdBy,
            ContainerPort defaultContainerPort,
            String deploymentId,
            List<ApplicationWithLatestDeploymentAndBuildEnv> env,
            boolean idleTimeoutEnabled,
            double requestedCPU,
            double requestedMemoryMB,
            int roomsPerProcess) {
        this(additionalContainerPorts, appId, build, buildId, Optional.empty(), createdAt, createdBy, defaultContainerPort, deploymentId, Optional.empty(), env, idleTimeoutEnabled, requestedCPU, requestedMemoryMB, roomsPerProcess);
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
    public BuildV3 build() {
        return build;
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
     * Arbitrary metadata associated with a deployment.
     */
    @JsonIgnore
    public Optional<String> deploymentTag() {
        return deploymentTag;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    @JsonIgnore
    public List<ApplicationWithLatestDeploymentAndBuildEnv> env() {
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
     * The amount of memory allocated to your process. By default, this is capped
     * at 8192 MB, but can be increased further on the Enterprise tier.
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
    public Deployment withAdditionalContainerPorts(List<ContainerPort> additionalContainerPorts) {
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
     * A build represents a game server artifact and its associated metadata.
     */
    public Deployment withBuild(BuildV3 build) {
        Utils.checkNotNull(build, "build");
        this.build = build;
        return this;
    }

    /**
     * System generated id for a build. Can also be user defined when creating a build.
     */
    public Deployment withBuildId(String buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    public Deployment withBuildTag(String buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = Optional.ofNullable(buildTag);
        return this;
    }

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    public Deployment withBuildTag(Optional<String> buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = buildTag;
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
     * System generated id for a deployment.
     */
    public Deployment withDeploymentId(String deploymentId) {
        Utils.checkNotNull(deploymentId, "deploymentId");
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Arbitrary metadata associated with a deployment.
     */
    public Deployment withDeploymentTag(String deploymentTag) {
        Utils.checkNotNull(deploymentTag, "deploymentTag");
        this.deploymentTag = Optional.ofNullable(deploymentTag);
        return this;
    }

    /**
     * Arbitrary metadata associated with a deployment.
     */
    public Deployment withDeploymentTag(Optional<String> deploymentTag) {
        Utils.checkNotNull(deploymentTag, "deploymentTag");
        this.deploymentTag = deploymentTag;
        return this;
    }

    /**
     * The environment variable that our process will have access to at runtime.
     */
    public Deployment withEnv(List<ApplicationWithLatestDeploymentAndBuildEnv> env) {
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
        this.idleTimeoutEnabled = idleTimeoutEnabled;
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
     * The amount of memory allocated to your process. By default, this is capped
     * at 8192 MB, but can be increased further on the Enterprise tier.
     */
    public Deployment withRequestedMemoryMB(double requestedMemoryMB) {
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
            Objects.deepEquals(this.additionalContainerPorts, other.additionalContainerPorts) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.build, other.build) &&
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.buildTag, other.buildTag) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.defaultContainerPort, other.defaultContainerPort) &&
            Objects.deepEquals(this.deploymentId, other.deploymentId) &&
            Objects.deepEquals(this.deploymentTag, other.deploymentTag) &&
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
            buildTag,
            createdAt,
            createdBy,
            defaultContainerPort,
            deploymentId,
            deploymentTag,
            env,
            idleTimeoutEnabled,
            requestedCPU,
            requestedMemoryMB,
            roomsPerProcess);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Deployment.class,
                "additionalContainerPorts", additionalContainerPorts,
                "appId", appId,
                "build", build,
                "buildId", buildId,
                "buildTag", buildTag,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "defaultContainerPort", defaultContainerPort,
                "deploymentId", deploymentId,
                "deploymentTag", deploymentTag,
                "env", env,
                "idleTimeoutEnabled", idleTimeoutEnabled,
                "requestedCPU", requestedCPU,
                "requestedMemoryMB", requestedMemoryMB,
                "roomsPerProcess", roomsPerProcess);
    }
    
    public final static class Builder {
 
        private List<ContainerPort> additionalContainerPorts;
 
        private String appId;
 
        private BuildV3 build;
 
        private String buildId;
 
        private Optional<String> buildTag = Optional.empty();
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private ContainerPort defaultContainerPort;
 
        private String deploymentId;
 
        private Optional<String> deploymentTag = Optional.empty();
 
        private List<ApplicationWithLatestDeploymentAndBuildEnv> env;
 
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
        public Builder build(BuildV3 build) {
            Utils.checkNotNull(build, "build");
            this.build = build;
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
         * Arbitrary metadata associated with a deployment.
         */
        public Builder deploymentTag(String deploymentTag) {
            Utils.checkNotNull(deploymentTag, "deploymentTag");
            this.deploymentTag = Optional.ofNullable(deploymentTag);
            return this;
        }

        /**
         * Arbitrary metadata associated with a deployment.
         */
        public Builder deploymentTag(Optional<String> deploymentTag) {
            Utils.checkNotNull(deploymentTag, "deploymentTag");
            this.deploymentTag = deploymentTag;
            return this;
        }

        /**
         * The environment variable that our process will have access to at runtime.
         */
        public Builder env(List<ApplicationWithLatestDeploymentAndBuildEnv> env) {
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
         * The amount of memory allocated to your process. By default, this is capped
         * at 8192 MB, but can be increased further on the Enterprise tier.
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
        
        public Deployment build() {
            return new Deployment(
                additionalContainerPorts,
                appId,
                build,
                buildId,
                buildTag,
                createdAt,
                createdBy,
                defaultContainerPort,
                deploymentId,
                deploymentTag,
                env,
                idleTimeoutEnabled,
                requestedCPU,
                requestedMemoryMB,
                roomsPerProcess);
        }
    }
}

