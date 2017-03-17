package com.fernandaochoa.Jueves;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestWorkerThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i =0; i <30; i++ ){
            Runnable worker = new WorkerThread(" "+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while (!executorService.isTerminated());
        System.out.println("Muertos todos");
    }
}
