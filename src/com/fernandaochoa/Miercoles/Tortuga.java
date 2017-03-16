package com.fernandaochoa.Miercoles;

public class Tortuga extends Thread {
    public void run(){
        int i = 0;
        System.out.println("Inicia la tortuga");
        while (i <=5){
            try {
                Thread.sleep(5000);
                System.out.println("Doy un paso");
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
            i++;
        }
        System.out.println("Ya llego la tortuga");
    }
}
