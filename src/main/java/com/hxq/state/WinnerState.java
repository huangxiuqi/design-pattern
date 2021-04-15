package com.hxq.state;

public class WinnerState implements State {

    private final GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("您是个赢家，您可以得到两颗糖果");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("糖果售罄");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public String toString() {
        return "赢得游戏，准备释放两颗糖果";
    }
}
