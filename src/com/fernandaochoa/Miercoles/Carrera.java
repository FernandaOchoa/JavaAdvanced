package com.fernandaochoa.Miercoles;


public class Carrera {
    public static void main(String[] args) {
        Tortuga t1 = new Tortuga();
        Thread t2 = new Thread(new Liebre());
       /* Liebre t3 = new Liebre();
        Thread hilo = new Thread(t3);
        */
       t1.start();
       t2.start();
    }
}
