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
import java.util.Objects;
/**
 * ConnectionInfo
 * 
 * <p>Connection information to the default port.
 */

@JsonDeserialize(using = ConnectionInfo._Deserializer.class)
public class ConnectionInfo {

    @JsonValue
    private TypedObject value;
    
    private ConnectionInfo(TypedObject value) {
        this.value = value;
    }

    public static ConnectionInfo of(StartingConnectionInfo value) {
        Utils.checkNotNull(value, "value");
        return new ConnectionInfo(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StartingConnectionInfo>(){}));
    }

    public static ConnectionInfo of(ActiveConnectionInfo value) {
        Utils.checkNotNull(value, "value");
        return new ConnectionInfo(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ActiveConnectionInfo>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code dev.hathora.cloud_sdk.models.shared.StartingConnectionInfo}</li>
     * <li>{@code dev.hathora.cloud_sdk.models.shared.ActiveConnectionInfo}</li>
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
        ConnectionInfo other = (ConnectionInfo) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<ConnectionInfo> {

        public _Deserializer() {
            super(ConnectionInfo.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ActiveConnectionInfo>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<StartingConnectionInfo>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionInfo.class,
                "value", value);
    }
 
}
