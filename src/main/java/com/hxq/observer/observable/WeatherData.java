package com.hxq.observer.observable;

import com.hxq.observer.observer.Observer;

import java.util.ArrayList;

/**
 * 气象站数据对象
 */
public class WeatherData implements Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    private final ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > -1) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object args) {
        for (Observer observer : observers) {
            observer.update(this, args);
        }
    }
}
