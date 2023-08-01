/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class LoginNicknameRequest {
    @JsonProperty("nickname")
    public String nickname;

    public LoginNicknameRequest withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    
    public LoginNicknameRequest(@JsonProperty("nickname") String nickname) {
        this.nickname = nickname;
  }
}