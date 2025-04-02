/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

@SuppressWarnings("serial")
public class ApiError extends RuntimeException {

    @JsonProperty("message")
    private String message;

    @JsonCreator
    public ApiError(
            @JsonProperty("message") String message) {
        super(message);
        Utils.checkNotNull(message, "message");
        this.message = message;
    }

    @JsonIgnore
    public String message() {
        return message;
    }

    @JsonIgnore
    @Override
    public String getMessage() {
        return Utils.valueOrNull(message);
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ApiError withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
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
        ApiError other = (ApiError) o;
        return 
            Objects.deepEquals(this.message, other.message);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            message);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiError.class,
                "message", message);
    }
    
    public final static class Builder {
 
        private String message;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }
        
        public ApiError build() {
            return new ApiError(
                message);
        }
    }
}

