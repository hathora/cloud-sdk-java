/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * LobbyVisibility - Types of lobbies a player can create.
 * 
 * `private`: the player who created the room must share the roomId with their friends
 * 
 * `public`: visible in the public lobby list, anyone can join
 * 
 * `local`: for testing with a server running locally
 */
public enum LobbyVisibility {
    PRIVATE_("private"),
    PUBLIC_("public"),
    LOCAL("local");

    @JsonValue
    private final String value;

    private LobbyVisibility(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
