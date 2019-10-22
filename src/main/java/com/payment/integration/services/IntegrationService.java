package com.payment.integration.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

@Configuration
public class IntegrationService {

    @Value("${braspag.merchant.id}")
    private String merchatId;

    @Value("${braspag.cartaoprotegido.merchant.id}")
    private String merchatKey;

    public HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("MerchantId", getMerchatId());
        headers.set("MerchantKey", getMerchatKey());

        return  headers;
    }

    public String getMerchatId() {
        return merchatId;
    }

    public void setMerchatId(String merchatId) {
        this.merchatId = merchatId;
    }

    public String getMerchatKey() {
        return merchatKey;
    }

    public void setMerchatKey(String merchatKey) {
        this.merchatKey = merchatKey;
    }
}
