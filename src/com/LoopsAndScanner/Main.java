package com.LoopsAndScanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i<10; i++){
            System.out.println("i is: " + i);}



        int counter = 0;
        while (counter <= 10){
            System.out.println("counter: " +counter);
            counter++;
        }



        int br = 0;
        do {
            System.out.println("br is: "+br);
            br++;
        }while (br<10);




        String[] strings = {"one", "two", "three"};
        for (String str:strings
             ) {
            System.out.println("String is:" +str);
        }


        String[] stringArray = new String[10];
        for (int i=0; i<stringArray.length; i++) {
            stringArray[i] = "String no " +i;
            System.out.println(stringArray[i]);
        }

        Scanner scanner = new Scanner(System.in);
        //Insert names task
        System.out.print("Insert name:");
        String name = scanner.nextLine();
        System.out.print("Insert age:");
        String age = scanner.nextLine();
        System.out.print("Insert date of birth:");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Result: "+name +", "+age+" years old"+", "+dateOfBirth);
        //Area task
        System.out.print("Insert a=");
        int a = scanner.nextInt();
        System.out.print("Insert b=");
        int b = scanner.nextInt();
        System.out.println("Area = " +(a*b));

        String[] stringss = new String[5];
        for (int i=0; i<stringss.length; i++){
            stringss[i] = scanner.next();
            System.out.println(stringss[i]);
        }
    }
}
