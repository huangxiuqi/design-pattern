package com.hxq.adapter;

import com.hxq.adapter.adapter.TurkeyAdapter;
import com.hxq.adapter.duck.Duck;
import com.hxq.adapter.duck.MallardDuck;
import com.hxq.adapter.turkey.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("火鸡测试");
        turkey.gobble();
        turkey.fly();

        System.out.println("鸭子测试");
        testDuck(duck);

        System.out.println("火鸡适配器测试");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
