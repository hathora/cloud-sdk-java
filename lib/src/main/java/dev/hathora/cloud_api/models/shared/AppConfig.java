/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AppConfig {
    /**
     * Readable name for an application. Must be unique within an organization.
     */
    @JsonProperty("appName")
    public String appName;

    public AppConfig withAppName(String appName) {
        this.appName = appName;
        return this;
    }
    
    @JsonProperty("authConfiguration")
    public AppConfigAuthConfiguration authConfiguration;

    public AppConfig withAuthConfiguration(AppConfigAuthConfiguration authConfiguration) {
        this.authConfiguration = authConfiguration;
        return this;
    }
    
    public AppConfig(@JsonProperty("appName") String appName, @JsonProperty("authConfiguration") AppConfigAuthConfiguration authConfiguration) {
        this.appName = appName;
        this.authConfiguration = authConfiguration;
  }
}
