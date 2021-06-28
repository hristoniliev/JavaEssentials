package com.DealingWithMoney;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	    /*
        double numberOne = 0.02;
	    double numberTwo = 0.03;                Do NOT use double when work with money
	    double result = numberTwo - numberOne;
        System.out.println(result);             The result is 0.0099999999999998 instead of 0.01
        */
        BigDecimal numberOne = new BigDecimal("0.02");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);
        System.out.println(result);

        //Compare with BigDecimal     Returns -1,0,1(<, ==, >)
        System.out.println(numberOne.compareTo(numberTwo));

        if(numberTwo.compareTo(numberOne)>0) System.out.println("Greater");

    }
}
