package com.java.multithreading;

//defining a thread by extending thread class
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i< Math.random()*10;i++){
            System.out.println("Executing by child thread "+i);
        }
    }
}

public class ThreadDemoByExtendingThread {
    public static void main(String[] args) {
        MyThread childThread=new MyThread();
        childThread.start();
        for(int i=0; i< Math.random()*10;i++){
            System.out.println("Executing by main thread "+i);
        }
    }
}
