package com.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Hristo");
        map.put(2, "Kris");
        map.put(3,"Peter");
        map.put(3,"Carla");//That duplicate overrides Peter/NOT allowed
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.keySet());

        //Loop
        for (int key : map.keySet()){
            System.out.println(map.get(key));
        }
        System.out.println(); //Loop
        for(int i=1; i<=map.size(); i++){//Begin from 1 and <=size
            System.out.println(map.get(i));
        }
        System.out.println();//Loop
        map.forEach((key, variable)-> {
            System.out.println(key +"-"+ variable);
        });

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert key to see value");
        int key = scanner.nextInt();
        String defaultV = map.getOrDefault(key, "ops this is not a default value");
        System.out.println(defaultV);
    }
}
