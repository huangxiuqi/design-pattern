package com.hxq.factory.abstractfactory.store;


import com.hxq.factory.abstractfactory.ingredient.PizzaIngredientFactory;
import com.hxq.factory.abstractfactory.ingredient.ChicagoPizzaIngredientFactory;
import com.hxq.factory.abstractfactory.pizza.CheesePizza;
import com.hxq.factory.abstractfactory.pizza.ClamPizza;
import com.hxq.factory.abstractfactory.pizza.Pizza;

/**
 * 芝加哥披萨店
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("芝加哥芝士披萨");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("芝加哥蛤蜊披萨");
        }

        return pizza;
    }
}
