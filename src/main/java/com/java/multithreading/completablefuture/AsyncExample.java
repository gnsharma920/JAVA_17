package com.java.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncExample {

    private static void delay(long sleepTime)  {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ExecutorService service= Executors.newCachedThreadPool();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                delay(10000L);
                System.out.println("In Runnable "+Thread.currentThread().getName());
            }
        };
        CompletableFuture<Void> completableFuture=CompletableFuture.runAsync(runnable,service);
        System.out.println("In Main Thread "+ Thread.currentThread().getName());
        completableFuture.join();
        service.shutdown();
    }
}
