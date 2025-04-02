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
@JsonDeserialize(using = Region._Deserializer.class)
@JsonSerialize(using = Region._Serializer.class)
public class Region {

    public static final Region SEATTLE = new Region("Seattle");
    public static final Region LOS_ANGELES = new Region("Los_Angeles");
    public static final Region WASHINGTON_DC = new Region("Washington_DC");
    public static final Region CHICAGO = new Region("Chicago");
    public static final Region LONDON = new Region("London");
    public static final Region FRANKFURT = new Region("Frankfurt");
    public static final Region MUMBAI = new Region("Mumbai");
    public static final Region SINGAPORE = new Region("Singapore");
    public static final Region TOKYO = new Region("Tokyo");
    public static final Region SYDNEY = new Region("Sydney");
    public static final Region SAO_PAULO = new Region("Sao_Paulo");
    public static final Region DALLAS = new Region("Dallas");
    public static final Region JOHANNESBURG = new Region("Johannesburg");
    public static final Region DUBAI = new Region("Dubai");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, Region> values = createValuesMap();
    private static final Map<String, RegionEnum> enums = createEnumsMap();

    private final String value;

    private Region(String value) {
        this.value = value;
    }

    /**
     * Returns a Region with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as Region
     */ 
    public static Region of(String value) {
        synchronized (Region.class) {
            return values.computeIfAbsent(value, v -> new Region(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<RegionEnum> asEnum() {
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
        Region other = (Region) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "Region [value=" + value + "]";
    }

    // return an array just like an enum
    public static Region[] values() {
        synchronized (Region.class) {
            return values.values().toArray(new Region[] {});
        }
    }

    private static final Map<String, Region> createValuesMap() {
        Map<String, Region> map = new LinkedHashMap<>();
        map.put("Seattle", SEATTLE);
        map.put("Los_Angeles", LOS_ANGELES);
        map.put("Washington_DC", WASHINGTON_DC);
        map.put("Chicago", CHICAGO);
        map.put("London", LONDON);
        map.put("Frankfurt", FRANKFURT);
        map.put("Mumbai", MUMBAI);
        map.put("Singapore", SINGAPORE);
        map.put("Tokyo", TOKYO);
        map.put("Sydney", SYDNEY);
        map.put("Sao_Paulo", SAO_PAULO);
        map.put("Dallas", DALLAS);
        map.put("Johannesburg", JOHANNESBURG);
        map.put("Dubai", DUBAI);
        return map;
    }

    private static final Map<String, RegionEnum> createEnumsMap() {
        Map<String, RegionEnum> map = new HashMap<>();
        map.put("Seattle", RegionEnum.SEATTLE);
        map.put("Los_Angeles", RegionEnum.LOS_ANGELES);
        map.put("Washington_DC", RegionEnum.WASHINGTON_DC);
        map.put("Chicago", RegionEnum.CHICAGO);
        map.put("London", RegionEnum.LONDON);
        map.put("Frankfurt", RegionEnum.FRANKFURT);
        map.put("Mumbai", RegionEnum.MUMBAI);
        map.put("Singapore", RegionEnum.SINGAPORE);
        map.put("Tokyo", RegionEnum.TOKYO);
        map.put("Sydney", RegionEnum.SYDNEY);
        map.put("Sao_Paulo", RegionEnum.SAO_PAULO);
        map.put("Dallas", RegionEnum.DALLAS);
        map.put("Johannesburg", RegionEnum.JOHANNESBURG);
        map.put("Dubai", RegionEnum.DUBAI);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<Region> {

        protected _Serializer() {
            super(Region.class);
        }

        @Override
        public void serialize(Region value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<Region> {

        protected _Deserializer() {
            super(Region.class);
        }

        @Override
        public Region deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return Region.of(v);
        }
    }
    
    public enum RegionEnum {

        SEATTLE("Seattle"),
        LOS_ANGELES("Los_Angeles"),
        WASHINGTON_DC("Washington_DC"),
        CHICAGO("Chicago"),
        LONDON("London"),
        FRANKFURT("Frankfurt"),
        MUMBAI("Mumbai"),
        SINGAPORE("Singapore"),
        TOKYO("Tokyo"),
        SYDNEY("Sydney"),
        SAO_PAULO("Sao_Paulo"),
        DALLAS("Dallas"),
        JOHANNESBURG("Johannesburg"),
        DUBAI("Dubai"),;

        private final String value;

        private RegionEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

