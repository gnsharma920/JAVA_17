package com.java.multithreading;

class OverridingStartMethod extends Thread {
    public void start() {
        System.out.println("Start method");
    }
    public void run() {
        System.out.println("run method");
    }
}

public class OverridingStartMethodDemo {
    public static void main(String[] args) {
        OverridingStartMethod overridingStartMethod = new OverridingStartMethod();
        overridingStartMethod.start();// normal method call by main thread
        overridingStartMethod.run();// normal method call by main thread
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread " + i);
        }
    }
}
