package com.java.multithreading;

class ThreadDemoByImplementingRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by child thread : " + Thread.currentThread().getName());
        }
    }
}

public class ThreadDemoByImplementingRunnableDemo {

    public static void main(String[] args) {
        Runnable runnable = new ThreadDemoByImplementingRunnable();
        Thread childThread1 = new Thread(runnable);

        Thread childThread2 = new Thread(() -> {
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName());
            }
        });

        Thread childThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Math.random() * 10; i++) {
                    System.out.println("Executing by child thread : " + Thread.currentThread().getName());
                }
            }
        });
        childThread1.start();
        childThread2.start();
        childThread3.start();
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread : " + Thread.currentThread().getName());
        }
    }
}
