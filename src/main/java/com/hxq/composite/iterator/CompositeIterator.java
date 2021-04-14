package com.hxq.composite.iterator;

import com.hxq.composite.component.Menu;
import com.hxq.composite.component.MenuComponent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * 组合迭代器
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    Deque<Iterator<MenuComponent>> stack = new ArrayDeque<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public MenuComponent next() {
        Iterator<MenuComponent> iterator = stack.peek();
        MenuComponent component = iterator.next();
        if (component instanceof Menu) {
            if (stack.size() < 2) {
                stack.push(component.createIterator());
            }
        }
        return component;
    }
}
