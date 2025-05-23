/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.errors.ApiError;
import dev.hathora.cloud_sdk.models.errors.SDKError;
import dev.hathora.cloud_sdk.models.operations.GetFleetMetricsRequest;
import dev.hathora.cloud_sdk.models.operations.GetFleetMetricsRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetFleetMetricsResponse;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionRequest;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetFleetRegionResponse;
import dev.hathora.cloud_sdk.models.operations.GetFleetsRequest;
import dev.hathora.cloud_sdk.models.operations.GetFleetsRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.GetFleetsResponse;
import dev.hathora.cloud_sdk.models.operations.SDKMethodInterfaces.*;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionRequest;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRegionResponse;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRequest;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetRequestBuilder;
import dev.hathora.cloud_sdk.models.operations.UpdateFleetResponse;
import dev.hathora.cloud_sdk.models.shared.FleetMetricsData;
import dev.hathora.cloud_sdk.models.shared.FleetRegion;
import dev.hathora.cloud_sdk.models.shared.FleetsPage;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.models.shared.UpdateFleet;
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
 * Operations to manage and view a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet).
 */
public class FleetsV1 implements
            MethodCallGetFleetMetrics,
            MethodCallGetFleetRegion,
            MethodCallGetFleets,
            MethodCallUpdateFleet,
            MethodCallUpdateFleetRegion {

    private final SDKConfiguration sdkConfiguration;

    FleetsV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * GetFleetMetrics
     * 
     * <p>Gets metrics for a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
     * 
     * @return The call builder
     */
    public GetFleetMetricsRequestBuilder getFleetMetrics() {
        return new GetFleetMetricsRequestBuilder(this);
    }

    /**
     * GetFleetMetrics
     * 
     * <p>Gets metrics for a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFleetMetricsResponse getFleetMetrics(
            GetFleetMetricsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetFleetMetricsRequest.class,
                _baseUrl,
                "/fleets/v1/fleets/{fleetId}/regions/{region}/metrics",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetFleetMetricsRequest.class,
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
                      "GetFleetMetrics", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetFleetMetrics",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "GetFleetMetrics",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetFleetMetrics",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetFleetMetricsResponse.Builder _resBuilder = 
            GetFleetMetricsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetFleetMetricsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FleetMetricsData _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FleetMetricsData>() {});
                _res.withFleetMetricsData(Optional.ofNullable(_out));
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
     * GetFleetRegion
     * 
     * <p>Gets the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
     * 
     * @return The call builder
     */
    public GetFleetRegionRequestBuilder getFleetRegion() {
        return new GetFleetRegionRequestBuilder(this);
    }

    /**
     * GetFleetRegion
     * 
     * <p>Gets the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
     * 
     * @param fleetId 
     * @param region 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFleetRegionResponse getFleetRegion(
            String fleetId,
            Region region) throws Exception {
        return getFleetRegion(fleetId, Optional.empty(), region);
    }
    
    /**
     * GetFleetRegion
     * 
     * <p>Gets the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
     * 
     * @param fleetId 
     * @param orgId 
     * @param region 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFleetRegionResponse getFleetRegion(
            String fleetId,
            Optional<String> orgId,
            Region region) throws Exception {
        GetFleetRegionRequest request =
            GetFleetRegionRequest
                .builder()
                .fleetId(fleetId)
                .orgId(orgId)
                .region(region)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetFleetRegionRequest.class,
                _baseUrl,
                "/fleets/v1/fleets/{fleetId}/regions/{region}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetFleetRegionRequest.class,
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
                      "GetFleetRegion", 
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
                            "GetFleetRegion",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "GetFleetRegion",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetFleetRegion",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetFleetRegionResponse.Builder _resBuilder = 
            GetFleetRegionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetFleetRegionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FleetRegion _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FleetRegion>() {});
                _res.withFleetRegion(Optional.ofNullable(_out));
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
     * GetFleets
     * 
     * <p>Returns an array of [fleets](https://hathora.dev/docs/concepts/hathora-entities#fleet).
     * 
     * @return The call builder
     */
    public GetFleetsRequestBuilder getFleets() {
        return new GetFleetsRequestBuilder(this);
    }

    /**
     * GetFleets
     * 
     * <p>Returns an array of [fleets](https://hathora.dev/docs/concepts/hathora-entities#fleet).
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFleetsResponse getFleetsDirect() throws Exception {
        return getFleets(Optional.empty());
    }
    
    /**
     * GetFleets
     * 
     * <p>Returns an array of [fleets](https://hathora.dev/docs/concepts/hathora-entities#fleet).
     * 
     * @param orgId 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetFleetsResponse getFleets(
            Optional<String> orgId) throws Exception {
        GetFleetsRequest request =
            GetFleetsRequest
                .builder()
                .orgId(orgId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/fleets/v1/fleets");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetFleetsRequest.class,
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
                      "GetFleets", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetFleets",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "GetFleets",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "GetFleets",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetFleetsResponse.Builder _resBuilder = 
            GetFleetsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetFleetsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FleetsPage _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FleetsPage>() {});
                _res.withFleetsPage(Optional.ofNullable(_out));
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
     * UpdateFleet
     * 
     * <p>Updates a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet)'s configuration.
     * 
     * @return The call builder
     */
    public UpdateFleetRequestBuilder updateFleet() {
        return new UpdateFleetRequestBuilder(this);
    }

    /**
     * UpdateFleet
     * 
     * <p>Updates a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet)'s configuration.
     * 
     * @param updateFleet 
     * @param fleetId 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateFleetResponse updateFleet(
            UpdateFleet updateFleet,
            String fleetId) throws Exception {
        return updateFleet(updateFleet, fleetId, Optional.empty());
    }
    
    /**
     * UpdateFleet
     * 
     * <p>Updates a [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet)'s configuration.
     * 
     * @param updateFleet 
     * @param fleetId 
     * @param orgId 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateFleetResponse updateFleet(
            UpdateFleet updateFleet,
            String fleetId,
            Optional<String> orgId) throws Exception {
        UpdateFleetRequest request =
            UpdateFleetRequest
                .builder()
                .updateFleet(updateFleet)
                .fleetId(fleetId)
                .orgId(orgId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateFleetRequest.class,
                _baseUrl,
                "/fleets/v1/fleets/{fleetId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "updateFleet",
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
                UpdateFleetRequest.class,
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
                      "UpdateFleet", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "UpdateFleet",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "UpdateFleet",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "UpdateFleet",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateFleetResponse.Builder _resBuilder = 
            UpdateFleetResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateFleetResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
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
     * UpdateFleetRegion
     * 
     * <p>Updates the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
     * 
     * @return The call builder
     */
    public UpdateFleetRegionRequestBuilder updateFleetRegion() {
        return new UpdateFleetRegionRequestBuilder(this);
    }

    /**
     * UpdateFleetRegion
     * 
     * <p>Updates the configuration for a given [fleet](https://hathora.dev/docs/concepts/hathora-entities#fleet) in a region.
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateFleetRegionResponse updateFleetRegion(
            UpdateFleetRegionRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateFleetRegionRequest.class,
                _baseUrl,
                "/fleets/v1/fleets/{fleetId}/regions/{region}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<UpdateFleetRegionRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "fleetRegionConfig",
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
                UpdateFleetRegionRequest.class,
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
                      "UpdateFleetRegion", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "UpdateFleetRegion",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "UpdateFleetRegion",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "UpdateFleetRegion",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateFleetRegionResponse.Builder _resBuilder = 
            UpdateFleetRegionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateFleetRegionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
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
