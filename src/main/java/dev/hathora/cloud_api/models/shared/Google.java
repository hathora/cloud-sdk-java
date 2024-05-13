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

/**
 * Google - Enable google auth for your application.
 */

public class Google {

    /**
     * A Google generated token representing the developer's credentials for [Google's API Console](https://console.cloud.google.com/apis/dashboard?pli=1&amp;project=discourse-login-388921). Learn how to get a `clientId` [here](https://developers.google.com/identity/gsi/web/guides/get-google-api-clientid).
     */
    @JsonProperty("clientId")
    private String clientId;

    @JsonCreator
    public Google(
            @JsonProperty("clientId") String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
    }

    /**
     * A Google generated token representing the developer's credentials for [Google's API Console](https://console.cloud.google.com/apis/dashboard?pli=1&amp;project=discourse-login-388921). Learn how to get a `clientId` [here](https://developers.google.com/identity/gsi/web/guides/get-google-api-clientid).
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A Google generated token representing the developer's credentials for [Google's API Console](https://console.cloud.google.com/apis/dashboard?pli=1&amp;project=discourse-login-388921). Learn how to get a `clientId` [here](https://developers.google.com/identity/gsi/web/guides/get-google-api-clientid).
     */
    public Google withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
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
        Google other = (Google) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Google.class,
                "clientId", clientId);
    }
    
    public final static class Builder {
 
        private String clientId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A Google generated token representing the developer's credentials for [Google's API Console](https://console.cloud.google.com/apis/dashboard?pli=1&amp;project=discourse-login-388921). Learn how to get a `clientId` [here](https://developers.google.com/identity/gsi/web/guides/get-google-api-clientid).
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }
        
        public Google build() {
            return new Google(
                clientId);
        }
    }
}

