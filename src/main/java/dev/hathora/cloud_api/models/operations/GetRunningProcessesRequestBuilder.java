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


public class GetRunningProcessesRequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private Optional<? extends dev.hathora.cloud_api.models.shared.Region> region = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetRunningProcesses sdk;

    public GetRunningProcessesRequestBuilder(SDKMethodInterfaces.MethodCallGetRunningProcesses sdk) {
        this.sdk = sdk;
    }
                
    public GetRunningProcessesRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public GetRunningProcessesRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public GetRunningProcessesRequestBuilder region(dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public GetRunningProcessesRequestBuilder region(Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public GetRunningProcessesResponse call() throws Exception {

        return sdk.getRunningProcesses(
            appId,
            region);
    }
}
