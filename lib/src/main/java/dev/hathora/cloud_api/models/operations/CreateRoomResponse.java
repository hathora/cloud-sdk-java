/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateRoomResponse {
    
    public dev.hathora.cloud_api.models.shared.ConnectionInfoV2 connectionInfoV2;

    public CreateRoomResponse withConnectionInfoV2(dev.hathora.cloud_api.models.shared.ConnectionInfoV2 connectionInfoV2) {
        this.connectionInfoV2 = connectionInfoV2;
        return this;
    }
    
    
    public String contentType;

    public CreateRoomResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String createRoom400ApplicationJSONString;

    public CreateRoomResponse withCreateRoom400ApplicationJSONString(String createRoom400ApplicationJSONString) {
        this.createRoom400ApplicationJSONString = createRoom400ApplicationJSONString;
        return this;
    }
    
    
    public String createRoom403ApplicationJSONString;

    public CreateRoomResponse withCreateRoom403ApplicationJSONString(String createRoom403ApplicationJSONString) {
        this.createRoom403ApplicationJSONString = createRoom403ApplicationJSONString;
        return this;
    }
    
    
    public String createRoom404ApplicationJSONString;

    public CreateRoomResponse withCreateRoom404ApplicationJSONString(String createRoom404ApplicationJSONString) {
        this.createRoom404ApplicationJSONString = createRoom404ApplicationJSONString;
        return this;
    }
    
    
    public String createRoom500ApplicationJSONString;

    public CreateRoomResponse withCreateRoom500ApplicationJSONString(String createRoom500ApplicationJSONString) {
        this.createRoom500ApplicationJSONString = createRoom500ApplicationJSONString;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateRoomResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateRoomResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateRoomResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}