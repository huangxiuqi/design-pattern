package com.hxq.factory.abstractfactory.ingredient;

import com.hxq.factory.abstractfactory.ingredient.cheese.Cheese;
import com.hxq.factory.abstractfactory.ingredient.cheese.ReggianoCheese;
import com.hxq.factory.abstractfactory.ingredient.clam.Clam;
import com.hxq.factory.abstractfactory.ingredient.clam.FreshClam;
import com.hxq.factory.abstractfactory.ingredient.dough.Dough;
import com.hxq.factory.abstractfactory.ingredient.dough.ThinCrustDough;
import com.hxq.factory.abstractfactory.ingredient.sauce.MarinaraSauce;
import com.hxq.factory.abstractfactory.ingredient.sauce.Sauce;

/**
 * 纽约原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
