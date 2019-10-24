package com.payment.integration.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.payment.integration.dto.common.Credentials;
import com.payment.integration.dto.common.ExtraDataCollection;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {
    private String provider;
    private String type;
    private long amount;
    private String Currency;
    private String Country;
    private int installments;
    private String interest;
    private boolean capture;
    private boolean authenticate;
    private boolean recurrent;
    private String softDescriptor;
    private boolean doSplit;
    private CreditCard creditCard;
    private Credentials credentials;
    private List<ExtraDataCollection> extraDataCollections = new ArrayList<>();

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public boolean isCapture() {
        return capture;
    }

    public void setCapture(boolean capture) {
        this.capture = capture;
    }

    public boolean isAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        this.authenticate = authenticate;
    }

    public boolean isRecurrent() {
        return recurrent;
    }

    public void setRecurrent(boolean recurrent) {
        this.recurrent = recurrent;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public boolean isDoSplit() {
        return doSplit;
    }

    public void setDoSplit(boolean doSplit) {
        this.doSplit = doSplit;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public List<ExtraDataCollection> getExtraDataCollections() {
        return extraDataCollections;
    }

    public void addExtraDataCollections(ExtraDataCollection extraDataCollection) {
        this.extraDataCollections.add(extraDataCollection);
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "'payment': {" +
                "'provider':'" + provider + '\'' +
                ", 'type':'" + type + '\'' +
                ", 'Currency':'" + Currency + '\'' +
                ", 'Country':'" + Country + '\'' +
                ", 'installments':" + installments +
                ", 'interest':'" + interest + '\'' +
                ", 'capture':" + capture +
                ", 'authenticate':" + authenticate +
                ", 'recurrent':" + recurrent +
                ", 'softDescriptor':'" + softDescriptor + '\'' +
                ", 'doSplit':" + doSplit +
                ", " + creditCard +
                ", " + credentials +
                ", " + extraDataCollections +
                '}';
    }
}
