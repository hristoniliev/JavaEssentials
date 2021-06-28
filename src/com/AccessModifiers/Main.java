package com.AccessModifiers;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lens lensOne = new Lens(
                "Sony",
                "85mm",
                true);
        Lens lensTwo = new Lens(
                "Sony",
                "35mm",
                true);
        Lens lensThree = new Lens(
                "Sony",
                "24-70mm",
                true);
        System.out.println("Lens 1: "+
                lensOne.getBrand() +
                lensOne.getFocalLength() +
                lensOne.isPrime());
        Passport ukPassport = new Passport("123456789",
                LocalDate.of(2025, 12, 30),
                "UK");
        Passport usPassport = new Passport("123458769",
                LocalDate.of(2026, 07, 13),
                "US");
        System.out.println("Pass1: " +
                        ukPassport.getCountry()+
                        ukPassport.getNumber());
    }
}
