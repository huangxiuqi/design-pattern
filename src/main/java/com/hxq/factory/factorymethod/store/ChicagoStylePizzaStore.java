package com.hxq.factory.factorymethod.store;

import com.hxq.factory.factorymethod.pizza.Pizza;
import com.hxq.factory.factorymethod.pizza.chicago.ChicagoStyleCheesePizza;
import com.hxq.factory.factorymethod.pizza.chicago.ChicagoStyleClamPizza;
import com.hxq.factory.factorymethod.pizza.chicago.ChicagoStylePepperoniPizza;
import com.hxq.factory.factorymethod.pizza.chicago.ChicagoStyleVeggiePizza;

/**
 * 芝加哥风味披萨店
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }

        throw new RuntimeException("未知披萨");
    }
}
