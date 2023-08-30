/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_api.utils.SpeakeasyMetadata;


public class GetAppsSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String auth0;

    public GetAppsSecurity withAuth0(String auth0) {
        this.auth0 = auth0;
        return this;
    }
    
    public GetAppsSecurity(@JsonProperty("auth0") String auth0) {
        this.auth0 = auth0;
  }
}
