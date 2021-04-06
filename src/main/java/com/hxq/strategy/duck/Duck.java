package com.hxq.strategy.duck;

import com.hxq.strategy.fly.FlyBehavior;
import com.hxq.strategy.quack.QuackBehavior;

/**
 * 所有鸭子的父类
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("所有的鸭子都可以游泳");
    }

    public abstract void display();

}
