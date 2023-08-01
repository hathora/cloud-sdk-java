/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class ListActivePublicLobbiesRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public ListActivePublicLobbiesRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * Region to filter by. If omitted, active public lobbies in all regions will be returned.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    public dev.hathora.cloud_api.models.shared.Region region;

    public ListActivePublicLobbiesRequest withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        this.region = region;
        return this;
    }
    
    public ListActivePublicLobbiesRequest(@JsonProperty("appId") String appId) {
        this.appId = appId;
  }
}