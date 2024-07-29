/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.hathora.cloud_api.utils.TypedObject;
import dev.hathora.cloud_api.utils.Utils.JsonShape;

/**
 * LobbyV3CreatedBy - UserId or email address for the user that created the lobby.
 */

@JsonDeserialize(using = LobbyV3CreatedBy._Deserializer.class)
public class LobbyV3CreatedBy {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private LobbyV3CreatedBy(TypedObject value) {
        this.value = value;
    }

    public static LobbyV3CreatedBy of(String value) {
        Utils.checkNotNull(value, "value");
        return new LobbyV3CreatedBy(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static LobbyV3CreatedBy of(double value) {
        Utils.checkNotNull(value, "value");
        return new LobbyV3CreatedBy(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Double>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code String}</li>
     * <li>{@code double}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LobbyV3CreatedBy other = (LobbyV3CreatedBy) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends dev.hathora.cloud_api.utils.OneOfDeserializer<LobbyV3CreatedBy> {

        public _Deserializer() {
            super(LobbyV3CreatedBy.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Double>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(LobbyV3CreatedBy.class,
                "value", value);
    }
 
}
