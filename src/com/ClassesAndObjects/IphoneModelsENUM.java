package com.ClassesAndObjects;

public enum IphoneModelsENUM {
    IPHONE_7("iPhone 7"),
    IPHONE_10S("iPhone 10S"),
    IPHONE_6S("iPhone 6S"),
    IPHONE_8("iPhone 8");

    private String modelStr;

    IphoneModelsENUM(String modelStr) {
        this.modelStr = modelStr;
    }

    public String getModelStr() {
        return modelStr;
    }
}
