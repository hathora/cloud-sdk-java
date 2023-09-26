/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class SetLobbyStateResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public SetLobbyStateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.Lobby lobby;

    public SetLobbyStateResponse withLobby(dev.hathora.cloud_api.models.shared.Lobby lobby) {
        this.lobby = lobby;
        return this;
    }
    
    
    public String setLobbyState404ApplicationJSONString;

    public SetLobbyStateResponse withSetLobbyState404ApplicationJSONString(String setLobbyState404ApplicationJSONString) {
        this.setLobbyState404ApplicationJSONString = setLobbyState404ApplicationJSONString;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public SetLobbyStateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public SetLobbyStateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    
    public String setLobbyState422ApplicationJSONString;

    public SetLobbyStateResponse withSetLobbyState422ApplicationJSONString(String setLobbyState422ApplicationJSONString) {
        this.setLobbyState422ApplicationJSONString = setLobbyState422ApplicationJSONString;
        return this;
    }
    
    public SetLobbyStateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
