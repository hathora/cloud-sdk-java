/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.errors;

import java.util.Optional;

/**
 * An exception associated with Authentication or Authorization.
 */
@SuppressWarnings("serial")
public class AuthException extends RuntimeException {

    private final Optional<Integer> statusCode;

    private AuthException(Optional<Integer> statusCode, String message) {
       super(message);
       this.statusCode = statusCode;
    }

    public AuthException(int statusCode, String message) {
        this(Optional.of(statusCode), message);
    }
    
    public AuthException(String message) {
        this(Optional.empty(), message);
    }
    
    public Optional<Integer> statusCode() {
        return statusCode;
    }
}
