/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.CreateMultipartBuildParams;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class CreateWithMultipartUploadsV2DeprecatedRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateMultipartBuildParams createMultipartBuildParams;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    private Optional<String> appId;

    @JsonCreator
    public CreateWithMultipartUploadsV2DeprecatedRequest(
            CreateMultipartBuildParams createMultipartBuildParams,
            Optional<String> appId) {
        Utils.checkNotNull(createMultipartBuildParams, "createMultipartBuildParams");
        Utils.checkNotNull(appId, "appId");
        this.createMultipartBuildParams = createMultipartBuildParams;
        this.appId = appId;
    }
    
    public CreateWithMultipartUploadsV2DeprecatedRequest(
            CreateMultipartBuildParams createMultipartBuildParams) {
        this(createMultipartBuildParams, Optional.empty());
    }

    @JsonIgnore
    public CreateMultipartBuildParams createMultipartBuildParams() {
        return createMultipartBuildParams;
    }

    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateWithMultipartUploadsV2DeprecatedRequest withCreateMultipartBuildParams(CreateMultipartBuildParams createMultipartBuildParams) {
        Utils.checkNotNull(createMultipartBuildParams, "createMultipartBuildParams");
        this.createMultipartBuildParams = createMultipartBuildParams;
        return this;
    }

    public CreateWithMultipartUploadsV2DeprecatedRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    public CreateWithMultipartUploadsV2DeprecatedRequest withAppId(Optional<String> appId) {
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
        CreateWithMultipartUploadsV2DeprecatedRequest other = (CreateWithMultipartUploadsV2DeprecatedRequest) o;
        return 
            Objects.deepEquals(this.createMultipartBuildParams, other.createMultipartBuildParams) &&
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createMultipartBuildParams,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateWithMultipartUploadsV2DeprecatedRequest.class,
                "createMultipartBuildParams", createMultipartBuildParams,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private CreateMultipartBuildParams createMultipartBuildParams;
 
        private Optional<String> appId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createMultipartBuildParams(CreateMultipartBuildParams createMultipartBuildParams) {
            Utils.checkNotNull(createMultipartBuildParams, "createMultipartBuildParams");
            this.createMultipartBuildParams = createMultipartBuildParams;
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
        
        public CreateWithMultipartUploadsV2DeprecatedRequest build() {
            return new CreateWithMultipartUploadsV2DeprecatedRequest(
                createMultipartBuildParams,
                appId);
        }
    }
}

