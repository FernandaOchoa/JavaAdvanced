package com.fernandaochoa.Martes;


public class Test3 {
    public static void main(String[] args) {
        try {
            int dato = 25/5;
            System.out.println(dato);
        }catch (NullPointerException npe){
            System.out.println(npe);
        }finally {
            System.out.println("Este bloque SIEMPRE SE EJECUTA");
        }
        System.out.println("lo que sea");
    }
}
