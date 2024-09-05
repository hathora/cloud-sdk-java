/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetPingServiceEndpointsDeprecatedRequestBuilder;
import com.hathora.hathora_cloud_sdk.models.operations.GetPingServiceEndpointsDeprecatedResponse;
import com.hathora.hathora_cloud_sdk.models.operations.SDKMethodInterfaces.*;
import com.hathora.hathora_cloud_sdk.models.shared.PingEndpoints;
import com.hathora.hathora_cloud_sdk.utils.HTTPClient;
import com.hathora.hathora_cloud_sdk.utils.HTTPRequest;
import com.hathora.hathora_cloud_sdk.utils.Hook.AfterErrorContextImpl;
import com.hathora.hathora_cloud_sdk.utils.Hook.AfterSuccessContextImpl;
import com.hathora.hathora_cloud_sdk.utils.Hook.BeforeRequestContextImpl;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * Deprecated. Does not include latest Regions (missing Dallas region). Use [DiscoveryV2](https://hathora.dev/api#tag/DiscoveryV2).
 */
public class DiscoveryV1 implements
            MethodCallGetPingServiceEndpointsDeprecated {

    private final SDKConfiguration sdkConfiguration;

    DiscoveryV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Returns an array of V1 regions with a host and port that a client can directly ping. Open a websocket connection to `wss://&lt;host&gt;:&lt;port&gt;/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetPingServiceEndpointsDeprecatedRequestBuilder getPingServiceEndpointsDeprecated() {
        return new GetPingServiceEndpointsDeprecatedRequestBuilder(this);
    }

    /**
     * Returns an array of V1 regions with a host and port that a client can directly ping. Open a websocket connection to `wss://&lt;host&gt;:&lt;port&gt;/ws` and send a packet. To calculate ping, measure the time it takes to get an echo packet back.
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetPingServiceEndpointsDeprecatedResponse getPingServiceEndpointsDeprecatedDirect() throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/discovery/v1/ping");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "GetPingServiceEndpointsDeprecated", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetPingServiceEndpointsDeprecated",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetPingServiceEndpointsDeprecated",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetPingServiceEndpointsDeprecated",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetPingServiceEndpointsDeprecatedResponse.Builder _resBuilder = 
            GetPingServiceEndpointsDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetPingServiceEndpointsDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<PingEndpoints> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<PingEndpoints>>() {});
                _res.withPingEndpoints(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}