package com.hxq.compound.combining.factory;

import com.hxq.compound.combining.Quackable;
import com.hxq.compound.combining.duck.DuckCall;
import com.hxq.compound.combining.duck.MallardDuck;
import com.hxq.compound.combining.duck.RedheadDuck;
import com.hxq.compound.combining.duck.RubberDuck;

/**
 * 没有被装饰的鸭子
 */
public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
