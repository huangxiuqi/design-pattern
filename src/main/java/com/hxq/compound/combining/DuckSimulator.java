package com.hxq.compound.combining;

import com.hxq.compound.combining.adapter.GooseAdapter;
import com.hxq.compound.combining.composite.Flock;
import com.hxq.compound.combining.decorator.QuackCounter;
import com.hxq.compound.combining.factory.AbstractDuckFactory;
import com.hxq.compound.combining.factory.CountingDuckFactory;
import com.hxq.compound.combining.goose.Goose;

/**
 * 模拟器
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("鸭子模拟器：所有鸭群");
        simulate(flockOfDucks);

        System.out.println();

        System.out.println("鸭子模拟器：绿头鸭群");
        simulate(flockOfMallards);

        System.out.println();

        System.out.println("鸭子模拟器：观察者");
        QuackLogist logist = new QuackLogist();
        flockOfDucks.registerObserver(logist);
        simulate(flockOfDucks);

        System.out.println("呱呱叫次数：" + QuackCounter.getQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
