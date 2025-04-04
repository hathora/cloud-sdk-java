/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.BuildWithMultipartUrls;
import dev.hathora.cloud_sdk.utils.Response;
import dev.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class CreateWithMultipartUploadsV2DeprecatedResponse implements Response {

    private Optional<? extends BuildWithMultipartUrls> buildWithMultipartUrls;

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

    @JsonCreator
    public CreateWithMultipartUploadsV2DeprecatedResponse(
            Optional<? extends BuildWithMultipartUrls> buildWithMultipartUrls,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(buildWithMultipartUrls, "buildWithMultipartUrls");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.buildWithMultipartUrls = buildWithMultipartUrls;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateWithMultipartUploadsV2DeprecatedResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BuildWithMultipartUrls> buildWithMultipartUrls() {
        return (Optional<BuildWithMultipartUrls>) buildWithMultipartUrls;
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

    public final static Builder builder() {
        return new Builder();
    }    

    public CreateWithMultipartUploadsV2DeprecatedResponse withBuildWithMultipartUrls(BuildWithMultipartUrls buildWithMultipartUrls) {
        Utils.checkNotNull(buildWithMultipartUrls, "buildWithMultipartUrls");
        this.buildWithMultipartUrls = Optional.ofNullable(buildWithMultipartUrls);
        return this;
    }

    public CreateWithMultipartUploadsV2DeprecatedResponse withBuildWithMultipartUrls(Optional<? extends BuildWithMultipartUrls> buildWithMultipartUrls) {
        Utils.checkNotNull(buildWithMultipartUrls, "buildWithMultipartUrls");
        this.buildWithMultipartUrls = buildWithMultipartUrls;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateWithMultipartUploadsV2DeprecatedResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateWithMultipartUploadsV2DeprecatedResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateWithMultipartUploadsV2DeprecatedResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateWithMultipartUploadsV2DeprecatedResponse other = (CreateWithMultipartUploadsV2DeprecatedResponse) o;
        return 
            Objects.deepEquals(this.buildWithMultipartUrls, other.buildWithMultipartUrls) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            buildWithMultipartUrls,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateWithMultipartUploadsV2DeprecatedResponse.class,
                "buildWithMultipartUrls", buildWithMultipartUrls,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends BuildWithMultipartUrls> buildWithMultipartUrls = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder buildWithMultipartUrls(BuildWithMultipartUrls buildWithMultipartUrls) {
            Utils.checkNotNull(buildWithMultipartUrls, "buildWithMultipartUrls");
            this.buildWithMultipartUrls = Optional.ofNullable(buildWithMultipartUrls);
            return this;
        }

        public Builder buildWithMultipartUrls(Optional<? extends BuildWithMultipartUrls> buildWithMultipartUrls) {
            Utils.checkNotNull(buildWithMultipartUrls, "buildWithMultipartUrls");
            this.buildWithMultipartUrls = buildWithMultipartUrls;
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
        
        public CreateWithMultipartUploadsV2DeprecatedResponse build() {
            return new CreateWithMultipartUploadsV2DeprecatedResponse(
                buildWithMultipartUrls,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}
