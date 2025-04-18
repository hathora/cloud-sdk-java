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
import java.util.List;
import java.util.Objects;

public class PendingOrgInvitesPage {

    @JsonProperty("invites")
    private List<PendingOrgInvite> invites;

    @JsonCreator
    public PendingOrgInvitesPage(
            @JsonProperty("invites") List<PendingOrgInvite> invites) {
        Utils.checkNotNull(invites, "invites");
        this.invites = invites;
    }

    @JsonIgnore
    public List<PendingOrgInvite> invites() {
        return invites;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public PendingOrgInvitesPage withInvites(List<PendingOrgInvite> invites) {
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
            Objects.deepEquals(this.invites, other.invites);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            invites);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PendingOrgInvitesPage.class,
                "invites", invites);
    }
    
    public final static class Builder {
 
        private List<PendingOrgInvite> invites;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder invites(List<PendingOrgInvite> invites) {
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
