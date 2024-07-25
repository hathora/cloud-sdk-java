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

public class PlayerTokenObject {

    /**
     * A unique Hathora-signed JWT player token.
     */
    @JsonProperty("token")
    private String token;

    @JsonCreator
    public PlayerTokenObject(
            @JsonProperty("token") String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
    }

    /**
     * A unique Hathora-signed JWT player token.
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique Hathora-signed JWT player token.
     */
    public PlayerTokenObject withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        PlayerTokenObject other = (PlayerTokenObject) o;
        return 
            java.util.Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PlayerTokenObject.class,
                "token", token);
    }
    
    public final static class Builder {
 
        private String token;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique Hathora-signed JWT player token.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public PlayerTokenObject build() {
            return new PlayerTokenObject(
                token);
        }
    }
}

