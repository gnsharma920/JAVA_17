package com.java.multithreading.concurrent.collections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add("Gopal");
        copyOnWriteArraySet.add("Rohan");
        copyOnWriteArraySet.add("Nayan");
        copyOnWriteArraySet.add("Ronak");

        System.out.println(copyOnWriteArraySet);
        System.out.println("**********************************");
        ArrayList list = new ArrayList<>();
        list.add("Nayan");
        list.add("Ronak");
        list.add("Nikunj");
        list.add("Urvik");
        copyOnWriteArraySet.addAll(list);
        System.out.println("**********************************");
        System.out.println(copyOnWriteArraySet);


    }
}
