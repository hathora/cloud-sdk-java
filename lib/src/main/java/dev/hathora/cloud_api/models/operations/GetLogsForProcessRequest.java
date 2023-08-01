/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class GetLogsForProcessRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public GetLogsForProcessRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=follow")
    public Boolean follow;

    public GetLogsForProcessRequest withFollow(Boolean follow) {
        this.follow = follow;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=processId")
    public String processId;

    public GetLogsForProcessRequest withProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tailLines")
    public Integer tailLines;

    public GetLogsForProcessRequest withTailLines(Integer tailLines) {
        this.tailLines = tailLines;
        return this;
    }
    
    public GetLogsForProcessRequest(@JsonProperty("appId") String appId, @JsonProperty("processId") String processId) {
        this.appId = appId;
        this.processId = processId;
  }
}