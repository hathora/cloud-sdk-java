/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.hathora.cloud_api.utils.HTTPClient;
import dev.hathora.cloud_api.utils.HTTPRequest;
import dev.hathora.cloud_api.utils.JSON;
import dev.hathora.cloud_api.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

/**
 * Operations that allow you manage your [applications](https://hathora.dev/docs/concepts/hathora-entities#application).
 */
public class AppV1 {
	
	private SDKConfiguration sdkConfiguration;

	public AppV1(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a new [application](https://hathora.dev/docs/concepts/hathora-entities#application).
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.CreateAppResponse createApp(dev.hathora.cloud_api.models.shared.AppConfig request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(baseUrl, "/apps/v1/create");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.CreateAppResponse res = new dev.hathora.cloud_api.models.operations.CreateAppResponse(contentType, httpRes.statusCode()) {{
            application = null;
            createApp422ApplicationJSONString = null;
            createApp500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Application out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Application.class);
                res.application = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createApp422ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createApp500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Delete an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Your organization will lose access to this application.
     * @param appId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.DeleteAppResponse deleteApp(String appId) throws Exception {
        dev.hathora.cloud_api.models.operations.DeleteAppRequest request = new dev.hathora.cloud_api.models.operations.DeleteAppRequest(appId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.DeleteAppRequest.class, baseUrl, "/apps/v1/delete/{appId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.DeleteAppResponse res = new dev.hathora.cloud_api.models.operations.DeleteAppResponse(contentType, httpRes.statusCode()) {{
            deleteApp404ApplicationJSONString = null;
            deleteApp500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.deleteApp404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.deleteApp500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Get details for an [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @param appId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.GetAppInfoResponse getAppInfo(String appId) throws Exception {
        dev.hathora.cloud_api.models.operations.GetAppInfoRequest request = new dev.hathora.cloud_api.models.operations.GetAppInfoRequest(appId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.GetAppInfoRequest.class, baseUrl, "/apps/v1/info/{appId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetAppInfoResponse res = new dev.hathora.cloud_api.models.operations.GetAppInfoResponse(contentType, httpRes.statusCode()) {{
            application = null;
            getAppInfo404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Application out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Application.class);
                res.application = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getAppInfo404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Returns an unsorted list of your organization’s [applications](https://hathora.dev/docs/concepts/hathora-entities#application). An application is uniquely identified by an `appId`.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.GetAppsResponse getApps() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(baseUrl, "/apps/v1/list");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetAppsResponse res = new dev.hathora.cloud_api.models.operations.GetAppsResponse(contentType, httpRes.statusCode()) {{
            applicationWithDeployments = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.ApplicationWithDeployment[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.ApplicationWithDeployment[].class);
                res.applicationWithDeployments = out;
            }
        }

        return res;
    }

    /**
     * Update data for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @param appConfig
     * @param appId
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.UpdateAppResponse updateApp(dev.hathora.cloud_api.models.shared.AppConfig appConfig, String appId) throws Exception {
        dev.hathora.cloud_api.models.operations.UpdateAppRequest request = new dev.hathora.cloud_api.models.operations.UpdateAppRequest(appConfig, appId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.UpdateAppRequest.class, baseUrl, "/apps/v1/update/{appId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "appConfig", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.UpdateAppResponse res = new dev.hathora.cloud_api.models.operations.UpdateAppResponse(contentType, httpRes.statusCode()) {{
            application = null;
            updateApp404ApplicationJSONString = null;
            updateApp500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Application out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Application.class);
                res.application = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.updateApp404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.updateApp500ApplicationJSONString = out;
            }
        }

        return res;
    }
}