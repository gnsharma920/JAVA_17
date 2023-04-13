package com.java.multithreading.synchronization.reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread1 extends Thread {
    static ReentrantLock reentrantLock = new ReentrantLock(true);

    MyThread1(String name) {
        super(name);
    }

    public void run() {
//        if(reentrantLock.tryLock()){
//            System.out.println(Thread.currentThread().getName()+" got lock and performing safe operations");
//            try {
//                Thread.sleep(4000);
//                reentrantLock.unlock();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        } else {
//            System.out.println(Thread.currentThread().getName()+" unable to get lock and performing alternative operations");
//        }
        try {
            if (reentrantLock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + " got lock and performing safe operations");
                Thread.sleep(3000);
                reentrantLock.unlock();
            } else {
                System.out.println(Thread.currentThread().getName() + " unable to get lock and performing alternative operations");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ReentrantLockDemo1 {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("FIRST_THREAD");
        MyThread1 t2 = new MyThread1("SECOND_THREAD");
        t1.start();
        t2.start();
    }
}
