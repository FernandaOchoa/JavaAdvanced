package com.fernandaochoa.Miercoles;

public class TestJoinNombre extends Thread {
    public void run(){
        System.out.println("corriendo");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TestJoinNombre t1= new TestJoinNombre(), t2= new TestJoinNombre(),
                t3= new TestJoinNombre();
        System.out.println("El nombre del hilo 1 es: "+t1.getName());
        System.out.println("El nombre del hilo 1 es: "+t2.getName());
        System.out.println("El nombre del hilo 1 es: "+t3.getName());

        t1.start();
        t2.start();
        t3.start();

        t1.setName("Hola soy un hilo");
        t2.setName("yo tambien soy un hilo");
        t3.setName("yo soy otro hilo");

        System.out.println("El hilo 1 ahora es: "+t1.getName());
        System.out.println("El hilo 2 ahora es: "+t2.getName());
        System.out.println("El hilo 3 ahora es: "+t3.getName());
    }
}
