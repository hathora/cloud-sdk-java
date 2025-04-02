/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.utils;

import java.io.InputStream;
import java.net.http.HttpResponse;

public interface Response {
    
    /**
     * Returns the value of the Content-Type header.
     **/
    String contentType();
    
    /** 
     * Returns the HTTP status code.
     **/
    int statusCode();
    
    /**
     * Returns the raw response.
     **/
    HttpResponse<InputStream> rawResponse();
}