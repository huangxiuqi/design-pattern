package com.hxq.facade.component;

/**
 * 功放
 */
public class Amplifier {

    public void on() {
        System.out.println("打开功放");
    }

    public void off() {
        System.out.println("关闭功放");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("连接DVD播放器");
    }

    public void setSurroundSound() {
        System.out.println("设置为环绕立体声");
    }

    public void setVolume(int volume) {
        System.out.println("音量调到" + volume);
    }
}
