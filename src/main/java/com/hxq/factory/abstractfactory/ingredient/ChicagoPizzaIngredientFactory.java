package com.hxq.factory.abstractfactory.ingredient;

import com.hxq.factory.abstractfactory.ingredient.PizzaIngredientFactory;
import com.hxq.factory.abstractfactory.ingredient.cheese.Cheese;
import com.hxq.factory.abstractfactory.ingredient.cheese.MozzarellaCheese;
import com.hxq.factory.abstractfactory.ingredient.clam.Clam;
import com.hxq.factory.abstractfactory.ingredient.clam.FrozenClam;
import com.hxq.factory.abstractfactory.ingredient.dough.Dough;
import com.hxq.factory.abstractfactory.ingredient.dough.ThickCrustDough;
import com.hxq.factory.abstractfactory.ingredient.sauce.PlumTomatoSauce;
import com.hxq.factory.abstractfactory.ingredient.sauce.Sauce;

/**
 * 芝加哥原料工厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
