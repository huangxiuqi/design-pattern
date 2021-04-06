package com.hxq.strategy.duck;

import com.hxq.strategy.fly.FlyNoWay;
import com.hxq.strategy.quack.Quack;

/**
 * 模型鸭
 * 不会飞行
 * 呱呱叫
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
