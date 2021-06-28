package com.NullsAndOptional;

public class Main {

    public static void main(String[] args) {
	    var brand = "iliev";
        System.out.println(brand.toUpperCase());

        String brandOne = null;
        //System.out.println(brandOne.toUpperCase()); //NullPointerException. Do not invoke methods to null values
        if(brandOne != null){
            System.out.println(brandOne);               //Way to handle null values
        }else System.out.println("Brand is null");

        try{
            System.out.println(brandOne.toUpperCase()); ////Another way to handle null values
        }catch (NullPointerException e){
            System.out.println("Brand is null and exception handled");
        }
    }
}
