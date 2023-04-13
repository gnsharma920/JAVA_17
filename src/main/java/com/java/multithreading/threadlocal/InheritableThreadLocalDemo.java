package com.java.multithreading.threadlocal;

class ParentThread extends Thread{
    public static InheritableThreadLocal threadLocal=new InheritableThreadLocal<>(){
        public Object childValue(Object object){
            return "CC";
        }
    };

    public void run(){
        System.out.println("Parent ThreadLocal value: "+ threadLocal.get());
        threadLocal.set("PP");
        System.out.println("Parent ThreadLocal value: "+ threadLocal.get());
        new ChildThread().start();
    }
}

class ChildThread extends Thread{
    public void run(){
        System.out.println("Child Thread value: "+ ParentThread.threadLocal.get());
    }
}
public class InheritableThreadLocalDemo {
    public static void main(String[] args) {
        ParentThread parentThread=new ParentThread();
        parentThread.start();
    }
}
