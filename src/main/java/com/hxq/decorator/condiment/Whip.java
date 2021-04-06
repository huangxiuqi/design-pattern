package com.hxq.decorator.condiment;

import com.hxq.decorator.beverage.Beverage;

/**
 * 奶泡
 */
public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 奶泡";
    }
}
