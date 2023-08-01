/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetBuildInfoResponse {
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.Build build;

    public GetBuildInfoResponse withBuild(dev.hathora.cloud_api.models.shared.Build build) {
        this.build = build;
        return this;
    }
    
    
    public String contentType;

    public GetBuildInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String getBuildInfo404ApplicationJSONString;

    public GetBuildInfoResponse withGetBuildInfo404ApplicationJSONString(String getBuildInfo404ApplicationJSONString) {
        this.getBuildInfo404ApplicationJSONString = getBuildInfo404ApplicationJSONString;
        return this;
    }
    
    
    public Integer statusCode;

    public GetBuildInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetBuildInfoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetBuildInfoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}