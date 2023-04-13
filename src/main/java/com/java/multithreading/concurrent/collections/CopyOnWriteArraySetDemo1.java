package com.java.multithreading.concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo1 {
    static CopyOnWriteArraySet set = new CopyOnWriteArraySet();

    public static void main(String[] args) throws InterruptedException {
        set.add("Gopal");
        set.add("Rohan");
        set.add("Nayan");
        set.add("Ronak");

        System.out.println(set);
        System.out.println("**********************************");

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child thread updating the list");
            set.add("Nikunj");
        });
        t1.start();

        Iterator i1 = set.iterator();
        while (i1.hasNext()) {
            System.out.println("Main thread Set value: " + i1.next());
        }
        Thread.sleep(4000);
        System.out.println("**********************************");
        System.out.println(set);
    }
}
