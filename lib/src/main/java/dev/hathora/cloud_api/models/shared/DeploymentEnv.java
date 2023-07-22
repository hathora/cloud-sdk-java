/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DeploymentEnv {
    @JsonProperty("name")
    public String name;

    public DeploymentEnv withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("value")
    public String value;

    public DeploymentEnv withValue(String value) {
        this.value = value;
        return this;
    }
    
    public DeploymentEnv(@JsonProperty("name") String name, @JsonProperty("value") String value) {
        this.name = name;
        this.value = value;
  }
}
