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

public class GetAppsRequestBuilder {


    private final SDKMethodInterfaces.MethodCallGetApps sdk;
    
    public GetAppsRequestBuilder(SDKMethodInterfaces.MethodCallGetApps sdk) {
        this.sdk = sdk;
    }

    public GetAppsResponse call() throws Exception {
        return sdk.getAppsDirect();
    }
}