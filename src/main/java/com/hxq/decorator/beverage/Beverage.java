package com.hxq.decorator.beverage;

/**
 * 饮料超类
 */
public abstract class Beverage {

    /**
     * 饮料的描述
     */
    String description = "未知饮料";

    public String getDescription() {
        return description;
    }

    /**
     * 计算价格
     * @return
     */
    public abstract double cost();
}
