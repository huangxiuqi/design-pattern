package com.hxq.decorator.condiment;

import com.hxq.decorator.beverage.Beverage;

/**
 * 调料装饰者
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
