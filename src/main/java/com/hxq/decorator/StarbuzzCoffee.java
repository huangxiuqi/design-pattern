package com.hxq.decorator;

import com.hxq.decorator.beverage.Beverage;
import com.hxq.decorator.beverage.DarkRoast;
import com.hxq.decorator.beverage.Espresso;
import com.hxq.decorator.beverage.HouseBlend;
import com.hxq.decorator.condiment.Mocha;
import com.hxq.decorator.condiment.Soy;
import com.hxq.decorator.condiment.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        // 一杯浓缩咖啡，不需要调料
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // 一杯深焙，加两分摩卡，一份奶泡
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // 一杯混合，加一份豆浆，一份摩卡，一份奶泡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
