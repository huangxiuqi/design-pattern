package com.hxq.observer;

import com.hxq.observer.observable.WeatherData;
import com.hxq.observer.observer.CurrentConditionsDisplay;
import com.hxq.observer.observer.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        // 气象数据对象
        WeatherData weatherData = new WeatherData();

        // 创建布告板
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // 更新气象数据
        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(32, 70, 29.2f);
        weatherData.setMeasurements(29, 90, 29.4f);
    }
}
