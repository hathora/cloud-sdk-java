/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedRequest;
import dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedResponse;
import dev.hathora.cloud_sdk.models.operations.CreatePrivateLobbyDeprecatedSecurity;
import dev.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedRequest;
import dev.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedResponse;
import dev.hathora.cloud_sdk.models.operations.CreatePublicLobbyDeprecatedSecurity;
import dev.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV1Request;
import dev.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV1RequestBuilder;
import dev.hathora.cloud_sdk.models.operations.ListActivePublicLobbiesDeprecatedV1Response;
import dev.hathora.cloud_sdk.models.operations.SDKMethodInterfaces.*;
import dev.hathora.cloud_sdk.models.shared.Lobby;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.HTTPRequest;
import dev.hathora.cloud_sdk.utils.Hook.AfterErrorContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.AfterSuccessContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.BeforeRequestContextImpl;
import dev.hathora.cloud_sdk.utils.Utils;
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
     * CreatePrivateLobbyDeprecated
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePrivateLobbyDeprecatedRequestBuilder createPrivateLobbyDeprecated() {
        return new CreatePrivateLobbyDeprecatedRequestBuilder(this);
    }

    /**
     * CreatePrivateLobbyDeprecated
     * 
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
     * CreatePrivateLobbyDeprecated
     * 
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
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                CreatePrivateLobbyDeprecatedRequest.class,
                request, 
                this.sdkConfiguration.globals));

        // hooks will be passed method level security only
        Optional<SecuritySource> _hookSecuritySource = Optional.of(SecuritySource.of(security));
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "CreatePrivateLobbyDeprecated", 
                      Optional.empty(), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "CreatePrivateLobbyDeprecated",
                            Optional.empty(),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "CreatePrivateLobbyDeprecated",
                            Optional.empty(), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "CreatePrivateLobbyDeprecated",
                            Optional.empty(),
                            _hookSecuritySource), 
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429")) {
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500")) {
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
     * CreatePublicLobbyDeprecated
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public CreatePublicLobbyDeprecatedRequestBuilder createPublicLobbyDeprecated() {
        return new CreatePublicLobbyDeprecatedRequestBuilder(this);
    }

    /**
     * CreatePublicLobbyDeprecated
     * 
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
     * CreatePublicLobbyDeprecated
     * 
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
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                CreatePublicLobbyDeprecatedRequest.class,
                request, 
                this.sdkConfiguration.globals));

        // hooks will be passed method level security only
        Optional<SecuritySource> _hookSecuritySource = Optional.of(SecuritySource.of(security));
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "CreatePublicLobbyDeprecated", 
                      Optional.empty(), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "CreatePublicLobbyDeprecated",
                            Optional.empty(),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "CreatePublicLobbyDeprecated",
                            Optional.empty(), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "CreatePublicLobbyDeprecated",
                            Optional.empty(),
                            _hookSecuritySource), 
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "402", "404", "422", "429")) {
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "500")) {
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
     * ListActivePublicLobbiesDeprecatedV1
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder listActivePublicLobbiesDeprecatedV1() {
        return new ListActivePublicLobbiesDeprecatedV1RequestBuilder(this);
    }

    /**
     * ListActivePublicLobbiesDeprecatedV1
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ListActivePublicLobbiesDeprecatedV1Response listActivePublicLobbiesDeprecatedV1Direct() throws Exception {
        return listActivePublicLobbiesDeprecatedV1(Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * ListActivePublicLobbiesDeprecatedV1
     * 
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
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListActivePublicLobbiesDeprecatedV1Request.class,
                request, 
                this.sdkConfiguration.globals));
        Optional<SecuritySource> _hookSecuritySource = Optional.empty();
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "ListActivePublicLobbiesDeprecatedV1", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "422", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "ListActivePublicLobbiesDeprecatedV1",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "ListActivePublicLobbiesDeprecatedV1",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "ListActivePublicLobbiesDeprecatedV1",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "422", "429")) {
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
