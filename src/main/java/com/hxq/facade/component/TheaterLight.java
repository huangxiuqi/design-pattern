package com.hxq.facade.component;

/**
 * 灯
 */
public class TheaterLight {

    public void on() {
        System.out.println("打开灯");
    }

    public void dim(int brightness) {
        System.out.println("灯光亮度调整为" + brightness + "%");
    }

    public void off() {
        System.out.println("关灯");
    }
}
