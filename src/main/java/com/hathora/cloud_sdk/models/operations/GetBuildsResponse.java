/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hathora.cloud_sdk.models.shared.BuildsV3Page;
import com.hathora.cloud_sdk.utils.Response;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class GetBuildsResponse implements Response {

    /**
     * Ok
     */
    private Optional<? extends BuildsV3Page> buildsV3Page;

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
    public GetBuildsResponse(
            Optional<? extends BuildsV3Page> buildsV3Page,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(buildsV3Page, "buildsV3Page");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.buildsV3Page = buildsV3Page;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetBuildsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Ok
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BuildsV3Page> buildsV3Page() {
        return (Optional<BuildsV3Page>) buildsV3Page;
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

    /**
     * Ok
     */
    public GetBuildsResponse withBuildsV3Page(BuildsV3Page buildsV3Page) {
        Utils.checkNotNull(buildsV3Page, "buildsV3Page");
        this.buildsV3Page = Optional.ofNullable(buildsV3Page);
        return this;
    }

    /**
     * Ok
     */
    public GetBuildsResponse withBuildsV3Page(Optional<? extends BuildsV3Page> buildsV3Page) {
        Utils.checkNotNull(buildsV3Page, "buildsV3Page");
        this.buildsV3Page = buildsV3Page;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetBuildsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetBuildsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetBuildsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetBuildsResponse other = (GetBuildsResponse) o;
        return 
            Objects.deepEquals(this.buildsV3Page, other.buildsV3Page) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            buildsV3Page,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBuildsResponse.class,
                "buildsV3Page", buildsV3Page,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends BuildsV3Page> buildsV3Page = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Ok
         */
        public Builder buildsV3Page(BuildsV3Page buildsV3Page) {
            Utils.checkNotNull(buildsV3Page, "buildsV3Page");
            this.buildsV3Page = Optional.ofNullable(buildsV3Page);
            return this;
        }

        /**
         * Ok
         */
        public Builder buildsV3Page(Optional<? extends BuildsV3Page> buildsV3Page) {
            Utils.checkNotNull(buildsV3Page, "buildsV3Page");
            this.buildsV3Page = buildsV3Page;
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
        
        public GetBuildsResponse build() {
            return new GetBuildsResponse(
                buildsV3Page,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

