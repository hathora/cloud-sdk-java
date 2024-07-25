/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 *  
 */
public class TokensV1 implements
            MethodCallCreateOrgToken,
            MethodCallGetOrgTokens,
            MethodCallRevokeOrgToken {

    private final SDKConfiguration sdkConfiguration;

    TokensV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create a new organization token.
     * @return The call builder
     */
    public dev.hathora.cloud_api.models.operations.CreateOrgTokenRequestBuilder createOrgToken() {
        return new dev.hathora.cloud_api.models.operations.CreateOrgTokenRequestBuilder(this);
    }

    /**
     * Create a new organization token.
     * @param createOrgToken
     * @param orgId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.CreateOrgTokenResponse createOrgToken(
            dev.hathora.cloud_api.models.shared.CreateOrgToken createOrgToken,
            String orgId) throws Exception {
        dev.hathora.cloud_api.models.operations.CreateOrgTokenRequest request =
            dev.hathora.cloud_api.models.operations.CreateOrgTokenRequest
                .builder()
                .createOrgToken(createOrgToken)
                .orgId(orgId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                dev.hathora.cloud_api.models.operations.CreateOrgTokenRequest.class,
                _baseUrl,
                "/tokens/v1/orgs/{orgId}/create",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "createOrgToken", "json", false);
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
                  new BeforeRequestContextImpl("CreateOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreateOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreateOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreateOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.CreateOrgTokenResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.CreateOrgTokenResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.CreateOrgTokenResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.shared.CreatedOrgToken _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.CreatedOrgToken>() {});
                _res.withCreatedOrgToken(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "422", "429")) {
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
     * List all organization tokens for a given org.
     * @return The call builder
     */
    public dev.hathora.cloud_api.models.operations.GetOrgTokensRequestBuilder getOrgTokens() {
        return new dev.hathora.cloud_api.models.operations.GetOrgTokensRequestBuilder(this);
    }

    /**
     * List all organization tokens for a given org.
     * @param orgId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.GetOrgTokensResponse getOrgTokens(
            String orgId) throws Exception {
        dev.hathora.cloud_api.models.operations.GetOrgTokensRequest request =
            dev.hathora.cloud_api.models.operations.GetOrgTokensRequest
                .builder()
                .orgId(orgId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetOrgTokensRequest.class,
                _baseUrl,
                "/tokens/v1/orgs/{orgId}",
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
                  new BeforeRequestContextImpl("GetOrgTokens", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetOrgTokens", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetOrgTokens", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetOrgTokens", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.GetOrgTokensResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.GetOrgTokensResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.GetOrgTokensResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                dev.hathora.cloud_api.models.shared.ListOrgTokens _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.ListOrgTokens>() {});
                _res.withListOrgTokens(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429")) {
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
     * Revoke an organization token.
     * @return The call builder
     */
    public dev.hathora.cloud_api.models.operations.RevokeOrgTokenRequestBuilder revokeOrgToken() {
        return new dev.hathora.cloud_api.models.operations.RevokeOrgTokenRequestBuilder(this);
    }

    /**
     * Revoke an organization token.
     * @param orgId
     * @param orgTokenId
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.RevokeOrgTokenResponse revokeOrgToken(
            String orgId,
            String orgTokenId) throws Exception {
        dev.hathora.cloud_api.models.operations.RevokeOrgTokenRequest request =
            dev.hathora.cloud_api.models.operations.RevokeOrgTokenRequest
                .builder()
                .orgId(orgId)
                .orgTokenId(orgTokenId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                dev.hathora.cloud_api.models.operations.RevokeOrgTokenRequest.class,
                _baseUrl,
                "/tokens/v1/orgs/{orgId}/tokens/{orgTokenId}/revoke",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("RevokeOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("RevokeOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("RevokeOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("RevokeOrgToken", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.RevokeOrgTokenResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.RevokeOrgTokenResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.RevokeOrgTokenResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                boolean _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Boolean>() {});
                _res.withBoolean(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "404", "429")) {
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
