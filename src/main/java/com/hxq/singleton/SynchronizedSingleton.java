package com.hxq.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 同步方法
 */
public class SynchronizedSingleton {

    private final AtomicInteger count;

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        count = new AtomicInteger();
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
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
