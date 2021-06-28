package com.MethodsAndStatics;

import java.util.Arrays;

public class TheObjectClass {
    public static void main(String[] args) {
        Object name = "jamile";
        System.out.println(name.equals("dsa"));
        Object [] names = {"jammie", "mike"};
        System.out.println("Array: "+Arrays.toString(names));
        System.out.println("Length: "+names.length);
        System.out.println("Last element: "+names[names.length-1]);
    }
}
