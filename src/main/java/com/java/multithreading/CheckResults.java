package com.java.multithreading;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        });
        t1.start();
        while (counter < 1_000_000) {
            System.out.println("Not reached yet");
            t1.join();
            System.out.println("Interrupted!");
        }
        System.out.println("Reached: " + counter);
    }
}
