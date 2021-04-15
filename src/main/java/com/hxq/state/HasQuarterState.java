package com.hxq.state;

import java.util.Random;

/**
 * 有硬币状态
 */
public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您不能重复投硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退还硬币");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("转动曲柄");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("没有释放糖果");
    }

    public String toString() {
        return "已投入硬币";
    }
}
