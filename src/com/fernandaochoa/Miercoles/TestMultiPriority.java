package com.fernandaochoa.Miercoles;

public class TestMultiPriority  extends Thread{
    public void run(){
        System.out.println("El hilo que esta corriendo es: "+Thread.currentThread().getName());
        System.out.println("La prioridad del hilo acttual es: "+Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        TestMultiPriority p1 = new TestMultiPriority(), p2 = new TestMultiPriority();
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);

        p1.start();
        p2.start();
    }
}
