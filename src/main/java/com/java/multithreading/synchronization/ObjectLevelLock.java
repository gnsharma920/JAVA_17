package com.java.multithreading.synchronization;

class Person {
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good morning : " + name);
        }
    }

    public static void sayHello(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello : " + name);
        }
    }
}

class MyThread extends Thread {

    private final Person person;

    private final String name;

    MyThread(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    public void run() {
        Person.sayHello(this.name);
        this.person.wish(this.name);
    }
}

public class ObjectLevelLock {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        MyThread t1 = new MyThread(p1, "MSD");
        MyThread t2 = new MyThread(p1, "YUVI");
        MyThread t3 = new MyThread(p1, "VIRAT");
        MyThread t4 = new MyThread(p2, "SACHIN");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
