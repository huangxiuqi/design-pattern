package com.hxq.state;

public class SoldOutState implements State {

    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("糖果已经售罄，不能投入硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您没有投入硬币，不能退还");
    }

    @Override
    public void turnCrank() {
        System.out.println("您没有投入硬币，转动曲柄无效");
    }

    @Override
    public void dispense() {
        System.out.println("没有糖果可以释放");
    }

    public String toString() {
        return "糖果已售罄";
    }
}
