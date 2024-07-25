/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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


public class CreateLocalLobbyRequestBuilder {

    private CreateLocalLobbySecurity security;
    private CreateLocalLobbyRequestBody requestBody;
    private Optional<? extends String> appId = Optional.empty();
    private Optional<? extends String> roomId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateLocalLobby sdk;

    public CreateLocalLobbyRequestBuilder(SDKMethodInterfaces.MethodCallCreateLocalLobby sdk) {
        this.sdk = sdk;
    }

    public CreateLocalLobbyRequestBuilder security(CreateLocalLobbySecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public CreateLocalLobbyRequestBuilder requestBody(CreateLocalLobbyRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }
                
    public CreateLocalLobbyRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreateLocalLobbyRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public CreateLocalLobbyRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.of(roomId);
        return this;
    }

    public CreateLocalLobbyRequestBuilder roomId(Optional<? extends String> roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public CreateLocalLobbyResponse call() throws Exception {

        return sdk.createLocalLobby(
            security,
            requestBody,
            appId,
            roomId);
    }
}
