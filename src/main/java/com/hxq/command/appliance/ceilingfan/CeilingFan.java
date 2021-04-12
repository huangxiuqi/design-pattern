package com.hxq.command.appliance.ceilingfan;

/**
 * 吊扇
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String name;
    private int speed;

    public CeilingFan(String name) {
        this.name = name;
    }

    /**
     * 高档
     */
    public void high() {
        this.speed = HIGH;
        System.out.println(name + "的吊扇设置为高档");
    }

    /**
     * 中档
     */
    public void medium() {
        this.speed = MEDIUM;
        System.out.println(name + "的吊扇设置为中档");
    }

    /**
     * 低档
     */
    public void low() {
        this.speed = LOW;
        System.out.println(name + "的吊扇设置为低档");
    }

    /**
     * 关闭
     */
    public void off() {
        this.speed = OFF;
        System.out.println(name + "的吊扇设置为关闭");
    }

    public int getSpeed() {
        return speed;
    }
}
