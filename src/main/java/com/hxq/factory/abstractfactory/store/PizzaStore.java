package com.hxq.factory.abstractfactory.store;


import com.hxq.factory.abstractfactory.pizza.Pizza;

/**
 * 抽象披萨店
 */
public abstract class PizzaStore {

    /**
     * 加盟店能使用不同的原料，不能修改制作流程
     * @param type
     * @return
     */
    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
