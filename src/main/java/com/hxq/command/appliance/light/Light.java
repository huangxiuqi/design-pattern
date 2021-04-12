package com.hxq.command.appliance.light;

/**
 * 灯
 */
public class Light {

    private final String name;

    public Light(String name) {
        this.name = name;
    }

    void on() {
        System.out.println("打开" + name + "的灯");
    }

    void off() {
        System.out.println("关闭" + name + "的灯");
    }
}
