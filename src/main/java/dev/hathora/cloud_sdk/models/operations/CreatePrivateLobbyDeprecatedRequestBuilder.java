/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_sdk.models.shared.Region;
import dev.hathora.cloud_sdk.utils.LazySingletonValue;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreatePrivateLobbyDeprecatedRequestBuilder {

    private CreatePrivateLobbyDeprecatedSecurity security;
    private Optional<String> appId = Optional.empty();
    private Optional<Boolean> local = Utils.readDefaultOrConstValue(
                            "local",
                            "false",
                            new TypeReference<Optional<Boolean>>() {});
    private Optional<? extends Region> region = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreatePrivateLobbyDeprecated sdk;

    public CreatePrivateLobbyDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallCreatePrivateLobbyDeprecated sdk) {
        this.sdk = sdk;
    }

    public CreatePrivateLobbyDeprecatedRequestBuilder security(CreatePrivateLobbyDeprecatedSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public CreatePrivateLobbyDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public CreatePrivateLobbyDeprecatedRequestBuilder local(boolean local) {
        Utils.checkNotNull(local, "local");
        this.local = Optional.of(local);
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequestBuilder local(Optional<Boolean> local) {
        Utils.checkNotNull(local, "local");
        this.local = local;
        return this;
    }
                
    public CreatePrivateLobbyDeprecatedRequestBuilder region(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = Optional.of(region);
        return this;
    }

    public CreatePrivateLobbyDeprecatedRequestBuilder region(Optional<? extends Region> region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public CreatePrivateLobbyDeprecatedResponse call() throws Exception {
        if (local == null) {
            local = _SINGLETON_VALUE_Local.value();
        }
        return sdk.createPrivateLobbyDeprecated(
            security,
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
