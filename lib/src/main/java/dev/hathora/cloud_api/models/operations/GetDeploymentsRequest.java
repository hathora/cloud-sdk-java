/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class GetDeploymentsRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public GetDeploymentsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    public GetDeploymentsRequest(@JsonProperty("appId") String appId) {
        this.appId = appId;
  }
}
