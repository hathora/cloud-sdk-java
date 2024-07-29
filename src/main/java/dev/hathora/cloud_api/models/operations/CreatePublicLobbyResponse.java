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

public class CreatePublicLobbyResponse implements dev.hathora.cloud_api.utils.Response {

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

    @JsonCreator
    public CreatePublicLobbyResponse(
            String contentType,
            Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(lobby, "lobby");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.lobby = lobby;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreatePublicLobbyResponse(
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<dev.hathora.cloud_api.models.shared.Lobby> lobby() {
        return (Optional<dev.hathora.cloud_api.models.shared.Lobby>) lobby;
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
    public CreatePublicLobbyResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public CreatePublicLobbyResponse withLobby(dev.hathora.cloud_api.models.shared.Lobby lobby) {
        Utils.checkNotNull(lobby, "lobby");
        this.lobby = Optional.ofNullable(lobby);
        return this;
    }

    public CreatePublicLobbyResponse withLobby(Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby) {
        Utils.checkNotNull(lobby, "lobby");
        this.lobby = lobby;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreatePublicLobbyResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreatePublicLobbyResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreatePublicLobbyResponse other = (CreatePublicLobbyResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.lobby, other.lobby) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            lobby,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePublicLobbyResponse.class,
                "contentType", contentType,
                "lobby", lobby,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.Lobby> lobby = Optional.empty();
 
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
        
        public CreatePublicLobbyResponse build() {
            return new CreatePublicLobbyResponse(
                contentType,
                lobby,
                statusCode,
                rawResponse);
        }
    }
}

