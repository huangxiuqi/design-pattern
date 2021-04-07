package com.hxq.factory.factorymethod.pizza.newyork;

import com.hxq.factory.factorymethod.pizza.Pizza;

/**
 * 纽约风味芝士披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "纽约风味酱料和芝士披萨";
        dough = "薄皮面团";
        sauce = "意大利西红柿酱";

        toppings.add("碎芝士奶酪");
    }
}
