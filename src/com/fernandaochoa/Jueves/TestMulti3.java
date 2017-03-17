package com.fernandaochoa.Jueves;

import sun.java2d.pipe.SpanShapeRenderer;

/*
Si tienes que realizar multiples tareas con multihilos, debes tener
multiples metodos run()
 */
class simpleA extends Thread{
    public void run(){
        System.out.println("Tarea uno");
    }
}
class simpleB extends Thread{
    public void run() {
        System.out.println("Tarea dos");
    }
}
public class TestMulti3 {
    public static void main(String[] args) {
        simpleA t1 = new simpleA();
        simpleB t2 = new simpleB();

        t1.start();
        t2.start();
    }
}
