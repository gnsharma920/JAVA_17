package com.java.multithreading.concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 {
    static CopyOnWriteArrayList list=new CopyOnWriteArrayList();
    public static void main(String[] args) throws InterruptedException {
        list.add("Gopal");
        list.add("Rohan");
        list.add("Nayan");
        list.add("Ronak");

        System.out.println(list);
        System.out.println("**********************************");
        Iterator i1=list.listIterator();
        list.add("Vaibhav");
        while (i1.hasNext()){
            System.out.println("Main thread list value: "+i1.next());
        }
        Thread.sleep(4000);
        System.out.println("**********************************");
        System.out.println(list);
    }
}
