package com.hxq.strategy.quack;

/**
 * 吱吱叫
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
