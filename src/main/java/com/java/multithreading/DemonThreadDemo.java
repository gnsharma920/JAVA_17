package com.java.multithreading;

class DemonThread extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Lazy child thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I got interrupted");
            }
        }
    }
}
public class DemonThreadDemo {
    public static void main(String[] args) {
        DemonThread d1=new DemonThread();
        d1.setDaemon(true);
        d1.start();
        System.out.println("Main thread end");
    }
}
