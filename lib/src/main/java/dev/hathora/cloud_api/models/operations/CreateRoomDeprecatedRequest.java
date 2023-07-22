/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class CreateRoomDeprecatedRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public dev.hathora.cloud_api.models.shared.CreateRoomRequest createRoomRequest;

    public CreateRoomDeprecatedRequest withCreateRoomRequest(dev.hathora.cloud_api.models.shared.CreateRoomRequest createRoomRequest) {
        this.createRoomRequest = createRoomRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public CreateRoomDeprecatedRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=roomId")
    public String roomId;

    public CreateRoomDeprecatedRequest withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    
    public CreateRoomDeprecatedRequest(@JsonProperty("CreateRoomRequest") dev.hathora.cloud_api.models.shared.CreateRoomRequest createRoomRequest, @JsonProperty("appId") String appId) {
        this.createRoomRequest = createRoomRequest;
        this.appId = appId;
  }
}
