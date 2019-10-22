package com.payment.integration.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    private String name;
    private String identity;
    private String identityType;
    private String email;
    private String birthdate;
    private Address address;
    private DeliveryAddress deliveryAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "'customer': {" +
                "name:' " + name + '\'' +
                ", 'identity':'" + identity + '\'' +
                ", 'identityType':'" + identityType + '\'' +
                ", 'email':'" + email + '\'' +
                ", 'birthdate': '" + birthdate + '\'' +
                ", " + address +
                ", " + deliveryAddress +
                '}';
    }
}
