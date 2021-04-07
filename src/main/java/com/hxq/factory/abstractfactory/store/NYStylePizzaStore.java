package com.hxq.factory.abstractfactory.store;


import com.hxq.factory.abstractfactory.ingredient.NYPizzaIngredientFactory;
import com.hxq.factory.abstractfactory.ingredient.PizzaIngredientFactory;
import com.hxq.factory.abstractfactory.pizza.CheesePizza;
import com.hxq.factory.abstractfactory.pizza.ClamPizza;
import com.hxq.factory.abstractfactory.pizza.Pizza;

/**
 * 纽约披萨店
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("纽约芝士披萨");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("纽约蛤蜊披萨");
        }

        return pizza;
    }
}
