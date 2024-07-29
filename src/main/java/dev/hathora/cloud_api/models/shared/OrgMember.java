/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

public class OrgMember {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("invitedBy")
    private String invitedBy;

    @JsonProperty("joinedAt")
    private OffsetDateTime joinedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastLogin")
    private Optional<? extends OffsetDateTime> lastLogin;

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
    public OrgMember(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("invitedBy") String invitedBy,
            @JsonProperty("joinedAt") OffsetDateTime joinedAt,
            @JsonProperty("lastLogin") Optional<? extends OffsetDateTime> lastLogin,
            @JsonProperty("orgId") String orgId,
            @JsonProperty("userEmail") String userEmail) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(invitedBy, "invitedBy");
        Utils.checkNotNull(joinedAt, "joinedAt");
        Utils.checkNotNull(lastLogin, "lastLogin");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(userEmail, "userEmail");
        this.createdAt = createdAt;
        this.invitedBy = invitedBy;
        this.joinedAt = joinedAt;
        this.lastLogin = lastLogin;
        this.orgId = orgId;
        this.userEmail = userEmail;
    }
    
    public OrgMember(
            OffsetDateTime createdAt,
            String invitedBy,
            OffsetDateTime joinedAt,
            String orgId,
            String userEmail) {
        this(createdAt, invitedBy, joinedAt, Optional.empty(), orgId, userEmail);
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String invitedBy() {
        return invitedBy;
    }

    @JsonIgnore
    public OffsetDateTime joinedAt() {
        return joinedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> lastLogin() {
        return (Optional<OffsetDateTime>) lastLogin;
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

    public OrgMember withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public OrgMember withInvitedBy(String invitedBy) {
        Utils.checkNotNull(invitedBy, "invitedBy");
        this.invitedBy = invitedBy;
        return this;
    }

    public OrgMember withJoinedAt(OffsetDateTime joinedAt) {
        Utils.checkNotNull(joinedAt, "joinedAt");
        this.joinedAt = joinedAt;
        return this;
    }

    public OrgMember withLastLogin(OffsetDateTime lastLogin) {
        Utils.checkNotNull(lastLogin, "lastLogin");
        this.lastLogin = Optional.ofNullable(lastLogin);
        return this;
    }

    public OrgMember withLastLogin(Optional<? extends OffsetDateTime> lastLogin) {
        Utils.checkNotNull(lastLogin, "lastLogin");
        this.lastLogin = lastLogin;
        return this;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    public OrgMember withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    /**
     * A user's email.
     */
    public OrgMember withUserEmail(String userEmail) {
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
        OrgMember other = (OrgMember) o;
        return 
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.invitedBy, other.invitedBy) &&
            java.util.Objects.deepEquals(this.joinedAt, other.joinedAt) &&
            java.util.Objects.deepEquals(this.lastLogin, other.lastLogin) &&
            java.util.Objects.deepEquals(this.orgId, other.orgId) &&
            java.util.Objects.deepEquals(this.userEmail, other.userEmail);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createdAt,
            invitedBy,
            joinedAt,
            lastLogin,
            orgId,
            userEmail);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrgMember.class,
                "createdAt", createdAt,
                "invitedBy", invitedBy,
                "joinedAt", joinedAt,
                "lastLogin", lastLogin,
                "orgId", orgId,
                "userEmail", userEmail);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String invitedBy;
 
        private OffsetDateTime joinedAt;
 
        private Optional<? extends OffsetDateTime> lastLogin = Optional.empty();
 
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

        public Builder joinedAt(OffsetDateTime joinedAt) {
            Utils.checkNotNull(joinedAt, "joinedAt");
            this.joinedAt = joinedAt;
            return this;
        }

        public Builder lastLogin(OffsetDateTime lastLogin) {
            Utils.checkNotNull(lastLogin, "lastLogin");
            this.lastLogin = Optional.ofNullable(lastLogin);
            return this;
        }

        public Builder lastLogin(Optional<? extends OffsetDateTime> lastLogin) {
            Utils.checkNotNull(lastLogin, "lastLogin");
            this.lastLogin = lastLogin;
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
        
        public OrgMember build() {
            return new OrgMember(
                createdAt,
                invitedBy,
                joinedAt,
                lastLogin,
                orgId,
                userEmail);
        }
    }
}

