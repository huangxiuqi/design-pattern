package com.hxq.compound.combining.duck;

import com.hxq.compound.combining.Quackable;
import com.hxq.compound.combining.observer.Observable;
import com.hxq.compound.combining.observer.Observer;

/**
 * 鸭鸣器
 */
public class DuckCall implements Quackable {

    private final Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
        return "鸭鸣器";
    }
}
