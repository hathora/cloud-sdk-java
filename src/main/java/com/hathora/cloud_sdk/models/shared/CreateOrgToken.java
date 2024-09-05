/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreateOrgToken {

    /**
     * Readable name for a token. Must be unique within an organization.
     */
    @JsonProperty("name")
    private String name;

    @JsonCreator
    public CreateOrgToken(
            @JsonProperty("name") String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }

    /**
     * Readable name for a token. Must be unique within an organization.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Readable name for a token. Must be unique within an organization.
     */
    public CreateOrgToken withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        CreateOrgToken other = (CreateOrgToken) o;
        return 
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrgToken.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Readable name for a token. Must be unique within an organization.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public CreateOrgToken build() {
            return new CreateOrgToken(
                name);
        }
    }
}
