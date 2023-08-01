/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class CreatePrivateLobbyDeprecatedRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public CreatePrivateLobbyDeprecatedRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=local")
    public Boolean local;

    public CreatePrivateLobbyDeprecatedRequest withLocal(Boolean local) {
        this.local = local;
        return this;
    }
    
    /**
     * Available regions to request a game server.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    public dev.hathora.cloud_api.models.shared.Region region;

    public CreatePrivateLobbyDeprecatedRequest withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        this.region = region;
        return this;
    }
    
    public CreatePrivateLobbyDeprecatedRequest(@JsonProperty("appId") String appId) {
        this.appId = appId;
  }
}