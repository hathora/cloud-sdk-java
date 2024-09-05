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
 * CreatedBy - UserId or email address for the user that created the lobby.
 */

@JsonDeserialize(using = CreatedBy._Deserializer.class)
public class CreatedBy {

    @JsonValue
    private TypedObject value;
    
    private CreatedBy(TypedObject value) {
        this.value = value;
    }

    public static CreatedBy of(String value) {
        Utils.checkNotNull(value, "value");
        return new CreatedBy(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static CreatedBy of(double value) {
        Utils.checkNotNull(value, "value");
        return new CreatedBy(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
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
        CreatedBy other = (CreatedBy) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CreatedBy> {

        public _Deserializer() {
            super(CreatedBy.class, false,
                  TypeReferenceWithShape.of(new TypeReference<java.lang.Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<java.lang.String>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatedBy.class,
                "value", value);
    }
 
}
