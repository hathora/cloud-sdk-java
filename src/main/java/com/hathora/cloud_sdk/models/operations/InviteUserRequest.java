/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.cloud_sdk.models.shared.CreateUserInvite;
import com.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InviteUserRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateUserInvite createUserInvite;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    private String orgId;

    @JsonCreator
    public InviteUserRequest(
            CreateUserInvite createUserInvite,
            String orgId) {
        Utils.checkNotNull(createUserInvite, "createUserInvite");
        Utils.checkNotNull(orgId, "orgId");
        this.createUserInvite = createUserInvite;
        this.orgId = orgId;
    }

    @JsonIgnore
    public CreateUserInvite createUserInvite() {
        return createUserInvite;
    }

    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public InviteUserRequest withCreateUserInvite(CreateUserInvite createUserInvite) {
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
            Objects.deepEquals(this.createUserInvite, other.createUserInvite) &&
            Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private CreateUserInvite createUserInvite;
 
        private String orgId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createUserInvite(CreateUserInvite createUserInvite) {
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

