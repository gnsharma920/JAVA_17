package com.java.multithreading;

class OverloadingRunMethod extends Thread{
    @Override
    public void run() {
        for(int i=0; i< Math.random()*10;i++){
            System.out.println("run()");
        }
    }

    // will work as normal method call
    public void run(int length) {
        for(int i=0; i< length;i++){
            System.out.println("run(int)");
        }
    }
}
public class OverloadingRunMethodDemo {

    public static void main(String[] args) {
        OverloadingRunMethod childThread= new OverloadingRunMethod();
        childThread.start();// will create child thread
        childThread.run(10);// normal method call by main thread
        childThread.run(); // normal method call by main thread
            for(int i=0; i< Math.random()*10;i++){
                System.out.println("Executing by main thread "+i);
            }
        }
}
