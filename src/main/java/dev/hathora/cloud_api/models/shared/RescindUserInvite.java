/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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

public class RescindUserInvite {

    /**
     * A user's email.
     */
    @JsonProperty("userEmail")
    private String userEmail;

    @JsonCreator
    public RescindUserInvite(
            @JsonProperty("userEmail") String userEmail) {
        Utils.checkNotNull(userEmail, "userEmail");
        this.userEmail = userEmail;
    }

    /**
     * A user's email.
     */
    @JsonIgnore
    public String userEmail() {
        return userEmail;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A user's email.
     */
    public RescindUserInvite withUserEmail(String userEmail) {
        Utils.checkNotNull(userEmail, "userEmail");
        this.userEmail = userEmail;
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
        RescindUserInvite other = (RescindUserInvite) o;
        return 
            java.util.Objects.deepEquals(this.userEmail, other.userEmail);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userEmail);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RescindUserInvite.class,
                "userEmail", userEmail);
    }
    
    public final static class Builder {
 
        private String userEmail;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A user's email.
         */
        public Builder userEmail(String userEmail) {
            Utils.checkNotNull(userEmail, "userEmail");
            this.userEmail = userEmail;
            return this;
        }
        
        public RescindUserInvite build() {
            return new RescindUserInvite(
                userEmail);
        }
    }
}

