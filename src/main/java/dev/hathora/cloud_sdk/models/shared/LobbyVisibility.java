/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * <p>Wrapper class for an "open" enum. "Open" enums are those that are expected
 * to evolve (particularly with the addition of enum members over time). If an
 * open enum is used then the appearance of unexpected enum values (say in a 
 * response from an updated an API) will not bring about a runtime error thus 
 * ensuring that non-updated client versions can continue to work without error.
 *
 * <p>Note that instances are immutable and are singletons (an internal thread-safe
 * cache is maintained to ensure that). As a consequence instances created with the 
 * same value will satisfy reference equality (via {@code ==}).
 * 
 * <p>This class is intended to emulate an enum (in terms of common usage and with 
 * reference equality) but with the ability to carry unknown values. Unfortunately
 * Java does not permit the use of an instance in a switch expression but you can 
 * use the {@code asEnum()} method (after dealing with the `Optional` appropriately).
 *
 */
/**
 * LobbyVisibility
 * 
 * <p>Types of lobbies a player can create.
 * 
 * <p>`private`: the player who created the room must share the roomId with their friends
 * 
 * <p>`public`: visible in the public lobby list, anyone can join
 * 
 * <p>`local`: for testing with a server running locally
 */
@JsonDeserialize(using = LobbyVisibility._Deserializer.class)
@JsonSerialize(using = LobbyVisibility._Serializer.class)
public class LobbyVisibility {

    public static final LobbyVisibility PRIVATE = new LobbyVisibility("private");
    public static final LobbyVisibility PUBLIC = new LobbyVisibility("public");
    public static final LobbyVisibility LOCAL = new LobbyVisibility("local");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, LobbyVisibility> values = createValuesMap();
    private static final Map<String, LobbyVisibilityEnum> enums = createEnumsMap();

    private final String value;

    private LobbyVisibility(String value) {
        this.value = value;
    }

    /**
     * Returns a LobbyVisibility with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as LobbyVisibility
     */ 
    public static LobbyVisibility of(String value) {
        synchronized (LobbyVisibility.class) {
            return values.computeIfAbsent(value, v -> new LobbyVisibility(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<LobbyVisibilityEnum> asEnum() {
        return Optional.ofNullable(enums.getOrDefault(value, null));
    }

    public boolean isKnown() {
        return asEnum().isPresent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LobbyVisibility other = (LobbyVisibility) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "LobbyVisibility [value=" + value + "]";
    }

    // return an array just like an enum
    public static LobbyVisibility[] values() {
        synchronized (LobbyVisibility.class) {
            return values.values().toArray(new LobbyVisibility[] {});
        }
    }

    private static final Map<String, LobbyVisibility> createValuesMap() {
        Map<String, LobbyVisibility> map = new LinkedHashMap<>();
        map.put("private", PRIVATE);
        map.put("public", PUBLIC);
        map.put("local", LOCAL);
        return map;
    }

    private static final Map<String, LobbyVisibilityEnum> createEnumsMap() {
        Map<String, LobbyVisibilityEnum> map = new HashMap<>();
        map.put("private", LobbyVisibilityEnum.PRIVATE);
        map.put("public", LobbyVisibilityEnum.PUBLIC);
        map.put("local", LobbyVisibilityEnum.LOCAL);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<LobbyVisibility> {

        protected _Serializer() {
            super(LobbyVisibility.class);
        }

        @Override
        public void serialize(LobbyVisibility value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<LobbyVisibility> {

        protected _Deserializer() {
            super(LobbyVisibility.class);
        }

        @Override
        public LobbyVisibility deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return LobbyVisibility.of(v);
        }
    }
    
    public enum LobbyVisibilityEnum {

        PRIVATE("private"),
        PUBLIC("public"),
        LOCAL("local"),;

        private final String value;

        private LobbyVisibilityEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

