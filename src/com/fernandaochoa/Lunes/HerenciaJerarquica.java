package com.fernandaochoa.Lunes;


public class HerenciaJerarquica {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.mueren();
        cat.nacen();
    }
}
class Animales {
    void nacen (){
        System.out.println("Nacen");
    }
}

class Dog extends Animales {
    void crecen(){
        System.out.println("Crecen");
    }
}

class Cat extends Animales {
    void mueren(){
        System.out.println("Me los comi jajaja");
    }
}