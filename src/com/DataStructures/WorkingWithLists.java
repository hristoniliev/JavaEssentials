package com.DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        //int[]  numbers = {1,2,3,4};
        List<Integer> numbers = new ArrayList<>();
        List<String> names = new ArrayList();
        numbers.add(1);
        numbers.add(24533);
        numbers.add(1000897678);
        numbers.add(2093);
        System.out.println(numbers);

        for (Object number : numbers) {
            System.out.println(number);

        }
        System.out.println();
        numbers.remove(3);
        numbers.add(3,1232123);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        Collections.sort(numbers);
        System.out.println("Sorted list: "+numbers);

    }
}
