package com.payment.integration.services.dto.response;

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
        "CardNumber",
        "Holder",
        "ExpirationDate",
        "SaveCard",
        "Alias",
        "Brand"
})
public class CreditCard {

    @JsonProperty("CardNumber")
    private String cardNumber;
    @JsonProperty("Holder")
    private String holder;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("SaveCard")
    private Boolean saveCard;
    @JsonProperty("Alias")
    private String alias;
    @JsonProperty("Brand")
    private String brand;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    @JsonProperty("CardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @JsonProperty("Holder")
    public String getHolder() {
        return holder;
    }

    @JsonProperty("Holder")
    public void setHolder(String holder) {
        this.holder = holder;
    }

    @JsonProperty("ExpirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("ExpirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("SaveCard")
    public Boolean getSaveCard() {
        return saveCard;
    }

    @JsonProperty("SaveCard")
    public void setSaveCard(Boolean saveCard) {
        this.saveCard = saveCard;
    }

    @JsonProperty("Alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("Alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("Brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(String brand) {
        this.brand = brand;
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
