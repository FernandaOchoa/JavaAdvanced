package com.fernandaochoa.Jueves;


public class TestMulti5 {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {

            public void run() {
                show();
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                show2();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

    public static void show(){
        System.out.print("Tarea uno");
    }

    public static void show2(){
        System.out.print("Tarea dos");
    }
}
