package com.MethodsAndStatics;

import java.util.List;
import java.util.Scanner;

public class PrimitivesAndTheirObjects {
    public static void main(String[] args) {
        Integer number = 1;
        //number.equals(2);
        System.out.println(number.equals(3));

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Compare(x, y);

        List<Double> numbers = null;
        numbers.add(1.00);

        Integer num = null;
        //int num = null; WRONG

    }
    public static void Compare(Integer x, Integer y){
        if(x>y) System.out.println(x);
        else if(x.equals(y))System.out.println("Equal");
        else System.out.println(y);
    }
}
