package com.java.multithreading;

class ThreadClassConstructors implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by child thread : " + Thread.currentThread().getName());
        }
    }
}
public class ThreadClassConstructorsDemo {
    public static void main(String[] args) {
        Runnable runnable = new ThreadDemoByImplementingRunnable();

        Thread t1=new Thread();
        t1.start();// Thread class start method and run method will be executed

        Thread t2 = new Thread(runnable);
        t2.start();

        Thread t3=new Thread("Thread-03");//Thread name
        t3.start();

        Thread t4=new Thread(runnable,"Thread-04");
        t4.start();

        Thread t5=new Thread(new ThreadGroup("ThreadGroupName"),()->{
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName()+", "+Thread.currentThread().getThreadGroup().getName());
            }
        },"Thread-05");
        t5.start();

        Thread t6=new Thread(new ThreadGroup("ThreadGroupName"),"Thread-06");
        t6.start();

        Thread t7=new Thread(new ThreadGroup("ThreadGroupName1"),()->{
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName()+", "+Thread.currentThread().getThreadGroup().getName());
            }});
        t7.start();

        Thread t8=new Thread(new ThreadGroup("ThreadGroupName"),()->{
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName()+", "+Thread.currentThread().getThreadGroup().getName());
            }
        },"Thread-08",200L);
        t8.start();

        for(int i=0; i< Math.random()*10;i++){
            System.out.println("Executing by main thread : "+Thread.currentThread().getName());
        }
    }
}
