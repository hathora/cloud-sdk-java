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


public class GetUserPendingInvitesResponse implements dev.hathora.cloud_api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends dev.hathora.cloud_api.models.shared.OrgInvitesPage> orgInvitesPage;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetUserPendingInvitesResponse(
            String contentType,
            Optional<? extends dev.hathora.cloud_api.models.shared.OrgInvitesPage> orgInvitesPage,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(orgInvitesPage, "orgInvitesPage");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.orgInvitesPage = orgInvitesPage;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetUserPendingInvitesResponse(
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
    public Optional<dev.hathora.cloud_api.models.shared.OrgInvitesPage> orgInvitesPage() {
        return (Optional<dev.hathora.cloud_api.models.shared.OrgInvitesPage>) orgInvitesPage;
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
    public GetUserPendingInvitesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public GetUserPendingInvitesResponse withOrgInvitesPage(dev.hathora.cloud_api.models.shared.OrgInvitesPage orgInvitesPage) {
        Utils.checkNotNull(orgInvitesPage, "orgInvitesPage");
        this.orgInvitesPage = Optional.ofNullable(orgInvitesPage);
        return this;
    }

    /**
     * Ok
     */
    public GetUserPendingInvitesResponse withOrgInvitesPage(Optional<? extends dev.hathora.cloud_api.models.shared.OrgInvitesPage> orgInvitesPage) {
        Utils.checkNotNull(orgInvitesPage, "orgInvitesPage");
        this.orgInvitesPage = orgInvitesPage;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetUserPendingInvitesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetUserPendingInvitesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetUserPendingInvitesResponse other = (GetUserPendingInvitesResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.orgInvitesPage, other.orgInvitesPage) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            orgInvitesPage,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUserPendingInvitesResponse.class,
                "contentType", contentType,
                "orgInvitesPage", orgInvitesPage,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.OrgInvitesPage> orgInvitesPage = Optional.empty();
 
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
        public Builder orgInvitesPage(dev.hathora.cloud_api.models.shared.OrgInvitesPage orgInvitesPage) {
            Utils.checkNotNull(orgInvitesPage, "orgInvitesPage");
            this.orgInvitesPage = Optional.ofNullable(orgInvitesPage);
            return this;
        }

        /**
         * Ok
         */
        public Builder orgInvitesPage(Optional<? extends dev.hathora.cloud_api.models.shared.OrgInvitesPage> orgInvitesPage) {
            Utils.checkNotNull(orgInvitesPage, "orgInvitesPage");
            this.orgInvitesPage = orgInvitesPage;
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
        
        public GetUserPendingInvitesResponse build() {
            return new GetUserPendingInvitesResponse(
                contentType,
                orgInvitesPage,
                statusCode,
                rawResponse);
        }
    }
}

