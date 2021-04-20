package com.hxq.compound.combining.observer;


public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
