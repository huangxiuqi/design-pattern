package com.hxq.factory.abstractfactory;


import com.hxq.factory.abstractfactory.pizza.Pizza;
import com.hxq.factory.abstractfactory.store.ChicagoStylePizzaStore;
import com.hxq.factory.abstractfactory.store.NYStylePizzaStore;
import com.hxq.factory.abstractfactory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("张三订了一个" + pizza.toString() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("李四订了一个" + pizza.toString() + "\n");
    }
}
