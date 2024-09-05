/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.models.errors.ApiError;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedRequest;
import com.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedRequestBuilder;
import com.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedResponse;
import com.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedSecurity;
import com.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedRequest;
import com.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedRequestBuilder;
import com.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedResponse;
import com.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedSecurity;
import com.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV1Request;
import com.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV1RequestBuilder;
import com.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV1Response;
import com.hathora.cloud_sdk.models.operations.SDKMethodInterfaces.*;
import com.hathora.cloud_sdk.models.shared.Lobby;
import com.hathora.cloud_sdk.models.shared.Region;
import com.hathora.cloud_sdk.utils.HTTPClient;
import com.hathora.cloud_sdk.utils.HTTPRequest;
import com.hathora.cloud_sdk.utils.Hook.AfterErrorContextImpl;
import com.hathora.cloud_sdk.utils.Hook.AfterSuccessContextImpl;
import com.hathora.cloud_sdk.utils.Hook.BeforeRequestContextImpl;
import com.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class LobbiesV1 implements
            MethodCallCreatePrivateLobbyDeprecated,
            MethodCallCreatePublicLobbyDeprecated,
            MethodCallListActivePublicLobbiesDeprecatedV1 {

    private final SDKConfiguration sdkConfiguration;

    LobbiesV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePrivateLobbyDeprecatedRequestBuilder createPrivateLobbyDeprecated() {
        return new CreatePrivateLobbyDeprecatedRequestBuilder(this);
    }

    /**
     * @param security The security details to use for authentication.
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePrivateLobbyDeprecatedResponse createPrivateLobbyDeprecated(
            CreatePrivateLobbyDeprecatedSecurity security) throws Exception {
        return createPrivateLobbyDeprecated(security, Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * @param security The security details to use for authentication.
     * @param appId
     * @param local
     * @param region
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePrivateLobbyDeprecatedResponse createPrivateLobbyDeprecated(
            CreatePrivateLobbyDeprecatedSecurity security,
            Optional<String> appId,
            Optional<Boolean> local,
            Optional<? extends Region> region) throws Exception {
        CreatePrivateLobbyDeprecatedRequest request =
            CreatePrivateLobbyDeprecatedRequest
                .builder()
                .appId(appId)
                .local(local)
                .region(region)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreatePrivateLobbyDeprecatedRequest.class,
                _baseUrl,
                "/lobby/v1/{appId}/create/private",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                CreatePrivateLobbyDeprecatedRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req, security);

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "CreatePrivateLobbyDeprecated", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreatePrivateLobbyDeprecated",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreatePrivateLobbyDeprecated",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreatePrivateLobbyDeprecated",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreatePrivateLobbyDeprecatedResponse.Builder _resBuilder = 
            CreatePrivateLobbyDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreatePrivateLobbyDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                String _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<String>() {});
                _res.withRoomId(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ApiError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApiError>() {});
                throw _out;
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



    /**
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePublicLobbyDeprecatedRequestBuilder createPublicLobbyDeprecated() {
        return new CreatePublicLobbyDeprecatedRequestBuilder(this);
    }

    /**
     * @param security The security details to use for authentication.
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePublicLobbyDeprecatedResponse createPublicLobbyDeprecated(
            CreatePublicLobbyDeprecatedSecurity security) throws Exception {
        return createPublicLobbyDeprecated(security, Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * @param security The security details to use for authentication.
     * @param appId
     * @param local
     * @param region
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePublicLobbyDeprecatedResponse createPublicLobbyDeprecated(
            CreatePublicLobbyDeprecatedSecurity security,
            Optional<String> appId,
            Optional<Boolean> local,
            Optional<? extends Region> region) throws Exception {
        CreatePublicLobbyDeprecatedRequest request =
            CreatePublicLobbyDeprecatedRequest
                .builder()
                .appId(appId)
                .local(local)
                .region(region)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreatePublicLobbyDeprecatedRequest.class,
                _baseUrl,
                "/lobby/v1/{appId}/create/public",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                CreatePublicLobbyDeprecatedRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req, security);

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "CreatePublicLobbyDeprecated", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreatePublicLobbyDeprecated",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreatePublicLobbyDeprecated",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreatePublicLobbyDeprecated",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreatePublicLobbyDeprecatedResponse.Builder _resBuilder = 
            CreatePublicLobbyDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreatePublicLobbyDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                String _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<String>() {});
                _res.withRoomId(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ApiError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApiError>() {});
                throw _out;
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



    /**
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder listActivePublicLobbiesDeprecatedV1() {
        return new ListActivePublicLobbiesDeprecatedV1RequestBuilder(this);
    }

    /**
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ListActivePublicLobbiesDeprecatedV1Response listActivePublicLobbiesDeprecatedV1Direct() throws Exception {
        return listActivePublicLobbiesDeprecatedV1(Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * @param appId
     * @param local
     * @param region
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ListActivePublicLobbiesDeprecatedV1Response listActivePublicLobbiesDeprecatedV1(
            Optional<String> appId,
            Optional<Boolean> local,
            Optional<? extends Region> region) throws Exception {
        ListActivePublicLobbiesDeprecatedV1Request request =
            ListActivePublicLobbiesDeprecatedV1Request
                .builder()
                .appId(appId)
                .local(local)
                .region(region)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListActivePublicLobbiesDeprecatedV1Request.class,
                _baseUrl,
                "/lobby/v1/{appId}/list",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                ListActivePublicLobbiesDeprecatedV1Request.class,
                request, 
                this.sdkConfiguration.globals));

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "ListActivePublicLobbiesDeprecatedV1", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListActivePublicLobbiesDeprecatedV1",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListActivePublicLobbiesDeprecatedV1",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListActivePublicLobbiesDeprecatedV1",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListActivePublicLobbiesDeprecatedV1Response.Builder _resBuilder = 
            ListActivePublicLobbiesDeprecatedV1Response
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListActivePublicLobbiesDeprecatedV1Response _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Lobby> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Lobby>>() {});
                _res.withClasses(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "429")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ApiError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApiError>() {});
                throw _out;
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
