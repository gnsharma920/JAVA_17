package com.java.multithreading.concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class UnsupportedOperationExceptionDemo {
    static CopyOnWriteArrayList list = new CopyOnWriteArrayList();

    public static void main(String[] args) throws InterruptedException {
        list.add("Gopal");
        list.add("Rohan");
        list.add("Nayan");
        list.add("Ronak");

        System.out.println(list);
        System.out.println("**********************************");

        Thread t1 = new Thread() {
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Child thread updating the list");
                list.add("Nikunj");
            }
        };
        t1.start();
        Iterator i1 = list.listIterator();
        try {
            while (i1.hasNext()) {
                System.out.println("Main thread list value: " + i1.next());
                if (i1.next().equals("Rohan")) {
                    i1.remove();
                }
            }
        } catch (UnsupportedOperationException exception) {
            System.out.println("Got UnsupportedOperationException");
        }
        Thread.sleep(4000);
        System.out.println("**********************************");
        System.out.println(list);
    }
}
