package com.java.multithreading.synchronization;

class Display {
    public void wish(String name) {
//        synchronized (this) {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Good morning : " + name);
//            }
//        }
//        System.out.println("After synchronized block");
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello : " + name);
//        }
        synchronized (Display.class) {
            System.out.println("ClassLevel lock with synchronized");
            for (int i = 0; i < 5; i++) {
                System.out.println("Good afternoon : " + name);
            }
        }
    }
}

class MyThreadDemo extends Thread {

    private final Display display;

    private final String name;

    MyThreadDemo(Display person, String name) {
        this.display = person;
        this.name = name;
    }

    public void run() {
//        synchronized (display) {
            this.display.wish(this.name);
//        }
    }
}

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();

        MyThreadDemo t1 = new MyThreadDemo(d1, "MSD");
        MyThreadDemo t2 = new MyThreadDemo(d1, "YUVI");
        MyThreadDemo t3 = new MyThreadDemo(d1, "VIRAT");
        MyThreadDemo t4 = new MyThreadDemo(d2, "SACHIN");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
