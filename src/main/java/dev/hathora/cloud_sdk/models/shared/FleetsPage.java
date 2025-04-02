/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.hathora.cloud_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.hathora.cloud_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class FleetsPage {

    @JsonProperty("fleets")
    private List<Fleet> fleets;

    @JsonCreator
    public FleetsPage(
            @JsonProperty("fleets") List<Fleet> fleets) {
        Utils.checkNotNull(fleets, "fleets");
        this.fleets = fleets;
    }

    @JsonIgnore
    public List<Fleet> fleets() {
        return fleets;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public FleetsPage withFleets(List<Fleet> fleets) {
        Utils.checkNotNull(fleets, "fleets");
        this.fleets = fleets;
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
        FleetsPage other = (FleetsPage) o;
        return 
            Objects.deepEquals(this.fleets, other.fleets);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fleets);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FleetsPage.class,
                "fleets", fleets);
    }
    
    public final static class Builder {
 
        private List<Fleet> fleets;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fleets(List<Fleet> fleets) {
            Utils.checkNotNull(fleets, "fleets");
            this.fleets = fleets;
            return this;
        }
        
        public FleetsPage build() {
            return new FleetsPage(
                fleets);
        }
    }
}
