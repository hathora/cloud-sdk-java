/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.LazySingletonValue;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public class ListActivePublicLobbiesDeprecatedV1RequestBuilder {

    private Optional<String> appId = Optional.empty();
    private Optional<Boolean> local = Utils.readDefaultOrConstValue(
                            "local",
                            "false",
                            new TypeReference<Optional<Boolean>>() {});
    private Optional<? extends Region> region = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListActivePublicLobbiesDeprecatedV1 sdk;

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder(SDKMethodInterfaces.MethodCallListActivePublicLobbiesDeprecatedV1 sdk) {
        this.sdk = sdk;
    }
                
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder local(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = Optional.of(local);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder local(Optional<Boolean> local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }
                
    public ListActivePublicLobbiesDeprecatedV1RequestBuilder region(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public ListActivePublicLobbiesDeprecatedV1RequestBuilder region(Optional<? extends Region> region) {
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

    private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Local =
            new LazySingletonValue<>(
                    "local",
                    "false",
                    new TypeReference<Optional<Boolean>>() {});
}
