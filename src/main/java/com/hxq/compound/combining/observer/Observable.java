package com.hxq.compound.combining.observer;

import java.util.ArrayList;

public class Observable implements QuackObservable {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private final QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
