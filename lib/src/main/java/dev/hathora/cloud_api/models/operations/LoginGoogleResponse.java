/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class LoginGoogleResponse {
    
    public String contentType;

    public LoginGoogleResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String loginGoogle401ApplicationJSONString;

    public LoginGoogleResponse withLoginGoogle401ApplicationJSONString(String loginGoogle401ApplicationJSONString) {
        this.loginGoogle401ApplicationJSONString = loginGoogle401ApplicationJSONString;
        return this;
    }
    
    
    public String loginGoogle404ApplicationJSONString;

    public LoginGoogleResponse withLoginGoogle404ApplicationJSONString(String loginGoogle404ApplicationJSONString) {
        this.loginGoogle404ApplicationJSONString = loginGoogle404ApplicationJSONString;
        return this;
    }
    
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.LoginResponse loginResponse;

    public LoginGoogleResponse withLoginResponse(dev.hathora.cloud_api.models.shared.LoginResponse loginResponse) {
        this.loginResponse = loginResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public LoginGoogleResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public LoginGoogleResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public LoginGoogleResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}