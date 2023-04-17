package com.java.lambda;

public class AnonymousVSLambda {

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Anonymous inner class");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Lambda expression");
            }
        });

        t1.start();
        t2.start();
    }
}
