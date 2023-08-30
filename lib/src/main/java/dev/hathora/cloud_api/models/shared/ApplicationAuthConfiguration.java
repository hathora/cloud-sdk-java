/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApplicationAuthConfiguration - Used to authenticate player requests. Use your own authentication or Hathora's Auth Client.
 */

public class ApplicationAuthConfiguration {
    /**
     * Construct a type with a set of properties K of type T
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("anonymous")
    public RecordStringNever anonymous;

    public ApplicationAuthConfiguration withAnonymous(RecordStringNever anonymous) {
        this.anonymous = anonymous;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("google")
    public ApplicationAuthConfigurationGoogle google;

    public ApplicationAuthConfiguration withGoogle(ApplicationAuthConfigurationGoogle google) {
        this.google = google;
        return this;
    }
    
    /**
     * Construct a type with a set of properties K of type T
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nickname")
    public RecordStringNever nickname;

    public ApplicationAuthConfiguration withNickname(RecordStringNever nickname) {
        this.nickname = nickname;
        return this;
    }
    
    public ApplicationAuthConfiguration(){}
}
