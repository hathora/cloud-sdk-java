/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class OrgToken {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("lastFourCharsOfKey")
    private String lastFourCharsOfKey;

    /**
     * Readable name for a token. Must be unique within an organization.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("orgId")
    private String orgId;

    /**
     * System generated unique identifier for an organization token.
     */
    @JsonProperty("orgTokenId")
    private String orgTokenId;

    /**
     * If not defined, the token has Admin access.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scopes")
    private Optional<? extends OrgTokenScopes> scopes;

    @JsonProperty("status")
    private OrgTokenStatus status;

    @JsonCreator
    public OrgToken(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdBy") String createdBy,
            @JsonProperty("lastFourCharsOfKey") String lastFourCharsOfKey,
            @JsonProperty("name") String name,
            @JsonProperty("orgId") String orgId,
            @JsonProperty("orgTokenId") String orgTokenId,
            @JsonProperty("scopes") Optional<? extends OrgTokenScopes> scopes,
            @JsonProperty("status") OrgTokenStatus status) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(lastFourCharsOfKey, "lastFourCharsOfKey");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(orgTokenId, "orgTokenId");
        Utils.checkNotNull(scopes, "scopes");
        Utils.checkNotNull(status, "status");
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.lastFourCharsOfKey = lastFourCharsOfKey;
        this.name = name;
        this.orgId = orgId;
        this.orgTokenId = orgTokenId;
        this.scopes = scopes;
        this.status = status;
    }
    
    public OrgToken(
            OffsetDateTime createdAt,
            String createdBy,
            String lastFourCharsOfKey,
            String name,
            String orgId,
            String orgTokenId,
            OrgTokenStatus status) {
        this(createdAt, createdBy, lastFourCharsOfKey, name, orgId, orgTokenId, Optional.empty(), status);
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String createdBy() {
        return createdBy;
    }

    @JsonIgnore
    public String lastFourCharsOfKey() {
        return lastFourCharsOfKey;
    }

    /**
     * Readable name for a token. Must be unique within an organization.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    /**
     * System generated unique identifier for an organization token.
     */
    @JsonIgnore
    public String orgTokenId() {
        return orgTokenId;
    }

    /**
     * If not defined, the token has Admin access.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrgTokenScopes> scopes() {
        return (Optional<OrgTokenScopes>) scopes;
    }

    @JsonIgnore
    public OrgTokenStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrgToken withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public OrgToken withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    public OrgToken withLastFourCharsOfKey(String lastFourCharsOfKey) {
        Utils.checkNotNull(lastFourCharsOfKey, "lastFourCharsOfKey");
        this.lastFourCharsOfKey = lastFourCharsOfKey;
        return this;
    }

    /**
     * Readable name for a token. Must be unique within an organization.
     */
    public OrgToken withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public OrgToken withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    /**
     * System generated unique identifier for an organization token.
     */
    public OrgToken withOrgTokenId(String orgTokenId) {
        Utils.checkNotNull(orgTokenId, "orgTokenId");
        this.orgTokenId = orgTokenId;
        return this;
    }

    /**
     * If not defined, the token has Admin access.
     */
    public OrgToken withScopes(OrgTokenScopes scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = Optional.ofNullable(scopes);
        return this;
    }

    /**
     * If not defined, the token has Admin access.
     */
    public OrgToken withScopes(Optional<? extends OrgTokenScopes> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = scopes;
        return this;
    }

    public OrgToken withStatus(OrgTokenStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        OrgToken other = (OrgToken) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.lastFourCharsOfKey, other.lastFourCharsOfKey) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.orgId, other.orgId) &&
            Objects.deepEquals(this.orgTokenId, other.orgTokenId) &&
            Objects.deepEquals(this.scopes, other.scopes) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            createdBy,
            lastFourCharsOfKey,
            name,
            orgId,
            orgTokenId,
            scopes,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrgToken.class,
                "createdAt", createdAt,
                "createdBy", createdBy,
                "lastFourCharsOfKey", lastFourCharsOfKey,
                "name", name,
                "orgId", orgId,
                "orgTokenId", orgTokenId,
                "scopes", scopes,
                "status", status);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private String lastFourCharsOfKey;
 
        private String name;
 
        private String orgId;
 
        private String orgTokenId;
 
        private Optional<? extends OrgTokenScopes> scopes = Optional.empty();
 
        private OrgTokenStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        public Builder lastFourCharsOfKey(String lastFourCharsOfKey) {
            Utils.checkNotNull(lastFourCharsOfKey, "lastFourCharsOfKey");
            this.lastFourCharsOfKey = lastFourCharsOfKey;
            return this;
        }

        /**
         * Readable name for a token. Must be unique within an organization.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder orgId(String orgId) {
            Utils.checkNotNull(orgId, "orgId");
            this.orgId = orgId;
            return this;
        }

        /**
         * System generated unique identifier for an organization token.
         */
        public Builder orgTokenId(String orgTokenId) {
            Utils.checkNotNull(orgTokenId, "orgTokenId");
            this.orgTokenId = orgTokenId;
            return this;
        }

        /**
         * If not defined, the token has Admin access.
         */
        public Builder scopes(OrgTokenScopes scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = Optional.ofNullable(scopes);
            return this;
        }

        /**
         * If not defined, the token has Admin access.
         */
        public Builder scopes(Optional<? extends OrgTokenScopes> scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = scopes;
            return this;
        }

        public Builder status(OrgTokenStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public OrgToken build() {
            return new OrgToken(
                createdAt,
                createdBy,
                lastFourCharsOfKey,
                name,
                orgId,
                orgTokenId,
                scopes,
                status);
        }
    }
}

