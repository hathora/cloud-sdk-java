/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class DeleteBuildRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buildId")
    private String buildId;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=orgId")
    private Optional<String> orgId;

    @JsonCreator
    public DeleteBuildRequest(
            String buildId,
            Optional<String> orgId) {
        Utils.checkNotNull(buildId, "buildId");
        Utils.checkNotNull(orgId, "orgId");
        this.buildId = buildId;
        this.orgId = orgId;
    }
    
    public DeleteBuildRequest(
            String buildId) {
        this(buildId, Optional.empty());
    }

    @JsonIgnore
    public String buildId() {
        return buildId;
    }

    @JsonIgnore
    public Optional<String> orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public DeleteBuildRequest withBuildId(String buildId) {
        Utils.checkNotNull(buildId, "buildId");
        this.buildId = buildId;
        return this;
    }

    public DeleteBuildRequest withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = Optional.ofNullable(orgId);
        return this;
    }

    public DeleteBuildRequest withOrgId(Optional<String> orgId) {
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
        DeleteBuildRequest other = (DeleteBuildRequest) o;
        return 
            Objects.deepEquals(this.buildId, other.buildId) &&
            Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            buildId,
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteBuildRequest.class,
                "buildId", buildId,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private String buildId;
 
        private Optional<String> orgId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder buildId(String buildId) {
            Utils.checkNotNull(buildId, "buildId");
            this.buildId = buildId;
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
        
        public DeleteBuildRequest build() {
            return new DeleteBuildRequest(
                buildId,
                orgId);
        }
    }
}
