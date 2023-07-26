/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class GetProcessInfoRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public GetProcessInfoRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=processId")
    public String processId;

    public GetProcessInfoRequest withProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    
    public GetProcessInfoRequest(@JsonProperty("appId") String appId, @JsonProperty("processId") String processId) {
        this.appId = appId;
        this.processId = processId;
  }
}
