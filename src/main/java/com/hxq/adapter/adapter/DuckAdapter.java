package com.hxq.adapter.adapter;

import com.hxq.adapter.duck.Duck;
import com.hxq.adapter.turkey.Turkey;

import java.util.Random;

/**
 * 鸭子适配器，可以将鸭子适配成火鸡
 */
public class DuckAdapter implements Turkey {

    private final Duck duck;
    private final Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
