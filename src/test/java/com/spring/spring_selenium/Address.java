package com.spring.spring_selenium;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;

    public Address(){
        this.street = "Jl.Bogowanto";
    }

    public String getStreet() {
        return street;
    }
}
