/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetLobbyInfoByRoomIdResponse {

    private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends dev.hathora.cloud_api.models.shared.LobbyV3> lobbyV3;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public GetLobbyInfoByRoomIdResponse(
            Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError,
            String contentType,
            Optional<? extends dev.hathora.cloud_api.models.shared.LobbyV3> lobbyV3,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiError, "apiError");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(lobbyV3, "lobbyV3");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiError = apiError;
        this.contentType = contentType;
        this.lobbyV3 = lobbyV3;
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

    /**
     * Ok
     */
    public Optional<? extends dev.hathora.cloud_api.models.shared.LobbyV3> lobbyV3() {
        return lobbyV3;
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

    public GetLobbyInfoByRoomIdResponse withApiError(dev.hathora.cloud_api.models.shared.ApiError apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = Optional.ofNullable(apiError);
        return this;
    }
    
    public GetLobbyInfoByRoomIdResponse withApiError(Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = apiError;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetLobbyInfoByRoomIdResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public GetLobbyInfoByRoomIdResponse withLobbyV3(dev.hathora.cloud_api.models.shared.LobbyV3 lobbyV3) {
        Utils.checkNotNull(lobbyV3, "lobbyV3");
        this.lobbyV3 = Optional.ofNullable(lobbyV3);
        return this;
    }
    
    /**
     * Ok
     */
    public GetLobbyInfoByRoomIdResponse withLobbyV3(Optional<? extends dev.hathora.cloud_api.models.shared.LobbyV3> lobbyV3) {
        Utils.checkNotNull(lobbyV3, "lobbyV3");
        this.lobbyV3 = lobbyV3;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetLobbyInfoByRoomIdResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetLobbyInfoByRoomIdResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetLobbyInfoByRoomIdResponse other = (GetLobbyInfoByRoomIdResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiError, other.apiError) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.lobbyV3, other.lobbyV3) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiError,
            contentType,
            lobbyV3,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLobbyInfoByRoomIdResponse.class,
                "apiError", apiError,
                "contentType", contentType,
                "lobbyV3", lobbyV3,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.LobbyV3> lobbyV3 = Optional.empty();
 
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

        /**
         * Ok
         */
        public Builder lobbyV3(dev.hathora.cloud_api.models.shared.LobbyV3 lobbyV3) {
            Utils.checkNotNull(lobbyV3, "lobbyV3");
            this.lobbyV3 = Optional.ofNullable(lobbyV3);
            return this;
        }
        
        /**
         * Ok
         */
        public Builder lobbyV3(Optional<? extends dev.hathora.cloud_api.models.shared.LobbyV3> lobbyV3) {
            Utils.checkNotNull(lobbyV3, "lobbyV3");
            this.lobbyV3 = lobbyV3;
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
        
        public GetLobbyInfoByRoomIdResponse build() {
            return new GetLobbyInfoByRoomIdResponse(
                apiError,
                contentType,
                lobbyV3,
                statusCode,
                rawResponse);
        }
    }
}
