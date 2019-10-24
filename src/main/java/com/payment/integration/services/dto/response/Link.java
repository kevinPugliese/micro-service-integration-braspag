package com.payment.integration.dto.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Method",
        "Rel",
        "Href"
})
public class Link {

    @JsonProperty("Method")
    private String method;
    @JsonProperty("Rel")
    private String rel;
    @JsonProperty("Href")
    private String href;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("Method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("Rel")
    public String getRel() {
        return rel;
    }

    @JsonProperty("Rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

    @JsonProperty("Href")
    public String getHref() {
        return href;
    }

    @JsonProperty("Href")
    public void setHref(String href) {
        this.href = href;
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
