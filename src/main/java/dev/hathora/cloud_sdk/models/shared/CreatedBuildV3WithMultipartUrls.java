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
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * CreatedBuildV3WithMultipartUrls
 * 
 * <p>A build represents a game server artifact and its associated metadata.
 */

public class CreatedBuildV3WithMultipartUrls {

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

    @JsonProperty("completeUploadPostRequestUrl")
    private String completeUploadPostRequestUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contentHash")
    private Optional<String> contentHash;

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
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonProperty("orgId")
    private String orgId;

    /**
     * Url to view details, like build logs, of the build.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shareUrl")
    private Optional<String> shareUrl;

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
    public CreatedBuildV3WithMultipartUrls(
            @JsonProperty("buildId") String buildId,
            @JsonProperty("buildTag") Optional<String> buildTag,
            @JsonProperty("completeUploadPostRequestUrl") String completeUploadPostRequestUrl,
            @JsonProperty("contentHash") Optional<String> contentHash,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("deletedAt") Optional<OffsetDateTime> deletedAt,
            @JsonProperty("expiredAt") Optional<OffsetDateTime> expiredAt,
            @JsonProperty("finishedAt") Optional<OffsetDateTime> finishedAt,
            @JsonProperty("imageSize") long imageSize,
            @JsonProperty("maxChunkSize") double maxChunkSize,
            @JsonProperty("orgId") String orgId,
            @JsonProperty("shareUrl") Optional<String> shareUrl,
            @JsonProperty("startedAt") Optional<OffsetDateTime> startedAt,
            @JsonProperty("status") BuildStatus status,
            @JsonProperty("uploadParts") List<BuildPart> uploadParts) {
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(buildTag, "buildTag");
        Utils.checkNotNull(completeUploadPostRequestUrl, "completeUploadPostRequestUrl");
        Utils.checkNotNull(contentHash, "contentHash");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(deletedAt, "deletedAt");
        Utils.checkNotNull(expiredAt, "expiredAt");
        Utils.checkNotNull(finishedAt, "finishedAt");
        Utils.checkNotNull(imageSize, "imageSize");
        Utils.checkNotNull(maxChunkSize, "maxChunkSize");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(shareUrl, "shareUrl");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(uploadParts, "uploadParts");
        this.buildId = buildId;
        this.buildTag = buildTag;
        this.completeUploadPostRequestUrl = completeUploadPostRequestUrl;
        this.contentHash = contentHash;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.deletedAt = deletedAt;
        this.expiredAt = expiredAt;
        this.finishedAt = finishedAt;
        this.imageSize = imageSize;
        this.maxChunkSize = maxChunkSize;
        this.orgId = orgId;
        this.shareUrl = shareUrl;
        this.startedAt = startedAt;
        this.status = status;
        this.uploadParts = uploadParts;
    }
    
    public CreatedBuildV3WithMultipartUrls(
            String buildId,
            String completeUploadPostRequestUrl,
            OffsetDateTime createdAt,
            String createdBy,
            long imageSize,
            double maxChunkSize,
            String orgId,
            BuildStatus status,
            List<BuildPart> uploadParts) {
        this(buildId, Optional.empty(), completeUploadPostRequestUrl, Optional.empty(), createdAt, createdBy, Optional.empty(), Optional.empty(), Optional.empty(), imageSize, maxChunkSize, orgId, Optional.empty(), Optional.empty(), status, uploadParts);
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

    @JsonIgnore
    public String completeUploadPostRequestUrl() {
        return completeUploadPostRequestUrl;
    }

    @JsonIgnore
    public Optional<String> contentHash() {
        return contentHash;
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
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    /**
     * Url to view details, like build logs, of the build.
     */
    @JsonIgnore
    public Optional<String> shareUrl() {
        return shareUrl;
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
     * System generated id for a build. Can also be user defined when creating a build.
     */
    public CreatedBuildV3WithMultipartUrls withBuildId(String buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    public CreatedBuildV3WithMultipartUrls withBuildTag(String buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = Optional.ofNullable(buildTag);
        return this;
    }

    /**
     * Tag to associate an external version with a build. It is accessible via [`GetBuildInfo()`](https://hathora.dev/api#tag/BuildV2/operation/GetBuildInfo).
     */
    public CreatedBuildV3WithMultipartUrls withBuildTag(Optional<String> buildTag) {
        Utils.checkNotNull(buildTag, "buildTag");
        this.buildTag = buildTag;
        return this;
    }

    public CreatedBuildV3WithMultipartUrls withCompleteUploadPostRequestUrl(String completeUploadPostRequestUrl) {
        Utils.checkNotNull(completeUploadPostRequestUrl, "completeUploadPostRequestUrl");
        this.completeUploadPostRequestUrl = completeUploadPostRequestUrl;
        return this;
    }

    public CreatedBuildV3WithMultipartUrls withContentHash(String contentHash) {
        Utils.checkNotNull(contentHash, "contentHash");
        this.contentHash = Optional.ofNullable(contentHash);
        return this;
    }

    public CreatedBuildV3WithMultipartUrls withContentHash(Optional<String> contentHash) {
        Utils.checkNotNull(contentHash, "contentHash");
        this.contentHash = contentHash;
        return this;
    }

    /**
     * When [`CreateBuild()`](https://hathora.dev/api#tag/BuildV2/operation/CreateBuild) is called.
     */
    public CreatedBuildV3WithMultipartUrls withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public CreatedBuildV3WithMultipartUrls withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * When the build was deleted.
     */
    public CreatedBuildV3WithMultipartUrls withDeletedAt(OffsetDateTime deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    /**
     * When the build was deleted.
     */
    public CreatedBuildV3WithMultipartUrls withDeletedAt(Optional<OffsetDateTime> deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * When the build expired
     */
    public CreatedBuildV3WithMultipartUrls withExpiredAt(OffsetDateTime expiredAt) {
        Utils.checkNotNull(expiredAt, "expiredAt");
        this.expiredAt = Optional.ofNullable(expiredAt);
        return this;
    }

    /**
     * When the build expired
     */
    public CreatedBuildV3WithMultipartUrls withExpiredAt(Optional<OffsetDateTime> expiredAt) {
        Utils.checkNotNull(expiredAt, "expiredAt");
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public CreatedBuildV3WithMultipartUrls withFinishedAt(OffsetDateTime finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = Optional.ofNullable(finishedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) finished executing.
     */
    public CreatedBuildV3WithMultipartUrls withFinishedAt(Optional<OffsetDateTime> finishedAt) {
        Utils.checkNotNull(finishedAt, "finishedAt");
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * The size (in bytes) of the Docker image built by Hathora.
     */
    public CreatedBuildV3WithMultipartUrls withImageSize(long imageSize) {
        Utils.checkNotNull(imageSize, "imageSize");
        this.imageSize = imageSize;
        return this;
    }

    public CreatedBuildV3WithMultipartUrls withMaxChunkSize(double maxChunkSize) {
        Utils.checkNotNull(maxChunkSize, "maxChunkSize");
        this.maxChunkSize = maxChunkSize;
        return this;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    public CreatedBuildV3WithMultipartUrls withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    /**
     * Url to view details, like build logs, of the build.
     */
    public CreatedBuildV3WithMultipartUrls withShareUrl(String shareUrl) {
        Utils.checkNotNull(shareUrl, "shareUrl");
        this.shareUrl = Optional.ofNullable(shareUrl);
        return this;
    }

    /**
     * Url to view details, like build logs, of the build.
     */
    public CreatedBuildV3WithMultipartUrls withShareUrl(Optional<String> shareUrl) {
        Utils.checkNotNull(shareUrl, "shareUrl");
        this.shareUrl = shareUrl;
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public CreatedBuildV3WithMultipartUrls withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = Optional.ofNullable(startedAt);
        return this;
    }

    /**
     * When [`RunBuild()`](https://hathora.dev/api#tag/BuildV2/operation/RunBuild) is called.
     */
    public CreatedBuildV3WithMultipartUrls withStartedAt(Optional<OffsetDateTime> startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public CreatedBuildV3WithMultipartUrls withStatus(BuildStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public CreatedBuildV3WithMultipartUrls withUploadParts(List<BuildPart> uploadParts) {
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
        CreatedBuildV3WithMultipartUrls other = (CreatedBuildV3WithMultipartUrls) o;
        return 
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.buildTag, other.buildTag) &&
            Objects.deepEquals(this.completeUploadPostRequestUrl, other.completeUploadPostRequestUrl) &&
            Objects.deepEquals(this.contentHash, other.contentHash) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            Objects.deepEquals(this.expiredAt, other.expiredAt) &&
            Objects.deepEquals(this.finishedAt, other.finishedAt) &&
            Objects.deepEquals(this.imageSize, other.imageSize) &&
            Objects.deepEquals(this.maxChunkSize, other.maxChunkSize) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.shareUrl, other.shareUrl) &&
            Objects.deepEquals(this.startedAt, other.startedAt) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.uploadParts, other.uploadParts);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            buildId,
            buildTag,
            completeUploadPostRequestUrl,
            contentHash,
            createdAt,
            createdBy,
            deletedAt,
            expiredAt,
            finishedAt,
            imageSize,
            maxChunkSize,
            orgId,
            shareUrl,
            startedAt,
            status,
            uploadParts);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatedBuildV3WithMultipartUrls.class,
                "buildId", buildId,
                "buildTag", buildTag,
                "completeUploadPostRequestUrl", completeUploadPostRequestUrl,
                "contentHash", contentHash,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "deletedAt", deletedAt,
                "expiredAt", expiredAt,
                "finishedAt", finishedAt,
                "imageSize", imageSize,
                "maxChunkSize", maxChunkSize,
                "orgId", orgId,
                "shareUrl", shareUrl,
                "startedAt", startedAt,
                "status", status,
                "uploadParts", uploadParts);
    }
    
    public final static class Builder {
 
        private String buildId;
 
        private Optional<String> buildTag = Optional.empty();
 
        private String completeUploadPostRequestUrl;
 
        private Optional<String> contentHash = Optional.empty();
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private Optional<OffsetDateTime> deletedAt = Optional.empty();
 
        private Optional<OffsetDateTime> expiredAt = Optional.empty();
 
        private Optional<OffsetDateTime> finishedAt = Optional.empty();
 
        private Long imageSize;
 
        private Double maxChunkSize;
 
        private String orgId;
 
        private Optional<String> shareUrl = Optional.empty();
 
        private Optional<OffsetDateTime> startedAt = Optional.empty();
 
        private BuildStatus status;
 
        private List<BuildPart> uploadParts;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder completeUploadPostRequestUrl(String completeUploadPostRequestUrl) {
            Utils.checkNotNull(completeUploadPostRequestUrl, "completeUploadPostRequestUrl");
            this.completeUploadPostRequestUrl = completeUploadPostRequestUrl;
            return this;
        }

        public Builder contentHash(String contentHash) {
            Utils.checkNotNull(contentHash, "contentHash");
            this.contentHash = Optional.ofNullable(contentHash);
            return this;
        }

        public Builder contentHash(Optional<String> contentHash) {
            Utils.checkNotNull(contentHash, "contentHash");
            this.contentHash = contentHash;
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
         * System generated unique identifier for an organization. Not guaranteed to have a specific format.
         */
        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        /**
         * Url to view details, like build logs, of the build.
         */
        public Builder shareUrl(String shareUrl) {
            Utils.checkNotNull(shareUrl, "shareUrl");
            this.shareUrl = Optional.ofNullable(shareUrl);
            return this;
        }

        /**
         * Url to view details, like build logs, of the build.
         */
        public Builder shareUrl(Optional<String> shareUrl) {
            Utils.checkNotNull(shareUrl, "shareUrl");
            this.shareUrl = shareUrl;
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
        
        public CreatedBuildV3WithMultipartUrls build() {
            return new CreatedBuildV3WithMultipartUrls(
                buildId,
                buildTag,
                completeUploadPostRequestUrl,
                contentHash,
                createdAt,
                createdBy,
                deletedAt,
                expiredAt,
                finishedAt,
                imageSize,
                maxChunkSize,
                orgId,
                shareUrl,
                startedAt,
                status,
                uploadParts);
        }
    }
}

