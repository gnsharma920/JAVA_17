package com.java.multithreading.compitablefuture;

import java.util.concurrent.CompletableFuture;

public class ComposeExample {
    public CompletableFuture<String> getUserDetails() {
        return CompletableFuture.supplyAsync(() -> {
            delay(2000L);
            System.out.println("getUserDetails() " + Thread.currentThread().getName());
            return "Gopal";
        });
    }

    public CompletableFuture<String> getWishList(String user) {
        return CompletableFuture.supplyAsync(() -> {
            delay(3000L);
            System.out.println("getWishList() user: " + user + " " + Thread.currentThread().getName());
            return "User's WishList";
        });
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ComposeExample composeExample = new ComposeExample();
        CompletableFuture<String> completableFuture = composeExample.getUserDetails().thenCompose(s1 -> composeExample.getWishList(s1));
        String message = completableFuture.join();

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
