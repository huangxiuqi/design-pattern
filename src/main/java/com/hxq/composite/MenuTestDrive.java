package com.hxq.composite;

import com.hxq.composite.component.Menu;
import com.hxq.composite.component.MenuComponent;
import com.hxq.composite.component.MenuItem;

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("煎饼屋菜单", "早餐");
        MenuComponent dinerMenu = new Menu("餐厅菜单", "午餐");
        MenuComponent cafeMenu = new Menu("咖啡店菜单", "晚餐");
        MenuComponent dessertMenu = new Menu("甜点菜单", "点心");

        MenuComponent allMenus = new Menu("所有菜单", "所有菜单的组合");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("意大利面", "意大利面配意大利西红柿酱和一片酸面包", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("苹果派", "苹果派，配以硬皮，配上香草冰淇淋", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        waitress.printVegetarianMenu();
    }
}
