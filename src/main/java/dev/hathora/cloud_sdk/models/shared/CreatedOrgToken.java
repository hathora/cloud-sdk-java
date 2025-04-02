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
import java.util.Objects;

public class CreatedOrgToken {

    @JsonProperty("orgToken")
    private OrgToken orgToken;

    @JsonProperty("plainTextToken")
    private String plainTextToken;

    @JsonCreator
    public CreatedOrgToken(
            @JsonProperty("orgToken") OrgToken orgToken,
            @JsonProperty("plainTextToken") String plainTextToken) {
        Utils.checkNotNull(orgToken, "orgToken");
        Utils.checkNotNull(plainTextToken, "plainTextToken");
        this.orgToken = orgToken;
        this.plainTextToken = plainTextToken;
    }

    @JsonIgnore
    public OrgToken orgToken() {
        return orgToken;
    }

    @JsonIgnore
    public String plainTextToken() {
        return plainTextToken;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public CreatedOrgToken withOrgToken(OrgToken orgToken) {
        Utils.checkNotNull(orgToken, "orgToken");
        this.orgToken = orgToken;
        return this;
    }

    public CreatedOrgToken withPlainTextToken(String plainTextToken) {
        Utils.checkNotNull(plainTextToken, "plainTextToken");
        this.plainTextToken = plainTextToken;
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
        CreatedOrgToken other = (CreatedOrgToken) o;
        return 
            Objects.deepEquals(this.orgToken, other.orgToken) &&
            Objects.deepEquals(this.plainTextToken, other.plainTextToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            orgToken,
            plainTextToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatedOrgToken.class,
                "orgToken", orgToken,
                "plainTextToken", plainTextToken);
    }
    
    public final static class Builder {
 
        private OrgToken orgToken;
 
        private String plainTextToken;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder orgToken(OrgToken orgToken) {
            Utils.checkNotNull(orgToken, "orgToken");
            this.orgToken = orgToken;
            return this;
        }

        public Builder plainTextToken(String plainTextToken) {
            Utils.checkNotNull(plainTextToken, "plainTextToken");
            this.plainTextToken = plainTextToken;
            return this;
        }
        
        public CreatedOrgToken build() {
            return new CreatedOrgToken(
                orgToken,
                plainTextToken);
        }
    }
}
