package com.payment.integration.services.dto.request;

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
        "cardNumber",
        "holder",
        "expirationDate",
        "securityCode",
        "brand",
        "saveCard",
        "alias"
})
public class CreditCard {

    @JsonProperty("cardNumber")
    private String cardNumber;
    @JsonProperty("holder")
    private String holder;
    @JsonProperty("expirationDate")
    private String expirationDate;
    @JsonProperty("securityCode")
    private String securityCode;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("saveCard")
    private String saveCard;
    @JsonProperty("alias")
    private String alias;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    @JsonProperty("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @JsonProperty("holder")
    public String getHolder() {
        return holder;
    }

    @JsonProperty("holder")
    public void setHolder(String holder) {
        this.holder = holder;
    }

    @JsonProperty("expirationDate")
    public String getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expirationDate")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("securityCode")
    public String getSecurityCode() {
        return securityCode;
    }

    @JsonProperty("securityCode")
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("saveCard")
    public String getSaveCard() {
        return saveCard;
    }

    @JsonProperty("saveCard")
    public void setSaveCard(String saveCard) {
        this.saveCard = saveCard;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
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
