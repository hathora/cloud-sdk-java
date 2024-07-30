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


public class GetOrgTokensRequestBuilder {

    private String orgId;
    private final SDKMethodInterfaces.MethodCallGetOrgTokens sdk;

    public GetOrgTokensRequestBuilder(SDKMethodInterfaces.MethodCallGetOrgTokens sdk) {
        this.sdk = sdk;
    }

    public GetOrgTokensRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetOrgTokensResponse call() throws Exception {

        return sdk.getOrgTokens(
            orgId);
    }
}
