package com.fernandaochoa.Jueves;

/*
 *Java Thread Pool
  *     Representa un grupo de hilos de trabajo y se reutilizan muchas veces.
   *     En el caso de Thread Pool se crea un grupo de hilos de un tamaño
   *     fijo. Un hilo se extrae del grupo y el proveedor de servicios
   *     (service provider) le asigna un trabajo. Una vez completado el trabajo
   *     el hilo es contenido en el grupo nuevamente.
   *
   *     Ventajas de usar Thread Pool
   *     Mejor rendimiento
   *        Ahorra tiempo ya que no hay necesidad de crear nuevos hilos.
   *        Uso en Tiempo Real
   *        Es usado en Servlets y JSP donde el contenedor crea un thread pool
   *        para procesar la solicitud
   *        Ejemplo simple de ExcutorService y Executor
   *
   *    PrintStackTrace() Se utiliza para imprimir el registro del stack donde
   *    se ha iniciado la excepcion
 */

public class WorkerThread implements Runnable  {
    private String message;

    public WorkerThread (String s){
        this.message = s;
    }
    public void run(){
        showBegin();
        processMessage();
        showEnd();
    }

    public void showBegin (){
        System.out.println(Thread.currentThread().getName()+"(Start) " +
                "message= "+message);
    }
    public void showEnd(){
        System.out.println(Thread.currentThread().getName()+"(End)");
    }
    private void processMessage(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

















