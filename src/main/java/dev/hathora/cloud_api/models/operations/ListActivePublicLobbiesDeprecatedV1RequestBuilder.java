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


public class ListActivePublicLobbiesDeprecatedV1RequestBuilder {

    private Optional<? extends String> appId = Optional.empty();
    private Optional<? extends Boolean> local = Utils.readDefaultOrConstValue(
                            "local",
                            "false",
                            new TypeReference<Optional<? extends Boolean>>() {});
    private Optional<? extends dev.hathora.cloud_api.models.shared.Region> region = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListActivePublicLobbiesDeprecatedV1 sdk;

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder(SDKMethodInterfaces.MethodCallListActivePublicLobbiesDeprecatedV1 sdk) {
        this.sdk = sdk;
    }
                
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder local(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = Optional.of(local);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder local(Optional<? extends Boolean> local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }
                
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder region(dev.hathora.cloud_api.models.shared.Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder region(Optional<? extends dev.hathora.cloud_api.models.shared.Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1Response call() throws Exception {
        if (local == null) {
            local = _SINGLETON_VALUE_Local.value();
        }

        return sdk.listActivePublicLobbiesDeprecatedV1(
            appId,
            local,
            region);
    }

    private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Local =
            new LazySingletonValue<>(
                    "local",
                    "false",
                    new TypeReference<Optional<? extends Boolean>>() {});
}
