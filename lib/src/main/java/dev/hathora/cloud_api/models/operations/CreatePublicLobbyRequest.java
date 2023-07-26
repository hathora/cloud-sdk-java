/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class CreatePublicLobbyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public CreatePublicLobbyRequestBody requestBody;

    public CreatePublicLobbyRequest withRequestBody(CreatePublicLobbyRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public CreatePublicLobbyRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=roomId")
    public String roomId;

    public CreatePublicLobbyRequest withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    
    public CreatePublicLobbyRequest(@JsonProperty("RequestBody") CreatePublicLobbyRequestBody requestBody, @JsonProperty("appId") String appId) {
        this.requestBody = requestBody;
        this.appId = appId;
  }
}
