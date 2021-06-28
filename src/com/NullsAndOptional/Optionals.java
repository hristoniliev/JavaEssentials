package com.NullsAndOptional;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String brand = null;
        String theBrand = Optional.ofNullable(brand).orElse("Brand is null");
        System.out.println(theBrand);

        String name = null;
        String theName = Optional.ofNullable(name).orElseGet(()-> {
            //logic
            return "Name is null";
        });
        System.out.println(theName);

        String name2 = "Hristo";
        String theName2 = Optional.ofNullable(name2).map(String::toUpperCase).orElseGet(()->{
            //logic
            return "Name2 is null";
        });
        System.out.println(theName2);
    }
}
