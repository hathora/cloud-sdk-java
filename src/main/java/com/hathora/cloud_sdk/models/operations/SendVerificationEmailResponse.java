/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class SendVerificationEmailResponse implements com.hathora.cloud_sdk.utils.Response {

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
    private Optional<? extends com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess> verificationEmailSuccess;

    @JsonCreator
    public SendVerificationEmailResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess> verificationEmailSuccess) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(verificationEmailSuccess, "verificationEmailSuccess");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.verificationEmailSuccess = verificationEmailSuccess;
    }
    
    public SendVerificationEmailResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Ok
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess> verificationEmailSuccess() {
        return (Optional<com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess>) verificationEmailSuccess;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public SendVerificationEmailResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public SendVerificationEmailResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public SendVerificationEmailResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Ok
     */
    public SendVerificationEmailResponse withVerificationEmailSuccess(com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess verificationEmailSuccess) {
        Utils.checkNotNull(verificationEmailSuccess, "verificationEmailSuccess");
        this.verificationEmailSuccess = Optional.ofNullable(verificationEmailSuccess);
        return this;
    }

    /**
     * Ok
     */
    public SendVerificationEmailResponse withVerificationEmailSuccess(Optional<? extends com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess> verificationEmailSuccess) {
        Utils.checkNotNull(verificationEmailSuccess, "verificationEmailSuccess");
        this.verificationEmailSuccess = verificationEmailSuccess;
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
        SendVerificationEmailResponse other = (SendVerificationEmailResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.verificationEmailSuccess, other.verificationEmailSuccess);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            verificationEmailSuccess);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SendVerificationEmailResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "verificationEmailSuccess", verificationEmailSuccess);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess> verificationEmailSuccess = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder verificationEmailSuccess(com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess verificationEmailSuccess) {
            Utils.checkNotNull(verificationEmailSuccess, "verificationEmailSuccess");
            this.verificationEmailSuccess = Optional.ofNullable(verificationEmailSuccess);
            return this;
        }

        /**
         * Ok
         */
        public Builder verificationEmailSuccess(Optional<? extends com.hathora.cloud_sdk.models.shared.VerificationEmailSuccess> verificationEmailSuccess) {
            Utils.checkNotNull(verificationEmailSuccess, "verificationEmailSuccess");
            this.verificationEmailSuccess = verificationEmailSuccess;
            return this;
        }
        
        public SendVerificationEmailResponse build() {
            return new SendVerificationEmailResponse(
                contentType,
                statusCode,
                rawResponse,
                verificationEmailSuccess);
        }
    }
}
