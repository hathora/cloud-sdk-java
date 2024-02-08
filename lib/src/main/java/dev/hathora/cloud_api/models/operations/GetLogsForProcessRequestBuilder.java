/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.utils.Utils;
import dev.hathora.cloud_api.utils.LazySingletonValue;

public class GetLogsForProcessRequestBuilder {

    private GetLogsForProcessRequest request;

    private final SDKMethodInterfaces.MethodCallGetLogsForProcess sdk;
    
    public GetLogsForProcessRequestBuilder(SDKMethodInterfaces.MethodCallGetLogsForProcess sdk) {
        this.sdk = sdk;
    }
             
    public GetLogsForProcessRequestBuilder request(GetLogsForProcessRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetLogsForProcessResponse call() throws Exception {
        return sdk.getLogsForProcess(
            request);
    }
}