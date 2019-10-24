package com.payment.integration.facades;

import com.payment.integration.services.dto.common.*;
import com.payment.integration.services.dto.request.AuthorizeTransactionRequest;
import com.payment.integration.services.dto.request.CreditCard;
import com.payment.integration.services.dto.request.Payment;
import com.payment.integration.services.dto.response.AuthorizationTransactionResponse;
import com.payment.integration.services.dto.response.ResponseData;
import com.payment.integration.controllers.dto.CartDTO;
import com.payment.integration.services.BraspagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BraspagFacade implements BraspagFacadeInterface {

    @Autowired
    private BraspagService braspagService;

    @Override
    public ResponseData authorization(final CartDTO cartDTO) {
        ResponseEntity<AuthorizationTransactionResponse> authorizationTransactionResponseResponseEntity = braspagService.creditCardAuthorization(getAuthorizeTransaction());
        ResponseData responseData = new ResponseData();
        responseData.setMessage(authorizationTransactionResponseResponseEntity.toString());
        return responseData;
    }

    private static AuthorizeTransactionRequest getAuthorizeTransaction() {
        Address address = new Address();
        address.setCity("Sao Paulo");
        address.setComplement("AP 21");
        address.setCountry("Brasil");
        address.setDistrict("Brás");
        address.setNumber("3243");
        address.setState("SP");
        address.setStreet("Luis Antonio");
        address.setZipCode("12345987");

        DeliveryAddress deliveryAddress = new DeliveryAddress();
        deliveryAddress.setCity("Sao Paulo");
        deliveryAddress.setComplement("AP 21");
        deliveryAddress.setCountry("Brasil");
        deliveryAddress.setDistrict("Brás");
        deliveryAddress.setNumber("3243");
        deliveryAddress.setState("SP");
        deliveryAddress.setStreet("Luis Antonio");
        deliveryAddress.setZipCode("12345987");

        Customer customer = new Customer();
        customer.setBirthdate("1991-01-02");
        customer.setEmail("kevin@gmail.com");
        customer.setIdentity("12345678909");
        customer.setIdentityType("CPF");
        customer.setName("Kevin pugliese");
        customer.setAddress(address);
        customer.setDeliveryAddress(deliveryAddress);

        CreditCard creditCard = new CreditCard();
        creditCard.setBrand("Visa");
        creditCard.setCardNumber("4551870000000181");
        creditCard.setExpirationDate("12/2021");
        creditCard.setHolder("Kevin Pugliese");
        creditCard.setSaveCard("false");
        creditCard.setSecurityCode("324");

        Credentials credentials = new Credentials();
        credentials.setCode("9999999");
        credentials.setKey("D8888888");
        credentials.setPassword("LOJA9999999");
        credentials.setSignature("001");
        credentials.setUsername("#Braspag2018@NOMEDALOJA#");

        ExtraDataCollection extraDataCollection = new ExtraDataCollection();
        extraDataCollection.setName("NomeDoCampo");
        extraDataCollection.setValue("ValorDoCampo");
        Payment payment = new Payment();
        payment.setAuthenticate(false);
        payment.setCapture(true);
        payment.setCountry("BRA");
        payment.setCurrency("BRL");
        payment.setDoSplit(false);
        payment.setInstallments(1);
        payment.setInterest("ByMerchant");
        payment.setProvider("Simulado");
        payment.setType("CreditCard");
        payment.setAmount(1000);
        payment.setRecurrent(false);
        payment.setSoftDescriptor("Mensagem");
        payment.setCreditCard(creditCard);
        payment.setCredentials(credentials);
        payment.addExtraDataCollections(extraDataCollection);

        AuthorizeTransactionRequest authorizeTransactionRequest = new AuthorizeTransactionRequest();
        authorizeTransactionRequest.setMerchantOrderId("2017051002");
        authorizeTransactionRequest.setCustomer(customer);
        authorizeTransactionRequest.setPayment(payment);

        return authorizeTransactionRequest;
    }
}
