package com.hxq.factory.abstractfactory.ingredient;

import com.hxq.factory.abstractfactory.ingredient.cheese.Cheese;
import com.hxq.factory.abstractfactory.ingredient.clam.Clam;
import com.hxq.factory.abstractfactory.ingredient.dough.Dough;
import com.hxq.factory.abstractfactory.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clam createClam();
}
