package com.hxq.template;

/**
 * 咖啡因饮料超类
 */
public abstract class CaffeineBeverage {

    /**
     * 制作算法被封装起来，且不允许修改
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * 差异部分需要由子类实现
     */
    public abstract void brew();

    public abstract void addCondiments();

    /**
     * 相同部分由超类实现
     */
    public void boilWater() {
        System.out.println("烧开水");
    }

    public void pourInCup() {
        System.out.println("倒进杯子");
    }

    /**
     * 钩子方法
     */
    public boolean customerWantsCondiments() {
        return true;
    }
}
