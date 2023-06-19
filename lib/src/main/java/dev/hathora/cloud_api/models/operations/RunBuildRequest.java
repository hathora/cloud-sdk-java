/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class RunBuildRequest {
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public RunBuildRequestBody requestBody;

    public RunBuildRequest withRequestBody(RunBuildRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public RunBuildRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=buildId")
    public Integer buildId;

    public RunBuildRequest withBuildId(Integer buildId) {
        this.buildId = buildId;
        return this;
    }
    
    public RunBuildRequest(@JsonProperty("RequestBody") RunBuildRequestBody requestBody, @JsonProperty("appId") String appId, @JsonProperty("buildId") Integer buildId) {
        this.requestBody = requestBody;
        this.appId = appId;
        this.buildId = buildId;
  }
}
