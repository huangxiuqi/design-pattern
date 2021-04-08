package com.hxq.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 急切实例化
 */
public class EagerlySingleton {

    private final AtomicInteger count;

    private static final EagerlySingleton instance = new EagerlySingleton();

    private EagerlySingleton() {
        count = new AtomicInteger();
    }

    public static EagerlySingleton getInstance() {
        return instance;
    }

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
