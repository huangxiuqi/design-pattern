package com.hxq.factory.abstractfactory.pizza;

import com.hxq.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    private final PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备：" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }

    @Override
    public void cut() {
        System.out.println("将披萨切成正方形");
    }
}
