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
import java.lang.Deprecated;
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
 * DeploymentV1TransportType
 * 
 * @deprecated enum: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
@JsonDeserialize(using = DeploymentV1TransportType._Deserializer.class)
@JsonSerialize(using = DeploymentV1TransportType._Serializer.class)
public class DeploymentV1TransportType {

    public static final DeploymentV1TransportType TCP = new DeploymentV1TransportType("tcp");
    public static final DeploymentV1TransportType UDP = new DeploymentV1TransportType("udp");
    public static final DeploymentV1TransportType TLS = new DeploymentV1TransportType("tls");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, DeploymentV1TransportType> values = createValuesMap();
    private static final Map<String, DeploymentV1TransportTypeEnum> enums = createEnumsMap();

    private final String value;

    private DeploymentV1TransportType(String value) {
        this.value = value;
    }

    /**
     * Returns a DeploymentV1TransportType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as DeploymentV1TransportType
     */ 
    public static DeploymentV1TransportType of(String value) {
        synchronized (DeploymentV1TransportType.class) {
            return values.computeIfAbsent(value, v -> new DeploymentV1TransportType(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<DeploymentV1TransportTypeEnum> asEnum() {
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
        DeploymentV1TransportType other = (DeploymentV1TransportType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "DeploymentV1TransportType [value=" + value + "]";
    }

    // return an array just like an enum
    public static DeploymentV1TransportType[] values() {
        synchronized (DeploymentV1TransportType.class) {
            return values.values().toArray(new DeploymentV1TransportType[] {});
        }
    }

    private static final Map<String, DeploymentV1TransportType> createValuesMap() {
        Map<String, DeploymentV1TransportType> map = new LinkedHashMap<>();
        map.put("tcp", TCP);
        map.put("udp", UDP);
        map.put("tls", TLS);
        return map;
    }

    private static final Map<String, DeploymentV1TransportTypeEnum> createEnumsMap() {
        Map<String, DeploymentV1TransportTypeEnum> map = new HashMap<>();
        map.put("tcp", DeploymentV1TransportTypeEnum.TCP);
        map.put("udp", DeploymentV1TransportTypeEnum.UDP);
        map.put("tls", DeploymentV1TransportTypeEnum.TLS);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<DeploymentV1TransportType> {

        protected _Serializer() {
            super(DeploymentV1TransportType.class);
        }

        @Override
        public void serialize(DeploymentV1TransportType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<DeploymentV1TransportType> {

        protected _Deserializer() {
            super(DeploymentV1TransportType.class);
        }

        @Override
        public DeploymentV1TransportType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return DeploymentV1TransportType.of(v);
        }
    }
    
    public enum DeploymentV1TransportTypeEnum {

        TCP("tcp"),
        UDP("udp"),
        TLS("tls"),;

        private final String value;

        private DeploymentV1TransportTypeEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

