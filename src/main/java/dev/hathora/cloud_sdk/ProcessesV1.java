/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetProcessInfoDeprecatedRequest;
import dev.hathora.cloud_sdk.models.operations.GetProcessInfoDeprecatedRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetProcessInfoDeprecatedResponse;
import dev.hathora.cloud_sdk.models.operations.GetRunningProcessesRequest;
import dev.hathora.cloud_sdk.models.operations.GetRunningProcessesRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetRunningProcessesResponse;
import dev.hathora.cloud_sdk.models.operations.GetStoppedProcessesRequest;
import dev.hathora.cloud_sdk.models.operations.GetStoppedProcessesRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetStoppedProcessesResponse;
import dev.hathora.cloud_sdk.models.operations.SDKMethodInterfaces.*;
import dev.hathora.cloud_sdk.models.shared.Process;
import dev.hathora.cloud_sdk.models.shared.ProcessWithRooms;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.HTTPRequest;
import dev.hathora.cloud_sdk.utils.Hook.AfterErrorContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.AfterSuccessContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.BeforeRequestContextImpl;
import dev.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

 

/**
 * Deprecated. Use [ProcessesV3](https://hathora.dev/api#tag/ProcessesV3).
 */
public class ProcessesV1 implements
            MethodCallGetProcessInfoDeprecated,
            MethodCallGetRunningProcesses,
            MethodCallGetStoppedProcesses {

    private final SDKConfiguration sdkConfiguration;

    ProcessesV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * GetProcessInfoDeprecated
     * 
     * <p>Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetProcessInfoDeprecatedRequestBuilder getProcessInfoDeprecated() {
        return new GetProcessInfoDeprecatedRequestBuilder(this);
    }

    /**
     * GetProcessInfoDeprecated
     * 
     * <p>Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).
     * 
     * @param processId 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetProcessInfoDeprecatedResponse getProcessInfoDeprecated(
            String processId) throws Exception {
        return getProcessInfoDeprecated(Optional.empty(), processId);
    }
    
    /**
     * GetProcessInfoDeprecated
     * 
     * <p>Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).
     * 
     * @param appId 
     * @param processId 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetProcessInfoDeprecatedResponse getProcessInfoDeprecated(
            Optional<String> appId,
            String processId) throws Exception {
        GetProcessInfoDeprecatedRequest request =
            GetProcessInfoDeprecatedRequest
                .builder()
                .appId(appId)
                .processId(processId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetProcessInfoDeprecatedRequest.class,
                _baseUrl,
                "/processes/v1/{appId}/info/{processId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "GetProcessInfoDeprecated", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetProcessInfoDeprecated",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "GetProcessInfoDeprecated",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetProcessInfoDeprecated",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetProcessInfoDeprecatedResponse.Builder _resBuilder = 
            GetProcessInfoDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetProcessInfoDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Process _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Process>() {});
                _res.withProcess(Optional.ofNullable(_out));
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
     * GetRunningProcesses
     * 
     * <p>Retrieve 10 most recently started [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetRunningProcessesRequestBuilder getRunningProcesses() {
        return new GetRunningProcessesRequestBuilder(this);
    }

    /**
     * GetRunningProcesses
     * 
     * <p>Retrieve 10 most recently started [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetRunningProcessesResponse getRunningProcessesDirect() throws Exception {
        return getRunningProcesses(Optional.empty(), Optional.empty());
    }
    
    /**
     * GetRunningProcesses
     * 
     * <p>Retrieve 10 most recently started [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * 
     * @param appId 
     * @param region 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetRunningProcessesResponse getRunningProcesses(
            Optional<String> appId,
            Optional<? extends Region> region) throws Exception {
        GetRunningProcessesRequest request =
            GetRunningProcessesRequest
                .builder()
                .appId(appId)
                .region(region)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetRunningProcessesRequest.class,
                _baseUrl,
                "/processes/v1/{appId}/list/running",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetRunningProcessesRequest.class,
                request, 
                this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "GetRunningProcesses", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetRunningProcesses",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "GetRunningProcesses",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetRunningProcesses",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetRunningProcessesResponse.Builder _resBuilder = 
            GetRunningProcessesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetRunningProcessesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<ProcessWithRooms> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<ProcessWithRooms>>() {});
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429")) {
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
     * GetStoppedProcesses
     * 
     * <p>Retrieve 10 most recently stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * 
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetStoppedProcessesRequestBuilder getStoppedProcesses() {
        return new GetStoppedProcessesRequestBuilder(this);
    }

    /**
     * GetStoppedProcesses
     * 
     * <p>Retrieve 10 most recently stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetStoppedProcessesResponse getStoppedProcessesDirect() throws Exception {
        return getStoppedProcesses(Optional.empty(), Optional.empty());
    }
    
    /**
     * GetStoppedProcesses
     * 
     * <p>Retrieve 10 most recently stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * 
     * @param appId 
     * @param region 
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public GetStoppedProcessesResponse getStoppedProcesses(
            Optional<String> appId,
            Optional<? extends Region> region) throws Exception {
        GetStoppedProcessesRequest request =
            GetStoppedProcessesRequest
                .builder()
                .appId(appId)
                .region(region)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetStoppedProcessesRequest.class,
                _baseUrl,
                "/processes/v1/{appId}/list/stopped",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetStoppedProcessesRequest.class,
                request, 
                this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "GetStoppedProcesses", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetStoppedProcesses",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "GetStoppedProcesses",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetStoppedProcesses",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetStoppedProcessesResponse.Builder _resBuilder = 
            GetStoppedProcessesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetStoppedProcessesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Process> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Process>>() {});
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429")) {
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
