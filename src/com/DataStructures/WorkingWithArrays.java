package com.DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = new int[4];
        numbers2[0] = 1;
        numbers2[1] = 10;
        numbers2[2] = 100;
        numbers2[3] = 1000;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //Next Example

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many friends are you gonna add ?");
        int input = scanner.nextInt();
        String[] friends = new String[input];
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter friends name " +(i+1)+": ");
            friends[i] = scanner.next();
        }
        System.out.println("Your friends are: "+Arrays.toString(friends));
        scanner.close();

    }
}
