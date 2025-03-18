/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_sdk.models.operations;

import dev.hathora.cloud_sdk.models.shared.CreateRoomParams;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreateRoomDeprecatedRequestBuilder {

    private CreateRoomParams createRoomParams;
    private Optional<String> appId = Optional.empty();
    private Optional<String> roomId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateRoomDeprecated sdk;

    public CreateRoomDeprecatedRequestBuilder(SDKMethodInterfaces.MethodCallCreateRoomDeprecated sdk) {
        this.sdk = sdk;
    }

    public CreateRoomDeprecatedRequestBuilder createRoomParams(CreateRoomParams createRoomParams) {
        Utils.checkNotNull(createRoomParams, "createRoomParams");
        this.createRoomParams = createRoomParams;
        return this;
    }
                
    public CreateRoomDeprecatedRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateRoomDeprecatedRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public CreateRoomDeprecatedRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.of(roomId);
        return this;
    }

    public CreateRoomDeprecatedRequestBuilder roomId(Optional<String> roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public CreateRoomDeprecatedResponse call() throws Exception {

        return sdk.createRoomDeprecated(
            createRoomParams,
            appId,
            roomId);
    }
}
