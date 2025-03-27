/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.hathora.cloud_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.hathora.cloud_sdk.utils.OneOfDeserializer;
import dev.hathora.cloud_sdk.utils.TypedObject;
import dev.hathora.cloud_sdk.utils.Utils.JsonShape;
import dev.hathora.cloud_sdk.utils.Utils.TypeReferenceWithShape;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
/**
 * OrgTokenScopes
 * 
 * <p>If not defined, the token has Admin access.
 */

@JsonDeserialize(using = OrgTokenScopes._Deserializer.class)
public class OrgTokenScopes {

    @JsonValue
    private TypedObject value;
    
    private OrgTokenScopes(TypedObject value) {
        this.value = value;
    }

    public static OrgTokenScopes of(List<Scope> value) {
        Utils.checkNotNull(value, "value");
        return new OrgTokenScopes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<List<Scope>>(){}));
    }

    public static OrgTokenScopes of(OrgToken2 value) {
        Utils.checkNotNull(value, "value");
        return new OrgTokenScopes(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<OrgToken2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.util.List<dev.hathora.cloud_sdk.models.shared.Scope>}</li>
     * <li>{@code dev.hathora.cloud_sdk.models.shared.OrgToken2}</li>
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
        OrgTokenScopes other = (OrgTokenScopes) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<OrgTokenScopes> {

        public _Deserializer() {
            super(OrgTokenScopes.class, false,
                  TypeReferenceWithShape.of(new TypeReference<OrgToken2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<List<Scope>>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrgTokenScopes.class,
                "value", value);
    }
 
}
