package com.java.multithreading.compitablefuture;

import java.util.concurrent.CompletableFuture;

public class CombineExample {

    public static CompletableFuture<String> getUserEmail() {
        return CompletableFuture.supplyAsync(() -> {
            delay(2000L);
            System.out.println("getUserDetails() " + Thread.currentThread().getName());
            return "gopal@gmail.com";
        });
    }

    public static CompletableFuture<String> getWeatherDetails() {
        return CompletableFuture.supplyAsync(() -> {
            delay(3000L);
            System.out.println("getWeatherDetails() " + Thread.currentThread().getName());
            return "Weather is perfect";
        });
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        CompletableFuture<String> future = getUserEmail().thenCombine(getWeatherDetails(), (e, w) -> e.concat(" ").concat(w));
        System.out.println(future.join());
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
