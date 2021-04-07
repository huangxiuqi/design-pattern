package com.hxq.factory.factorymethod.store;

import com.hxq.factory.factorymethod.pizza.Pizza;
import com.hxq.factory.factorymethod.pizza.newyork.NYStyleCheesePizza;
import com.hxq.factory.factorymethod.pizza.newyork.NYStyleClamPizza;
import com.hxq.factory.factorymethod.pizza.newyork.NYStylePepperoniPizza;
import com.hxq.factory.factorymethod.pizza.newyork.NYStyleVeggiePizza;

/**
 * 纽约风格披萨店
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }

        throw new RuntimeException("未知披萨");
    }
}
