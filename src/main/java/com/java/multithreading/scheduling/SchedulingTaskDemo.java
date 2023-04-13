package com.java.multithreading.scheduling;

import java.util.concurrent.*;

public class SchedulingTaskDemo {
    public static void main(String[] args) throws InterruptedException {
        Callable task1 = new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Callable task");
                return "task1";
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable task " + Thread.currentThread().getName());
            }
        };

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(task1, 1000, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleAtFixedRate(task2, 1000, 2000, TimeUnit.MILLISECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();

        System.out.println("*****************************");

        ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService1.schedule(task1, 1000, TimeUnit.MILLISECONDS);
        scheduledExecutorService1.scheduleWithFixedDelay(task2, 1000, 2000, TimeUnit.MILLISECONDS);
        Thread.sleep(10000);
        scheduledExecutorService1.shutdown();

        System.out.println("*****************************");

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executorService.submit(task2);
        }
        Thread.sleep(10000);
        executorService.shutdown();
    }
}
