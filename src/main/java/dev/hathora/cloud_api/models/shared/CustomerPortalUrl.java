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

public class CustomerPortalUrl {

    @JsonProperty("returnUrl")
    private String returnUrl;

    @JsonCreator
    public CustomerPortalUrl(
            @JsonProperty("returnUrl") String returnUrl) {
        Utils.checkNotNull(returnUrl, "returnUrl");
        this.returnUrl = returnUrl;
    }

    @JsonIgnore
    public String returnUrl() {
        return returnUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CustomerPortalUrl withReturnUrl(String returnUrl) {
        Utils.checkNotNull(returnUrl, "returnUrl");
        this.returnUrl = returnUrl;
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
        CustomerPortalUrl other = (CustomerPortalUrl) o;
        return 
            java.util.Objects.deepEquals(this.returnUrl, other.returnUrl);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            returnUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomerPortalUrl.class,
                "returnUrl", returnUrl);
    }
    
    public final static class Builder {
 
        private String returnUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder returnUrl(String returnUrl) {
            Utils.checkNotNull(returnUrl, "returnUrl");
            this.returnUrl = returnUrl;
            return this;
        }
        
        public CustomerPortalUrl build() {
            return new CustomerPortalUrl(
                returnUrl);
        }
    }
}

