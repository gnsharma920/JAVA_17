package com.java.multithreading;

class NotRecommendedApproach extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by child thread : " + Thread.currentThread().getName());
        }
    }
}
public class NotRecommendedApproachDemo {
    public static void main(String[] args) {
        NotRecommendedApproach notRecommendedApproach=new NotRecommendedApproach();
        Thread thread=new Thread(notRecommendedApproach);
        thread.start();
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread : " + Thread.currentThread().getName());
        }

    }
}
