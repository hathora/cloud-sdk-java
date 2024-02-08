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
import dev.hathora.cloud_api.utils.JSON;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Deprecated. Use [LobbyV3](https://hathora.dev/api#tag/LobbyV3).
 */
public class LobbyV1 implements
            MethodCallCreatePrivateLobbyDeprecated,
            MethodCallCreatePublicLobbyDeprecated,
            MethodCallListActivePublicLobbiesDeprecatedV1 {
    
    private final SDKConfiguration sdkConfiguration;

    LobbyV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequestBuilder createPrivateLobbyDeprecated() {
        return new dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequestBuilder(this);
    }

    /**
     * @param security the security details to use for authentication
     * @param appId
     * @param local
     * @param region
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse createPrivateLobbyDeprecated(
            dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedSecurity security,
            Optional<? extends String> appId,
            Optional<? extends Boolean> local,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) throws Exception {
        
        dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest request = 
            dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest
                .builder()
                .appId(appId)
                .local(local)
                .region(region)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest.class, 
                baseUrl, 
                "/lobby/v1/{appId}/create/private", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(
                dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest.class, request, this.sdkConfiguration.globals);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = Utils.toUtf8AndClose(httpRes.body());
                res.withRoomId(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 422 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.ApiError out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.ApiError>() {});
                res.withApiError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequestBuilder createPublicLobbyDeprecated() {
        return new dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequestBuilder(this);
    }

    /**
     * @param security the security details to use for authentication
     * @param appId
     * @param local
     * @param region
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse createPublicLobbyDeprecated(
            dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedSecurity security,
            Optional<? extends String> appId,
            Optional<? extends Boolean> local,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) throws Exception {
        
        dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest request = 
            dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest
                .builder()
                .appId(appId)
                .local(local)
                .region(region)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest.class, 
                baseUrl, 
                "/lobby/v1/{appId}/create/public", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(
                dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest.class, request, this.sdkConfiguration.globals);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = Utils.toUtf8AndClose(httpRes.body());
                res.withRoomId(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 422 || httpRes.statusCode() == 429 || httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.ApiError out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.ApiError>() {});
                res.withApiError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

    public dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1RequestBuilder listActivePublicLobbiesDeprecatedV1() {
        return new dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1RequestBuilder(this);
    }

    /**
     * @param appId
     * @param local
     * @param region
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Response listActivePublicLobbiesDeprecatedV1(
            Optional<? extends String> appId,
            Optional<? extends Boolean> local,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) throws Exception {
        
        dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Request request = 
            dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Request
                .builder()
                .appId(appId)
                .local(local)
                .region(region)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Request.class, 
                baseUrl, 
                "/lobby/v1/{appId}/list", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(
                dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Request.class, request, this.sdkConfiguration.globals);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Response.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Response
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedV1Response res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<dev.hathora.cloud_api.models.shared.Lobby> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<dev.hathora.cloud_api.models.shared.Lobby>>() {});
                res.withClasses(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.ApiError out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.ApiError>() {});
                res.withApiError(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
