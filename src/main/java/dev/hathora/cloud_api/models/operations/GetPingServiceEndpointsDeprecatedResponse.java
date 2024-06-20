/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class GetPingServiceEndpointsDeprecatedResponse implements dev.hathora.cloud_api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints>> pingEndpoints;

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
            Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints>> pingEndpoints,
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
    public Optional<java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints>> pingEndpoints() {
        return (Optional<java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints>>) pingEndpoints;
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
    public GetPingServiceEndpointsDeprecatedResponse withPingEndpoints(java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints> pingEndpoints) {
        Utils.checkNotNull(pingEndpoints, "pingEndpoints");
        this.pingEndpoints = Optional.ofNullable(pingEndpoints);
        return this;
    }

    /**
     * Ok
     */
    public GetPingServiceEndpointsDeprecatedResponse withPingEndpoints(Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints>> pingEndpoints) {
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
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.pingEndpoints, other.pingEndpoints) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints>> pingEndpoints = Optional.empty();
 
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
        public Builder pingEndpoints(java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints> pingEndpoints) {
            Utils.checkNotNull(pingEndpoints, "pingEndpoints");
            this.pingEndpoints = Optional.ofNullable(pingEndpoints);
            return this;
        }

        /**
         * Ok
         */
        public Builder pingEndpoints(Optional<? extends java.util.List<dev.hathora.cloud_api.models.shared.PingEndpoints>> pingEndpoints) {
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

