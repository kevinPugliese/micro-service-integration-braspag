package com.payment.integration.services;

import com.payment.integration.entity.Address;
import com.payment.integration.entity.DeliveryAddress;
import com.payment.integration.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DBService {

    @Autowired
    private AddressRepository addressRepository;

    public void instantiateTestDatabase() {

        Address address = new Address(null, "Santa Maria", "33", "Ap 43", "02000300", "SP", "Brasil", "Vila Cardozo");
        DeliveryAddress deliveryAddress = new DeliveryAddress(null, "Santa Marta", "33", "Ap 43", "02000300", "SP", "Brasil", "Vila Cardozo");


        addressRepository.saveAll(Arrays.asList(address, deliveryAddress));
    }
}
