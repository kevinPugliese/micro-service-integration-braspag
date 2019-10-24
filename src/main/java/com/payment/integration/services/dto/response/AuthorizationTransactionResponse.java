package com.payment.integration.services.dto.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.payment.integration.services.dto.common.Customer;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MerchantOrderId",
        "Customer",
        "Payment"
})
public class AuthorizationTransactionResponse {

    @JsonProperty("MerchantOrderId")
    private String merchantOrderId;
    @JsonProperty("Customer")
    private Customer customer;
    @JsonProperty("Payment")
    private Payment payment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MerchantOrderId")
    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    @JsonProperty("MerchantOrderId")
    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    @JsonProperty("Customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("Customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("Payment")
    public Payment getPayment() {
        return payment;
    }

    @JsonProperty("Payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
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
