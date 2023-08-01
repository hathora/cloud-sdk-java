/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetDeploymentInfoResponse {
    
    public String contentType;

    public GetDeploymentInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.Deployment deployment;

    public GetDeploymentInfoResponse withDeployment(dev.hathora.cloud_api.models.shared.Deployment deployment) {
        this.deployment = deployment;
        return this;
    }
    
    
    public String getDeploymentInfo404ApplicationJSONString;

    public GetDeploymentInfoResponse withGetDeploymentInfo404ApplicationJSONString(String getDeploymentInfo404ApplicationJSONString) {
        this.getDeploymentInfo404ApplicationJSONString = getDeploymentInfo404ApplicationJSONString;
        return this;
    }
    
    
    public Integer statusCode;

    public GetDeploymentInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetDeploymentInfoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetDeploymentInfoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}