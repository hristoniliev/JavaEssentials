package com.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {
    public static void main(String[] args) throws FileNotFoundException{
        //Checked exceptions
        FileInputStream inputStream = new FileInputStream("src/example.txt");
        //Or use try-catch block
        /*
        try{FileInputStream inputStream = new FileInputStream("src/example.txt")}
        catch(FileNotFoundExceptions e){e.printStackTrace();}
        * */

        //Unchecked exceptions
        try{
            var result = 10/0;
            System.out.println("result");
        }catch (ArithmeticException | NullPointerException | NumberFormatException e) {
            System.out.println("cannot divide number by 0");
        }finally {
            System.out.println("cleaning up..."); //Always executes
        }
        double number = performDivision(10,0);
    }

    static double performDivision(double a, double b) {
        if(b==0){
            throw new MyException("Cannot divide by zero(custom exception)");
        }
        return a/b;
    }

    static class MyException extends RuntimeException{
        public MyException(String message) {
            super(message);
        }
    }
}
