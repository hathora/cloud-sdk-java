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
 * PlanName - A plan defines how much CPU and memory is required to run an instance of your game server.
 * 
 * `tiny`: shared core, 1gb memory
 * 
 * `small`: 1 core, 2gb memory
 * 
 * `medium`: 2 core, 4gb memory
 * 
 * `large`: 4 core, 8gb memory
 */
@JsonDeserialize(using = PlanName._Deserializer.class)
@JsonSerialize(using = PlanName._Serializer.class)
public class PlanName {

    public static final PlanName TINY = new PlanName("tiny");
    public static final PlanName SMALL = new PlanName("small");
    public static final PlanName MEDIUM = new PlanName("medium");
    public static final PlanName LARGE = new PlanName("large");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, PlanName> values = createValuesMap();
    private static final Map<String, PlanNameEnum> enums = createEnumsMap();

    private final String value;

    private PlanName(String value) {
        this.value = value;
    }

    /**
     * Returns a PlanName with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as PlanName
     */ 
    public static PlanName of(String value) {
        synchronized (PlanName.class) {
            return values.computeIfAbsent(value, v -> new PlanName(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<PlanNameEnum> asEnum() {
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
        PlanName other = (PlanName) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "PlanName [value=" + value + "]";
    }

    // return an array just like an enum
    public static PlanName[] values() {
        synchronized (PlanName.class) {
            return values.values().toArray(new PlanName[] {});
        }
    }

    private static final Map<String, PlanName> createValuesMap() {
        Map<String, PlanName> map = new LinkedHashMap<>();
        map.put("tiny", TINY);
        map.put("small", SMALL);
        map.put("medium", MEDIUM);
        map.put("large", LARGE);
        return map;
    }

    private static final Map<String, PlanNameEnum> createEnumsMap() {
        Map<String, PlanNameEnum> map = new HashMap<>();
        map.put("tiny", PlanNameEnum.TINY);
        map.put("small", PlanNameEnum.SMALL);
        map.put("medium", PlanNameEnum.MEDIUM);
        map.put("large", PlanNameEnum.LARGE);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<PlanName> {

        protected _Serializer() {
            super(PlanName.class);
        }

        @Override
        public void serialize(PlanName value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<PlanName> {

        protected _Deserializer() {
            super(PlanName.class);
        }

        @Override
        public PlanName deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return PlanName.of(v);
        }
    }
    
    public enum PlanNameEnum {

        TINY("tiny"),
        SMALL("small"),
        MEDIUM("medium"),
        LARGE("large"),;

        private final String value;

        private PlanNameEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}
