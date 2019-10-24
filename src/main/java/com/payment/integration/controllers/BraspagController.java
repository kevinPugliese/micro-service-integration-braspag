package com.payment.integration.controllers;

import com.payment.integration.services.dto.response.ResponseData;
import com.payment.integration.facades.BraspagFacade;
import com.payment.integration.controllers.dto.CartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/braspag")
public class BraspagController {

    @Autowired
    private BraspagFacade braspagFacade;

    @PostMapping(value = "/credit-card-authorization")
    public ResponseEntity<ResponseData> getAuthorization(@Valid @RequestBody final CartDTO cartDTO) {
        ResponseData responseData = braspagFacade.authorization(cartDTO);
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
