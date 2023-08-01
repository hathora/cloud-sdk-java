/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class GetAppInfoRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public GetAppInfoRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    public GetAppInfoRequest(@JsonProperty("appId") String appId) {
        this.appId = appId;
  }
}