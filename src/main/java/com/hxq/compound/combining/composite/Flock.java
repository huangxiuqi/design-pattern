package com.hxq.compound.combining.composite;

import com.hxq.compound.combining.Quackable;
import com.hxq.compound.combining.observer.Observable;
import com.hxq.compound.combining.observer.Observer;
import com.hxq.compound.combining.observer.QuackObservable;

import java.util.ArrayList;

public class Flock implements Quackable {

    private final ArrayList<Quackable> quackers = new ArrayList<>();
    private final QuackObservable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
