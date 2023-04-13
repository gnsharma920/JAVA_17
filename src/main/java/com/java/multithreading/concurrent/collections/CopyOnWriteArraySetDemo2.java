package com.java.multithreading.concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo2 {
    static CopyOnWriteArraySet set =new CopyOnWriteArraySet();
    public static void main(String[] args) throws InterruptedException {
        set.add("Gopal");
        set.add("Rohan");
        set.add("Nayan");
        set.add("Ronak");

        System.out.println(set);
        System.out.println("**********************************");
        Iterator i1= set.iterator();
        set.add("Vaibhav");
        while (i1.hasNext()){
            System.out.println("Main thread list value: "+i1.next());
        }
        Thread.sleep(4000);
        System.out.println("**********************************");
        System.out.println(set);
    }
}
