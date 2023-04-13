package com.java.multithreading.concurrent.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo1 extends Thread {
    static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Child thread updating map");
        concurrentHashMap.put("5", "Vivek");
    }

    public static void main(String[] args) throws InterruptedException {
        concurrentHashMap.put("1", "Rohan");
        concurrentHashMap.put("2", "Gopal");
        concurrentHashMap.put("3", "Nayan");
        concurrentHashMap.put("4", "Ronak");
        ConcurrentHashMapDemo1 t1 = new ConcurrentHashMapDemo1();
        t1.start();

        Set s1 = concurrentHashMap.keySet();

        Iterator iterator = s1.iterator();

        while (iterator.hasNext()) {
            String i1 = iterator.next().toString();
            System.out.println("Main Thread key: " + i1 + " value: " + concurrentHashMap.get(i1));
        }
        Thread.sleep(3000);
        System.out.println("**********************************");
        System.out.println(concurrentHashMap);
    }
}
