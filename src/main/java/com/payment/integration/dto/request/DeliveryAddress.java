package com.payment.integration.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryAddress {
    private String street;
    private String number;
    private String complement;
    private String zipCode;
    private String city;
    private String state;
    private String country;
    private String district;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "'deliveryAddress': {" +
                "'street':'" + street + '\'' +
                ", 'number':'" + number + '\'' +
                ", 'complement':'" + complement + '\'' +
                ", 'zipCode':'" + zipCode + '\'' +
                ", 'city':'" + city + '\'' +
                ", 'state':'" + state + '\'' +
                ", 'country':'" + country + '\'' +
                ", 'district':'" + district + '\'' +
                '}';
    }
}
