/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.hathora.cloud_api.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.hathora.cloud_api.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * ProcessExposedPort - Connection details for an active process.
 */

public class ProcessExposedPort {

    @JsonProperty("host")
    private String host;

    @JsonProperty("name")
    private String name;

    @JsonProperty("port")
    private int port;

    /**
     * Transport type specifies the underlying communication protocol to the exposed port.
     */
    @JsonProperty("transportType")
    private TransportType transportType;

    @JsonCreator
    public ProcessExposedPort(
            @JsonProperty("host") String host,
            @JsonProperty("name") String name,
            @JsonProperty("port") int port,
            @JsonProperty("transportType") TransportType transportType) {
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(transportType, "transportType");
        this.host = host;
        this.name = name;
        this.port = port;
        this.transportType = transportType;
    }

    @JsonIgnore
    public String host() {
        return host;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public int port() {
        return port;
    }

    /**
     * Transport type specifies the underlying communication protocol to the exposed port.
     */
    @JsonIgnore
    public TransportType transportType() {
        return transportType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ProcessExposedPort withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public ProcessExposedPort withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ProcessExposedPort withPort(int port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Transport type specifies the underlying communication protocol to the exposed port.
     */
    public ProcessExposedPort withTransportType(TransportType transportType) {
        Utils.checkNotNull(transportType, "transportType");
        this.transportType = transportType;
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
        ProcessExposedPort other = (ProcessExposedPort) o;
        return 
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.transportType, other.transportType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            host,
            name,
            port,
            transportType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProcessExposedPort.class,
                "host", host,
                "name", name,
                "port", port,
                "transportType", transportType);
    }
    
    public final static class Builder {
 
        private String host;
 
        private String name;
 
        private Integer port;
 
        private TransportType transportType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder port(int port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * Transport type specifies the underlying communication protocol to the exposed port.
         */
        public Builder transportType(TransportType transportType) {
            Utils.checkNotNull(transportType, "transportType");
            this.transportType = transportType;
            return this;
        }
        
        public ProcessExposedPort build() {
            return new ProcessExposedPort(
                host,
                name,
                port,
                transportType);
        }
    }
}

