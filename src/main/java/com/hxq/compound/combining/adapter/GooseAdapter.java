package com.hxq.compound.combining.adapter;

import com.hxq.compound.combining.goose.Goose;
import com.hxq.compound.combining.Quackable;
import com.hxq.compound.combining.observer.Observable;
import com.hxq.compound.combining.observer.Observer;

/**
 * 鹅适配器
 */
public class GooseAdapter implements Quackable {

    private final Observable observable;
    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "装作是鸭的鹅";
    }
}
