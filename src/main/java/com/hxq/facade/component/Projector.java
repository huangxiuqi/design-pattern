package com.hxq.facade.component;

/**
 * 投影仪
 */
public class Projector {

    public void on() {
        System.out.println("打开投影仪");
    }

    public void off() {
        System.out.println("关闭投影仪");
    }

    public void setInput(String input) {
        System.out.println("设置为" + input + "模式");
    }

    public void wideScreenMode() {
        System.out.println("设置为宽屏模式");
    }
}
