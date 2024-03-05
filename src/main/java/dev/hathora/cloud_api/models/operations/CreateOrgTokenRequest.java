/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class CreateOrgTokenRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private dev.hathora.cloud_api.models.shared.CreateOrgToken createOrgToken;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    private String orgId;

    public CreateOrgTokenRequest(
            dev.hathora.cloud_api.models.shared.CreateOrgToken createOrgToken,
            String orgId) {
        Utils.checkNotNull(createOrgToken, "createOrgToken");
        Utils.checkNotNull(orgId, "orgId");
        this.createOrgToken = createOrgToken;
        this.orgId = orgId;
    }

    public dev.hathora.cloud_api.models.shared.CreateOrgToken createOrgToken() {
        return createOrgToken;
    }

    public String orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateOrgTokenRequest withCreateOrgToken(dev.hathora.cloud_api.models.shared.CreateOrgToken createOrgToken) {
        Utils.checkNotNull(createOrgToken, "createOrgToken");
        this.createOrgToken = createOrgToken;
        return this;
    }

    public CreateOrgTokenRequest withOrgId(String orgId) {
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
        CreateOrgTokenRequest other = (CreateOrgTokenRequest) o;
        return 
            java.util.Objects.deepEquals(this.createOrgToken, other.createOrgToken) &&
            java.util.Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createOrgToken,
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrgTokenRequest.class,
                "createOrgToken", createOrgToken,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private dev.hathora.cloud_api.models.shared.CreateOrgToken createOrgToken;
 
        private String orgId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createOrgToken(dev.hathora.cloud_api.models.shared.CreateOrgToken createOrgToken) {
            Utils.checkNotNull(createOrgToken, "createOrgToken");
            this.createOrgToken = createOrgToken;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }
        
        public CreateOrgTokenRequest build() {
            return new CreateOrgTokenRequest(
                createOrgToken,
                orgId);
        }
    }
}

