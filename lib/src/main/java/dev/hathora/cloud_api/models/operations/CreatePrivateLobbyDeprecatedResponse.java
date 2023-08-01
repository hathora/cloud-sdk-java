/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreatePrivateLobbyDeprecatedResponse {
    
    public String contentType;

    public CreatePrivateLobbyDeprecatedResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String createPrivateLobbyDeprecated400ApplicationJSONString;

    public CreatePrivateLobbyDeprecatedResponse withCreatePrivateLobbyDeprecated400ApplicationJSONString(String createPrivateLobbyDeprecated400ApplicationJSONString) {
        this.createPrivateLobbyDeprecated400ApplicationJSONString = createPrivateLobbyDeprecated400ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobbyDeprecated401ApplicationJSONString;

    public CreatePrivateLobbyDeprecatedResponse withCreatePrivateLobbyDeprecated401ApplicationJSONString(String createPrivateLobbyDeprecated401ApplicationJSONString) {
        this.createPrivateLobbyDeprecated401ApplicationJSONString = createPrivateLobbyDeprecated401ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobbyDeprecated404ApplicationJSONString;

    public CreatePrivateLobbyDeprecatedResponse withCreatePrivateLobbyDeprecated404ApplicationJSONString(String createPrivateLobbyDeprecated404ApplicationJSONString) {
        this.createPrivateLobbyDeprecated404ApplicationJSONString = createPrivateLobbyDeprecated404ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobbyDeprecated422ApplicationJSONString;

    public CreatePrivateLobbyDeprecatedResponse withCreatePrivateLobbyDeprecated422ApplicationJSONString(String createPrivateLobbyDeprecated422ApplicationJSONString) {
        this.createPrivateLobbyDeprecated422ApplicationJSONString = createPrivateLobbyDeprecated422ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobbyDeprecated429ApplicationJSONString;

    public CreatePrivateLobbyDeprecatedResponse withCreatePrivateLobbyDeprecated429ApplicationJSONString(String createPrivateLobbyDeprecated429ApplicationJSONString) {
        this.createPrivateLobbyDeprecated429ApplicationJSONString = createPrivateLobbyDeprecated429ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobbyDeprecated500ApplicationJSONString;

    public CreatePrivateLobbyDeprecatedResponse withCreatePrivateLobbyDeprecated500ApplicationJSONString(String createPrivateLobbyDeprecated500ApplicationJSONString) {
        this.createPrivateLobbyDeprecated500ApplicationJSONString = createPrivateLobbyDeprecated500ApplicationJSONString;
        return this;
    }
    
    /**
     * Ok
     */
    
    public String roomId;

    public CreatePrivateLobbyDeprecatedResponse withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    
    
    public Integer statusCode;

    public CreatePrivateLobbyDeprecatedResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreatePrivateLobbyDeprecatedResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreatePrivateLobbyDeprecatedResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}