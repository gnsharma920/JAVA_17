package com.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsDemo {
    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        return input;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
              .stream()
              .map(w -> doWork(w))
              .forEach(s -> System.out.print(s + " "));
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");// without parallel stream


        long start1 = System.currentTimeMillis();
        List.of(1, 2, 3, 4, 5)
              .parallelStream()
              .map(w -> doWork(w))
              .forEachOrdered(s -> System.out.print(s + " "));
        var timeTaken1 = (System.currentTimeMillis() - start1) / 1000;
        System.out.println("Time: " + timeTaken1 + " seconds");

        for(int i=0;i<100;i++) {
            System.out.println(List.of(1, 5, 2, 4, 3, 6).stream().skip(3).collect(Collectors.toList()));
        }

        System.out.println("********************************");

        for(int i=0;i<100;i++) {
            System.out.println(List.of(1, 5, 2, 4, 3, 6).stream().parallel().skip(3).collect(Collectors.toList()));
        }

        for(int i=0;i<100;i++) {
            System.out.println(List.of(1, 2, 3, 4, 5, 6)
                  .stream().findAny().get());
        }
        System.out.println("********************************");
        for(int i=0;i<100;i++) {
            System.out.print(List.of(1, 2, 3, 4, 5, 6)
                  .parallelStream().findAny().get());
        }
    }
}
