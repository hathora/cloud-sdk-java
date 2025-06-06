/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.utils.Response;
import dev.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class CreatePublicLobbyDeprecatedResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<String> roomId;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreatePublicLobbyDeprecatedResponse(
            String contentType,
            Optional<String> roomId,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(roomId, "roomId");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.roomId = roomId;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreatePublicLobbyDeprecatedResponse(
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
    @JsonIgnore
    public Optional<String> roomId() {
        return roomId;
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
    public CreatePublicLobbyDeprecatedResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public CreatePublicLobbyDeprecatedResponse withRoomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.ofNullable(roomId);
        return this;
    }

    /**
     * Ok
     */
    public CreatePublicLobbyDeprecatedResponse withRoomId(Optional<String> roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreatePublicLobbyDeprecatedResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreatePublicLobbyDeprecatedResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreatePublicLobbyDeprecatedResponse other = (CreatePublicLobbyDeprecatedResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.roomId, other.roomId) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            roomId,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePublicLobbyDeprecatedResponse.class,
                "contentType", contentType,
                "roomId", roomId,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<String> roomId = Optional.empty();
 
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
        public Builder roomId(String roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = Optional.ofNullable(roomId);
            return this;
        }

        /**
         * Ok
         */
        public Builder roomId(Optional<String> roomId) {
            Utils.checkNotNull(roomId, "roomId");
            this.roomId = roomId;
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
        
        public CreatePublicLobbyDeprecatedResponse build() {
            return new CreatePublicLobbyDeprecatedResponse(
                contentType,
                roomId,
                statusCode,
                rawResponse);
        }
    }
}
