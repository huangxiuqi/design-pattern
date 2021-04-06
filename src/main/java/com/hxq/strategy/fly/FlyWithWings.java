package com.hxq.strategy.fly;

/**
 * 使用翅膀飞行
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我使用翅膀飞行");
    }
}
