/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class GetProcessInfoResponse implements dev.hathora.cloud_api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends dev.hathora.cloud_api.models.shared.ProcessV2> processV2;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetProcessInfoResponse(
            String contentType,
            Optional<? extends dev.hathora.cloud_api.models.shared.ProcessV2> processV2,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(processV2, "processV2");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.processV2 = processV2;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetProcessInfoResponse(
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
    public Optional<dev.hathora.cloud_api.models.shared.ProcessV2> processV2() {
        return (Optional<dev.hathora.cloud_api.models.shared.ProcessV2>) processV2;
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
    public GetProcessInfoResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public GetProcessInfoResponse withProcessV2(dev.hathora.cloud_api.models.shared.ProcessV2 processV2) {
        Utils.checkNotNull(processV2, "processV2");
        this.processV2 = Optional.ofNullable(processV2);
        return this;
    }

    /**
     * Ok
     */
    public GetProcessInfoResponse withProcessV2(Optional<? extends dev.hathora.cloud_api.models.shared.ProcessV2> processV2) {
        Utils.checkNotNull(processV2, "processV2");
        this.processV2 = processV2;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetProcessInfoResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetProcessInfoResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetProcessInfoResponse other = (GetProcessInfoResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.processV2, other.processV2) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            processV2,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProcessInfoResponse.class,
                "contentType", contentType,
                "processV2", processV2,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.ProcessV2> processV2 = Optional.empty();
 
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
        public Builder processV2(dev.hathora.cloud_api.models.shared.ProcessV2 processV2) {
            Utils.checkNotNull(processV2, "processV2");
            this.processV2 = Optional.ofNullable(processV2);
            return this;
        }

        /**
         * Ok
         */
        public Builder processV2(Optional<? extends dev.hathora.cloud_api.models.shared.ProcessV2> processV2) {
            Utils.checkNotNull(processV2, "processV2");
            this.processV2 = processV2;
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
        
        public GetProcessInfoResponse build() {
            return new GetProcessInfoResponse(
                contentType,
                processV2,
                statusCode,
                rawResponse);
        }
    }
}

