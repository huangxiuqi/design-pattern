package com.hxq.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 双重检查锁
 */
public class DoubleCheckLockSingleton {

    private final AtomicInteger count;

    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
        count = new AtomicInteger();
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
