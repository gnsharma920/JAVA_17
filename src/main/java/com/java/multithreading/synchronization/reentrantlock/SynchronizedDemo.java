package com.java.multithreading.synchronization.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

class DisplayDTO {
    ReentrantLock reentrantLock=new ReentrantLock(true);
    public void wish(String name) throws InterruptedException {
        reentrantLock.lock();
        for(int i=0;i<5;i++){
            System.out.print("Good morning: ");
            Thread.sleep(2000);
            System.out.println(name);
        }
        reentrantLock.unlock();
        reentrantLock.lock();
    }
}

class MyThread extends Thread{
    private final DisplayDTO displayDTO;
    private final String name;

    MyThread(DisplayDTO display, String name) {
        displayDTO = display;
        this.name = name;
    }

    public void run(){
        try {
            displayDTO.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) {
        DisplayDTO displayDTO =new DisplayDTO();
        MyThread t1=new MyThread(displayDTO,"Dhoni");
        MyThread t2=new MyThread(displayDTO,"Yuvi");
        t1.start();
        t2.start();

    }
}
