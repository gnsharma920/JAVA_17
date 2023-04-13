package com.java.multithreading.compitablefuture;

import java.util.concurrent.*;

public class FutureDemo {
    private static void delay(long sleepTime) throws InterruptedException {
        Thread.sleep(sleepTime);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService service = Executors.newCachedThreadPool();
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                delay(10000l);
                return "Hello from callable";
            }
        };

        Future<String> future = service.submit(callable);
        for (int i = 0; i < 5; i++) {
            delay(2000L);
            System.out.println("Main thread");
        }
        String s1 = future.get();
        System.out.println("Main thread :" + s1);
        service.shutdown();
        long endTime = System.currentTimeMillis();

        System.out.println("Total Time: " + (endTime - startTime) / 1000);
    }
}
