package com.java.multithreading;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Demo Group");
        Thread t1 = new Thread(tg, () -> {
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName()
                      + ", Thread Group: " + Thread.currentThread().getThreadGroup().getName()
                      + ", Parent Thread Group: " + Thread.currentThread().getThreadGroup().getParent().getName());
            }
        });
        ThreadGroup tg1 = new ThreadGroup(tg, "Demo Group 1");
        Thread t2 = new Thread(tg1, () -> {
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName()
                      + ", Thread Group: " + Thread.currentThread().getThreadGroup().getName()
                      + ", Parent Thread Group: " + Thread.currentThread().getThreadGroup().getParent().getName());
            }
        });
        t1.start();
        t2.start();
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by main thread : " + Thread.currentThread().getName()
                  + ", Thread Group: " + Thread.currentThread().getThreadGroup().getName()
                  + ", Parent Thread Group: " + Thread.currentThread().getThreadGroup().getParent().getName());
        }
        //methods of ThreadGroup
//        ThreadGroup tg2 = new ThreadGroup(tg1, "Demo Group 2");
//        System.out.println("Thread name: " + tg2.getName());
//        System.out.println("Thread priority: " + tg2.getMaxPriority());
//        tg2.setMaxPriority(5);
//        System.out.println("Thread priority after changing: " + tg2.getMaxPriority());
//        System.out.println("Parent thread name: " + tg2.getParent());
//        tg2.list();//print information about the thread to the console
//        System.out.println("Active Thread of the group: " + tg1.getParent());
//
    }
}
