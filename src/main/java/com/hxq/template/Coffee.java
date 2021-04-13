package com.hxq.template;

/**
 * 咖啡
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("冲泡咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
