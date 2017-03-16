package com.fernandaochoa.Miercoles.Nivel1;
//POJO Plain Old Java Object
public class Cliente {
    private  String nombre;
    private  int[] carroCompra;

    public Cliente (){

    }
    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    public String getNombre(){
        return  nombre;
    }
    public int[] getCarroCompra (){
        return carroCompra;
    }

}
