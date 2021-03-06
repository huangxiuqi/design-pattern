package com.hxq.factory.simple;

import com.hxq.factory.simple.pizza.Pizza;
import com.hxq.factory.simple.pizza.SimplePizzaFactory;

/**
 * 披萨店
 */
public class PizzaStore {
    private final SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
