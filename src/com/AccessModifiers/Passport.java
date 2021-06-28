package com.AccessModifiers;

import java.time.LocalDate;

public class Passport {
    private String number;
    private LocalDate expiryDate;
    private String country;


    public Passport(String number, LocalDate expiryDate, String country) {
        this.number = number;
        this.expiryDate = expiryDate;
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCountry() {
        return country;
    }
}
