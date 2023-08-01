/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetBuildsResponse {
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.Build[] builds;

    public GetBuildsResponse withBuilds(dev.hathora.cloud_api.models.shared.Build[] builds) {
        this.builds = builds;
        return this;
    }
    
    
    public String contentType;

    public GetBuildsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String getBuilds404ApplicationJSONString;

    public GetBuildsResponse withGetBuilds404ApplicationJSONString(String getBuilds404ApplicationJSONString) {
        this.getBuilds404ApplicationJSONString = getBuilds404ApplicationJSONString;
        return this;
    }
    
    
    public Integer statusCode;

    public GetBuildsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetBuildsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetBuildsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}