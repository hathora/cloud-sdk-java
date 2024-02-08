/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;


public class CreatePublicLobbySecurity {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    private String playerAuth;

    public CreatePublicLobbySecurity(
            String playerAuth) {
        Utils.checkNotNull(playerAuth, "playerAuth");
        this.playerAuth = playerAuth;
    }

    public String playerAuth() {
        return playerAuth;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreatePublicLobbySecurity withPlayerAuth(String playerAuth) {
        Utils.checkNotNull(playerAuth, "playerAuth");
        this.playerAuth = playerAuth;
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
        CreatePublicLobbySecurity other = (CreatePublicLobbySecurity) o;
        return 
            java.util.Objects.deepEquals(this.playerAuth, other.playerAuth);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            playerAuth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePublicLobbySecurity.class,
                "playerAuth", playerAuth);
    }
    
    public final static class Builder {
 
        private String playerAuth;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder playerAuth(String playerAuth) {
            Utils.checkNotNull(playerAuth, "playerAuth");
            this.playerAuth = playerAuth;
            return this;
        }        
        
        public CreatePublicLobbySecurity build() {
            return new CreatePublicLobbySecurity(
                playerAuth);
        }
    }
}

