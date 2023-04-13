package com.java.multithreading;

public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName());
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName());
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread : " + Thread.currentThread().getName());
        }
    }
}
