package com.hxq.facade.component;

/**
 * DVD播放器
 */
public class DvdPlayer {

    public void on() {
        System.out.println("打开DVD播放器");
    }

    public void off() {
        System.out.println("关闭DVD播放器");
    }

    public void play(String movie) {
        System.out.println("开始播放" + movie);
    }

    public void stop() {
        System.out.println("停止播放");
    }

    public void eject() {
        System.out.println("弹出碟片");
    }
}
