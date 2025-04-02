/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.DownloadLogForProcessRequest;
import dev.hathora.cloud_sdk.models.operations.DownloadLogForProcessRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.DownloadLogForProcessResponse;
import dev.hathora.cloud_sdk.models.operations.GetLogsForProcessRequest;
import dev.hathora.cloud_sdk.models.operations.GetLogsForProcessRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetLogsForProcessResponse;
import dev.hathora.cloud_sdk.models.operations.SDKMethodInterfaces.*;
import dev.hathora.cloud_sdk.utils.HTTPClient;
import dev.hathora.cloud_sdk.utils.HTTPRequest;
import dev.hathora.cloud_sdk.utils.Hook.AfterErrorContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.AfterSuccessContextImpl;
import dev.hathora.cloud_sdk.utils.Hook.BeforeRequestContextImpl;
import dev.hathora.cloud_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

 

public class LogsV1 implements
            MethodCallDownloadLogForProcess,
            MethodCallGetLogsForProcess {

    private final SDKConfiguration sdkConfiguration;

    LogsV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * DownloadLogForProcess
     * 
     * <p>Download entire log file for a stopped process.
     * 
     * @return The call builder
     */
    public DownloadLogForProcessRequestBuilder downloadLogForProcess() {
        return new DownloadLogForProcessRequestBuilder(this);
    }

    /**
     * DownloadLogForProcess
     * 
     * <p>Download entire log file for a stopped process.
     * 
     * @param processId 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DownloadLogForProcessResponse downloadLogForProcess(
            String processId) throws Exception {
        return downloadLogForProcess(Optional.empty(), processId);
    }
    
    /**
     * DownloadLogForProcess
     * 
     * <p>Download entire log file for a stopped process.
     * 
     * @param appId 
     * @param processId 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DownloadLogForProcessResponse downloadLogForProcess(
            Optional<String> appId,
            String processId) throws Exception {
        DownloadLogForProcessRequest request =
            DownloadLogForProcessRequest
                .builder()
                .appId(appId)
                .processId(processId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                DownloadLogForProcessRequest.class,
                _baseUrl,
                "/logs/v1/{appId}/process/{processId}/download",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/octet-stream")
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
                      "DownloadLogForProcess", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "410", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "DownloadLogForProcess",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "DownloadLogForProcess",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "DownloadLogForProcess",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DownloadLogForProcessResponse.Builder _resBuilder = 
            DownloadLogForProcessResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
            _resBuilder.responseStream(_httpRes.body());
        }

        DownloadLogForProcessResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "410", "429")) {
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
     * GetLogsForProcess
     * 
     * <p>Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     * 
     * @return The call builder
     */
    public GetLogsForProcessRequestBuilder getLogsForProcess() {
        return new GetLogsForProcessRequestBuilder(this);
    }

    /**
     * GetLogsForProcess
     * 
     * <p>Returns a stream of logs for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetLogsForProcessResponse getLogsForProcess(
            GetLogsForProcessRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetLogsForProcessRequest.class,
                _baseUrl,
                "/logs/v1/{appId}/process/{processId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/octet-stream")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetLogsForProcessRequest.class,
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
                      "GetLogsForProcess", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "408", "410", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetLogsForProcess",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "GetLogsForProcess",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetLogsForProcess",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetLogsForProcessResponse.Builder _resBuilder = 
            GetLogsForProcessResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
            _resBuilder.responseStream(_httpRes.body());
        }

        GetLogsForProcessResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "408", "410", "429")) {
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

}
