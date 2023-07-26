/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class DestroyRoomRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public DestroyRoomRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=roomId")
    public String roomId;

    public DestroyRoomRequest withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    
    public DestroyRoomRequest(@JsonProperty("appId") String appId, @JsonProperty("roomId") String roomId) {
        this.appId = appId;
        this.roomId = roomId;
  }
}
