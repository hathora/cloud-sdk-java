/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetAppsResponse {
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.ApplicationWithDeployment[] applicationWithDeployments;

    public GetAppsResponse withApplicationWithDeployments(dev.hathora.cloud_api.models.shared.ApplicationWithDeployment[] applicationWithDeployments) {
        this.applicationWithDeployments = applicationWithDeployments;
        return this;
    }
    
    
    public String contentType;

    public GetAppsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetAppsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetAppsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetAppsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}