/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VerificationEmailResponse - Ok
 */

public class VerificationEmailResponse {
    @JsonProperty("status")
    public VerificationEmailResponseStatus status;

    public VerificationEmailResponse withStatus(VerificationEmailResponseStatus status) {
        this.status = status;
        return this;
    }
    
    public VerificationEmailResponse(@JsonProperty("status") VerificationEmailResponseStatus status) {
        this.status = status;
  }
}
