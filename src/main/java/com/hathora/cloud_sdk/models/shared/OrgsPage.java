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
import java.util.List;
import java.util.Objects;


public class OrgsPage {

    @JsonProperty("orgs")
    private List<Organization> orgs;

    @JsonCreator
    public OrgsPage(
            @JsonProperty("orgs") List<Organization> orgs) {
        Utils.checkNotNull(orgs, "orgs");
        this.orgs = orgs;
    }

    @JsonIgnore
    public List<Organization> orgs() {
        return orgs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrgsPage withOrgs(List<Organization> orgs) {
        Utils.checkNotNull(orgs, "orgs");
        this.orgs = orgs;
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
        OrgsPage other = (OrgsPage) o;
        return 
            Objects.deepEquals(this.orgs, other.orgs);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            orgs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrgsPage.class,
                "orgs", orgs);
    }
    
    public final static class Builder {
 
        private List<Organization> orgs;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder orgs(List<Organization> orgs) {
            Utils.checkNotNull(orgs, "orgs");
            this.orgs = orgs;
            return this;
        }
        
        public OrgsPage build() {
            return new OrgsPage(
                orgs);
        }
    }
}
