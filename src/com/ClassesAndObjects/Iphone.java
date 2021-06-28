package com.ClassesAndObjects;

public class Iphone {
    private IphoneModelsENUM model;
    private double price;
    private boolean isWaterResistant;

    //1st Constructor
    public Iphone(IphoneModelsENUM model, double price, boolean isWaterResistant) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    //2nd Constructor
    public Iphone(IphoneModelsENUM model){
        this.model = model;
    }

    //3rd Constructor
    public Iphone(IphoneModelsENUM model, double price){
        this(model, price, false);
        this.model = model;
        this.price = price;
    }


    public IphoneModelsENUM getModel() {
        return model;
    }

    public void setModel(IphoneModelsENUM model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) { this.price = price; }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + getModel().getModelStr() + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}
