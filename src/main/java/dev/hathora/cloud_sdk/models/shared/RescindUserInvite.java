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
            Objects.deepEquals(this.userEmail, other.userEmail);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
