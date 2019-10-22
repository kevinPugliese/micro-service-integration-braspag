package com.payment.integration.services;

import com.payment.integration.dto.request.*;
import com.payment.integration.dto.response.AuthorizationTransactionResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class DefaultBraspagService extends IntegrationService {

    public AuthorizationTransactionResponse creditCardAuthorization(AuthorizeTransactionRequest authorizeTransactionRequest) throws RestClientException {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<AuthorizeTransactionRequest> authorizeTransactionRequestHttpEntity =
                new HttpEntity<>(authorizeTransactionRequest, getHeaders());

        ResponseEntity<AuthorizationTransactionResponse> exchange = restTemplate.exchange(
                "https://apisandbox.braspag.com.br/v2/sales",
                HttpMethod.POST,
                authorizeTransactionRequestHttpEntity,
                AuthorizationTransactionResponse.class
        );

        return exchange.getBody();
    }
}
