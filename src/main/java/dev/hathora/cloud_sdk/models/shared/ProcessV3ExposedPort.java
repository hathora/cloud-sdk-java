/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * ProcessV3ExposedPort
 * 
 * <p>Connection details for an active process.
 */
public class ProcessV3ExposedPort {

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
    public ProcessV3ExposedPort(
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

    public ProcessV3ExposedPort withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    public ProcessV3ExposedPort withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ProcessV3ExposedPort withPort(int port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Transport type specifies the underlying communication protocol to the exposed port.
     */
    public ProcessV3ExposedPort withTransportType(TransportType transportType) {
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
        ProcessV3ExposedPort other = (ProcessV3ExposedPort) o;
        return 
            Objects.deepEquals(this.host, other.host) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.port, other.port) &&
            Objects.deepEquals(this.transportType, other.transportType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            host,
            name,
            port,
            transportType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProcessV3ExposedPort.class,
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
        
        public ProcessV3ExposedPort build() {
            return new ProcessV3ExposedPort(
                host,
                name,
                port,
                transportType);
        }
    }
}
