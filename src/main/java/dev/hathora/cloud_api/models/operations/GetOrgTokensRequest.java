/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class GetOrgTokensRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    private String orgId;

    @JsonCreator
    public GetOrgTokensRequest(
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

    public GetOrgTokensRequest withOrgId(String orgId) {
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
        GetOrgTokensRequest other = (GetOrgTokensRequest) o;
        return 
            java.util.Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOrgTokensRequest.class,
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
        
        public GetOrgTokensRequest build() {
            return new GetOrgTokensRequest(
                orgId);
        }
    }
}

