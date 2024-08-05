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

public class GetStoppedProcessesResponse implements com.hathora.cloud_sdk.utils.Response {

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
    private Optional<? extends java.util.List<com.hathora.cloud_sdk.models.shared.Process>> classes;

    @JsonCreator
    public GetStoppedProcessesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends java.util.List<com.hathora.cloud_sdk.models.shared.Process>> classes) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(classes, "classes");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.classes = classes;
    }
    
    public GetStoppedProcessesResponse(
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
    public Optional<java.util.List<com.hathora.cloud_sdk.models.shared.Process>> classes() {
        return (Optional<java.util.List<com.hathora.cloud_sdk.models.shared.Process>>) classes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetStoppedProcessesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetStoppedProcessesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetStoppedProcessesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Ok
     */
    public GetStoppedProcessesResponse withClasses(java.util.List<com.hathora.cloud_sdk.models.shared.Process> classes) {
        Utils.checkNotNull(classes, "classes");
        this.classes = Optional.ofNullable(classes);
        return this;
    }

    /**
     * Ok
     */
    public GetStoppedProcessesResponse withClasses(Optional<? extends java.util.List<com.hathora.cloud_sdk.models.shared.Process>> classes) {
        Utils.checkNotNull(classes, "classes");
        this.classes = classes;
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
        GetStoppedProcessesResponse other = (GetStoppedProcessesResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.classes, other.classes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            classes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetStoppedProcessesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "classes", classes);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends java.util.List<com.hathora.cloud_sdk.models.shared.Process>> classes = Optional.empty();  
        
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
        public Builder classes(java.util.List<com.hathora.cloud_sdk.models.shared.Process> classes) {
            Utils.checkNotNull(classes, "classes");
            this.classes = Optional.ofNullable(classes);
            return this;
        }

        /**
         * Ok
         */
        public Builder classes(Optional<? extends java.util.List<com.hathora.cloud_sdk.models.shared.Process>> classes) {
            Utils.checkNotNull(classes, "classes");
            this.classes = classes;
            return this;
        }
        
        public GetStoppedProcessesResponse build() {
            return new GetStoppedProcessesResponse(
                contentType,
                statusCode,
                rawResponse,
                classes);
        }
    }
}
