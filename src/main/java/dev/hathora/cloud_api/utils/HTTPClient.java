/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;

public interface HTTPClient {
    HttpResponse<InputStream> send(HttpRequest request)
            throws IOException, InterruptedException, URISyntaxException;
}
