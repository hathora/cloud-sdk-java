/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.hathora.cloud_api.utils.HTTPClient;
import dev.hathora.cloud_api.utils.HTTPRequest;
import dev.hathora.cloud_api.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class LobbyV1 {
	
	private SDKConfiguration sdkConfiguration;

	public LobbyV1(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse createPrivateLobbyDeprecated(dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest.class, baseUrl, "/lobby/v1/{appId}/create/private", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = dev.hathora.cloud_api.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.CreatePrivateLobbyDeprecatedResponse(contentType, httpRes.statusCode()) {{
            roomId = null;
            createPrivateLobbyDeprecated400ApplicationJSONString = null;
            createPrivateLobbyDeprecated401ApplicationJSONString = null;
            createPrivateLobbyDeprecated404ApplicationJSONString = null;
            createPrivateLobbyDeprecated422ApplicationJSONString = null;
            createPrivateLobbyDeprecated429ApplicationJSONString = null;
            createPrivateLobbyDeprecated500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.roomId = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobbyDeprecated400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobbyDeprecated401ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobbyDeprecated404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobbyDeprecated422ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 429) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobbyDeprecated429ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobbyDeprecated500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse createPublicLobbyDeprecated(dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest.class, baseUrl, "/lobby/v1/{appId}/create/public", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = dev.hathora.cloud_api.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.CreatePublicLobbyDeprecatedResponse(contentType, httpRes.statusCode()) {{
            roomId = null;
            createPublicLobbyDeprecated400ApplicationJSONString = null;
            createPublicLobbyDeprecated401ApplicationJSONString = null;
            createPublicLobbyDeprecated404ApplicationJSONString = null;
            createPublicLobbyDeprecated422ApplicationJSONString = null;
            createPublicLobbyDeprecated429ApplicationJSONString = null;
            createPublicLobbyDeprecated500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.roomId = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobbyDeprecated400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobbyDeprecated401ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobbyDeprecated404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobbyDeprecated422ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 429) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobbyDeprecated429ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobbyDeprecated500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated method: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedResponse listActivePublicLobbiesDeprecated(dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedRequest.class, baseUrl, "/lobby/v1/{appId}/list", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = dev.hathora.cloud_api.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesDeprecatedResponse(contentType, httpRes.statusCode()) {{
            lobbies = null;
            listActivePublicLobbiesDeprecated401ApplicationJSONString = null;
            listActivePublicLobbiesDeprecated404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby[].class);
                res.lobbies = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.listActivePublicLobbiesDeprecated401ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.listActivePublicLobbiesDeprecated404ApplicationJSONString = out;
            }
        }

        return res;
    }
}