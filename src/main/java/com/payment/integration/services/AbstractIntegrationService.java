package com.payment.integration.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public abstract class IntegrationService {

    @Value("${braspag.merchant.id}")
    private String merchantId;

    @Value("${braspag.merchant.key}")
    private String merchantKey;

    @Value("${braspag.integration.url}")
    private String braspagURL;

    private static final String CREDIT_CARD_AUTHORIZATION_URI = "/v2/sales";

    @Bean
    public HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("MerchantId", merchantId);
        headers.set("MerchantKey", merchantKey);

        return  headers;
    }

    @Bean
    public String getCreditCardAuthorizationURL() {
        return braspagURL + CREDIT_CARD_AUTHORIZATION_URI;
    }
}
