/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class CreatePublicLobbyDeprecatedSecurity {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    private String playerAuth;

    @JsonCreator
    public CreatePublicLobbyDeprecatedSecurity(
            String playerAuth) {
        Utils.checkNotNull(playerAuth, "playerAuth");
        this.playerAuth = playerAuth;
    }

    @JsonIgnore
    public String playerAuth() {
        return playerAuth;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreatePublicLobbyDeprecatedSecurity withPlayerAuth(String playerAuth) {
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
        CreatePublicLobbyDeprecatedSecurity other = (CreatePublicLobbyDeprecatedSecurity) o;
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
        return Utils.toString(CreatePublicLobbyDeprecatedSecurity.class,
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
        
        public CreatePublicLobbyDeprecatedSecurity build() {
            return new CreatePublicLobbyDeprecatedSecurity(
                playerAuth);
        }
    }
}

