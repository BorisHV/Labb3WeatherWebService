
package com.example.labb3weatherwebservice.met;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "data"
})
@Generated("jsonschema2pojo")
public class Timeseries {

    @JsonProperty("time")
    private String time;
    @JsonProperty("data")
    private com.example.labb3smhi.MET.Data data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("data")
    public com.example.labb3smhi.MET.Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(com.example.labb3smhi.MET.Data data) {
        this.data = data;
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
