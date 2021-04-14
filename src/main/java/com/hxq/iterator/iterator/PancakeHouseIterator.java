package com.hxq.iterator.iterator;

import com.hxq.iterator.MenuItem;
import com.hxq.iterator.iterator.Iterator;

import java.util.ArrayList;

/**
 * 煎饼屋迭代器
 */
public class PancakeHouseIterator implements Iterator<MenuItem> {

    private final ArrayList<MenuItem> arrayList;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return position < arrayList.size();
    }

    @Override
    public MenuItem next() {
        return arrayList.get(position++);
    }
}
