package com.hxq.composite;

import com.hxq.composite.component.MenuComponent;

import java.util.Iterator;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 打印所有菜单
     */
    public void printMenu() {
        allMenus.print();
    }

    /**
     * 打印素食菜单
     */
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("===== 素食菜单 =====");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignore) {

            }
        }
    }
}
