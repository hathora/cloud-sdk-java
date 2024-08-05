/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hathora.cloud_sdk.models.errors.SDKError;
import com.hathora.cloud_sdk.utils.LazySingletonValue;
import com.hathora.cloud_sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class RescindInviteRequestBuilder {

    private com.hathora.cloud_sdk.models.shared.RescindUserInvite rescindUserInvite;
    private String orgId;
    private final SDKMethodInterfaces.MethodCallRescindInvite sdk;

    public RescindInviteRequestBuilder(SDKMethodInterfaces.MethodCallRescindInvite sdk) {
        this.sdk = sdk;
    }

    public RescindInviteRequestBuilder rescindUserInvite(com.hathora.cloud_sdk.models.shared.RescindUserInvite rescindUserInvite) {
        Utils.checkNotNull(rescindUserInvite, "rescindUserInvite");
        this.rescindUserInvite = rescindUserInvite;
        return this;
    }

    public RescindInviteRequestBuilder orgId(String orgId) {
        Utils.checkNotNull(orgId, "orgId");
        this.orgId = orgId;
        return this;
    }

    public RescindInviteResponse call() throws Exception {

        return sdk.rescindInvite(
            rescindUserInvite,
            orgId);
    }
}