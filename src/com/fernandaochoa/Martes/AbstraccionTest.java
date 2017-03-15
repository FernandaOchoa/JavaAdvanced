package com.fernandaochoa.Martes;

abstract class Bici{
    Bici(){
        System.out.println("La bicicleta se creo");
    }
    abstract void run();

    void changeColor(){
        System.out.println("Color cambiado");
    }
}

class Magistroni extends Bici {
    void  run(){
        System.out.println("Soy una bicicleta");
    }
}
public class AbstraccionTest {

    void run(){
        System.out.println("La bici corre de manera segura");
    }
    public static void main(String[] args) {

        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();

    }
}
