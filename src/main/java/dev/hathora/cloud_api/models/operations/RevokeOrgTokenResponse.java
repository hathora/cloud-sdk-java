/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class RevokeOrgTokenResponse implements dev.hathora.cloud_api.utils.Response {

    private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Ok
     */
    private Optional<? extends Boolean> boolean_;

    public RevokeOrgTokenResponse(
            Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends Boolean> boolean_) {
        Utils.checkNotNull(apiError, "apiError");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(boolean_, "boolean_");
        this.apiError = apiError;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.boolean_ = boolean_;
    }

    public Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError() {
        return apiError;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Ok
     */
    public Optional<? extends Boolean> boolean_() {
        return boolean_;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RevokeOrgTokenResponse withApiError(dev.hathora.cloud_api.models.shared.ApiError apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = Optional.ofNullable(apiError);
        return this;
    }

    public RevokeOrgTokenResponse withApiError(Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = apiError;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public RevokeOrgTokenResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public RevokeOrgTokenResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public RevokeOrgTokenResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Ok
     */
    public RevokeOrgTokenResponse withBoolean(boolean boolean_) {
        Utils.checkNotNull(boolean_, "boolean_");
        this.boolean_ = Optional.ofNullable(boolean_);
        return this;
    }

    /**
     * Ok
     */
    public RevokeOrgTokenResponse withBoolean(Optional<? extends Boolean> boolean_) {
        Utils.checkNotNull(boolean_, "boolean_");
        this.boolean_ = boolean_;
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
        RevokeOrgTokenResponse other = (RevokeOrgTokenResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiError, other.apiError) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.boolean_, other.boolean_);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiError,
            contentType,
            statusCode,
            rawResponse,
            boolean_);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RevokeOrgTokenResponse.class,
                "apiError", apiError,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "boolean_", boolean_);
    }
    
    public final static class Builder {
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends Boolean> boolean_ = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiError(dev.hathora.cloud_api.models.shared.ApiError apiError) {
            Utils.checkNotNull(apiError, "apiError");
            this.apiError = Optional.ofNullable(apiError);
            return this;
        }

        public Builder apiError(Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError) {
            Utils.checkNotNull(apiError, "apiError");
            this.apiError = apiError;
            return this;
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Ok
         */
        public Builder boolean_(boolean boolean_) {
            Utils.checkNotNull(boolean_, "boolean_");
            this.boolean_ = Optional.ofNullable(boolean_);
            return this;
        }

        /**
         * Ok
         */
        public Builder boolean_(Optional<? extends Boolean> boolean_) {
            Utils.checkNotNull(boolean_, "boolean_");
            this.boolean_ = boolean_;
            return this;
        }
        
        public RevokeOrgTokenResponse build() {
            return new RevokeOrgTokenResponse(
                apiError,
                contentType,
                statusCode,
                rawResponse,
                boolean_);
        }
    }
}
