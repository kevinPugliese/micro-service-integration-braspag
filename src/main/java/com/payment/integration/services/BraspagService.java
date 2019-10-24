package com.payment.integration.services;

import com.payment.integration.dto.request.AuthorizeTransactionRequest;
import com.payment.integration.dto.response.AuthorizationTransactionResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class BraspagService extends AbstractIntegrationService {

    @Override
    public ResponseEntity<AuthorizationTransactionResponse> creditCardAuthorization(AuthorizeTransactionRequest authorizeTransactionRequest) throws RestClientException {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<AuthorizeTransactionRequest> authorizeTransactionRequestHttpEntity =
                new HttpEntity<>(authorizeTransactionRequest, getHeaders());

        ResponseEntity<AuthorizationTransactionResponse> exchange = restTemplate.exchange(
                getCreditCardAuthorizationURL(),
                HttpMethod.POST,
                authorizeTransactionRequestHttpEntity,
                AuthorizationTransactionResponse.class
        );

        return exchange;
    }
}
