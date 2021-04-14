package com.hxq.iterator.menu;

import com.hxq.iterator.MenuItem;
import com.hxq.iterator.iterator.DinerMenuIterator;
import com.hxq.iterator.iterator.Iterator;

/**
 * 餐厅
 */
public class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("素食BLT", "培根、生菜&西红柿，用麸皮面包做", true, 2.99);
        addItem("BLT", "培根、生菜&西红柿", false, 2.99);
        addItem("例汤", "一碗例汤，陪土豆沙拉", false, 3.29);
        addItem("热狗", "热狗、酸菜，上盖芝士", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("菜单已满！");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
