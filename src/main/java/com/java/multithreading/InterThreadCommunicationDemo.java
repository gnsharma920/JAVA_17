package com.java.multithreading;

public class InterThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadB t1=new ThreadB();
        t1.start();
        synchronized (t1){
            System.out.println("Main thread trying to call wait()");
            t1.wait();
            System.out.println("Main thread got notification");
            System.out.println("Total:"+t1.total);
        }
    }
}

class ThreadB  extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("Child thread starts notification");
            for(int i=1;i<=1000;i++){
                total++;
            }
            System.out.println("Child thread trying to give notification");
            this.notifyAll();
        }
    }
}