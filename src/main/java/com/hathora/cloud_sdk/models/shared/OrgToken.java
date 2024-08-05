/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;

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
            @JsonProperty("status") OrgTokenStatus status) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(lastFourCharsOfKey, "lastFourCharsOfKey");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(orgTokenId, "orgTokenId");
        Utils.checkNotNull(status, "status");
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.lastFourCharsOfKey = lastFourCharsOfKey;
        this.name = name;
        this.orgId = orgId;
        this.orgTokenId = orgTokenId;
        this.status = status;
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
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.createdBy, other.createdBy) &&
            java.util.Objects.deepEquals(this.lastFourCharsOfKey, other.lastFourCharsOfKey) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.orgId, other.orgId) &&
            java.util.Objects.deepEquals(this.orgTokenId, other.orgTokenId) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createdAt,
            createdBy,
            lastFourCharsOfKey,
            name,
            orgId,
            orgTokenId,
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
                "status", status);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String createdBy;
 
        private String lastFourCharsOfKey;
 
        private String name;
 
        private String orgId;
 
        private String orgTokenId;
 
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
                status);
        }
    }
}
