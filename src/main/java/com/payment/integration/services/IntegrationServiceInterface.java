package com.payment.integration.services;

import com.payment.integration.dto.request.AuthorizeTransactionRequest;
import com.payment.integration.dto.response.AuthorizationTransactionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

public interface IntegrationServiceInterface {
    ResponseEntity<AuthorizationTransactionResponse> creditCardAuthorization(AuthorizeTransactionRequest authorizeTransactionRequest) throws RestClientException;
}
