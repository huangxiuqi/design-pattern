package com.hxq.decorator.condiment;

import com.hxq.decorator.beverage.Beverage;

/**
 * 豆浆
 */
public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 豆浆";
    }
}
