/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateLobbyDeprecatedResponse implements dev.hathora.cloud_api.utils.Response {

    private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public CreateLobbyDeprecatedResponse(
            Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError,
            String contentType,
            Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiError, "apiError");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(lobby, "lobby");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiError = apiError;
        this.contentType = contentType;
        this.lobby = lobby;
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

    public Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby() {
        return lobby;
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

    public CreateLobbyDeprecatedResponse withApiError(dev.hathora.cloud_api.models.shared.ApiError apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = Optional.ofNullable(apiError);
        return this;
    }

    public CreateLobbyDeprecatedResponse withApiError(Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError) {
        Utils.checkNotNull(apiError, "apiError");
        this.apiError = apiError;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateLobbyDeprecatedResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public CreateLobbyDeprecatedResponse withLobby(dev.hathora.cloud_api.models.shared.Lobby lobby) {
        Utils.checkNotNull(lobby, "lobby");
        this.lobby = Optional.ofNullable(lobby);
        return this;
    }

    public CreateLobbyDeprecatedResponse withLobby(Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby) {
        Utils.checkNotNull(lobby, "lobby");
        this.lobby = lobby;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateLobbyDeprecatedResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateLobbyDeprecatedResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateLobbyDeprecatedResponse other = (CreateLobbyDeprecatedResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiError, other.apiError) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.lobby, other.lobby) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiError,
            contentType,
            lobby,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateLobbyDeprecatedResponse.class,
                "apiError", apiError,
                "contentType", contentType,
                "lobby", lobby,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.ApiError> apiError = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby = Optional.empty();
 
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

        public Builder lobby(dev.hathora.cloud_api.models.shared.Lobby lobby) {
            Utils.checkNotNull(lobby, "lobby");
            this.lobby = Optional.ofNullable(lobby);
            return this;
        }

        public Builder lobby(Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby) {
            Utils.checkNotNull(lobby, "lobby");
            this.lobby = lobby;
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
        
        public CreateLobbyDeprecatedResponse build() {
            return new CreateLobbyDeprecatedResponse(
                apiError,
                contentType,
                lobby,
                statusCode,
                rawResponse);
        }
    }
}

