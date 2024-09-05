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
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Build - A build represents a game server artifact and its associated metadata.
 */

public class Build {

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

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("buildTag")
    private JsonNullable<String> buildTag;

    /**
     * When [`CreateBuild()`](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called.
     */
    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("createdBy")
    private String createdBy;

    /**
     * When the build was deleted.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("deletedAt")
    private Optional<OffsetDateTime> deletedAt;

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("finishedAt")
    private Optional<OffsetDateTime> finishedAt;

    /**
     * The size (in bytes) of the Docker image built by Hathora.
     */
    @JsonProperty("imageSize")
    private long imageSize;

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("regionalContainerTags")
    @Deprecated
    private List<RegionalContainerTags> regionalContainerTags;

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("startedAt")
    private Optional<OffsetDateTime> startedAt;

    @JsonProperty("status")
    private BuildStatus status;

    @JsonCreator
    public Build(
            @JsonProperty("appId") String appId,
            @JsonProperty("buildId") int buildId,
            @JsonProperty("buildTag") JsonNullable<String> buildTag,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("deletedAt") Optional<OffsetDateTime> deletedAt,
            @JsonProperty("finishedAt") Optional<OffsetDateTime> finishedAt,
            @JsonProperty("imageSize") long imageSize,
            @JsonProperty("regionalContainerTags") List<RegionalContainerTags> regionalContainerTags,
            @JsonProperty("startedAt") Optional<OffsetDateTime> startedAt,
            @JsonProperty("status") BuildStatus status) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(buildTag, "buildTag");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(deletedAt, "deletedAt");
        Utils.checkNotNull(finishedAt, "finishedAt");
        Utils.checkNotNull(imageSize, "imageSize");
        Utils.checkNotNull(regionalContainerTags, "regionalContainerTags");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(status, "status");
        this.appId = appId;
        this.buildId = buildId;
        this.buildTag = buildTag;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.deletedAt = deletedAt;
        this.finishedAt = finishedAt;
        this.imageSize = imageSize;
        this.regionalContainerTags = regionalContainerTags;
        this.startedAt = startedAt;
        this.status = status;
    }
    
    public Build(
            String appId,
            int buildId,
            OffsetDateTime createdAt,
            String createdBy,
            long imageSize,
            List<RegionalContainerTags> regionalContainerTags,
            BuildStatus status) {
        this(appId, buildId, JsonNullable.undefined(), createdAt, createdBy, Optional.empty(), Optional.empty(), imageSize, regionalContainerTags, Optional.empty(), status);
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

    @JsonIgnore
    public JsonNullable<String> buildTag() {
        return buildTag;
    }

    /**
     * When [`CreateBuild()`](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called.
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
     * When the build was deleted.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> deletedAt() {
        return deletedAt;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> finishedAt() {
        return finishedAt;
    }

    /**
     * The size (in bytes) of the Docker image built by Hathora.
     */
    @JsonIgnore
    public long imageSize() {
        return imageSize;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public List<RegionalContainerTags> regionalContainerTags() {
        return regionalContainerTags;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startedAt() {
        return startedAt;
    }

    @JsonIgnore
    public BuildStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * System generated unique identifier for an application.
     */
    public Build withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    public Build withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    public Build withBuildTag(String buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = JsonNullable.of(buildTag);
        return this;
    }

    public Build withBuildTag(JsonNullable<String> buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = buildTag;
        return this;
    }

    /**
     * When [`CreateBuild()`](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called.
     */
    public Build withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Build withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * When the build was deleted.
     */
    public Build withDeletedAt(OffsetDateTime deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    /**
     * When the build was deleted.
     */
    public Build withDeletedAt(Optional<OffsetDateTime> deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public Build withFinishedAt(OffsetDateTime finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = Optional.ofNullable(finishedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public Build withFinishedAt(Optional<OffsetDateTime> finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * The size (in bytes) of the Docker image built by Hathora.
     */
    public Build withImageSize(long imageSize) {
        Utils.checkNotNull(imageSize, "imageSize");
        this.imageSize = imageSize;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public Build withRegionalContainerTags(List<RegionalContainerTags> regionalContainerTags) {
        Utils.checkNotNull(regionalContainerTags, "regionalContainerTags");
        this.regionalContainerTags = regionalContainerTags;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public Build withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = Optional.ofNullable(startedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public Build withStartedAt(Optional<OffsetDateTime> startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public Build withStatus(BuildStatus status) {
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
        Build other = (Build) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.buildTag, other.buildTag) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            Objects.deepEquals(this.finishedAt, other.finishedAt) &&
            Objects.deepEquals(this.imageSize, other.imageSize) &&
            Objects.deepEquals(this.regionalContainerTags, other.regionalContainerTags) &&
            Objects.deepEquals(this.startedAt, other.startedAt) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            buildId,
            buildTag,
            createdAt,
            createdBy,
            deletedAt,
            finishedAt,
            imageSize,
            regionalContainerTags,
            startedAt,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Build.class,
                "appId", appId,
                "buildId", buildId,
                "buildTag", buildTag,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "deletedAt", deletedAt,
                "finishedAt", finishedAt,
                "imageSize", imageSize,
                "regionalContainerTags", regionalContainerTags,
                "startedAt", startedAt,
                "status", status);
    }
    
    public final static class Builder {
 
        private String appId;
 
        private Integer buildId;
 
        private JsonNullable<String> buildTag = JsonNullable.undefined();
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private Optional<OffsetDateTime> deletedAt = Optional.empty();
 
        private Optional<OffsetDateTime> finishedAt = Optional.empty();
 
        private Long imageSize;
 
        @Deprecated
        private List<RegionalContainerTags> regionalContainerTags;
 
        private Optional<OffsetDateTime> startedAt = Optional.empty();
 
        private BuildStatus status;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder buildTag(String buildTag) {
            Utils.checkNotNull(buildTag, "buildTag");
            this.buildTag = JsonNullable.of(buildTag);
            return this;
        }

        public Builder buildTag(JsonNullable<String> buildTag) {
            Utils.checkNotNull(buildTag, "buildTag");
            this.buildTag = buildTag;
            return this;
        }

        /**
         * When [`CreateBuild()`](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called.
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
         * When the build was deleted.
         */
        public Builder deletedAt(OffsetDateTime deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = Optional.ofNullable(deletedAt);
            return this;
        }

        /**
         * When the build was deleted.
         */
        public Builder deletedAt(Optional<OffsetDateTime> deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = deletedAt;
            return this;
        }

        /**
         * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
         */
        public Builder finishedAt(OffsetDateTime finishedAt) {
            Utils.checkNotNull(finishedAt, "finishedAt");
            this.finishedAt = Optional.ofNullable(finishedAt);
            return this;
        }

        /**
         * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
         */
        public Builder finishedAt(Optional<OffsetDateTime> finishedAt) {
            Utils.checkNotNull(finishedAt, "finishedAt");
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * The size (in bytes) of the Docker image built by Hathora.
         */
        public Builder imageSize(long imageSize) {
            Utils.checkNotNull(imageSize, "imageSize");
            this.imageSize = imageSize;
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder regionalContainerTags(List<RegionalContainerTags> regionalContainerTags) {
            Utils.checkNotNull(regionalContainerTags, "regionalContainerTags");
            this.regionalContainerTags = regionalContainerTags;
            return this;
        }

        /**
         * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
         */
        public Builder startedAt(OffsetDateTime startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = Optional.ofNullable(startedAt);
            return this;
        }

        /**
         * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
         */
        public Builder startedAt(Optional<OffsetDateTime> startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
            return this;
        }

        public Builder status(BuildStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public Build build() {
            return new Build(
                appId,
                buildId,
                buildTag,
                createdAt,
                createdBy,
                deletedAt,
                finishedAt,
                imageSize,
                regionalContainerTags,
                startedAt,
                status);
        }
    }
}
