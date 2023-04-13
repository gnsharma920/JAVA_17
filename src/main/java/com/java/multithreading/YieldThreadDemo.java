package com.java.multithreading;


public class YieldThreadDemo {

    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            Thread.yield();
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName());
            }
        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread : " + Thread.currentThread().getName());
        }
    }
}
