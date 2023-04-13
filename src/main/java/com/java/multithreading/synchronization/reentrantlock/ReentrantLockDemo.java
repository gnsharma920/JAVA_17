package com.java.multithreading.synchronization.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock=new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.lock();
        System.out.println(reentrantLock.isLocked());
        System.out.println(reentrantLock.isHeldByCurrentThread());
        System.out.println(reentrantLock.getQueueLength());
        System.out.println(reentrantLock.getHoldCount());
        reentrantLock.unlock();
        System.out.println(reentrantLock.getHoldCount());
        reentrantLock.unlock();
        System.out.println(reentrantLock.isLocked());
        System.out.println(reentrantLock.isFair());
    }
}
