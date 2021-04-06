package com.hxq.observer.observer;

import com.hxq.observer.observable.Observable;

/**
 * 观察者
 */
public interface Observer {

    void update(Observable observable, Object args);
}
