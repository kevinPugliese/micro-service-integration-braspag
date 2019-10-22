package com.payment.integration.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCard {
    private String cardNumber;
    private String holder;
    private String expirationDate;
    private String securityCode;
    private String brand;
    private String saveCard;
    private String alias;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSaveCard() {
        return saveCard;
    }

    public void setSaveCard(String saveCard) {
        this.saveCard = saveCard;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "'creditCard':{" +
                "'cardNumber':'" + cardNumber + '\'' +
                ", 'holder':'" + holder + '\'' +
                ", 'expirationDate':'" + expirationDate + '\'' +
                ", 'securityCode':'" + securityCode + '\'' +
                ", 'brand':'" + brand + '\'' +
                ", 'saveCard':'" + saveCard + '\'' +
                ", 'alias':'" + alias + '\'' +
                '}';
    }
}
