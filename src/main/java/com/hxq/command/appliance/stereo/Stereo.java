package com.hxq.command.appliance.stereo;

/**
 * 音响
 */
public class Stereo {

    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("打开" + name + "的音响");
    }

    public void off() {
        System.out.println("关闭" + name + "的音响");
    }

    public void setCd() {
        System.out.println("向" + name + "的音响插入CD");
    }

    public void setDvd() {
        System.out.println("向" + name + "的音响插入DVD");
    }

    public void setVolume(int volume) {
        System.out.println("把" + name + "的音响音量设置为" + volume);
    }
}
