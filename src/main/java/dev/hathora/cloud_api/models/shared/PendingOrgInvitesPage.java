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

public class PendingOrgInvitesPage {

    @JsonProperty("invites")
    private java.util.List<PendingOrgInvite> invites;

    @JsonCreator
    public PendingOrgInvitesPage(
            @JsonProperty("invites") java.util.List<PendingOrgInvite> invites) {
        Utils.checkNotNull(invites, "invites");
        this.invites = invites;
    }

    @JsonIgnore
    public java.util.List<PendingOrgInvite> invites() {
        return invites;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PendingOrgInvitesPage withInvites(java.util.List<PendingOrgInvite> invites) {
        Utils.checkNotNull(invites, "invites");
        this.invites = invites;
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
        PendingOrgInvitesPage other = (PendingOrgInvitesPage) o;
        return 
            java.util.Objects.deepEquals(this.invites, other.invites);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            invites);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PendingOrgInvitesPage.class,
                "invites", invites);
    }
    
    public final static class Builder {
 
        private java.util.List<PendingOrgInvite> invites;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder invites(java.util.List<PendingOrgInvite> invites) {
            Utils.checkNotNull(invites, "invites");
            this.invites = invites;
            return this;
        }
        
        public PendingOrgInvitesPage build() {
            return new PendingOrgInvitesPage(
                invites);
        }
    }
}

