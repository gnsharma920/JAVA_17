package com.java.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
    String name;
    PrintJob(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name +" Job started by "+ Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name +" Job completed by "+ Thread.currentThread().getName());
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs=new PrintJob[]{new PrintJob("Gopal"),
              new PrintJob("Rohan"),
              new PrintJob("Nayan"),
              new PrintJob("Ronak"),
              new PrintJob("Nikunj"),
        };

        ExecutorService service= Executors.newFixedThreadPool(5);
        for(PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}
