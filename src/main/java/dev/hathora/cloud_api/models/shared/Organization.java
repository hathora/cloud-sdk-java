/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Organization {

    @JsonProperty("isSingleTenant")
    private boolean isSingleTenant;

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonProperty("orgId")
    private String orgId;

    @JsonProperty("stripeCustomerId")
    private String stripeCustomerId;

    @JsonCreator
    public Organization(
            @JsonProperty("isSingleTenant") boolean isSingleTenant,
            @JsonProperty("orgId") String orgId,
            @JsonProperty("stripeCustomerId") String stripeCustomerId) {
        Utils.checkNotNull(isSingleTenant, "isSingleTenant");
        Utils.checkNotNull(orgId, "orgId");
        Utils.checkNotNull(stripeCustomerId, "stripeCustomerId");
        this.isSingleTenant = isSingleTenant;
        this.orgId = orgId;
        this.stripeCustomerId = stripeCustomerId;
    }

    @JsonIgnore
    public boolean isSingleTenant() {
        return isSingleTenant;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    @JsonIgnore
    public String orgId() {
        return orgId;
    }

    @JsonIgnore
    public String stripeCustomerId() {
        return stripeCustomerId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Organization withIsSingleTenant(boolean isSingleTenant) {
        Utils.checkNotNull(isSingleTenant, "isSingleTenant");
        this.isSingleTenant = isSingleTenant;
        return this;
    }

    /**
     * System generated unique identifier for an organization. Not guaranteed to have a specific format.
     */
    public Organization withOrgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public Organization withStripeCustomerId(String stripeCustomerId) {
        Utils.checkNotNull(stripeCustomerId, "stripeCustomerId");
        this.stripeCustomerId = stripeCustomerId;
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
        Organization other = (Organization) o;
        return 
            java.util.Objects.deepEquals(this.isSingleTenant, other.isSingleTenant) &&
            java.util.Objects.deepEquals(this.orgId, other.orgId) &&
            java.util.Objects.deepEquals(this.stripeCustomerId, other.stripeCustomerId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            isSingleTenant,
            orgId,
            stripeCustomerId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Organization.class,
                "isSingleTenant", isSingleTenant,
                "orgId", orgId,
                "stripeCustomerId", stripeCustomerId);
    }
    
    public final static class Builder {
 
        private Boolean isSingleTenant;
 
        private String orgId;
 
        private String stripeCustomerId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder isSingleTenant(boolean isSingleTenant) {
            Utils.checkNotNull(isSingleTenant, "isSingleTenant");
            this.isSingleTenant = isSingleTenant;
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

        public Builder stripeCustomerId(String stripeCustomerId) {
            Utils.checkNotNull(stripeCustomerId, "stripeCustomerId");
            this.stripeCustomerId = stripeCustomerId;
            return this;
        }
        
        public Organization build() {
            return new Organization(
                isSingleTenant,
                orgId,
                stripeCustomerId);
        }
    }
}

