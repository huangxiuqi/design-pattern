package com.hxq.decorator.beverage;

/**
 * 深焙咖啡
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "深焙";
    }

    @Override
    public double cost() {
        return .99;
    }
}
