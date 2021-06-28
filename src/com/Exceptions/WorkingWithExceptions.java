package com.Exceptions;

public class WorkingWithExceptions {
    public static void main(String[] args) {
        String brand = null;
        try{
            System.out.println(brand.length());
        }catch (Exception e){
            System.out.println("Brand is null" + e);
        }
    }
}
