/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.cloud_sdk.models.shared.RescindUserInvite;
import com.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RescindInviteRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private RescindUserInvite rescindUserInvite;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    private String orgId;

    @JsonCreator
    public RescindInviteRequest(
            RescindUserInvite rescindUserInvite,
            String orgId) {
        Utils.checkNotNull(rescindUserInvite, "rescindUserInvite");
        Utils.checkNotNull(orgId, "orgId");
        this.rescindUserInvite = rescindUserInvite;
        this.orgId = orgId;
    }

    @JsonIgnore
    public RescindUserInvite rescindUserInvite() {
        return rescindUserInvite;
    }

    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RescindInviteRequest withRescindUserInvite(RescindUserInvite rescindUserInvite) {
        Utils.checkNotNull(rescindUserInvite, "rescindUserInvite");
        this.rescindUserInvite = rescindUserInvite;
        return this;
    }

    public RescindInviteRequest withOrgId(String orgId) {
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
        RescindInviteRequest other = (RescindInviteRequest) o;
        return 
            Objects.deepEquals(this.rescindUserInvite, other.rescindUserInvite) &&
            Objects.deepEquals(this.orgId, other.orgId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rescindUserInvite,
            orgId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RescindInviteRequest.class,
                "rescindUserInvite", rescindUserInvite,
                "orgId", orgId);
    }
    
    public final static class Builder {
 
        private RescindUserInvite rescindUserInvite;
 
        private String orgId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder rescindUserInvite(RescindUserInvite rescindUserInvite) {
            Utils.checkNotNull(rescindUserInvite, "rescindUserInvite");
            this.rescindUserInvite = rescindUserInvite;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }
        
        public RescindInviteRequest build() {
            return new RescindInviteRequest(
                rescindUserInvite,
                orgId);
        }
    }
}

