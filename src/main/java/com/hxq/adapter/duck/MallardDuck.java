package com.hxq.adapter.duck;

/**
 * 绿头鸭
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("我可以飞");
    }
}
