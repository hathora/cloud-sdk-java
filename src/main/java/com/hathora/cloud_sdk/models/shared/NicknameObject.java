/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class NicknameObject {

    /**
     * An alias to represent a player.
     */
    @JsonProperty("nickname")
    private String nickname;

    @JsonCreator
    public NicknameObject(
            @JsonProperty("nickname") String nickname) {
        Utils.checkNotNull(nickname, "nickname");
        this.nickname = nickname;
    }

    /**
     * An alias to represent a player.
     */
    @JsonIgnore
    public String nickname() {
        return nickname;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An alias to represent a player.
     */
    public NicknameObject withNickname(String nickname) {
        Utils.checkNotNull(nickname, "nickname");
        this.nickname = nickname;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NicknameObject other = (NicknameObject) o;
        return 
            Objects.deepEquals(this.nickname, other.nickname);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            nickname);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NicknameObject.class,
                "nickname", nickname);
    }
    
    public final static class Builder {
 
        private String nickname;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An alias to represent a player.
         */
        public Builder nickname(String nickname) {
            Utils.checkNotNull(nickname, "nickname");
            this.nickname = nickname;
            return this;
        }
        
        public NicknameObject build() {
            return new NicknameObject(
                nickname);
        }
    }
}

