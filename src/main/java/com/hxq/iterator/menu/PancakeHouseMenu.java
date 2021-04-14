package com.hxq.iterator.menu;

import com.hxq.iterator.MenuItem;
import com.hxq.iterator.iterator.Iterator;
import com.hxq.iterator.iterator.PancakeHouseIterator;

import java.util.ArrayList;

/**
 * 煎饼屋
 */
public class PancakeHouseMenu implements Menu {

    private final ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's薄煎饼早餐", "薄煎饼、清蛋和吐司", true, 2.99);
        addItem("薄煎饼早餐例餐", "薄煎饼带煎蛋，香肠", false, 2.99);
        addItem("蓝莓薄煎饼", "新鲜蓝莓和蓝莓糖浆做成的薄煎饼", true, 3.49);
        addItem("松饼", "松饼，可以选择蓝莓或草莓", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
