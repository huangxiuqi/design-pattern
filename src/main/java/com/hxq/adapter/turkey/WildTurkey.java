package com.hxq.adapter.turkey;

/**
 * 野火鸡
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("我可以短距离飞行");
    }
}
