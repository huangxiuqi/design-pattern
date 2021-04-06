package com.hxq.observer.observer;

import com.hxq.observer.DisplayElement;
import com.hxq.observer.observable.Observable;
import com.hxq.observer.observable.WeatherData;

/**
 * 当前状态布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.registerObserver(this);
        this.observable = observable;
    }

    @Override
    public void update(Observable observable, Object args) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature + "摄氏度；当前湿度：" + humidity + "%");
    }
}
