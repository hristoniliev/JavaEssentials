package com.ClassesAndObjects;

public class Classes {
    public static void main(String[] args){
    Iphone iphone10s = new Iphone(IphoneModelsENUM.IPHONE_10S, 200.00, true);//1st Const with 3par
        iphone10s.setPrice(300.00);
        System.out.println(iphone10s.getModel().getModelStr());
        System.out.println(iphone10s.getPrice());
        System.out.println(iphone10s.isWaterResistant());
        System.out.println();

        Iphone iphone8 = new Iphone(IphoneModelsENUM.IPHONE_8);//2nd Constructor with 1 param
        System.out.println(iphone8.getModel().getModelStr());
        System.out.println(iphone8.getPrice());//No Price Set
        System.out.println(iphone8.isWaterResistant());//No Resistant Set
        System.out.println();

        Iphone iphone6s = new Iphone(IphoneModelsENUM.IPHONE_6S, 100.00);//3rd Constructor with 2 parameters
        System.out.println(iphone6s.getModel().getModelStr());
        System.out.println(iphone6s.getPrice());
        System.out.println(iphone6s.isWaterResistant()); //Resistance set in this() in constructor

        System.out.println(iphone10s);
        System.out.println(iphone6s);
        System.out.println(iphone8);
    }
}
