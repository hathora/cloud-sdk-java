/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetPaymentMethodResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetPaymentMethodResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String getPaymentMethod404ApplicationJSONString;

    public GetPaymentMethodResponse withGetPaymentMethod404ApplicationJSONString(String getPaymentMethod404ApplicationJSONString) {
        this.getPaymentMethod404ApplicationJSONString = getPaymentMethod404ApplicationJSONString;
        return this;
    }
    
    
    public String getPaymentMethod500ApplicationJSONString;

    public GetPaymentMethodResponse withGetPaymentMethod500ApplicationJSONString(String getPaymentMethod500ApplicationJSONString) {
        this.getPaymentMethod500ApplicationJSONString = getPaymentMethod500ApplicationJSONString;
        return this;
    }
    
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.PaymentMethod paymentMethod;

    public GetPaymentMethodResponse withPaymentMethod(dev.hathora.cloud_api.models.shared.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetPaymentMethodResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetPaymentMethodResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetPaymentMethodResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
