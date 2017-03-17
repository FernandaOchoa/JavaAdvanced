package com.fernandaochoa.Jueves;

/*
Java Shutdown Hook
El shutdown hook puede ser utilizado para realizar acciones de
limpieza o guardar el estado cuando la JVM se apaga abruptamente
o normalmente.
Realizar acciones de limpieza o recursos de limpieza significa
cerrar el archivo de registro, enviar algunas alertas o algo mas.
Asi que si se desea ejecutar algun codigo antes de que la JVM
se apaque utilizamos Shutdown Hook

Cuando se cierra la JVM?
    Cuando el usuario presiona ctrl +c en la consola
    Se invoca el metodo System.exit(int)
    Usuario cierra sesion
    El metodo addShutdownHook(Thread hook)
        Este ultimo de la clase Runtime se utiliza para registrar el hilo
        con la JVM

Sintaxis Basica
    public void addShutdownHook(Thread hook){}
El objeto de la clase Runtime se puede obtener llamndo al metodo
estatico factory getRuntime(). Ej
        Runtime r = new Runtime.getRuntime();

        Factory: Metodo que devuelve una instancia de una clase
*/

public class MyThread extends Thread {
    public void run(){
        System.out.println("Shut down hook task completed...");
    }
}
class TestShutdown{
    public static void main(String[] args) throws Exception {
        Runtime r =  Runtime.getRuntime();
        r.addShutdownHook(new MyThread());
        System.out.println("Now main sleeping... press ctrl + c to exit");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
