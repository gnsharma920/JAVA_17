package com.java.lambda;

interface Interf1 {
    void sum(int num1, int num2);
}

interface Interf2 {
    int square(int num1);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        Interf1 s = (a, b) -> System.out.println("The sum: " + a + b);
        s.sum(10, 20);

        Interf2 i2 = (number) -> number * number;
        System.out.println("Square: " + i2.square(2));

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Child Thread");
            }
        });

        t1.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Main Thread");
        }
    }
}
