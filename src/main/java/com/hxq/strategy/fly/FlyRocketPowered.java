package com.hxq.strategy.fly;

/**
 * 火箭动力飞行
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我使用一个火箭作为动力飞行");
    }
}
