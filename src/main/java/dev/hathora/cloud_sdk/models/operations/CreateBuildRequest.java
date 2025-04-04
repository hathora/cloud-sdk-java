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

public class CreateBuildRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateMultipartBuildParams createMultipartBuildParams;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orgId")
    private Optional<String> orgId;

    @JsonCreator
    public CreateBuildRequest(
            CreateMultipartBuildParams createMultipartBuildParams,
            Optional<String> orgId) {
        Utils.checkNotNull(createMultipartBuildParams, "createMultipartBuildParams");
        Utils.checkNotNull(orgId, "orgId");
        this.createMultipartBuildParams = createMultipartBuildParams;
        this.orgId = orgId;
    }
    
    public CreateBuildRequest(
            CreateMultipartBuildParams createMultipartBuildParams) {
        this(createMultipartBuildParams, Optional.empty());
    }

    @JsonIgnore
    public CreateMultipartBuildParams createMultipartBuildParams() {
        return createMultipartBuildParams;
    }

    @JsonIgnore
    public Optional<String> orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public CreateBuildRequest withCreateMultipartBuildParams(CreateMultipartBuildParams createMultipartBuildParams) {
        Utils.checkNotNull(createMultipartBuildParams, "createMultipartBuildParams");
        this.createMultipartBuildParams = createMultipartBuildParams;
        return this;
    }

    public CreateBuildRequest withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.ofNullable(orgId);
        return this;
    }

    public CreateBuildRequest withOrgId(Optional<String> orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
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
        CreateBuildRequest other = (CreateBuildRequest) o;
        return 
            Objects.deepEquals(this.createMultipartBuildParams, other.createMultipartBuildParams) &&
            Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createMultipartBuildParams,
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBuildRequest.class,
                "createMultipartBuildParams", createMultipartBuildParams,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private CreateMultipartBuildParams createMultipartBuildParams;
 
        private Optional<String> orgId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createMultipartBuildParams(CreateMultipartBuildParams createMultipartBuildParams) {
            Utils.checkNotNull(createMultipartBuildParams, "createMultipartBuildParams");
            this.createMultipartBuildParams = createMultipartBuildParams;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = Optional.ofNullable(orgId);
            return this;
        }

        public Builder orgId(Optional<String> orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }
        
        public CreateBuildRequest build() {
            return new CreateBuildRequest(
                createMultipartBuildParams,
                orgId);
        }
    }
}
