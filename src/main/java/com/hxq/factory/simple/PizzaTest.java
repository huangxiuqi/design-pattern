package com.hxq.factory.simple;

import com.hxq.factory.simple.pizza.Pizza;
import com.hxq.factory.simple.pizza.SimplePizzaFactory;

public class PizzaTest {

    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("张三订了一个" + pizza.getName() + "\n");

        pizza = pizzaStore.orderPizza("clam");
        System.out.println("李四订了一个" + pizza.getName() + "\n");
    }
}
