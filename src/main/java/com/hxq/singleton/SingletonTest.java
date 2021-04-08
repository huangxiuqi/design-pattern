package com.hxq.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {

    public static void main(String[] args) throws InterruptedException {
        test1();
        test2();
        test3();
    }

    static void test1() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        final CountDownLatch countDownLatch = new CountDownLatch(100);

        // 100个线程各自加10
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
                for (int j = 0; j < 10; j++) {
                    singleton.increment();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
        System.out.println("同步方法创建单例对象，最终累加结果：" + singleton.getCount());
        executor.shutdown();
    }

    static void test2() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        final CountDownLatch countDownLatch = new CountDownLatch(100);

        // 100个线程各自加10
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                EagerlySingleton singleton = EagerlySingleton.getInstance();
                for (int j = 0; j < 10; j++) {
                    singleton.increment();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        EagerlySingleton singleton = EagerlySingleton.getInstance();
        System.out.println("急切实例化方式创建单例对象，最终累加结果：" + singleton.getCount());
        executor.shutdown();
    }

    static void test3() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        final CountDownLatch countDownLatch = new CountDownLatch(100);

        // 100个线程各自加10
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                DoubleCheckLockSingleton singleton = DoubleCheckLockSingleton.getInstance();
                for (int j = 0; j < 10; j++) {
                    singleton.increment();
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        DoubleCheckLockSingleton singleton = DoubleCheckLockSingleton.getInstance();
        System.out.println("双重检查锁创建单例对象，最终累加结果：" + singleton.getCount());
        executor.shutdown();
    }
}
