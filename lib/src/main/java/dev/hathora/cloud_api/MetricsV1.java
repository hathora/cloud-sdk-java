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

/**
 * Operations to get metrics by [process](https://hathora.dev/docs/concepts/hathora-entities#process). We store 72 hours of metrics data.
 */
public class MetricsV1 {
	
	private SDKConfiguration sdkConfiguration;

	public MetricsV1(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get metrics for a [process](https://hathora.dev/docs/concepts/hathora-entities#process) using `appId` and `processId`.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.hathora.cloud_api.models.operations.GetMetricsResponse getMetrics(dev.hathora.cloud_api.models.operations.GetMetricsRequest request, dev.hathora.cloud_api.models.operations.GetMetricsSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.hathora.cloud_api.utils.Utils.generateURL(dev.hathora.cloud_api.models.operations.GetMetricsRequest.class, baseUrl, "/metrics/v1/{appId}/process/{processId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.hathora.cloud_api.utils.Utils.getQueryParams(dev.hathora.cloud_api.models.operations.GetMetricsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = dev.hathora.cloud_api.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.hathora.cloud_api.models.operations.GetMetricsResponse res = new dev.hathora.cloud_api.models.operations.GetMetricsResponse(contentType, httpRes.statusCode()) {{
            metricsResponse = null;
            getMetrics404ApplicationJSONString = null;
            getMetrics422ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.hathora.cloud_api.models.shared.MetricsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.hathora.cloud_api.models.shared.MetricsResponse.class);
                res.metricsResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getMetrics404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (dev.hathora.cloud_api.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getMetrics422ApplicationJSONString = out;
            }
        }

        return res;
    }
}