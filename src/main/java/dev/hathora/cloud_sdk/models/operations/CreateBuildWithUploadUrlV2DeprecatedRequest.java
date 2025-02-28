/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.CreateBuildParams;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class CreateBuildWithUploadUrlV2DeprecatedRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateBuildParams createBuildParams;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @JsonCreator
    public CreateBuildWithUploadUrlV2DeprecatedRequest(
            CreateBuildParams createBuildParams,
            Optional<String> appId) {
        Utils.checkNotNull(createBuildParams, "createBuildParams");
        Utils.checkNotNull(appId, "appId");
        this.createBuildParams = createBuildParams;
        this.appId = appId;
    }
    
    public CreateBuildWithUploadUrlV2DeprecatedRequest(
            CreateBuildParams createBuildParams) {
        this(createBuildParams, Optional.empty());
    }

    @JsonIgnore
    public CreateBuildParams createBuildParams() {
        return createBuildParams;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateBuildWithUploadUrlV2DeprecatedRequest withCreateBuildParams(CreateBuildParams createBuildParams) {
        Utils.checkNotNull(createBuildParams, "createBuildParams");
        this.createBuildParams = createBuildParams;
        return this;
    }

    public CreateBuildWithUploadUrlV2DeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateBuildWithUploadUrlV2DeprecatedRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
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
        CreateBuildWithUploadUrlV2DeprecatedRequest other = (CreateBuildWithUploadUrlV2DeprecatedRequest) o;
        return 
            Objects.deepEquals(this.createBuildParams, other.createBuildParams) &&
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createBuildParams,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBuildWithUploadUrlV2DeprecatedRequest.class,
                "createBuildParams", createBuildParams,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private CreateBuildParams createBuildParams;
 
        private Optional<String> appId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createBuildParams(CreateBuildParams createBuildParams) {
            Utils.checkNotNull(createBuildParams, "createBuildParams");
            this.createBuildParams = createBuildParams;
            return this;
        }

        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }
        
        public CreateBuildWithUploadUrlV2DeprecatedRequest build() {
            return new CreateBuildWithUploadUrlV2DeprecatedRequest(
                createBuildParams,
                appId);
        }
    }
}

