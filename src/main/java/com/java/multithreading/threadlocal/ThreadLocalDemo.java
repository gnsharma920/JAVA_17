package com.java.multithreading.threadlocal;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        System.out.println(threadLocal.get());
        threadLocal.set("Hello");
        System.out.println(threadLocal.get());
        threadLocal.remove();
        System.out.println(threadLocal.get());

        ThreadLocal threadLocal1=new ThreadLocal(){
            public Object initialValue(){
                return "abc";
            }
        };
        System.out.println(threadLocal1.get());
        threadLocal1.set("Hello");
        System.out.println(threadLocal1.get());
        threadLocal1.remove();
        System.out.println(threadLocal1.get());

    }
}
