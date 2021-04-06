package com.hxq.strategy.duck;

import com.hxq.strategy.fly.FlyWithWings;
import com.hxq.strategy.quack.Quack;

/**
 * 绿头鸭
 * 可以飞行
 * 呱呱叫
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
