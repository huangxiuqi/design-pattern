package com.hxq.factory.factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("准备：" + name);
        System.out.println("揉面团");
        System.out.println("添加酱料");
        System.out.println("添加配料：");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("沿对角线切分披萨");
    }

    public void box() {
        System.out.println("将披萨装盒");
    }

    public String getName() {
        return name;
    }
}
