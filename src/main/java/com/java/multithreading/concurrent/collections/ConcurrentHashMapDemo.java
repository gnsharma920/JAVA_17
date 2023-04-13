package com.java.multithreading.concurrent.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap<>();// initial capacity 16, concurrency level 16, fill ratio 0.75

        ConcurrentHashMap concurrentHashMap1=new ConcurrentHashMap<>(10);// initial capacity 10, concurrency level 16, fill ratio 0.75

        ConcurrentHashMap concurrentHashMap3=new ConcurrentHashMap<>(10, 0.50f);// initial capacity 10, concurrency level 16, fill ratio 0.50

        ConcurrentHashMap concurrentHashMap4=new ConcurrentHashMap<>(10, 0.50f,10);// initial capacity 10, concurrency level 10, fill ratio 0.50

        ConcurrentHashMap concurrentHashMap5=new ConcurrentHashMap<>(concurrentHashMap);

        concurrentHashMap.put("1","Rohan");
        concurrentHashMap.put("2","Gopal");
        concurrentHashMap.put("3","Nayan");
        concurrentHashMap.put("4","Ronak");

        System.out.println(concurrentHashMap);
        concurrentHashMap.putIfAbsent("1","Vivek");
        System.out.println(concurrentHashMap);
        concurrentHashMap.putIfAbsent("5","Vivek");
        System.out.println(concurrentHashMap);
        concurrentHashMap.remove("2","Rohan");
        System.out.println(concurrentHashMap);
        concurrentHashMap.remove("2","Gopal");
        System.out.println(concurrentHashMap);
        concurrentHashMap.replace("3","Ronak","Nikunj");
        System.out.println(concurrentHashMap);
        concurrentHashMap.replace("3","Nayan","Nikunj");
        System.out.println(concurrentHashMap);


    }
}
