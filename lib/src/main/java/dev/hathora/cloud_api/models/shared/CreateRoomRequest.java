/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateRoomRequest {
    /**
     * Available regions to request a game server.
     */
    @JsonProperty("region")
    public Region region;

    public CreateRoomRequest withRegion(Region region) {
        this.region = region;
        return this;
    }
    
    public CreateRoomRequest(@JsonProperty("region") Region region) {
        this.region = region;
  }
}