/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DestroyRoomResponse {
    
    public String contentType;

    public DestroyRoomResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String destroyRoom404ApplicationJSONString;

    public DestroyRoomResponse withDestroyRoom404ApplicationJSONString(String destroyRoom404ApplicationJSONString) {
        this.destroyRoom404ApplicationJSONString = destroyRoom404ApplicationJSONString;
        return this;
    }
    
    
    public String destroyRoom500ApplicationJSONString;

    public DestroyRoomResponse withDestroyRoom500ApplicationJSONString(String destroyRoom500ApplicationJSONString) {
        this.destroyRoom500ApplicationJSONString = destroyRoom500ApplicationJSONString;
        return this;
    }
    
    
    public Integer statusCode;

    public DestroyRoomResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DestroyRoomResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DestroyRoomResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}