/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.CreateAppRequest;
import dev.hathora.cloud_sdk.models.operations.CreateAppRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.CreateAppResponse;
import dev.hathora.cloud_sdk.models.operations.DeleteAppRequest;
import dev.hathora.cloud_sdk.models.operations.DeleteAppRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.DeleteAppResponse;
import dev.hathora.cloud_sdk.models.operations.GetAppRequest;
import dev.hathora.cloud_sdk.models.operations.GetAppRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetAppResponse;
import dev.hathora.cloud_sdk.models.operations.GetAppsRequest;
import dev.hathora.cloud_sdk.models.operations.GetAppsRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetAppsResponse;
import dev.hathora.cloud_sdk.models.operations.SDKMethodInterfaces.*;
import dev.hathora.cloud_sdk.models.operations.UpdateAppRequest;
import dev.hathora.cloud_sdk.models.operations.UpdateAppRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.UpdateAppResponse;
import dev.hathora.cloud_sdk.models.shared.AppConfig;
import dev.hathora.cloud_sdk.models.shared.Application;
import dev.hathora.cloud_sdk.models.shared.ApplicationsPage;
import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.HTTPRequest;
import dev.hathora.cloud_sdk.utils.Hook.AfterErrorContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.AfterSuccessContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.BeforeRequestContextImpl;
import dev.hathora.cloud_sdk.utils.SerializedBody;
import dev.hathora.cloud_sdk.utils.Utils.JsonShape;
import dev.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).
 */
public class AppsV2 implements
            MethodCallCreateApp,
            MethodCallDeleteApp,
            MethodCallGetApp,
            MethodCallGetApps,
            MethodCallUpdateApp {

    private final SDKConfiguration sdkConfiguration;

    AppsV2(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @return The call builder
     */
    public CreateAppRequestBuilder createApp() {
        return new CreateAppRequestBuilder(this);
    }

    /**
     * Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appConfig
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateAppResponse createApp(
            AppConfig appConfig) throws Exception {
        return createApp(appConfig, Optional.empty());
    }
    
    /**
     * Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appConfig
     * @param orgId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateAppResponse createApp(
            AppConfig appConfig,
            Optional<String> orgId) throws Exception {
        CreateAppRequest request =
            CreateAppRequest
                .builder()
                .appConfig(appConfig)
                .orgId(orgId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/apps/v2/apps");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "appConfig",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                CreateAppRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "CreateApp", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateApp",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateAppResponse.Builder _resBuilder = 
            CreateAppResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateAppResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Application _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Application>() {});
                _res.withApplication(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "500")) {
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
     * Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.
     * @return The call builder
     */
    public DeleteAppRequestBuilder deleteApp() {
        return new DeleteAppRequestBuilder(this);
    }

    /**
     * Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteAppResponse deleteAppDirect() throws Exception {
        return deleteApp(Optional.empty());
    }
    
    /**
     * Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.
     * @param appId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteAppResponse deleteApp(
            Optional<String> appId) throws Exception {
        DeleteAppRequest request =
            DeleteAppRequest
                .builder()
                .appId(appId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                DeleteAppRequest.class,
                _baseUrl,
                "/apps/v2/apps/{appId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "DeleteApp", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteApp",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteAppResponse.Builder _resBuilder = 
            DeleteAppResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteAppResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "500")) {
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
     * Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @return The call builder
     */
    public GetAppRequestBuilder getApp() {
        return new GetAppRequestBuilder(this);
    }

    /**
     * Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAppResponse getAppDirect() throws Exception {
        return getApp(Optional.empty());
    }
    
    /**
     * Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @param appId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAppResponse getApp(
            Optional<String> appId) throws Exception {
        GetAppRequest request =
            GetAppRequest
                .builder()
                .appId(appId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetAppRequest.class,
                _baseUrl,
                "/apps/v2/apps/{appId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "GetApp", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetApp",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetAppResponse.Builder _resBuilder = 
            GetAppResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetAppResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Application _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Application>() {});
                _res.withApplication(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429")) {
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
     * Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.
     * @return The call builder
     */
    public GetAppsRequestBuilder getApps() {
        return new GetAppsRequestBuilder(this);
    }

    /**
     * Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAppsResponse getAppsDirect() throws Exception {
        return getApps(Optional.empty());
    }
    
    /**
     * Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.
     * @param orgId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAppsResponse getApps(
            Optional<String> orgId) throws Exception {
        GetAppsRequest request =
            GetAppsRequest
                .builder()
                .orgId(orgId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/apps/v2/apps");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetAppsRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "GetApps", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetApps",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetApps",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetApps",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetAppsResponse.Builder _resBuilder = 
            GetAppsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetAppsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ApplicationsPage _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApplicationsPage>() {});
                _res.withApplicationsPage(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429")) {
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
     * Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @return The call builder
     */
    public UpdateAppRequestBuilder updateApp() {
        return new UpdateAppRequestBuilder(this);
    }

    /**
     * Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @param appConfig
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateAppResponse updateApp(
            AppConfig appConfig) throws Exception {
        return updateApp(appConfig, Optional.empty());
    }
    
    /**
     * Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @param appConfig
     * @param appId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateAppResponse updateApp(
            AppConfig appConfig,
            Optional<String> appId) throws Exception {
        UpdateAppRequest request =
            UpdateAppRequest
                .builder()
                .appConfig(appConfig)
                .appId(appId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateAppRequest.class,
                _baseUrl,
                "/apps/v2/apps/{appId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "appConfig",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "UpdateApp", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateApp",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateApp",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateAppResponse.Builder _resBuilder = 
            UpdateAppResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateAppResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Application _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Application>() {});
                _res.withApplication(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "500")) {
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
