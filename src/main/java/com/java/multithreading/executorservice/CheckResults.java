package com.java.multithreading.executorservice;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;
    public static void main(String[] unused) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 1_000_000; i++) counter++;
            });
            System.out.println(result.get(1000, TimeUnit.SECONDS)); // Returns null for Runnable System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            service.shutdown();
        }
    }
}
