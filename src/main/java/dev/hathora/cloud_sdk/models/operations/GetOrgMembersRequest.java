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

public class GetOrgMembersRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    private String orgId;

    @JsonCreator
    public GetOrgMembersRequest(
            String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
    }

    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetOrgMembersRequest withOrgId(String orgId) {
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
        GetOrgMembersRequest other = (GetOrgMembersRequest) o;
        return 
            Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOrgMembersRequest.class,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private String orgId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }
        
        public GetOrgMembersRequest build() {
            return new GetOrgMembersRequest(
                orgId);
        }
    }
}
