package com.java.multithreading.callable;

import java.util.concurrent.*;

class MyCallable implements Callable {
    private final int num;

    MyCallable(int num){
        this.num=num;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" is responsible to find sum of first "+num+" numbers");
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}

public class CallableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable[] jobs=new MyCallable[]{new MyCallable(3),
              new MyCallable(4),
              new MyCallable(5),
              new MyCallable(6),
              new MyCallable(7),
              new MyCallable(8)};

        ExecutorService service= Executors.newFixedThreadPool(4);
        for(MyCallable job:jobs){
            Future future=service.submit(job);
            System.out.println(future.get());
        }
        service.shutdown();
    }
}
