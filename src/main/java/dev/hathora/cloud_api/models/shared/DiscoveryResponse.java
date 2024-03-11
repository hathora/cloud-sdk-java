/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class DiscoveryResponse {

    @JsonProperty("host")
    private String host;

    @JsonProperty("port")
    private double port;

    @JsonProperty("region")
    private Region region;

    public DiscoveryResponse(
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

    public String host() {
        return host;
    }

    public double port() {
        return port;
    }

    public Region region() {
        return region;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DiscoveryResponse withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public DiscoveryResponse withPort(double port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    public DiscoveryResponse withRegion(Region region) {
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
        DiscoveryResponse other = (DiscoveryResponse) o;
        return 
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.region, other.region);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            host,
            port,
            region);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DiscoveryResponse.class,
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
        
        public DiscoveryResponse build() {
            return new DiscoveryResponse(
                host,
                port,
                region);
        }
    }
}
