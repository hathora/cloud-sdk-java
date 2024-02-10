/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateRoomResponse {

    private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private Optional<? extends dev.hathora.cloud_api.models.shared.CreateRoomResponse> createRoomResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateRoomResponse(
            Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError,
            String contentType,
            Optional<? extends dev.hathora.cloud_api.models.shared.CreateRoomResponse> createRoomResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiError, "apiError");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createRoomResponse, "createRoomResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiError = apiError;
        this.contentType = contentType;
        this.createRoomResponse = createRoomResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
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

    public Optional<? extends dev.hathora.cloud_api.models.shared.CreateRoomResponse> createRoomResponse() {
        return createRoomResponse;
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
    
    public final static Builder builder() {
        return new Builder();
    }

    public CreateRoomResponse withApiError(dev.hathora.cloud_api.models.shared.ApiError apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = Optional.ofNullable(apiError);
        return this;
    }
    
    public CreateRoomResponse withApiError(Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = apiError;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateRoomResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public CreateRoomResponse withCreateRoomResponse(dev.hathora.cloud_api.models.shared.CreateRoomResponse createRoomResponse) {
        Utils.checkNotNull(createRoomResponse, "createRoomResponse");
        this.createRoomResponse = Optional.ofNullable(createRoomResponse);
        return this;
    }
    
    public CreateRoomResponse withCreateRoomResponse(Optional<? extends dev.hathora.cloud_api.models.shared.CreateRoomResponse> createRoomResponse) {
        Utils.checkNotNull(createRoomResponse, "createRoomResponse");
        this.createRoomResponse = createRoomResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateRoomResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateRoomResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateRoomResponse other = (CreateRoomResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiError, other.apiError) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createRoomResponse, other.createRoomResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiError,
            contentType,
            createRoomResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRoomResponse.class,
                "apiError", apiError,
                "contentType", contentType,
                "createRoomResponse", createRoomResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.CreateRoomResponse> createRoomResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
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

        public Builder createRoomResponse(dev.hathora.cloud_api.models.shared.CreateRoomResponse createRoomResponse) {
            Utils.checkNotNull(createRoomResponse, "createRoomResponse");
            this.createRoomResponse = Optional.ofNullable(createRoomResponse);
            return this;
        }
        
        public Builder createRoomResponse(Optional<? extends dev.hathora.cloud_api.models.shared.CreateRoomResponse> createRoomResponse) {
            Utils.checkNotNull(createRoomResponse, "createRoomResponse");
            this.createRoomResponse = createRoomResponse;
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
        
        public CreateRoomResponse build() {
            return new CreateRoomResponse(
                apiError,
                contentType,
                createRoomResponse,
                statusCode,
                rawResponse);
        }
    }
}

