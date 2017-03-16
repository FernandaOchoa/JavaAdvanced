package com.fernandaochoa.Miercoles.Nivel1;


public class Main {
    public static void main(String[] args) {
        Cliente paco = new Cliente("Francisco", new int[]{2,4,2,4,8});
        Cliente uriel = new Cliente("Uriel", new int[]{5,1,1,3,12});

        Cajera claudia = new Cajera("Claudia");
        Cajera laura = new Cajera("Laura");

        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        claudia.procesarCompra(paco,initialTime);
        laura.procesarCompra(uriel,initialTime);
    }
}
