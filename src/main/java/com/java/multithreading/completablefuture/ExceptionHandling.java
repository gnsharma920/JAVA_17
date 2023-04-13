package com.java.multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionHandling {
    public static void main(String[] args) {
        boolean error = true;
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (error) {
                throw new RuntimeException("ERROR");
            }
            return "SUCCESS";
        }).handle((result, exception) -> {
            if (exception != null) {
                return "NULL";
            }
            return result;
        });
        System.out.println(future.join());

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            if (error) {
                throw new RuntimeException("ERROR");
            }
            return "SUCCESS";
        }).exceptionally(exception -> {
            return "NULL";
        });
        System.out.println(future1.join());
    }
}
