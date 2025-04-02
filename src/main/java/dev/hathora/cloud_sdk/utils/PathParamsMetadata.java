/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.utils;

import java.lang.reflect.Field;

class PathParamsMetadata {

    // these fields set via reflection
    
    String style = "simple";
    boolean explode;
    String name;
    String serialization;
    boolean allowReserved;

    private PathParamsMetadata() {
    }

    static PathParamsMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("pathParam", new PathParamsMetadata(), field);
    }
}
