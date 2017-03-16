package com.fernandaochoa.Miercoles.Nivel2;


public class Main {
    public static void main(String[] args) {
        Cliente paco = new Cliente("Francisco", new int[]{2,4,2,4,8});
        Cliente uriel = new Cliente("Uriel", new int[]{5,1,1,3,12});

        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        Cajera claudia = new Cajera("Claudia",paco,initialTime);
        Cajera laura = new Cajera("Laura",uriel,initialTime);

        claudia.start();
        laura.start();

    }
}
