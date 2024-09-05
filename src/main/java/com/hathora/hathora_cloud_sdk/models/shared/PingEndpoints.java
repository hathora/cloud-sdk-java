/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.hathora.hathora_cloud_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hathora.hathora_cloud_sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PingEndpoints {

    @JsonProperty("host")
    private String host;

    @JsonProperty("port")
    private double port;

    @JsonProperty("region")
    private Region region;

    @JsonCreator
    public PingEndpoints(
            @JsonProperty("host") String host,
            @JsonProperty("port") double port,
            @JsonProperty("region") Region region) {
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(region, "region");
        this.host = host;
        this.port = port;
        this.region = region;
    }

    @JsonIgnore
    public String host() {
        return host;
    }

    @JsonIgnore
    public double port() {
        return port;
    }

    @JsonIgnore
    public Region region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PingEndpoints withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public PingEndpoints withPort(double port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    public PingEndpoints withRegion(Region region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
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
        PingEndpoints other = (PingEndpoints) o;
        return 
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.port, other.port) &&
            Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            host,
            port,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PingEndpoints.class,
                "host", host,
                "port", port,
                "region", region);
    }
    
    public final static class Builder {
 
        private String host;
 
        private Double port;
 
        private Region region;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        public Builder port(double port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        public Builder region(Region region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }
        
        public PingEndpoints build() {
            return new PingEndpoints(
                host,
                port,
                region);
        }
    }
}
