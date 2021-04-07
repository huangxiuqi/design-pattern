package com.hxq.factory.abstractfactory.pizza;

import com.hxq.factory.abstractfactory.ingredient.cheese.Cheese;
import com.hxq.factory.abstractfactory.ingredient.clam.Clam;
import com.hxq.factory.abstractfactory.ingredient.dough.Dough;
import com.hxq.factory.abstractfactory.ingredient.sauce.Sauce;

/**
 * 披萨抽象类
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("沿对角线切分披萨");
    }

    public void box() {
        System.out.println("将披萨装盒");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(";");
        sb.append("原料：");
        if (dough != null) {
            sb.append("[面团：").append(dough).append("]");
        }
        if (sauce != null) {
            sb.append("[酱料：").append(sauce).append("]");
        }
        if (cheese != null) {
            sb.append("[芝士：").append(cheese).append("]");
        }
        if (clam != null) {
            sb.append("[蛤蜊：").append(clam).append("]");
        }
        return sb.toString();
    }
}
