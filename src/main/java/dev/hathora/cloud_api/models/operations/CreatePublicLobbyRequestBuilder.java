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


public class CreatePublicLobbyRequestBuilder {

    private CreatePublicLobbySecurity security;
    private CreatePublicLobbyRequestBody requestBody;
    private Optional<? extends String> appId = Optional.empty();
    private Optional<? extends String> roomId = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreatePublicLobby sdk;

    public CreatePublicLobbyRequestBuilder(SDKMethodInterfaces.MethodCallCreatePublicLobby sdk) {
        this.sdk = sdk;
    }

    public CreatePublicLobbyRequestBuilder security(CreatePublicLobbySecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public CreatePublicLobbyRequestBuilder requestBody(CreatePublicLobbyRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }
                
    public CreatePublicLobbyRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public CreatePublicLobbyRequestBuilder appId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public CreatePublicLobbyRequestBuilder roomId(String roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = Optional.of(roomId);
        return this;
    }

    public CreatePublicLobbyRequestBuilder roomId(Optional<? extends String> roomId) {
        Utils.checkNotNull(roomId, "roomId");
        this.roomId = roomId;
        return this;
    }

    public CreatePublicLobbyResponse call() throws Exception {

        return sdk.createPublicLobby(
            security,
            requestBody,
            appId,
            roomId);
    }
}
