/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hathora.cloud_sdk.utils.OneOfDeserializer;
import com.hathora.cloud_sdk.utils.TypedObject;
import com.hathora.cloud_sdk.utils.Utils.JsonShape;
import com.hathora.cloud_sdk.utils.Utils.TypeReferenceWithShape;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * LobbyV3CreatedBy - UserId or email address for the user that created the lobby.
 */

@JsonDeserialize(using = LobbyV3CreatedBy._Deserializer.class)
public class LobbyV3CreatedBy {

    @JsonValue
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
        return new LobbyV3CreatedBy(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
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
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<LobbyV3CreatedBy> {

        public _Deserializer() {
            super(LobbyV3CreatedBy.class, false,
                  TypeReferenceWithShape.of(new TypeReference<java.lang.Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<java.lang.String>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(LobbyV3CreatedBy.class,
                "value", value);
    }
 
}
