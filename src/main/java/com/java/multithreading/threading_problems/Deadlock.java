package com.java.multithreading.threading_problems;

class DemoA {
    public synchronized void foo(DemoB b) throws InterruptedException {
        System.out.println("Thread starts foo");
        Thread.sleep(1000);
        System.out.println("Thread is trying to call b's last");
        b.last();
    }

    public synchronized void last() {
        System.out.println("Inside A, This is last");
    }
}

class DemoB {
    public synchronized void bar(DemoA a) throws InterruptedException {
        System.out.println("Thread starts bar");
        Thread.sleep(5000);
        System.out.println("Thread is trying to call a's last");
        a.last();

    }

    public synchronized void last() {
        System.out.println("Inside B, This is last");
    }
}

public class Deadlock extends Thread {
    DemoA a = new DemoA();
    DemoB b = new DemoB();

    Deadlock() throws InterruptedException {
        this.start();
        a.foo(b);
    }

    public void run() {
        try {
            b.bar(a);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Deadlock();
    }


}
