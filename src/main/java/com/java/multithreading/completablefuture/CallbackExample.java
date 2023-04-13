package com.java.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CallbackExample {
    public static void main(String[] args) {
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
                  delay(3000L);
                  return "Hello JAVA";
              }).thenApply((s1 -> s1.concat(", Good morning")))
              .thenAccept(System.out::println);

        CompletableFuture<Void> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            delay(1000L);
            System.out.println(Thread.currentThread().getName());
            return "Hello JAVA";
        }).thenApply((s1 -> {
            System.out.println(Thread.currentThread().getName());
            return s1.concat(", Good morning");
        })).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Finished");
        });

        completableFuture.join();
        completableFuture1.join();

    }

    private static void delay(long sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
