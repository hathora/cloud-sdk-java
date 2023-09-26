/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetLogsForProcessResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetLogsForProcessResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Ok
     */
    
    public String getLogsForProcess200TextPlainByteString;

    public GetLogsForProcessResponse withGetLogsForProcess200TextPlainByteString(String getLogsForProcess200TextPlainByteString) {
        this.getLogsForProcess200TextPlainByteString = getLogsForProcess200TextPlainByteString;
        return this;
    }
    
    
    public String getLogsForProcess404ApplicationJSONString;

    public GetLogsForProcessResponse withGetLogsForProcess404ApplicationJSONString(String getLogsForProcess404ApplicationJSONString) {
        this.getLogsForProcess404ApplicationJSONString = getLogsForProcess404ApplicationJSONString;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetLogsForProcessResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetLogsForProcessResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetLogsForProcessResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
