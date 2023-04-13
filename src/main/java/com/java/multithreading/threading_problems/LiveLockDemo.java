package com.java.multithreading.threading_problems;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLockDemo {

    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        LiveLockDemo demo = new LiveLockDemo();

        Thread t1 = new Thread(() -> {
            try {
                demo.greeting();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                demo.wish();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }

    public void wish() throws InterruptedException {
        while (true) {
            lock1.tryLock(1000, TimeUnit.MILLISECONDS);
            System.out.println("lock1 acquired, waiting to acquire lock2.");
            Thread.sleep(1000);

            if (lock2.tryLock()) {
                System.out.println("lock2 acquired");
            } else {
                System.out.println("cannot acquire lock2, releasing lock1.");
                lock1.unlock();
                continue;
            }
            System.out.println("Good morning");
            break;
        }

        lock2.unlock();
        lock1.unlock();
    }

    public void greeting() throws InterruptedException {
        while (true) {
            lock2.tryLock(1000, TimeUnit.MILLISECONDS);
            System.out.println("lock2 acquired, waiting to acquire lock1.");
            Thread.sleep(1000);

            if (lock1.tryLock()) {
                System.out.println("lock1 acquired");
            } else {
                System.out.println("cannot acquire lock1, releasing lock2");
                lock2.unlock();
                continue;
            }
            System.out.println("Hello");
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }
}
