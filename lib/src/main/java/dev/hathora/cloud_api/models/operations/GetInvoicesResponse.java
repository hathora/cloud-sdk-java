/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetInvoicesResponse {
    
    public String contentType;

    public GetInvoicesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public String getInvoices404ApplicationJSONString;

    public GetInvoicesResponse withGetInvoices404ApplicationJSONString(String getInvoices404ApplicationJSONString) {
        this.getInvoices404ApplicationJSONString = getInvoices404ApplicationJSONString;
        return this;
    }
    
    /**
     * Ok
     */
    
    public dev.hathora.cloud_api.models.shared.Invoice[] invoices;

    public GetInvoicesResponse withInvoices(dev.hathora.cloud_api.models.shared.Invoice[] invoices) {
        this.invoices = invoices;
        return this;
    }
    
    
    public Integer statusCode;

    public GetInvoicesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetInvoicesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetInvoicesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
