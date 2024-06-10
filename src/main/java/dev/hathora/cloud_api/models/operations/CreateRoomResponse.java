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

public class CreateRoomResponse implements dev.hathora.cloud_api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private Optional<? extends dev.hathora.cloud_api.models.shared.RoomConnectionData> roomConnectionData;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateRoomResponse(
            String contentType,
            Optional<? extends dev.hathora.cloud_api.models.shared.RoomConnectionData> roomConnectionData,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(roomConnectionData, "roomConnectionData");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.roomConnectionData = roomConnectionData;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateRoomResponse(
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
    public Optional<dev.hathora.cloud_api.models.shared.RoomConnectionData> roomConnectionData() {
        return (Optional<dev.hathora.cloud_api.models.shared.RoomConnectionData>) roomConnectionData;
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
    public CreateRoomResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public CreateRoomResponse withRoomConnectionData(dev.hathora.cloud_api.models.shared.RoomConnectionData roomConnectionData) {
        Utils.checkNotNull(roomConnectionData, "roomConnectionData");
        this.roomConnectionData = Optional.ofNullable(roomConnectionData);
        return this;
    }

    public CreateRoomResponse withRoomConnectionData(Optional<? extends dev.hathora.cloud_api.models.shared.RoomConnectionData> roomConnectionData) {
        Utils.checkNotNull(roomConnectionData, "roomConnectionData");
        this.roomConnectionData = roomConnectionData;
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
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.roomConnectionData, other.roomConnectionData) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            roomConnectionData,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRoomResponse.class,
                "contentType", contentType,
                "roomConnectionData", roomConnectionData,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends dev.hathora.cloud_api.models.shared.RoomConnectionData> roomConnectionData = Optional.empty();
 
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

        public Builder roomConnectionData(dev.hathora.cloud_api.models.shared.RoomConnectionData roomConnectionData) {
            Utils.checkNotNull(roomConnectionData, "roomConnectionData");
            this.roomConnectionData = Optional.ofNullable(roomConnectionData);
            return this;
        }

        public Builder roomConnectionData(Optional<? extends dev.hathora.cloud_api.models.shared.RoomConnectionData> roomConnectionData) {
            Utils.checkNotNull(roomConnectionData, "roomConnectionData");
            this.roomConnectionData = roomConnectionData;
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
                contentType,
                roomConnectionData,
                statusCode,
                rawResponse);
        }
    }
}

