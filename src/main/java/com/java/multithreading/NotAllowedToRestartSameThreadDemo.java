package com.java.multithreading;

class NotAllowedToRestartSameThread extends Thread {
    public void run() {
        for(int i=0; i< Math.random()*10;i++){
            System.out.println("run()");
        }
    }
}
public class NotAllowedToRestartSameThreadDemo {
    public static void main(String[] args) {
        NotAllowedToRestartSameThread child=new NotAllowedToRestartSameThread();
        child.start();
        for(int i=0; i< Math.random()*10;i++){
            System.out.println("Executing by main thread "+i);
        }
        child.start();// will throw exception: IllegalThreadStateException
    }
}
