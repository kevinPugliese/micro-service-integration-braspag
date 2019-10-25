package com.payment.integration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String identity;
    private Address address;
    private DeliveryAddress deliveryAddress;us


    /**
     *
     * customer.setBirthdate("1991-01-02");
     *         customer.setEmail("kevin@gmail.com");
     *         customer.setIdentity("12345678909");
     *         customer.setIdentityType("CPF");
     *         customer.setName("Kevin pugliese");
     *         customer.setAddress(address);
     *         customer.setDeliveryAddress(deliveryAddress);
     *
     */
}
