/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class InviteUserRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private dev.hathora.cloud_api.models.shared.CreateUserInvite createUserInvite;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    private String orgId;

    @JsonCreator
    public InviteUserRequest(
            dev.hathora.cloud_api.models.shared.CreateUserInvite createUserInvite,
            String orgId) {
        Utils.checkNotNull(createUserInvite, "createUserInvite");
        Utils.checkNotNull(orgId, "orgId");
        this.createUserInvite = createUserInvite;
        this.orgId = orgId;
    }

    @JsonIgnore
    public dev.hathora.cloud_api.models.shared.CreateUserInvite createUserInvite() {
        return createUserInvite;
    }

    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public InviteUserRequest withCreateUserInvite(dev.hathora.cloud_api.models.shared.CreateUserInvite createUserInvite) {
        Utils.checkNotNull(createUserInvite, "createUserInvite");
        this.createUserInvite = createUserInvite;
        return this;
    }

    public InviteUserRequest withOrgId(String orgId) {
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
        InviteUserRequest other = (InviteUserRequest) o;
        return 
            java.util.Objects.deepEquals(this.createUserInvite, other.createUserInvite) &&
            java.util.Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createUserInvite,
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InviteUserRequest.class,
                "createUserInvite", createUserInvite,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private dev.hathora.cloud_api.models.shared.CreateUserInvite createUserInvite;
 
        private String orgId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createUserInvite(dev.hathora.cloud_api.models.shared.CreateUserInvite createUserInvite) {
            Utils.checkNotNull(createUserInvite, "createUserInvite");
            this.createUserInvite = createUserInvite;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }
        
        public InviteUserRequest build() {
            return new InviteUserRequest(
                createUserInvite,
                orgId);
        }
    }
}

