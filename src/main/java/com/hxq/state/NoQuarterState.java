package com.hxq.state;

/**
 * 无硬币状态
 */
public class NoQuarterState implements State {

    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您投入了一个硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您还没有投入硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("您还没有投入硬币，转动无效");
    }

    @Override
    public void dispense() {
        System.out.println("您必须先投入硬币");
    }

    public String toString() {
        return "未投入硬币";
    }
}
