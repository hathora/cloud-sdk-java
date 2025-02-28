/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.utils.SpeakeasyMetadata;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class CreateLobbySecurity {

    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    private String playerAuth;

    @JsonCreator
    public CreateLobbySecurity(
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

    public CreateLobbySecurity withPlayerAuth(String playerAuth) {
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
        CreateLobbySecurity other = (CreateLobbySecurity) o;
        return 
            Objects.deepEquals(this.playerAuth, other.playerAuth);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            playerAuth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateLobbySecurity.class,
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
        
        public CreateLobbySecurity build() {
            return new CreateLobbySecurity(
                playerAuth);
        }
    }
}

