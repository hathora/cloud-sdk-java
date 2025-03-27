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
import java.lang.Deprecated;
import java.lang.Double;
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
 * BuildWithMultipartUrls
 * 
 * <p>A build represents a game server artifact and its associated metadata.
 */

public class BuildWithMultipartUrls {

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

    @JsonProperty("completeUploadPostRequestUrl")
    private String completeUploadPostRequestUrl;

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
     * When the build expired
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiredAt")
    private Optional<OffsetDateTime> expiredAt;

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

    @JsonProperty("maxChunkSize")
    private double maxChunkSize;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("regionalContainerTags")
    @Deprecated
    private List<BuildWithMultipartUrlsRegionalContainerTags> regionalContainerTags;

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("startedAt")
    private Optional<OffsetDateTime> startedAt;

    @JsonProperty("status")
    private BuildStatus status;

    @JsonProperty("uploadParts")
    private List<BuildPart> uploadParts;

    @JsonCreator
    public BuildWithMultipartUrls(
            @JsonProperty("appId") String appId,
            @JsonProperty("buildId") int buildId,
            @JsonProperty("buildTag") JsonNullable<String> buildTag,
            @JsonProperty("completeUploadPostRequestUrl") String completeUploadPostRequestUrl,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("deletedAt") Optional<OffsetDateTime> deletedAt,
            @JsonProperty("expiredAt") Optional<OffsetDateTime> expiredAt,
            @JsonProperty("finishedAt") Optional<OffsetDateTime> finishedAt,
            @JsonProperty("imageSize") long imageSize,
            @JsonProperty("maxChunkSize") double maxChunkSize,
            @JsonProperty("regionalContainerTags") List<BuildWithMultipartUrlsRegionalContainerTags> regionalContainerTags,
            @JsonProperty("startedAt") Optional<OffsetDateTime> startedAt,
            @JsonProperty("status") BuildStatus status,
            @JsonProperty("uploadParts") List<BuildPart> uploadParts) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(buildTag, "buildTag");
        Utils.checkNotNull(completeUploadPostRequestUrl, "completeUploadPostRequestUrl");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(deletedAt, "deletedAt");
        Utils.checkNotNull(expiredAt, "expiredAt");
        Utils.checkNotNull(finishedAt, "finishedAt");
        Utils.checkNotNull(imageSize, "imageSize");
        Utils.checkNotNull(maxChunkSize, "maxChunkSize");
        Utils.checkNotNull(regionalContainerTags, "regionalContainerTags");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(uploadParts, "uploadParts");
        this.appId = appId;
        this.buildId = buildId;
        this.buildTag = buildTag;
        this.completeUploadPostRequestUrl = completeUploadPostRequestUrl;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.deletedAt = deletedAt;
        this.expiredAt = expiredAt;
        this.finishedAt = finishedAt;
        this.imageSize = imageSize;
        this.maxChunkSize = maxChunkSize;
        this.regionalContainerTags = regionalContainerTags;
        this.startedAt = startedAt;
        this.status = status;
        this.uploadParts = uploadParts;
    }
    
    public BuildWithMultipartUrls(
            String appId,
            int buildId,
            String completeUploadPostRequestUrl,
            OffsetDateTime createdAt,
            String createdBy,
            long imageSize,
            double maxChunkSize,
            List<BuildWithMultipartUrlsRegionalContainerTags> regionalContainerTags,
            BuildStatus status,
            List<BuildPart> uploadParts) {
        this(appId, buildId, JsonNullable.undefined(), completeUploadPostRequestUrl, createdAt, createdBy, Optional.empty(), Optional.empty(), Optional.empty(), imageSize, maxChunkSize, regionalContainerTags, Optional.empty(), status, uploadParts);
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

    @JsonIgnore
    public String completeUploadPostRequestUrl() {
        return completeUploadPostRequestUrl;
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
     * When the build expired
     */
    @JsonIgnore
    public Optional<OffsetDateTime> expiredAt() {
        return expiredAt;
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

    @JsonIgnore
    public double maxChunkSize() {
        return maxChunkSize;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public List<BuildWithMultipartUrlsRegionalContainerTags> regionalContainerTags() {
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

    @JsonIgnore
    public List<BuildPart> uploadParts() {
        return uploadParts;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * System generated unique identifier for an application.
     */
    public BuildWithMultipartUrls withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * System generated id for a build. Increments by 1.
     */
    public BuildWithMultipartUrls withBuildId(int buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    public BuildWithMultipartUrls withBuildTag(String buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = JsonNullable.of(buildTag);
        return this;
    }

    public BuildWithMultipartUrls withBuildTag(JsonNullable<String> buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = buildTag;
        return this;
    }

    public BuildWithMultipartUrls withCompleteUploadPostRequestUrl(String completeUploadPostRequestUrl) {
        Utils.checkNotNull(completeUploadPostRequestUrl, "completeUploadPostRequestUrl");
        this.completeUploadPostRequestUrl = completeUploadPostRequestUrl;
        return this;
    }

    /**
     * When [`CreateBuild()`](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called.
     */
    public BuildWithMultipartUrls withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public BuildWithMultipartUrls withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * When the build was deleted.
     */
    public BuildWithMultipartUrls withDeletedAt(OffsetDateTime deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    /**
     * When the build was deleted.
     */
    public BuildWithMultipartUrls withDeletedAt(Optional<OffsetDateTime> deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * When the build expired
     */
    public BuildWithMultipartUrls withExpiredAt(OffsetDateTime expiredAt) {
        Utils.checkNotNull(expiredAt, "expiredAt");
        this.expiredAt = Optional.ofNullable(expiredAt);
        return this;
    }

    /**
     * When the build expired
     */
    public BuildWithMultipartUrls withExpiredAt(Optional<OffsetDateTime> expiredAt) {
        Utils.checkNotNull(expiredAt, "expiredAt");
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public BuildWithMultipartUrls withFinishedAt(OffsetDateTime finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = Optional.ofNullable(finishedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public BuildWithMultipartUrls withFinishedAt(Optional<OffsetDateTime> finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * The size (in bytes) of the Docker image built by Hathora.
     */
    public BuildWithMultipartUrls withImageSize(long imageSize) {
        Utils.checkNotNull(imageSize, "imageSize");
        this.imageSize = imageSize;
        return this;
    }

    public BuildWithMultipartUrls withMaxChunkSize(double maxChunkSize) {
        Utils.checkNotNull(maxChunkSize, "maxChunkSize");
        this.maxChunkSize = maxChunkSize;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public BuildWithMultipartUrls withRegionalContainerTags(List<BuildWithMultipartUrlsRegionalContainerTags> regionalContainerTags) {
        Utils.checkNotNull(regionalContainerTags, "regionalContainerTags");
        this.regionalContainerTags = regionalContainerTags;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public BuildWithMultipartUrls withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = Optional.ofNullable(startedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public BuildWithMultipartUrls withStartedAt(Optional<OffsetDateTime> startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public BuildWithMultipartUrls withStatus(BuildStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public BuildWithMultipartUrls withUploadParts(List<BuildPart> uploadParts) {
        Utils.checkNotNull(uploadParts, "uploadParts");
        this.uploadParts = uploadParts;
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
        BuildWithMultipartUrls other = (BuildWithMultipartUrls) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.buildTag, other.buildTag) &&
            Objects.deepEquals(this.completeUploadPostRequestUrl, other.completeUploadPostRequestUrl) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            Objects.deepEquals(this.expiredAt, other.expiredAt) &&
            Objects.deepEquals(this.finishedAt, other.finishedAt) &&
            Objects.deepEquals(this.imageSize, other.imageSize) &&
            Objects.deepEquals(this.maxChunkSize, other.maxChunkSize) &&
            Objects.deepEquals(this.regionalContainerTags, other.regionalContainerTags) &&
            Objects.deepEquals(this.startedAt, other.startedAt) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.uploadParts, other.uploadParts);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            buildId,
            buildTag,
            completeUploadPostRequestUrl,
            createdAt,
            createdBy,
            deletedAt,
            expiredAt,
            finishedAt,
            imageSize,
            maxChunkSize,
            regionalContainerTags,
            startedAt,
            status,
            uploadParts);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BuildWithMultipartUrls.class,
                "appId", appId,
                "buildId", buildId,
                "buildTag", buildTag,
                "completeUploadPostRequestUrl", completeUploadPostRequestUrl,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "deletedAt", deletedAt,
                "expiredAt", expiredAt,
                "finishedAt", finishedAt,
                "imageSize", imageSize,
                "maxChunkSize", maxChunkSize,
                "regionalContainerTags", regionalContainerTags,
                "startedAt", startedAt,
                "status", status,
                "uploadParts", uploadParts);
    }
    
    public final static class Builder {
 
        private String appId;
 
        private Integer buildId;
 
        private JsonNullable<String> buildTag = JsonNullable.undefined();
 
        private String completeUploadPostRequestUrl;
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private Optional<OffsetDateTime> deletedAt = Optional.empty();
 
        private Optional<OffsetDateTime> expiredAt = Optional.empty();
 
        private Optional<OffsetDateTime> finishedAt = Optional.empty();
 
        private Long imageSize;
 
        private Double maxChunkSize;
 
        @Deprecated
        private List<BuildWithMultipartUrlsRegionalContainerTags> regionalContainerTags;
 
        private Optional<OffsetDateTime> startedAt = Optional.empty();
 
        private BuildStatus status;
 
        private List<BuildPart> uploadParts;  
        
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

        public Builder completeUploadPostRequestUrl(String completeUploadPostRequestUrl) {
            Utils.checkNotNull(completeUploadPostRequestUrl, "completeUploadPostRequestUrl");
            this.completeUploadPostRequestUrl = completeUploadPostRequestUrl;
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
         * When the build expired
         */
        public Builder expiredAt(OffsetDateTime expiredAt) {
            Utils.checkNotNull(expiredAt, "expiredAt");
            this.expiredAt = Optional.ofNullable(expiredAt);
            return this;
        }

        /**
         * When the build expired
         */
        public Builder expiredAt(Optional<OffsetDateTime> expiredAt) {
            Utils.checkNotNull(expiredAt, "expiredAt");
            this.expiredAt = expiredAt;
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

        public Builder maxChunkSize(double maxChunkSize) {
            Utils.checkNotNull(maxChunkSize, "maxChunkSize");
            this.maxChunkSize = maxChunkSize;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder regionalContainerTags(List<BuildWithMultipartUrlsRegionalContainerTags> regionalContainerTags) {
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

        public Builder uploadParts(List<BuildPart> uploadParts) {
            Utils.checkNotNull(uploadParts, "uploadParts");
            this.uploadParts = uploadParts;
            return this;
        }
        
        public BuildWithMultipartUrls build() {
            return new BuildWithMultipartUrls(
                appId,
                buildId,
                buildTag,
                completeUploadPostRequestUrl,
                createdAt,
                createdBy,
                deletedAt,
                expiredAt,
                finishedAt,
                imageSize,
                maxChunkSize,
                regionalContainerTags,
                startedAt,
                status,
                uploadParts);
        }
    }
}

