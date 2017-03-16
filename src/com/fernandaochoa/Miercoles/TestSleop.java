package com.fernandaochoa.Miercoles;

public class TestSleop extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
        }
    }

    public static void main(String[] args) {
        TestSleop t1 = new TestSleop();
        TestSleop t2 = new TestSleop();

        t1.start();
        t2.start();
    }
}
