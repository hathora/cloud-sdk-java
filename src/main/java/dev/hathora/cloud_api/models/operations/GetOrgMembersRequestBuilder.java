/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class GetOrgMembersRequestBuilder {

    private String orgId;
    private final SDKMethodInterfaces.MethodCallGetOrgMembers sdk;

    public GetOrgMembersRequestBuilder(SDKMethodInterfaces.MethodCallGetOrgMembers sdk) {
        this.sdk = sdk;
    }

    public GetOrgMembersRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public GetOrgMembersResponse call() throws Exception {

        return sdk.getOrgMembers(
            orgId);
    }
}
