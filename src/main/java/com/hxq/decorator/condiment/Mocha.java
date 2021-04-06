package com.hxq.decorator.condiment;

import com.hxq.decorator.beverage.Beverage;

/**
 * 摩卡
 */
public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 摩卡";
    }
}
