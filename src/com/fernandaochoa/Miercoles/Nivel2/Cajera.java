package com.fernandaochoa.Miercoles.Nivel2;


public class Cajera extends  Thread {
    private  String nombre;
    private Cliente cliente;
    private long initialTime;

    public Cajera(){

    }
    public Cajera(String nombre, Cliente cliente, long initialTime){
        this.nombre= nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre(){
        return nombre;
    }
    public long getInitialTime(){
        return initialTime;
    }
    public Cliente getCliente(){
        return cliente;
    }


    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para esperarXsegundos
     * @params int seg
     */
    private void esperarXsegundos (int segundos){
        try {
            Thread.sleep(segundos * 1000);
        }catch (InterruptedException ie){
            Thread.currentThread().interrupt();
            System.out.println(ie);
        }
    }


    public void run(){
        System.out.println("La cajera: "+this.nombre+
                " Ha comenzado a procesar la compra del cliente "+
                cliente.getNombre()+"\n En un tiempo de: "+
                (System.currentTimeMillis() -this.initialTime)/1000+
                "seg");

        for(int i= 0; i< cliente.getCarroCompra().length; i++){
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto: "+(i+1)
                    +" en el tiempo: "
                    +(System.currentTimeMillis()-this.initialTime)/1000);
        }

        System.out.println("La cajera: "+this.nombre +
                " Ha terminado de procesar los productos del cliente "+
                cliente.getNombre()+ " en el tiempo:"+
                (System.currentTimeMillis()-this.initialTime)/1000+
                " seg");
    }
}
