package com.hxq.factory.simple.pizza;

public abstract class Pizza {

    protected String name;

    public void prepare() {
        System.out.println("准备：" + name);
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
