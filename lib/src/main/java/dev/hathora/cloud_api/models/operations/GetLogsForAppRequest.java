/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class GetLogsForAppRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public GetLogsForAppRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=follow")
    public Boolean follow;

    public GetLogsForAppRequest withFollow(Boolean follow) {
        this.follow = follow;
        return this;
    }
    
    /**
     * Available regions to request a game server.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=region")
    public dev.hathora.cloud_api.models.shared.Region region;

    public GetLogsForAppRequest withRegion(dev.hathora.cloud_api.models.shared.Region region) {
        this.region = region;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tailLines")
    public Integer tailLines;

    public GetLogsForAppRequest withTailLines(Integer tailLines) {
        this.tailLines = tailLines;
        return this;
    }
    
    public GetLogsForAppRequest(@JsonProperty("appId") String appId) {
        this.appId = appId;
  }
}