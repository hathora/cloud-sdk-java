/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.hathora.cloud_sdk.models.shared.RoomAllocationData;
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

public class ResumeRoomResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Ok
     */
    private Optional<? extends RoomAllocationData> roomAllocationData;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ResumeRoomResponse(
            String contentType,
            Optional<? extends RoomAllocationData> roomAllocationData,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(roomAllocationData, "roomAllocationData");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.roomAllocationData = roomAllocationData;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ResumeRoomResponse(
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
    public Optional<RoomAllocationData> roomAllocationData() {
        return (Optional<RoomAllocationData>) roomAllocationData;
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
    public ResumeRoomResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Ok
     */
    public ResumeRoomResponse withRoomAllocationData(RoomAllocationData roomAllocationData) {
        Utils.checkNotNull(roomAllocationData, "roomAllocationData");
        this.roomAllocationData = Optional.ofNullable(roomAllocationData);
        return this;
    }

    /**
     * Ok
     */
    public ResumeRoomResponse withRoomAllocationData(Optional<? extends RoomAllocationData> roomAllocationData) {
        Utils.checkNotNull(roomAllocationData, "roomAllocationData");
        this.roomAllocationData = roomAllocationData;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ResumeRoomResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ResumeRoomResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ResumeRoomResponse other = (ResumeRoomResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.roomAllocationData, other.roomAllocationData) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            roomAllocationData,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResumeRoomResponse.class,
                "contentType", contentType,
                "roomAllocationData", roomAllocationData,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends RoomAllocationData> roomAllocationData = Optional.empty();
 
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
        public Builder roomAllocationData(RoomAllocationData roomAllocationData) {
            Utils.checkNotNull(roomAllocationData, "roomAllocationData");
            this.roomAllocationData = Optional.ofNullable(roomAllocationData);
            return this;
        }

        /**
         * Ok
         */
        public Builder roomAllocationData(Optional<? extends RoomAllocationData> roomAllocationData) {
            Utils.checkNotNull(roomAllocationData, "roomAllocationData");
            this.roomAllocationData = roomAllocationData;
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
        
        public ResumeRoomResponse build() {
            return new ResumeRoomResponse(
                contentType,
                roomAllocationData,
                statusCode,
                rawResponse);
        }
    }
}

