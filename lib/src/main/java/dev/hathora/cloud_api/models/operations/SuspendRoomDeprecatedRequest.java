/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class SuspendRoomDeprecatedRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public SuspendRoomDeprecatedRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=roomId")
    public String roomId;

    public SuspendRoomDeprecatedRequest withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    
    public SuspendRoomDeprecatedRequest(@JsonProperty("appId") String appId, @JsonProperty("roomId") String roomId) {
        this.appId = appId;
        this.roomId = roomId;
  }
}
