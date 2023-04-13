package com.java.multithreading;

public class ThreadInterruptionDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                for (int i = 0; i < Math.random() * 10; i++) {
                    System.out.println("Executing by child thread : " + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                System.out.println("I got Interrupted");
            }

        });
        t1.start();
        t1.interrupt();
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread : " + Thread.currentThread().getName());
        }
    }
}
