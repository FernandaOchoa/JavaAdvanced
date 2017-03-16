package com.fernandaochoa.Miercoles.Nivel3;


public class Main implements Runnable {

    private Cliente cliente;
    private Cajera cajera;
    private long initialTime;

    public Main(Cliente cliente, Cajera cajera, long initialTime) {
        this.cajera = cajera;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }


    public static void main(String[] args) {
        Cliente paco = new Cliente("Francisco", new int[]{2,4,2,4,8});
        Cliente uriel = new Cliente("Uriel", new int[]{5,1,1,3,12});

        Cajera claudia = new Cajera("Claudia");
        Cajera laura = new Cajera("Laura");

        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        Runnable caja1 = new Main(paco,claudia,initialTime);
        Runnable caja2 = new Main(uriel,laura,initialTime);

        new Thread(caja1).start();
        new Thread(caja2).start();
    }
    public void run(){
        this.cajera.procesarCompra(this.cliente,this.initialTime);
    }
}
