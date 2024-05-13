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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 *  
 */
public class ManagementV1 implements
            MethodCallSendVerificationEmail {

    private final SDKConfiguration sdkConfiguration;

    ManagementV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public dev.hathora.cloud_api.models.operations.SendVerificationEmailRequestBuilder sendVerificationEmail() {
        return new dev.hathora.cloud_api.models.operations.SendVerificationEmailRequestBuilder(this);
    }

    public dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse sendVerificationEmail(
            dev.hathora.cloud_api.models.shared.VerificationEmailRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/management/v1/sendverificationemail");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<dev.hathora.cloud_api.models.shared.VerificationEmailRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "request", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("SendVerificationEmail", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "429", "4XX", "500", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("SendVerificationEmail", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("SendVerificationEmail", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("SendVerificationEmail", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse.Builder _resBuilder = 
            dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        dev.hathora.cloud_api.models.operations.SendVerificationEmailResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.VerificationEmailSuccess _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.VerificationEmailSuccess>() {});
                _res.withVerificationEmailSuccess(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "429", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.errors.ApiError _out = _mapper.readValue(
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
