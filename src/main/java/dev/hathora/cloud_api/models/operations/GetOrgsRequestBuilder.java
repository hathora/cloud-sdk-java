/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.models.errors.SDKError;
import dev.hathora.cloud_api.utils.LazySingletonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetOrgsRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetOrgs sdk;

    public GetOrgsRequestBuilder(SDKMethodInterfaces.MethodCallGetOrgs sdk) {
        this.sdk = sdk;
    }

    public GetOrgsResponse call() throws Exception {

        return sdk.getOrgsDirect();
    }
}
