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
import dev.hathora.cloud_api.utils.SerializedBody;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Operations that allow you create and manage your [builds](https://hathora.dev/docs/concepts/hathora-entities#build).
 */
public class BuildV1 implements
            MethodCallCreateBuild,
            MethodCallDeleteBuild,
            MethodCallGetBuildInfo,
            MethodCallGetBuilds,
            MethodCallRunBuild {
    
    private final SDKConfiguration sdkConfiguration;

    BuildV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public dev.hathora.cloud_api.models.operations.CreateBuildRequestBuilder createBuild() {
        return new dev.hathora.cloud_api.models.operations.CreateBuildRequestBuilder(this);
    }

    /**
     * Creates a new [build](https://hathora.dev/docs/concepts/hathora-entities#build). Responds with a `buildId` that you must pass to [`RunBuild()`](https://hathora.dev/api#tag/BuildV1/operation/RunBuild) to build the game server artifact. You can optionally pass in a `buildTag` to associate an external version with a build.
     * @param createBuildParams
     * @param appId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.CreateBuildResponse createBuild(
            dev.hathora.cloud_api.models.shared.CreateBuildParams createBuildParams,
            Optional<? extends String> appId) throws Exception {
        
        dev.hathora.cloud_api.models.operations.CreateBuildRequest request = 
            dev.hathora.cloud_api.models.operations.CreateBuildRequest
                .builder()
                .createBuildParams(createBuildParams)
                .appId(appId)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.CreateBuildRequest.class, 
                baseUrl, 
                "/builds/v1/{appId}/create", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(
                request, "createBuildParams", "json", false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.CreateBuildResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.CreateBuildResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.CreateBuildResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 201) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Build out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.Build>() {});
                res.withBuild(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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

    public dev.hathora.cloud_api.models.operations.DeleteBuildRequestBuilder deleteBuild() {
        return new dev.hathora.cloud_api.models.operations.DeleteBuildRequestBuilder(this);
    }

    /**
     * Delete a [build](https://hathora.dev/docs/concepts/hathora-entities#build). All associated metadata is deleted.
     * @param appId
     * @param buildId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.DeleteBuildResponse deleteBuild(
            Optional<? extends String> appId,
            int buildId) throws Exception {
        
        dev.hathora.cloud_api.models.operations.DeleteBuildRequest request = 
            dev.hathora.cloud_api.models.operations.DeleteBuildRequest
                .builder()
                .appId(appId)
                .buildId(buildId)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.DeleteBuildRequest.class, 
                baseUrl, 
                "/builds/v1/{appId}/delete/{buildId}", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.DeleteBuildResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.DeleteBuildResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.DeleteBuildResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 204) {
        } else if (httpRes.statusCode() == 404 || httpRes.statusCode() == 422 || httpRes.statusCode() == 500) {
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

    public dev.hathora.cloud_api.models.operations.GetBuildInfoRequestBuilder getBuildInfo() {
        return new dev.hathora.cloud_api.models.operations.GetBuildInfoRequestBuilder(this);
    }

    /**
     * Get details for a [build](https://hathora.dev/docs/concepts/hathora-entities#build).
     * @param appId
     * @param buildId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.GetBuildInfoResponse getBuildInfo(
            Optional<? extends String> appId,
            int buildId) throws Exception {
        
        dev.hathora.cloud_api.models.operations.GetBuildInfoRequest request = 
            dev.hathora.cloud_api.models.operations.GetBuildInfoRequest
                .builder()
                .appId(appId)
                .buildId(buildId)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetBuildInfoRequest.class, 
                baseUrl, 
                "/builds/v1/{appId}/info/{buildId}", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetBuildInfoResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.GetBuildInfoResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.GetBuildInfoResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Build out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.Build>() {});
                res.withBuild(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 404) {
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

    public dev.hathora.cloud_api.models.operations.GetBuildsRequestBuilder getBuilds() {
        return new dev.hathora.cloud_api.models.operations.GetBuildsRequestBuilder(this);
    }

    /**
     * Returns an array of [builds](https://hathora.dev/docs/concepts/hathora-entities#build) for an [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param appId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.GetBuildsResponse getBuilds(
            Optional<? extends String> appId) throws Exception {
        
        dev.hathora.cloud_api.models.operations.GetBuildsRequest request = 
            dev.hathora.cloud_api.models.operations.GetBuildsRequest
                .builder()
                .appId(appId)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetBuildsRequest.class, 
                baseUrl, 
                "/builds/v1/{appId}/list", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetBuildsResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.GetBuildsResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.GetBuildsResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<dev.hathora.cloud_api.models.shared.Build> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<dev.hathora.cloud_api.models.shared.Build>>() {});
                res.withClasses(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 404) {
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

    public dev.hathora.cloud_api.models.operations.RunBuildRequestBuilder runBuild() {
        return new dev.hathora.cloud_api.models.operations.RunBuildRequestBuilder(this);
    }

    /**
     * Builds a game server artifact from a tarball you provide. Pass in the `buildId` generated from [`CreateBuild()`](https://hathora.dev/api#tag/BuildV1/operation/CreateBuild).
     * @param requestBody
     * @param appId
     * @param buildId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.RunBuildResponse runBuild(
            dev.hathora.cloud_api.models.operations.RunBuildRequestBody requestBody,
            Optional<? extends String> appId,
            int buildId) throws Exception {
        
        dev.hathora.cloud_api.models.operations.RunBuildRequest request = 
            dev.hathora.cloud_api.models.operations.RunBuildRequest
                .builder()
                .requestBody(requestBody)
                .appId(appId)
                .buildId(buildId)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.RunBuildRequest.class, 
                baseUrl, 
                "/builds/v1/{appId}/run/{buildId}", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(
                request, "requestBody", "multipart", false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, text/plain;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(
                this.sdkConfiguration.defaultClient, this.sdkConfiguration.securitySource.getSecurity());
        
        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
                .headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.RunBuildResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.RunBuildResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.RunBuildResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "text/plain")) {
                String out = Utils.toUtf8AndClose(httpRes.body());
                res.withRes(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        } else if (httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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
