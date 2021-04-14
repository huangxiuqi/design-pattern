package com.hxq.iterator.menu;

import com.hxq.iterator.MenuItem;
import com.hxq.iterator.iterator.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();
}
