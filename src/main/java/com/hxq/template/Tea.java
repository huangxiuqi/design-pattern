package com.hxq.template;

/**
 * 茶
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("泡茶");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }
}
