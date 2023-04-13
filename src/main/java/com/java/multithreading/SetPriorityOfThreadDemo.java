package com.java.multithreading;

class SetPriorityOfThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Math.random() * 10; i++) {
            System.out.println("Executing by child thread : " + Thread.currentThread().getName());
        }
    }
}

public class SetPriorityOfThreadDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for (int i = 0; i < Math.random() * 10; i++) {
                System.out.println("Executing by child thread : " + Thread.currentThread().getName());
            }
        });
        t1.setName("CHILD_THREAD");
        t1.setPriority(Thread.MAX_PRIORITY);// Child thread will execute first
        t1.start();

        SetPriorityOfThread t2=new SetPriorityOfThread();
        t2.setName("CHILD_THREAD_");
        t2.setPriority(Thread.MIN_PRIORITY);// Child thread will execute first
        t2.start();

        for(int i=0; i< Math.random()*10;i++){
            System.out.println("Executing by main thread : "+Thread.currentThread().getName());
        }

        //Thread priority does not guarantee execution order
        //https://blog.vanillajava.blog/2011/09/why-thread-priority-rarely-matters.html#!/2011/09/why-thread-priority-rarely-matters.html
    }
}
