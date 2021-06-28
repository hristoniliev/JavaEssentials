package com.AccessModifiers;

public class Lens {
    private String brand;
    private String focalLength;
    boolean isPrime;
    private String model;
    private double weight;
    private double price;

    public Lens(String brand, String focalLength, boolean isPrime) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.isPrime = isPrime;
    }

    public String getBrand() {
        return brand;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public boolean isPrime() {
        return isPrime;
    }
}
