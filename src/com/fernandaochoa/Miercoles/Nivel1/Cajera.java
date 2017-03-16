package com.fernandaochoa.Miercoles.Nivel1;

public class Cajera {
    private  String nombre;

    public Cajera(){

    }
    public Cajera(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
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

    /**
     * Metodo procesar compra
     * @param cliente
     * @param  timeStamp
     */
    public void procesarCompra(Cliente cliente, long timeStamp){
        System.out.println("La cajera: "+this.nombre+
        " Ha comenzado a procesar la compra del cliente "+
        cliente.getNombre()+"\n En un tiempo de: "+
                (System.currentTimeMillis() -timeStamp)/1000+
        "seg");

        for(int i= 0; i< cliente.getCarroCompra().length; i++){
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto: "+(i+1)
            +" en el tiempo: "
                    +(System.currentTimeMillis()-timeStamp)/1000);
        }

        System.out.println("La cajera: "+this.nombre +
        " Ha terminado de procesar los productos del cliente "+
        cliente.getNombre()+ " en el tiempo:"+
                (System.currentTimeMillis()-timeStamp)/1000+
        " seg");
    }


}
