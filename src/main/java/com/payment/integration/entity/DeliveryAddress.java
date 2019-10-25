package com.payment.integration.entity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class DeliveryAddress extends Address implements Serializable {
    private static final long serialVersionUID = 1L;

    public DeliveryAddress(Integer id, String street, String number, String complement, String zipCode, String state, String country, String district) {
        super(id, street, number, complement, zipCode, state, country, district);
    }

    public DeliveryAddress() {
    }
}
