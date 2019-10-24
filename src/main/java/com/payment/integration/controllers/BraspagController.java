package com.payment.integration.controllers;

import com.payment.integration.facades.BraspagFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/braspag")
public class BraspagController {

    @Autowired
    private BraspagFacade braspagFacade;

    @GetMapping(name = "/hello")
    public String getHello() {
        System.out.println("Ola mundo");

        String authorization = braspagFacade.authorization();

        return authorization;
    }
}
