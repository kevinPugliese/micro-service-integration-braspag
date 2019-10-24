package com.payment.integration.services.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.payment.integration.services.dto.common.Customer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizeTransactionRequest {
    private String merchantOrderId;
    private Customer customer;
    private Payment payment;

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "{" +
                "'merchantOrderId':'" + merchantOrderId + '\'' +
                ", " + customer +
                ", " + payment +
                '}';
    }
}
