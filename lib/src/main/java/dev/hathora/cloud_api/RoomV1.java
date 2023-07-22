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
import org.apache.http.NameValuePair;

public class RoomV1 {
	
	private SDKConfiguration sdkConfiguration;

	public RoomV1(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedResponse createRoomDeprecated(dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedRequest request, dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedRequest.class, baseUrl, "/rooms/v1/{appId}/create", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.hathora.cloud_api.utils.Utils.serializeRequestBody(request, "createRoomRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.8, application/json;q=0.6, application/json;q=0.4, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.CreateRoomDeprecatedResponse(contentType, httpRes.statusCode()) {{
            roomId = null;
            createRoomDeprecated400ApplicationJSONString = null;
            createRoomDeprecated403ApplicationJSONString = null;
            createRoomDeprecated404ApplicationJSONString = null;
            createRoomDeprecated500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.roomId = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createRoomDeprecated400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createRoomDeprecated403ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createRoomDeprecated404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.createRoomDeprecated500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedResponse destroyRoomDeprecated(dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedRequest request, dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedRequest.class, baseUrl, "/rooms/v1/{appId}/destroy/{roomId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.DestroyRoomDeprecatedResponse(contentType, httpRes.statusCode()) {{
            destroyRoomDeprecated404ApplicationJSONString = null;
            destroyRoomDeprecated500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.destroyRoomDeprecated404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.destroyRoomDeprecated500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedResponse getActiveRoomsForProcessDeprecated(dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedRequest request, dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedRequest.class, baseUrl, "/rooms/v1/{appId}/list/{processId}/active", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.GetActiveRoomsForProcessDeprecatedResponse(contentType, httpRes.statusCode()) {{
            roomWithoutAllocations = null;
            getActiveRoomsForProcessDeprecated404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.RoomWithoutAllocations[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.RoomWithoutAllocations[].class);
                res.roomWithoutAllocations = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getActiveRoomsForProcessDeprecated404ApplicationJSONString = out;
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
    public dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedResponse getConnectionInfoDeprecated(dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedRequest.class, baseUrl, "/rooms/v1/{appId}/connectioninfo/{roomId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.8, application/json;q=0.5, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.GetConnectionInfoDeprecatedResponse(contentType, httpRes.statusCode()) {{
            connectionInfo = null;
            getConnectionInfoDeprecated400ApplicationJSONString = null;
            getConnectionInfoDeprecated404ApplicationJSONString = null;
            getConnectionInfoDeprecated500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.connectionInfo = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getConnectionInfoDeprecated400ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getConnectionInfoDeprecated404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getConnectionInfoDeprecated500ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedResponse getInactiveRoomsForProcessDeprecated(dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedRequest request, dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedRequest.class, baseUrl, "/rooms/v1/{appId}/list/{processId}/inactive", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.GetInactiveRoomsForProcessDeprecatedResponse(contentType, httpRes.statusCode()) {{
            roomWithoutAllocations = null;
            getInactiveRoomsForProcessDeprecated404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.RoomWithoutAllocations[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.RoomWithoutAllocations[].class);
                res.roomWithoutAllocations = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getInactiveRoomsForProcessDeprecated404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedResponse getRoomInfoDeprecated(dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedRequest request, dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedRequest.class, baseUrl, "/rooms/v1/{appId}/info/{roomId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.GetRoomInfoDeprecatedResponse(contentType, httpRes.statusCode()) {{
            room = null;
            getRoomInfoDeprecated404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.Room out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.Room.class);
                res.room = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getRoomInfoDeprecated404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     * @deprecated this method will be removed in a future release, please migrate away from it as soon as possible
     */
    @Deprecated
    public dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse suspendRoomDeprecated(dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedRequest request, dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedRequest.class, baseUrl, "/rooms/v1/{appId}/suspend/{roomId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse res = new dev.hathora.cloud_api.models.operations.SuspendRoomDeprecatedResponse(contentType, httpRes.statusCode()) {{
            suspendRoomDeprecated404ApplicationJSONString = null;
            suspendRoomDeprecated500ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.suspendRoomDeprecated404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.suspendRoomDeprecated500ApplicationJSONString = out;
            }
        }

        return res;
    }
}