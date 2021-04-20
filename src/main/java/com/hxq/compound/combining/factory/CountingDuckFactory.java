package com.hxq.compound.combining.factory;

import com.hxq.compound.combining.Quackable;
import com.hxq.compound.combining.decorator.QuackCounter;
import com.hxq.compound.combining.duck.DuckCall;
import com.hxq.compound.combining.duck.MallardDuck;
import com.hxq.compound.combining.duck.RedheadDuck;
import com.hxq.compound.combining.duck.RubberDuck;

/**
 * 生产被装饰的鸭子
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
