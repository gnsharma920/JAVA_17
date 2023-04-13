package com.java.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        PrintJob[] jobs=new PrintJob[]{new PrintJob("Gopal"),
              new PrintJob("Rohan"),
              new PrintJob("Nayan"),
              new PrintJob("Ronak"),
              new PrintJob("Nikunj"),
        };

        ExecutorService service= Executors.newSingleThreadExecutor();
        try {
            for(PrintJob job:jobs){
                service.submit(job);
            }
        } finally {
            service.shutdown();
        }
    }
}
