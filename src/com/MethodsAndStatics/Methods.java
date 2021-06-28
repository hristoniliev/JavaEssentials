package com.MethodsAndStatics;

import java.time.LocalDate;
import java.time.LocalTime;

public class Methods {
    public static void main(String[] args) {
        int x = incrementNumber(0);
        //System.out.println(incrementNumber(0));
        System.out.println(x);
        print(x, "Hristo");
        var date = getCurrentDate();
        var time = getCurrentTime();
        //System.out.println(getCurrentDate());
        System.out.println(date +"  "+ time);

    }
    private static int incrementNumber(int value){
        return value+3;
    }

    private static void print(int value, String name){
        System.out.println(value + name);
    }
    private static LocalDate getCurrentDate(){
        return LocalDate.now();
    }
    private static LocalTime getCurrentTime(){
        return LocalTime.now();
    }
}
