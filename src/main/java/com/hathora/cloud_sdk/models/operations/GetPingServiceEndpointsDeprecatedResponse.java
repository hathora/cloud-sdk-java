/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.cloud_sdk.models.shared.PingEndpoints;
import com.hathora.cloud_sdk.utils.Response;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetPingServiceEndpointsDeprecatedResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends List<PingEndpoints>> pingEndpoints;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetPingServiceEndpointsDeprecatedResponse(
            String contentType,
            Optional<? extends List<PingEndpoints>> pingEndpoints,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(pingEndpoints, "pingEndpoints");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.pingEndpoints = pingEndpoints;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetPingServiceEndpointsDeprecatedResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Ok
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PingEndpoints>> pingEndpoints() {
        return (Optional<List<PingEndpoints>>) pingEndpoints;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetPingServiceEndpointsDeprecatedResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public GetPingServiceEndpointsDeprecatedResponse withPingEndpoints(List<PingEndpoints> pingEndpoints) {
        Utils.checkNotNull(pingEndpoints, "pingEndpoints");
        this.pingEndpoints = Optional.ofNullable(pingEndpoints);
        return this;
    }

    /**
     * Ok
     */
    public GetPingServiceEndpointsDeprecatedResponse withPingEndpoints(Optional<? extends List<PingEndpoints>> pingEndpoints) {
        Utils.checkNotNull(pingEndpoints, "pingEndpoints");
        this.pingEndpoints = pingEndpoints;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPingServiceEndpointsDeprecatedResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPingServiceEndpointsDeprecatedResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        GetPingServiceEndpointsDeprecatedResponse other = (GetPingServiceEndpointsDeprecatedResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.pingEndpoints, other.pingEndpoints) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            pingEndpoints,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPingServiceEndpointsDeprecatedResponse.class,
                "contentType", contentType,
                "pingEndpoints", pingEndpoints,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends List<PingEndpoints>> pingEndpoints = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
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
         * Ok
         */
        public Builder pingEndpoints(List<PingEndpoints> pingEndpoints) {
            Utils.checkNotNull(pingEndpoints, "pingEndpoints");
            this.pingEndpoints = Optional.ofNullable(pingEndpoints);
            return this;
        }

        /**
         * Ok
         */
        public Builder pingEndpoints(Optional<? extends List<PingEndpoints>> pingEndpoints) {
            Utils.checkNotNull(pingEndpoints, "pingEndpoints");
            this.pingEndpoints = pingEndpoints;
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
        
        public GetPingServiceEndpointsDeprecatedResponse build() {
            return new GetPingServiceEndpointsDeprecatedResponse(
                contentType,
                pingEndpoints,
                statusCode,
                rawResponse);
        }
    }
}

