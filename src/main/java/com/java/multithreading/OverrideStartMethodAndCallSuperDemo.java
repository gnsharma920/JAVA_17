package com.java.multithreading;

class OverrideStartMethodAndCallSuper extends Thread {
    public void start() {
        super.start();// new child thread will be created
        System.out.println("Start method : "+Thread.currentThread().getName());
    }
    public void run() {
        System.out.println("run method : "+Thread.currentThread().getName());// will be executed by child thread
    }
}

public class OverrideStartMethodAndCallSuperDemo {
    public static void main(String[] args) {
        OverrideStartMethodAndCallSuper child=new OverrideStartMethodAndCallSuper();
        child.start();//normal method call by main thread
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread : " + Thread.currentThread().getName());
        }
    }
}
