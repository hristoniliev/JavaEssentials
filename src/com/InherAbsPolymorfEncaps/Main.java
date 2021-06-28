package com.InherAbsPolymorfEncaps;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Animal animal = new Animal("Edi"); No longer valid because it is abstract class
        Dog dog = new Dog("Flex", "Bulldog");
        System.out.println(dog.getName() + " is a "+dog.getBreed());
        System.out.println(dog);
        System.out.print("He is making that sound: ");
        dog.makeSound(); //Polymorphism

        Cat cat = new Cat("Rosie");
        System.out.print(cat.getNameFromInterface() + " is making sound: ");
        cat.makeSound(); //Polymorphism

        SuperMath superMath = new SuperMath();
        System.out.println(superMath.add(2,45));
        System.out.println(superMath.add(2,45, 3));

    }
}
