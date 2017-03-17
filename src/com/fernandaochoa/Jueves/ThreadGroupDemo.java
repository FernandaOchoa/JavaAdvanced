package com.fernandaochoa.Jueves;
/*
Java proporciona una forma conveniente de agrupar multiples hilos
en un solo objeto.
De esta manera podemos suspender, reanudar o interrumpir el grupo de hilos
mediante una sola llamada al metodo.

Solo hay dos constructores de la clase ThreadGroup
1.- ThreadGroup(String name) crea un grupo de hilos con nombre
2.-ThreadGroup(ThreadGroup parent, String name) crea un grupo de
hilos con nombre de grupo y nombre

Metodos importantes de la clase ThreadGroup
1) int activeCount() regresa el numero de hilos activos en el grupo actual
2.- int activeGroupCount() regresa el numero de grupos activos en este grupo
3.- void destroy() destruye este grupo de hilos y subgrupos
 4.-ThreadGroup getParent() regresa el padre de este grupo
 5.- String getName() regresa el nombre del grupo
 6.- void interrupt() interrumpe todos los hilos de este grupo
 7.-- void list() imprime informacion de este grupo en consola estandar.

 */

public class ThreadGroupDemo implements Runnable{

    public void run(){
        show();
    }

    void show(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Grupo Padre");
        Thread t1 = new Thread(tg1, runnable,"uno");
        Thread t2 = new Thread(tg1, runnable,"dos");
        Thread t3 = new Thread(tg1, runnable,"tres");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Nombre del grupo: "+tg1.getName());
        tg1.list();
    }
}







