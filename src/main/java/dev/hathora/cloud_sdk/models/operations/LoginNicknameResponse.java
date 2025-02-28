/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.PlayerTokenObject;
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

public class LoginNicknameResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends PlayerTokenObject> playerTokenObject;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public LoginNicknameResponse(
            String contentType,
            Optional<? extends PlayerTokenObject> playerTokenObject,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(playerTokenObject, "playerTokenObject");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.playerTokenObject = playerTokenObject;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public LoginNicknameResponse(
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
    public Optional<PlayerTokenObject> playerTokenObject() {
        return (Optional<PlayerTokenObject>) playerTokenObject;
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
    public LoginNicknameResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public LoginNicknameResponse withPlayerTokenObject(PlayerTokenObject playerTokenObject) {
        Utils.checkNotNull(playerTokenObject, "playerTokenObject");
        this.playerTokenObject = Optional.ofNullable(playerTokenObject);
        return this;
    }

    /**
     * Ok
     */
    public LoginNicknameResponse withPlayerTokenObject(Optional<? extends PlayerTokenObject> playerTokenObject) {
        Utils.checkNotNull(playerTokenObject, "playerTokenObject");
        this.playerTokenObject = playerTokenObject;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public LoginNicknameResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public LoginNicknameResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        LoginNicknameResponse other = (LoginNicknameResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.playerTokenObject, other.playerTokenObject) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            playerTokenObject,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LoginNicknameResponse.class,
                "contentType", contentType,
                "playerTokenObject", playerTokenObject,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends PlayerTokenObject> playerTokenObject = Optional.empty();
 
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
        public Builder playerTokenObject(PlayerTokenObject playerTokenObject) {
            Utils.checkNotNull(playerTokenObject, "playerTokenObject");
            this.playerTokenObject = Optional.ofNullable(playerTokenObject);
            return this;
        }

        /**
         * Ok
         */
        public Builder playerTokenObject(Optional<? extends PlayerTokenObject> playerTokenObject) {
            Utils.checkNotNull(playerTokenObject, "playerTokenObject");
            this.playerTokenObject = playerTokenObject;
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
        
        public LoginNicknameResponse build() {
            return new LoginNicknameResponse(
                contentType,
                playerTokenObject,
                statusCode,
                rawResponse);
        }
    }
}

