package com.hxq.factory.factorymethod;

import com.hxq.factory.factorymethod.pizza.Pizza;
import com.hxq.factory.factorymethod.store.ChicagoStylePizzaStore;
import com.hxq.factory.factorymethod.store.NYStylePizzaStore;
import com.hxq.factory.factorymethod.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("张三订了一个" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("李四订了一个" + pizza.getName() + "\n");
    }
}
