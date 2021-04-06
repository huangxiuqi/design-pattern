package com.hxq.strategy;

import com.hxq.strategy.duck.Duck;
import com.hxq.strategy.duck.MallardDuck;
import com.hxq.strategy.duck.ModelDuck;
import com.hxq.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        // 实例化一个绿头鸭，可以飞和呱呱叫
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        // 实例化一个模型鸭，一开始不会飞，后来装上了火箭推进器，可以飞了
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
