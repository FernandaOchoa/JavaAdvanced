package com.fernandaochoa.Miercoles;
/*
Un hilo Demonio en java es un hilo proveedor de servicios que proporciona servicios
al hilo de usuario. Su vida depende de los demas hilos, es decir si todos los demas
hilos se mueren la JVM lo termina automaticamente.

Hay muchos hilos demonios en java que se ejecutan automaticamente.
gc, finalizer, etc

Jconsole en el simbolo del sistema , proporciona la informacion sobre las clases
cargadas, uso de memoria, ejecucion de hilos, etc.

Puntos importantes
Un hilo en java proporciona sevicios a los hilos para brindar soporte a tareas en
segundo plano.
Su vida depende de los hilos del usuario
Es un hilo de baja prioridad.
Java.lang.Thread provee dos metodos para un demonio
1.- public setDaemon(boolean status) es usado para marcar el hilo actual,
como un hilo demonio
2.- public boolean isDaemon() revisa si el hilo actual es un demonio-
 */

public class TestDaemon extends  Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("Tenemos un demonio aqui");
        } else
            System.out.println("Ah no es un hilo de usuario");
    }

    public static void main(String[] args) {
        TestDaemon t1 = new TestDaemon(), t2 = new TestDaemon(),
                t3 = new TestDaemon();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

    }
}
