package com.hxq.factory.factorymethod.pizza.chicago;

import com.hxq.factory.factorymethod.pizza.Pizza;

/**
 * 芝加哥风味芝士披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "芝加哥风味深盘奶酪披萨";
        dough = "加厚面团";
        sauce = "小番茄酱";

        toppings.add("意大利白干酪");
    }

    @Override
    public void cut() {
        System.out.println("将披萨切成正方形");
    }
}
