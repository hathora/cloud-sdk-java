/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class RevokeOrgTokenRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    private String orgId;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgTokenId")
    private String orgTokenId;

    @JsonCreator
    public RevokeOrgTokenRequest(
            String orgId,
            String orgTokenId) {
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(orgTokenId, "orgTokenId");
        this.orgId = orgId;
        this.orgTokenId = orgTokenId;
    }

    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    @JsonIgnore
    public String orgTokenId() {
        return orgTokenId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RevokeOrgTokenRequest withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public RevokeOrgTokenRequest withOrgTokenId(String orgTokenId) {
        Utils.checkNotNull(orgTokenId, "orgTokenId");
        this.orgTokenId = orgTokenId;
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
        RevokeOrgTokenRequest other = (RevokeOrgTokenRequest) o;
        return 
            java.util.Objects.deepEquals(this.orgId, other.orgId) &&
            java.util.Objects.deepEquals(this.orgTokenId, other.orgTokenId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            orgId,
            orgTokenId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RevokeOrgTokenRequest.class,
                "orgId", orgId,
                "orgTokenId", orgTokenId);
    }
    
    public final static class Builder {
 
        private String orgId;
 
        private String orgTokenId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        public Builder orgTokenId(String orgTokenId) {
            Utils.checkNotNull(orgTokenId, "orgTokenId");
            this.orgTokenId = orgTokenId;
            return this;
        }
        
        public RevokeOrgTokenRequest build() {
            return new RevokeOrgTokenRequest(
                orgId,
                orgTokenId);
        }
    }
}
