package com.InherAbsPolymorfEncaps;

public class Cat implements AnimalInterface{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getNameFromInterface() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Miaow Miaow");
    }

}
