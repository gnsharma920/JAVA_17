package com.java.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;

public class AnyOfExample {
    public static CompletableFuture<String> future1() {
        return CompletableFuture.supplyAsync(() -> {
            delay(4000L);
            System.out.println("future1() " + Thread.currentThread().getName());
            return "Hello";
        });
    }

    public static CompletableFuture<String> future2() {
        return CompletableFuture.supplyAsync(() -> {
            delay(3000L);
            System.out.println("future2() " + Thread.currentThread().getName());
            return "Heyy";
        });
    }

    public static CompletableFuture<String> future3() {
        return CompletableFuture.supplyAsync(() -> {
            delay(2000L);
            System.out.println("future3() " + Thread.currentThread().getName());
            return "Hi";
        });
    }

    public static CompletableFuture<String> future4() {
        return CompletableFuture.supplyAsync(() -> {
            delay(1000L);
            System.out.println("future4() " + Thread.currentThread().getName());
            return "Hey Hey";
        });
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        CompletableFuture<Object> future = CompletableFuture.anyOf(future1(), future2(), future3(), future4());
        System.out.println(future.join().toString());
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (endTime - startTime) / 1000);
    }

    private static void delay(long sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
