package com.payment.integration.dto.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.payment.integration.dto.common.Credentials;
import com.payment.integration.dto.common.ExtraDataCollection;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ServiceTaxAmount",
        "Installments",
        "Interest",
        "Capture",
        "Authenticate",
        "Recurrent",
        "CreditCard",
        "ProofOfSale",
        "AcquirerTransactionId",
        "AuthorizationCode",
        "SoftDescriptor",
        "Credentials",
        "DoSplit",
        "PaymentId",
        "Type",
        "Amount",
        "ReceivedDate",
        "CapturedAmount",
        "CapturedDate",
        "Currency",
        "Country",
        "Provider",
        "ExtraDataCollection",
        "ReasonCode",
        "ReasonMessage",
        "Status",
        "ProviderReturnCode",
        "ProviderReturnMessage",
        "Links"
})
public class Payment {

    @JsonProperty("ServiceTaxAmount")
    private Integer serviceTaxAmount;
    @JsonProperty("Installments")
    private Integer installments;
    @JsonProperty("Interest")
    private String interest;
    @JsonProperty("Capture")
    private Boolean capture;
    @JsonProperty("Authenticate")
    private Boolean authenticate;
    @JsonProperty("Recurrent")
    private Boolean recurrent;
    @JsonProperty("CreditCard")
    private CreditCard creditCard;
    @JsonProperty("ProofOfSale")
    private String proofOfSale;
    @JsonProperty("AcquirerTransactionId")
    private String acquirerTransactionId;
    @JsonProperty("AuthorizationCode")
    private String authorizationCode;
    @JsonProperty("SoftDescriptor")
    private String softDescriptor;
    @JsonProperty("Credentials")
    private Credentials credentials;
    @JsonProperty("DoSplit")
    private Boolean doSplit;
    @JsonProperty("PaymentId")
    private String paymentId;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Amount")
    private Integer amount;
    @JsonProperty("ReceivedDate")
    private String receivedDate;
    @JsonProperty("CapturedAmount")
    private Integer capturedAmount;
    @JsonProperty("CapturedDate")
    private String capturedDate;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Provider")
    private String provider;
    @JsonProperty("ExtraDataCollection")
    private List<ExtraDataCollection> extraDataCollection = null;
    @JsonProperty("ReasonCode")
    private Integer reasonCode;
    @JsonProperty("ReasonMessage")
    private String reasonMessage;
    @JsonProperty("Status")
    private Integer status;
    @JsonProperty("ProviderReturnCode")
    private String providerReturnCode;
    @JsonProperty("ProviderReturnMessage")
    private String providerReturnMessage;
    @JsonProperty("Links")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ServiceTaxAmount")
    public Integer getServiceTaxAmount() {
        return serviceTaxAmount;
    }

    @JsonProperty("ServiceTaxAmount")
    public void setServiceTaxAmount(Integer serviceTaxAmount) {
        this.serviceTaxAmount = serviceTaxAmount;
    }

    @JsonProperty("Installments")
    public Integer getInstallments() {
        return installments;
    }

    @JsonProperty("Installments")
    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    @JsonProperty("Interest")
    public String getInterest() {
        return interest;
    }

    @JsonProperty("Interest")
    public void setInterest(String interest) {
        this.interest = interest;
    }

    @JsonProperty("Capture")
    public Boolean getCapture() {
        return capture;
    }

    @JsonProperty("Capture")
    public void setCapture(Boolean capture) {
        this.capture = capture;
    }

    @JsonProperty("Authenticate")
    public Boolean getAuthenticate() {
        return authenticate;
    }

    @JsonProperty("Authenticate")
    public void setAuthenticate(Boolean authenticate) {
        this.authenticate = authenticate;
    }

    @JsonProperty("Recurrent")
    public Boolean getRecurrent() {
        return recurrent;
    }

    @JsonProperty("Recurrent")
    public void setRecurrent(Boolean recurrent) {
        this.recurrent = recurrent;
    }

    @JsonProperty("CreditCard")
    public CreditCard getCreditCard() {
        return creditCard;
    }

    @JsonProperty("CreditCard")
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @JsonProperty("ProofOfSale")
    public String getProofOfSale() {
        return proofOfSale;
    }

    @JsonProperty("ProofOfSale")
    public void setProofOfSale(String proofOfSale) {
        this.proofOfSale = proofOfSale;
    }

    @JsonProperty("AcquirerTransactionId")
    public String getAcquirerTransactionId() {
        return acquirerTransactionId;
    }

    @JsonProperty("AcquirerTransactionId")
    public void setAcquirerTransactionId(String acquirerTransactionId) {
        this.acquirerTransactionId = acquirerTransactionId;
    }

    @JsonProperty("AuthorizationCode")
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    @JsonProperty("AuthorizationCode")
    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    @JsonProperty("SoftDescriptor")
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    @JsonProperty("SoftDescriptor")
    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    @JsonProperty("Credentials")
    public Credentials getCredentials() {
        return credentials;
    }

    @JsonProperty("Credentials")
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @JsonProperty("DoSplit")
    public Boolean getDoSplit() {
        return doSplit;
    }

    @JsonProperty("DoSplit")
    public void setDoSplit(Boolean doSplit) {
        this.doSplit = doSplit;
    }

    @JsonProperty("PaymentId")
    public String getPaymentId() {
        return paymentId;
    }

    @JsonProperty("PaymentId")
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("ReceivedDate")
    public String getReceivedDate() {
        return receivedDate;
    }

    @JsonProperty("ReceivedDate")
    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    @JsonProperty("CapturedAmount")
    public Integer getCapturedAmount() {
        return capturedAmount;
    }

    @JsonProperty("CapturedAmount")
    public void setCapturedAmount(Integer capturedAmount) {
        this.capturedAmount = capturedAmount;
    }

    @JsonProperty("CapturedDate")
    public String getCapturedDate() {
        return capturedDate;
    }

    @JsonProperty("CapturedDate")
    public void setCapturedDate(String capturedDate) {
        this.capturedDate = capturedDate;
    }

    @JsonProperty("Currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Provider")
    public String getProvider() {
        return provider;
    }

    @JsonProperty("Provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @JsonProperty("ExtraDataCollection")
    public List<ExtraDataCollection> getExtraDataCollection() {
        return extraDataCollection;
    }

    @JsonProperty("ExtraDataCollection")
    public void setExtraDataCollection(List<ExtraDataCollection> extraDataCollection) {
        this.extraDataCollection = extraDataCollection;
    }

    @JsonProperty("ReasonCode")
    public Integer getReasonCode() {
        return reasonCode;
    }

    @JsonProperty("ReasonCode")
    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    @JsonProperty("ReasonMessage")
    public String getReasonMessage() {
        return reasonMessage;
    }

    @JsonProperty("ReasonMessage")
    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }

    @JsonProperty("Status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("ProviderReturnCode")
    public String getProviderReturnCode() {
        return providerReturnCode;
    }

    @JsonProperty("ProviderReturnCode")
    public void setProviderReturnCode(String providerReturnCode) {
        this.providerReturnCode = providerReturnCode;
    }

    @JsonProperty("ProviderReturnMessage")
    public String getProviderReturnMessage() {
        return providerReturnMessage;
    }

    @JsonProperty("ProviderReturnMessage")
    public void setProviderReturnMessage(String providerReturnMessage) {
        this.providerReturnMessage = providerReturnMessage;
    }

    @JsonProperty("Links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(List<Link> links) {
        this.links = links;
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
