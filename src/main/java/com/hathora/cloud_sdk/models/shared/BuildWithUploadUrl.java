/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * BuildWithUploadUrl - A build represents a game server artifact and its associated metadata.
 */

public class BuildWithUploadUrl {

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
    private JsonNullable<? extends String> buildTag;

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
    private Optional<? extends OffsetDateTime> deletedAt;

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("finishedAt")
    private Optional<? extends OffsetDateTime> finishedAt;

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
    private java.util.List<BuildWithUploadUrlRegionalContainerTags> regionalContainerTags;

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("startedAt")
    private Optional<? extends OffsetDateTime> startedAt;

    @JsonProperty("status")
    private BuildStatus status;

    @JsonProperty("uploadBodyParams")
    private java.util.List<UploadBodyParams> uploadBodyParams;

    @JsonProperty("uploadUrl")
    private String uploadUrl;

    @JsonCreator
    public BuildWithUploadUrl(
            @JsonProperty("appId") String appId,
            @JsonProperty("buildId") int buildId,
            @JsonProperty("buildTag") JsonNullable<? extends String> buildTag,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("deletedAt") Optional<? extends OffsetDateTime> deletedAt,
            @JsonProperty("finishedAt") Optional<? extends OffsetDateTime> finishedAt,
            @JsonProperty("imageSize") long imageSize,
            @JsonProperty("regionalContainerTags") java.util.List<BuildWithUploadUrlRegionalContainerTags> regionalContainerTags,
            @JsonProperty("startedAt") Optional<? extends OffsetDateTime> startedAt,
            @JsonProperty("status") BuildStatus status,
            @JsonProperty("uploadBodyParams") java.util.List<UploadBodyParams> uploadBodyParams,
            @JsonProperty("uploadUrl") String uploadUrl) {
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
        Utils.checkNotNull(uploadBodyParams, "uploadBodyParams");
        Utils.checkNotNull(uploadUrl, "uploadUrl");
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
        this.uploadBodyParams = uploadBodyParams;
        this.uploadUrl = uploadUrl;
    }
    
    public BuildWithUploadUrl(
            String appId,
            int buildId,
            OffsetDateTime createdAt,
            String createdBy,
            long imageSize,
            java.util.List<BuildWithUploadUrlRegionalContainerTags> regionalContainerTags,
            BuildStatus status,
            java.util.List<UploadBodyParams> uploadBodyParams,
            String uploadUrl) {
        this(appId, buildId, JsonNullable.undefined(), createdAt, createdBy, Optional.empty(), Optional.empty(), imageSize, regionalContainerTags, Optional.empty(), status, uploadBodyParams, uploadUrl);
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> buildTag() {
        return (JsonNullable<String>) buildTag;
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
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> deletedAt() {
        return (Optional<OffsetDateTime>) deletedAt;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> finishedAt() {
        return (Optional<OffsetDateTime>) finishedAt;
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
    public java.util.List<BuildWithUploadUrlRegionalContainerTags> regionalContainerTags() {
        return regionalContainerTags;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startedAt() {
        return (Optional<OffsetDateTime>) startedAt;
    }

    @JsonIgnore
    public BuildStatus status() {
        return status;
    }

    @JsonIgnore
    public java.util.List<UploadBodyParams> uploadBodyParams() {
        return uploadBodyParams;
    }

    @JsonIgnore
    public String uploadUrl() {
        return uploadUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * System generated unique identifier for an application.
     */
    public BuildWithUploadUrl withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    public BuildWithUploadUrl withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    public BuildWithUploadUrl withBuildTag(String buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = JsonNullable.of(buildTag);
        return this;
    }

    public BuildWithUploadUrl withBuildTag(JsonNullable<? extends String> buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = buildTag;
        return this;
    }

    /**
     * When [`CreateBuild()`](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called.
     */
    public BuildWithUploadUrl withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public BuildWithUploadUrl withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * When the build was deleted.
     */
    public BuildWithUploadUrl withDeletedAt(OffsetDateTime deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    /**
     * When the build was deleted.
     */
    public BuildWithUploadUrl withDeletedAt(Optional<? extends OffsetDateTime> deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public BuildWithUploadUrl withFinishedAt(OffsetDateTime finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = Optional.ofNullable(finishedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public BuildWithUploadUrl withFinishedAt(Optional<? extends OffsetDateTime> finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * The size (in bytes) of the Docker image built by Hathora.
     */
    public BuildWithUploadUrl withImageSize(long imageSize) {
        Utils.checkNotNull(imageSize, "imageSize");
        this.imageSize = imageSize;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public BuildWithUploadUrl withRegionalContainerTags(java.util.List<BuildWithUploadUrlRegionalContainerTags> regionalContainerTags) {
        Utils.checkNotNull(regionalContainerTags, "regionalContainerTags");
        this.regionalContainerTags = regionalContainerTags;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public BuildWithUploadUrl withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = Optional.ofNullable(startedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public BuildWithUploadUrl withStartedAt(Optional<? extends OffsetDateTime> startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public BuildWithUploadUrl withStatus(BuildStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public BuildWithUploadUrl withUploadBodyParams(java.util.List<UploadBodyParams> uploadBodyParams) {
        Utils.checkNotNull(uploadBodyParams, "uploadBodyParams");
        this.uploadBodyParams = uploadBodyParams;
        return this;
    }

    public BuildWithUploadUrl withUploadUrl(String uploadUrl) {
        Utils.checkNotNull(uploadUrl, "uploadUrl");
        this.uploadUrl = uploadUrl;
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
        BuildWithUploadUrl other = (BuildWithUploadUrl) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.buildId, other.buildId) &&
            java.util.Objects.deepEquals(this.buildTag, other.buildTag) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.createdBy, other.createdBy) &&
            java.util.Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            java.util.Objects.deepEquals(this.finishedAt, other.finishedAt) &&
            java.util.Objects.deepEquals(this.imageSize, other.imageSize) &&
            java.util.Objects.deepEquals(this.regionalContainerTags, other.regionalContainerTags) &&
            java.util.Objects.deepEquals(this.startedAt, other.startedAt) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.uploadBodyParams, other.uploadBodyParams) &&
            java.util.Objects.deepEquals(this.uploadUrl, other.uploadUrl);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
            status,
            uploadBodyParams,
            uploadUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BuildWithUploadUrl.class,
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
                "status", status,
                "uploadBodyParams", uploadBodyParams,
                "uploadUrl", uploadUrl);
    }
    
    public final static class Builder {
 
        private String appId;
 
        private Integer buildId;
 
        private JsonNullable<? extends String> buildTag = JsonNullable.undefined();
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private Optional<? extends OffsetDateTime> deletedAt = Optional.empty();
 
        private Optional<? extends OffsetDateTime> finishedAt = Optional.empty();
 
        private Long imageSize;
 
        @Deprecated
        private java.util.List<BuildWithUploadUrlRegionalContainerTags> regionalContainerTags;
 
        private Optional<? extends OffsetDateTime> startedAt = Optional.empty();
 
        private BuildStatus status;
 
        private java.util.List<UploadBodyParams> uploadBodyParams;
 
        private String uploadUrl;  
        
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

        public Builder buildTag(JsonNullable<? extends String> buildTag) {
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
        public Builder deletedAt(Optional<? extends OffsetDateTime> deletedAt) {
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
        public Builder finishedAt(Optional<? extends OffsetDateTime> finishedAt) {
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
        public Builder regionalContainerTags(java.util.List<BuildWithUploadUrlRegionalContainerTags> regionalContainerTags) {
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
        public Builder startedAt(Optional<? extends OffsetDateTime> startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
            return this;
        }

        public Builder status(BuildStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder uploadBodyParams(java.util.List<UploadBodyParams> uploadBodyParams) {
            Utils.checkNotNull(uploadBodyParams, "uploadBodyParams");
            this.uploadBodyParams = uploadBodyParams;
            return this;
        }

        public Builder uploadUrl(String uploadUrl) {
            Utils.checkNotNull(uploadUrl, "uploadUrl");
            this.uploadUrl = uploadUrl;
            return this;
        }
        
        public BuildWithUploadUrl build() {
            return new BuildWithUploadUrl(
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
                status,
                uploadBodyParams,
                uploadUrl);
        }
    }
}
