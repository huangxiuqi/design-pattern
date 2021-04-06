package com.hxq.strategy.fly;

/**
 * 无法飞行
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我无法飞行");
    }
}
