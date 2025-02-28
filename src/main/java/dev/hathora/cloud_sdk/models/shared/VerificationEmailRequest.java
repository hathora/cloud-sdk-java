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

public class VerificationEmailRequest {

    @JsonProperty("userId")
    private String userId;

    @JsonCreator
    public VerificationEmailRequest(
            @JsonProperty("userId") String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public VerificationEmailRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        VerificationEmailRequest other = (VerificationEmailRequest) o;
        return 
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VerificationEmailRequest.class,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public VerificationEmailRequest build() {
            return new VerificationEmailRequest(
                userId);
        }
    }
}

