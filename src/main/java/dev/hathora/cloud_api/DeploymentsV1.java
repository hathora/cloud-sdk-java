/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.hathora.cloud_api.models.errors.SDKError;
import dev.hathora.cloud_api.models.operations.SDKMethodInterfaces.*;
import dev.hathora.cloud_api.utils.HTTPClient;
import dev.hathora.cloud_api.utils.HTTPRequest;
import dev.hathora.cloud_api.utils.Hook.AfterErrorContextImpl;
import dev.hathora.cloud_api.utils.Hook.AfterSuccessContextImpl;
import dev.hathora.cloud_api.utils.Hook.BeforeRequestContextImpl;
import dev.hathora.cloud_api.utils.JSON;
import dev.hathora.cloud_api.utils.Retries.NonRetryableException;
import dev.hathora.cloud_api.utils.SerializedBody;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class DeploymentsV1 implements
            MethodCallCreateDeploymentDeprecated,
            MethodCallGetDeploymentInfoDeprecated,
            MethodCallGetDeploymentsDeprecated,
            MethodCallGetLatestDeploymentDeprecated {

    private final SDKConfiguration sdkConfiguration;

    DeploymentsV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedRequestBuilder createDeploymentDeprecated() {
        return new dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedRequestBuilder(this);
    }

    /**
     * Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.
     * @param deploymentConfig User specified deployment configuration for your application at runtime.
     * @param buildId
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedResponse createDeploymentDeprecated(
            dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig,
            int buildId) throws Exception {
        return createDeploymentDeprecated(deploymentConfig, Optional.empty(), buildId);
    }
    /**
     * Create a new [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment). Creating a new deployment means all new rooms created will use the latest deployment configuration, but existing games in progress will not be affected.
     * @param deploymentConfig User specified deployment configuration for your application at runtime.
     * @param appId
     * @param buildId
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedResponse createDeploymentDeprecated(
            dev.hathora.cloud_api.models.shared.DeploymentConfig deploymentConfig,
            Optional<? extends String> appId,
            int buildId) throws Exception {
        dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedRequest request =
            dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedRequest
                .builder()
                .deploymentConfig(deploymentConfig)
                .appId(appId)
                .buildId(buildId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedRequest.class,
                _baseUrl,
                "/deployments/v1/{appId}/create/{buildId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "deploymentConfig", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("CreateDeploymentDeprecated", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "422", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreateDeploymentDeprecated", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreateDeploymentDeprecated", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreateDeploymentDeprecated", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.CreateDeploymentDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.shared.Deployment _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.Deployment>() {});
                _res.withDeployment(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "422", "429", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.errors.ApiError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.errors.ApiError>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedRequestBuilder getDeploymentInfoDeprecated() {
        return new dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedRequestBuilder(this);
    }

    /**
     * Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).
     * @param deploymentId
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedResponse getDeploymentInfoDeprecated(
            int deploymentId) throws Exception {
        return getDeploymentInfoDeprecated(Optional.empty(), deploymentId);
    }
    /**
     * Get details for a [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment).
     * @param appId
     * @param deploymentId
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedResponse getDeploymentInfoDeprecated(
            Optional<? extends String> appId,
            int deploymentId) throws Exception {
        dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedRequest request =
            dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedRequest
                .builder()
                .appId(appId)
                .deploymentId(deploymentId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedRequest.class,
                _baseUrl,
                "/deployments/v1/{appId}/info/{deploymentId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("GetDeploymentInfoDeprecated", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetDeploymentInfoDeprecated", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetDeploymentInfoDeprecated", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetDeploymentInfoDeprecated", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.GetDeploymentInfoDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.shared.Deployment _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.Deployment>() {});
                _res.withDeployment(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.errors.ApiError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.errors.ApiError>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedRequestBuilder getDeploymentsDeprecated() {
        return new dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedRequestBuilder(this);
    }

    /**
     * Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedResponse getDeploymentsDeprecatedDirect() throws Exception {
        return getDeploymentsDeprecated(Optional.empty());
    }
    /**
     * Returns an array of [deployments](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appId
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedResponse getDeploymentsDeprecated(
            Optional<? extends String> appId) throws Exception {
        dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedRequest request =
            dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedRequest
                .builder()
                .appId(appId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedRequest.class,
                _baseUrl,
                "/deployments/v1/{appId}/list",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("GetDeploymentsDeprecated", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetDeploymentsDeprecated", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetDeploymentsDeprecated", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetDeploymentsDeprecated", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.GetDeploymentsDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                java.util.List<dev.hathora.cloud_api.models.shared.Deployment> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<dev.hathora.cloud_api.models.shared.Deployment>>() {});
                _res.withClasses(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.errors.ApiError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.errors.ApiError>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @return The call builder
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedRequestBuilder getLatestDeploymentDeprecated() {
        return new dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedRequestBuilder(this);
    }

    /**
     * Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedResponse getLatestDeploymentDeprecatedDirect() throws Exception {
        return getLatestDeploymentDeprecated(Optional.empty());
    }
    /**
     * Get the latest [deployment](https://hathora.dev/docs/concepts/hathora-entities#deployment) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appId
     * @return The response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedResponse getLatestDeploymentDeprecated(
            Optional<? extends String> appId) throws Exception {
        dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedRequest request =
            dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedRequest
                .builder()
                .appId(appId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedRequest.class,
                _baseUrl,
                "/deployments/v1/{appId}/latest",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("GetLatestDeploymentDeprecated", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetLatestDeploymentDeprecated", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetLatestDeploymentDeprecated", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetLatestDeploymentDeprecated", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.GetLatestDeploymentDeprecatedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.shared.Deployment _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.Deployment>() {});
                _res.withDeployment(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.errors.ApiError _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.errors.ApiError>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
