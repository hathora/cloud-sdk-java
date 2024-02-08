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

public class CreateAppRequestBuilder {

    private dev.hathora.cloud_api.models.shared.AppConfig request;

    private final SDKMethodInterfaces.MethodCallCreateApp sdk;
    
    public CreateAppRequestBuilder(SDKMethodInterfaces.MethodCallCreateApp sdk) {
        this.sdk = sdk;
    }
             
    public CreateAppRequestBuilder request(dev.hathora.cloud_api.models.shared.AppConfig request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAppResponse call() throws Exception {
        return sdk.createApp(
            request);
    }
}