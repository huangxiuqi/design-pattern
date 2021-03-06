package com.hxq.compound.combining.decorator;

import com.hxq.compound.combining.Quackable;
import com.hxq.compound.combining.observer.Observer;

/**
 * 呱呱叫计数装饰器
 */
public class QuackCounter implements Quackable {

    private final Quackable duck;

    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
