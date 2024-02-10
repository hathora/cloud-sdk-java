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
import java.time.OffsetDateTime;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Deprecated. Use [ProcessesV2](https://hathora.dev/api#tag/ProcessesV2).
 */
public class ProcessesV1 implements
            MethodCallGetProcessInfoDeprecated,
            MethodCallGetRunningProcesses,
            MethodCallGetStoppedProcesses {
    
    private final SDKConfiguration sdkConfiguration;

    ProcessesV1(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    public dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedRequestBuilder getProcessInfoDeprecated() {
        return new dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedRequestBuilder(this);
    }

    /**
     * Get details for a [process](https://hathora.dev/docs/concepts/hathora-entities#process).
     * @param appId
     * @param processId
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedResponse getProcessInfoDeprecated(
            Optional<? extends String> appId,
            String processId) throws Exception {
        
        dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedRequest request = 
            dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedRequest
                .builder()
                .appId(appId)
                .processId(processId)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedRequest.class, 
                baseUrl, 
                "/processes/v1/{appId}/info/{processId}", 
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
        dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.GetProcessInfoDeprecatedResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Process out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<dev.hathora.cloud_api.models.shared.Process>() {});
                res.withProcess(java.util.Optional.ofNullable(out));
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

    public dev.hathora.cloud_api.models.operations.GetRunningProcessesRequestBuilder getRunningProcesses() {
        return new dev.hathora.cloud_api.models.operations.GetRunningProcessesRequestBuilder(this);
    }

    /**
     * Retrieve 10 most recently started [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * @param appId
     * @param region
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetRunningProcessesResponse getRunningProcesses(
            Optional<? extends String> appId,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) throws Exception {
        
        dev.hathora.cloud_api.models.operations.GetRunningProcessesRequest request = 
            dev.hathora.cloud_api.models.operations.GetRunningProcessesRequest
                .builder()
                .appId(appId)
                .region(region)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetRunningProcessesRequest.class, 
                baseUrl, 
                "/processes/v1/{appId}/list/running", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(
                dev.hathora.cloud_api.models.operations.GetRunningProcessesRequest.class, request, this.sdkConfiguration.globals);
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
        dev.hathora.cloud_api.models.operations.GetRunningProcessesResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.GetRunningProcessesResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.GetRunningProcessesResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<dev.hathora.cloud_api.models.shared.ProcessWithRooms> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<dev.hathora.cloud_api.models.shared.ProcessWithRooms>>() {});
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

    public dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequestBuilder getStoppedProcesses() {
        return new dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequestBuilder(this);
    }

    /**
     * Retrieve 10 most recently stopped [process](https://hathora.dev/docs/concepts/hathora-entities#process) objects for an [application](https://hathora.dev/docs/concepts/hathora-entities#application). Filter the array by optionally passing in a `region`.
     * @param appId
     * @param region
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetStoppedProcessesResponse getStoppedProcesses(
            Optional<? extends String> appId,
            Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) throws Exception {
        
        dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequest request = 
            dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequest
                .builder()
                .appId(appId)
                .region(region)
                .build();
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(
                dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequest.class, 
                baseUrl, 
                "/processes/v1/{appId}/list/stopped", 
                request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(
                dev.hathora.cloud_api.models.operations.GetStoppedProcessesRequest.class, request, this.sdkConfiguration.globals);
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
        dev.hathora.cloud_api.models.operations.GetStoppedProcessesResponse.Builder resBuilder = 
            dev.hathora.cloud_api.models.operations.GetStoppedProcessesResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        dev.hathora.cloud_api.models.operations.GetStoppedProcessesResponse res = resBuilder.build();

        res.withRawResponse(httpRes);
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.List<dev.hathora.cloud_api.models.shared.Process> out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<java.util.List<dev.hathora.cloud_api.models.shared.Process>>() {});
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

}
