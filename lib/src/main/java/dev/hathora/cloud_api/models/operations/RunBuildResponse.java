/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class RunBuildResponse {
    
    public String contentType;

    public RunBuildResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Ok
     */
    
    public String runBuild200TextPlainByteString;

    public RunBuildResponse withRunBuild200TextPlainByteString(String runBuild200TextPlainByteString) {
        this.runBuild200TextPlainByteString = runBuild200TextPlainByteString;
        return this;
    }
    
    
    public String runBuild404ApplicationJSONString;

    public RunBuildResponse withRunBuild404ApplicationJSONString(String runBuild404ApplicationJSONString) {
        this.runBuild404ApplicationJSONString = runBuild404ApplicationJSONString;
        return this;
    }
    
    
    public Integer statusCode;

    public RunBuildResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public RunBuildResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    
    public String runBuild500ApplicationJSONString;

    public RunBuildResponse withRunBuild500ApplicationJSONString(String runBuild500ApplicationJSONString) {
        this.runBuild500ApplicationJSONString = runBuild500ApplicationJSONString;
        return this;
    }
    
    public RunBuildResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
