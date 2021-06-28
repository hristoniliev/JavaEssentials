package com.MethodsAndStatics;

import java.util.ArrayList;
import java.util.List;

public class Statics {

    public static String BRAND = "ICO"; //(final) when we dont want to change it ever
                                        //static is a MUST here to access it
    public static List list;
    static {
        list = new ArrayList();
        list.add("something");
    }

    public static void main(String[] args) {
        System.out.println(BRAND);
        Person alex = new Person("alex");
        System.out.println(alex.name);
        System.out.println(BRAND);
        Person bob = new Person("Bob");
        System.out.println(bob.name);
        System.out.println(BRAND);
        System.out.println(Person.createdPeople);
    }

     static class Person{
        static int createdPeople = 0;
        String name;
        public Person(String name) {
            this.name = name;
            createdPeople++;
            Statics.BRAND = name.toUpperCase();
        }
    }
}
