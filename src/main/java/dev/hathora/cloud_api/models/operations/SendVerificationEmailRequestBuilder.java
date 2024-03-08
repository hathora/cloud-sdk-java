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


public class SendVerificationEmailRequestBuilder {

    private dev.hathora.cloud_api.models.shared.VerificationEmailRequest request;
    private final SDKMethodInterfaces.MethodCallSendVerificationEmail sdk;

    public SendVerificationEmailRequestBuilder(SDKMethodInterfaces.MethodCallSendVerificationEmail sdk) {
        this.sdk = sdk;
    }

    public SendVerificationEmailRequestBuilder request(dev.hathora.cloud_api.models.shared.VerificationEmailRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SendVerificationEmailResponse call() throws Exception {

        return sdk.sendVerificationEmail(
            request);
    }
}
