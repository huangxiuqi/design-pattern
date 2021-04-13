package com.hxq.adapter.adapter;

import com.hxq.adapter.duck.Duck;
import com.hxq.adapter.turkey.Turkey;

/**
 * 火鸡适配器，可以将火鸡适配成鸭子
 */
public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
