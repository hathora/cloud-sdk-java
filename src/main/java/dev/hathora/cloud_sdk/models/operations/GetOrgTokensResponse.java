/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.ListOrgTokens;
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

public class GetOrgTokensResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends ListOrgTokens> listOrgTokens;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetOrgTokensResponse(
            String contentType,
            Optional<? extends ListOrgTokens> listOrgTokens,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(listOrgTokens, "listOrgTokens");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.listOrgTokens = listOrgTokens;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetOrgTokensResponse(
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
    public Optional<ListOrgTokens> listOrgTokens() {
        return (Optional<ListOrgTokens>) listOrgTokens;
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
    public GetOrgTokensResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public GetOrgTokensResponse withListOrgTokens(ListOrgTokens listOrgTokens) {
        Utils.checkNotNull(listOrgTokens, "listOrgTokens");
        this.listOrgTokens = Optional.ofNullable(listOrgTokens);
        return this;
    }

    /**
     * Ok
     */
    public GetOrgTokensResponse withListOrgTokens(Optional<? extends ListOrgTokens> listOrgTokens) {
        Utils.checkNotNull(listOrgTokens, "listOrgTokens");
        this.listOrgTokens = listOrgTokens;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetOrgTokensResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetOrgTokensResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetOrgTokensResponse other = (GetOrgTokensResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.listOrgTokens, other.listOrgTokens) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            listOrgTokens,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOrgTokensResponse.class,
                "contentType", contentType,
                "listOrgTokens", listOrgTokens,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends ListOrgTokens> listOrgTokens = Optional.empty();
 
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
        public Builder listOrgTokens(ListOrgTokens listOrgTokens) {
            Utils.checkNotNull(listOrgTokens, "listOrgTokens");
            this.listOrgTokens = Optional.ofNullable(listOrgTokens);
            return this;
        }

        /**
         * Ok
         */
        public Builder listOrgTokens(Optional<? extends ListOrgTokens> listOrgTokens) {
            Utils.checkNotNull(listOrgTokens, "listOrgTokens");
            this.listOrgTokens = listOrgTokens;
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
        
        public GetOrgTokensResponse build() {
            return new GetOrgTokensResponse(
                contentType,
                listOrgTokens,
                statusCode,
                rawResponse);
        }
    }
}

