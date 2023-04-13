package com.java.multithreading;

class MyThreadWithoutOverridingRun extends Thread {
    //Thread class run() will be executed which has empty implementation.
}

public class NotOverrideRunMethod {
    public static void main(String[] args) {
        MyThreadWithoutOverridingRun childThread=new MyThreadWithoutOverridingRun();
        childThread.start();
        for(int i=0; i< Math.random()*10;i++){
            System.out.println("Executing by main thread "+i);
        }
    }
}
