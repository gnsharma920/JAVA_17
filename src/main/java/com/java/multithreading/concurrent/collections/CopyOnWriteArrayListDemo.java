package com.java.multithreading.concurrent.collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Gopal");
        copyOnWriteArrayList.add("Rohan");
        copyOnWriteArrayList.add("Nayan");
        copyOnWriteArrayList.add("Ronak");

        System.out.println(copyOnWriteArrayList);
        System.out.println("**********************************");
        copyOnWriteArrayList.addIfAbsent("Rohan");
        System.out.println(copyOnWriteArrayList);
        copyOnWriteArrayList.addIfAbsent("Vivek");
        System.out.println(copyOnWriteArrayList);
        ArrayList list = new ArrayList<>();
        list.add("Nayan");
        list.add("Ronak");
        list.add("Nikunj");
        list.add("Urvik");
        int numberOfAddedValue = copyOnWriteArrayList.addAllAbsent(list);
        System.out.println("Number of added value:" + numberOfAddedValue + ", " + copyOnWriteArrayList);

    }
}
