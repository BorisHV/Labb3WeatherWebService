
package com.example.labb3weatherwebservice.met;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "updated_at",
    "units"
})
@Generated("jsonschema2pojo")
public class Meta {

    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("units")
    private com.example.labb3smhi.MET.Units units;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("units")
    public com.example.labb3smhi.MET.Units getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(com.example.labb3smhi.MET.Units units) {
        this.units = units;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
