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
import org.apache.http.NameValuePair;

/**
 * Operations to create and manage [lobbies](https://hathora.dev/docs/concepts/hathora-entities#lobby).
 */
public class LobbyV2 {
	
	private SDKConfiguration sdkConfiguration;

	public LobbyV2(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a new [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) for an existing [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.CreateLobbyResponse createLobby(dev.hathora.cloud_api.models.operations.CreateLobbyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.CreateLobbyRequest.class, baseUrl, "/lobby/v2/{appId}/create", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "createLobbyRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.CreateLobbyRequest.class, request, null);
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

        dev.hathora.cloud_api.models.operations.CreateLobbyResponse res = new dev.hathora.cloud_api.models.operations.CreateLobbyResponse(contentType, httpRes.statusCode()) {{
            lobby = null;
            createLobby400ApplicationJSONString = null;
            createLobby401ApplicationJSONString = null;
            createLobby404ApplicationJSONString = null;
            createLobby422ApplicationJSONString = null;
            createLobby429ApplicationJSONString = null;
            createLobby500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby.class);
                res.lobby = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLobby400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLobby401ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLobby404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLobby422ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 429) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLobby429ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLobby500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse createLocalLobby(dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequest.class, baseUrl, "/lobby/v2/{appId}/create/local", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.CreateLocalLobbyRequest.class, request, null);
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

        dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse res = new dev.hathora.cloud_api.models.operations.CreateLocalLobbyResponse(contentType, httpRes.statusCode()) {{
            lobby = null;
            createLocalLobby400ApplicationJSONString = null;
            createLocalLobby401ApplicationJSONString = null;
            createLocalLobby404ApplicationJSONString = null;
            createLocalLobby422ApplicationJSONString = null;
            createLocalLobby429ApplicationJSONString = null;
            createLocalLobby500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby.class);
                res.lobby = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLocalLobby400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLocalLobby401ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLocalLobby404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLocalLobby422ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 429) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLocalLobby429ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createLocalLobby500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse createPrivateLobby(dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequest.class, baseUrl, "/lobby/v2/{appId}/create/private", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.CreatePrivateLobbyRequest.class, request, null);
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

        dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse res = new dev.hathora.cloud_api.models.operations.CreatePrivateLobbyResponse(contentType, httpRes.statusCode()) {{
            lobby = null;
            createPrivateLobby400ApplicationJSONString = null;
            createPrivateLobby401ApplicationJSONString = null;
            createPrivateLobby404ApplicationJSONString = null;
            createPrivateLobby422ApplicationJSONString = null;
            createPrivateLobby429ApplicationJSONString = null;
            createPrivateLobby500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby.class);
                res.lobby = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobby400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobby401ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobby404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobby422ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 429) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobby429ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPrivateLobby500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse createPublicLobby(dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequest.class, baseUrl, "/lobby/v2/{appId}/create/public", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.CreatePublicLobbyRequest.class, request, null);
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

        dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse res = new dev.hathora.cloud_api.models.operations.CreatePublicLobbyResponse(contentType, httpRes.statusCode()) {{
            lobby = null;
            createPublicLobby400ApplicationJSONString = null;
            createPublicLobby401ApplicationJSONString = null;
            createPublicLobby404ApplicationJSONString = null;
            createPublicLobby422ApplicationJSONString = null;
            createPublicLobby429ApplicationJSONString = null;
            createPublicLobby500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby.class);
                res.lobby = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobby400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobby401ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobby404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobby422ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 429) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobby429ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createPublicLobby500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Get details for an existing [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse getLobbyInfo(dev.hathora.cloud_api.models.operations.GetLobbyInfoRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.GetLobbyInfoRequest.class, baseUrl, "/lobby/v2/{appId}/info/{roomId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse res = new dev.hathora.cloud_api.models.operations.GetLobbyInfoResponse(contentType, httpRes.statusCode()) {{
            lobby = null;
            getLobbyInfo404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby.class);
                res.lobby = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getLobbyInfo404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Get all active [lobbies](https://hathora.dev/docs/concepts/hathora-entities#lobby) for a given [application](https://hathora.dev/docs/concepts/hathora-entities#application) using `appId`. Filter the array by optionally passing in a `region`.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse listActivePublicLobbies(dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesRequest.class, baseUrl, "/lobby/v2/{appId}/list/public", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse res = new dev.hathora.cloud_api.models.operations.ListActivePublicLobbiesResponse(contentType, httpRes.statusCode()) {{
            lobbies = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby[].class);
                res.lobbies = out;
            }
        }

        return res;
    }

    /**
     * Set the state of a [lobby](https://hathora.dev/docs/concepts/hathora-entities#lobby) using `appId` and `roomId`. State is intended to be set by the server and must be smaller than 1MB.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.SetLobbyStateResponse setLobbyState(dev.hathora.cloud_api.models.operations.SetLobbyStateRequest request, dev.hathora.cloud_api.models.operations.SetLobbyStateSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.SetLobbyStateRequest.class, baseUrl, "/lobby/v2/{appId}/setState/{roomId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "setLobbyStateRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.SetLobbyStateResponse res = new dev.hathora.cloud_api.models.operations.SetLobbyStateResponse(contentType, httpRes.statusCode()) {{
            lobby = null;
            setLobbyState404ApplicationJSONString = null;
            setLobbyState422ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Lobby out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Lobby.class);
                res.lobby = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.setLobbyState404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.setLobbyState422ApplicationJSONString = out;
            }
        }

        return res;
    }
}