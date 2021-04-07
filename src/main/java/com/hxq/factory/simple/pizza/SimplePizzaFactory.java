package com.hxq.factory.simple.pizza;

import com.hxq.factory.simple.pizza.Pizza;

/**
 * 简单披萨工厂
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("clam")) {
            return new ClamPizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }

        throw new RuntimeException("未知披萨");
    }
}
