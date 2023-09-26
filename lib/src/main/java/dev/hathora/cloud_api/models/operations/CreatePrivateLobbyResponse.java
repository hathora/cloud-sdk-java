/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreatePrivateLobbyResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public CreatePrivateLobbyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String createPrivateLobby400ApplicationJSONString;

    public CreatePrivateLobbyResponse withCreatePrivateLobby400ApplicationJSONString(String createPrivateLobby400ApplicationJSONString) {
        this.createPrivateLobby400ApplicationJSONString = createPrivateLobby400ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobby401ApplicationJSONString;

    public CreatePrivateLobbyResponse withCreatePrivateLobby401ApplicationJSONString(String createPrivateLobby401ApplicationJSONString) {
        this.createPrivateLobby401ApplicationJSONString = createPrivateLobby401ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobby404ApplicationJSONString;

    public CreatePrivateLobbyResponse withCreatePrivateLobby404ApplicationJSONString(String createPrivateLobby404ApplicationJSONString) {
        this.createPrivateLobby404ApplicationJSONString = createPrivateLobby404ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobby422ApplicationJSONString;

    public CreatePrivateLobbyResponse withCreatePrivateLobby422ApplicationJSONString(String createPrivateLobby422ApplicationJSONString) {
        this.createPrivateLobby422ApplicationJSONString = createPrivateLobby422ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobby429ApplicationJSONString;

    public CreatePrivateLobbyResponse withCreatePrivateLobby429ApplicationJSONString(String createPrivateLobby429ApplicationJSONString) {
        this.createPrivateLobby429ApplicationJSONString = createPrivateLobby429ApplicationJSONString;
        return this;
    }
    
    
    public String createPrivateLobby500ApplicationJSONString;

    public CreatePrivateLobbyResponse withCreatePrivateLobby500ApplicationJSONString(String createPrivateLobby500ApplicationJSONString) {
        this.createPrivateLobby500ApplicationJSONString = createPrivateLobby500ApplicationJSONString;
        return this;
    }
    
    
    public dev.hathora.cloud_api.models.shared.Lobby lobby;

    public CreatePrivateLobbyResponse withLobby(dev.hathora.cloud_api.models.shared.Lobby lobby) {
        this.lobby = lobby;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public CreatePrivateLobbyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public CreatePrivateLobbyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreatePrivateLobbyResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
