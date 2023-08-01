/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListActivePublicLobbiesResponse {
    
    public String contentType;

    public ListActivePublicLobbiesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.Lobby[] lobbies;

    public ListActivePublicLobbiesResponse withLobbies(dev.hathora.cloud_api.models.shared.Lobby[] lobbies) {
        this.lobbies = lobbies;
        return this;
    }
    
    
    public Integer statusCode;

    public ListActivePublicLobbiesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListActivePublicLobbiesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListActivePublicLobbiesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}