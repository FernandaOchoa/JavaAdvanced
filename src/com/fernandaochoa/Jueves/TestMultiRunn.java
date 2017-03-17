package com.fernandaochoa.Jueves;


import java.io.FileOutputStream;
import java.io.IOException;

public class TestMultiRunn implements Runnable {

    public void run() {
        show();
        escribe();
    }
    void show(){
        System.out.println("Tarea uno");
    }

    void escribe(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\hilos.txt");
            fos.write(65);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestMultiRunn());
        Thread t2 = new Thread(new TestMultiRunn());

        t1.start();
        t2.start();
    }
}
