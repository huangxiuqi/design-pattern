package com.hxq.iterator;

import com.hxq.iterator.iterator.Iterator;
import com.hxq.iterator.menu.DinerMenu;
import com.hxq.iterator.menu.Menu;
import com.hxq.iterator.menu.PancakeHouseMenu;

/**
 * 招待
 */
public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("===== 早餐菜单 =====");
        printMenu(pancakeIterator);
        System.out.println("===== 午餐菜单 =====");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
