package com.hxq.compound.combining.duck;

import com.hxq.compound.combining.Quackable;
import com.hxq.compound.combining.observer.Observable;
import com.hxq.compound.combining.observer.Observer;

/**
 * 绿头鸭
 */
public class MallardDuck implements Quackable {

    private final Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "绿头鸭";
    }
}
