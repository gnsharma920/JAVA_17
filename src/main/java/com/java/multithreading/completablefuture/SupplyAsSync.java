package com.java.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class SupplyAsSync {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Supplier<String> supplier = () -> {
            delay(1111l);
            return "Hello from supplier";
        };
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier, service);
        System.out.println("In Main Thread " + Thread.currentThread().getName());
        String message = completableFuture.join();
        System.out.println("Message: " + message);
        service.shutdown();
    }

    private static void delay(long sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
