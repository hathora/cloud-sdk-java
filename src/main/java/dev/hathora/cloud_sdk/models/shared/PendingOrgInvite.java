/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class PendingOrgInvite {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("invitedBy")
    private String invitedBy;

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonProperty("orgId")
    private String orgId;

    /**
     * A user's email.
     */
    @JsonProperty("userEmail")
    private String userEmail;

    @JsonCreator
    public PendingOrgInvite(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("invitedBy") String invitedBy,
            @JsonProperty("orgId") String orgId,
            @JsonProperty("userEmail") String userEmail) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(invitedBy, "invitedBy");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(userEmail, "userEmail");
        this.createdAt = createdAt;
        this.invitedBy = invitedBy;
        this.orgId = orgId;
        this.userEmail = userEmail;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String invitedBy() {
        return invitedBy;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    /**
     * A user's email.
     */
    @JsonIgnore
    public String userEmail() {
        return userEmail;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PendingOrgInvite withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public PendingOrgInvite withInvitedBy(String invitedBy) {
        Utils.checkNotNull(invitedBy, "invitedBy");
        this.invitedBy = invitedBy;
        return this;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    public PendingOrgInvite withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    /**
     * A user's email.
     */
    public PendingOrgInvite withUserEmail(String userEmail) {
        Utils.checkNotNull(userEmail, "userEmail");
        this.userEmail = userEmail;
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
        PendingOrgInvite other = (PendingOrgInvite) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.invitedBy, other.invitedBy) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.userEmail, other.userEmail);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            invitedBy,
            orgId,
            userEmail);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PendingOrgInvite.class,
                "createdAt", createdAt,
                "invitedBy", invitedBy,
                "orgId", orgId,
                "userEmail", userEmail);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String invitedBy;
 
        private String orgId;
 
        private String userEmail;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder invitedBy(String invitedBy) {
            Utils.checkNotNull(invitedBy, "invitedBy");
            this.invitedBy = invitedBy;
            return this;
        }

        /**
         * System generated unique identifier for an organization. Not guaranteed to have a specific format.
         */
        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        /**
         * A user's email.
         */
        public Builder userEmail(String userEmail) {
            Utils.checkNotNull(userEmail, "userEmail");
            this.userEmail = userEmail;
            return this;
        }
        
        public PendingOrgInvite build() {
            return new PendingOrgInvite(
                createdAt,
                invitedBy,
                orgId,
                userEmail);
        }
    }
}
