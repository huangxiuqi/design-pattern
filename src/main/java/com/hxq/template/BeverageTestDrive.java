package com.hxq.template;

public class BeverageTestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("茶制作中。。。");
        tea.prepareRecipe();

        System.out.println("==============y");

        System.out.println("咖啡制作中。。。");
        coffeeHook.prepareRecipe();
    }
}
