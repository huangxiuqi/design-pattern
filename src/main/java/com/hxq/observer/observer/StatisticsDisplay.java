package com.hxq.observer.observer;

import com.hxq.observer.DisplayElement;
import com.hxq.observer.observable.Observable;
import com.hxq.observer.observable.WeatherData;

/**
 * 统计布告板
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float min = Float.MAX_VALUE;
    private float max = Float.MIN_VALUE;
    private float avg;

    public StatisticsDisplay(Observable observable) {
        observable.registerObserver(this);
        this.observable = observable;
    }


    @Override
    public void display() {
        System.out.println("平均/最高/最低温度：" + avg + "/" + max + "/" + min);
    }

    @Override
    public void update(Observable observable, Object args) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            float temperature = weatherData.getTemperature();
            if (temperature < min) {
                min = temperature;
            }
            if (temperature > max) {
                max = temperature;
            }
            avg = (max + min) / 2;
            display();
        }
    }
}
