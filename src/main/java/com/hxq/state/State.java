package com.hxq.state;

public interface State {

    /**
     * 投入硬币
     */
    void insertQuarter();

    /**
     * 退出硬币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
