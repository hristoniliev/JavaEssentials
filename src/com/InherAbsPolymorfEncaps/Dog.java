package com.InherAbsPolymorfEncaps;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("bark bark");
    }

    @Override
    public String toString() {
        return "Dog{Name= " + getName()+
                " breed='" + breed + '\'' +
                '}';
    }
}
