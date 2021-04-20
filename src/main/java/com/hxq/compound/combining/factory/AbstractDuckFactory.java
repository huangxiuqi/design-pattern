package com.hxq.compound.combining.factory;

import com.hxq.compound.combining.Quackable;

/**
 * 鸭子抽象工厂
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
