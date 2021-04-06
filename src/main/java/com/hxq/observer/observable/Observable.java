package com.hxq.observer.observable;

import com.hxq.observer.observer.Observer;

/**
 * 被观察者
 */
public interface Observable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void notifyObservers(Object args);
}
