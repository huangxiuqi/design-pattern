package com.hxq.state;

/**
 *
 */
public class SoldState implements State {

    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请稍等，正在释放糖果");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("抱歉，您已经转动曲柄，不能退还硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("多次转动曲柄也不能给您其他的糖果");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public String toString() {
        return "正在释放糖果";
    }
}
