/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.LazySingletonValue;
import dev.hathora.cloud_api.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class RevokeOrgTokenRequestBuilder {

    private String orgId;
    private String orgTokenId;
    private final SDKMethodInterfaces.MethodCallRevokeOrgToken sdk;

    public RevokeOrgTokenRequestBuilder(SDKMethodInterfaces.MethodCallRevokeOrgToken sdk) {
        this.sdk = sdk;
    }

    public RevokeOrgTokenRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public RevokeOrgTokenRequestBuilder orgTokenId(String orgTokenId) {
        Utils.checkNotNull(orgTokenId, "orgTokenId");
        this.orgTokenId = orgTokenId;
        return this;
    }

    public RevokeOrgTokenResponse call() throws Exception {

        return sdk.revokeOrgToken(
            orgId,
            orgTokenId);
    }
}
