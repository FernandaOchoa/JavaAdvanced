package com.fernandaochoa.Lunes;

public class HerenciaMultinivel {

    public static void main(String[] args) {
        Cachorro puppy = new Cachorro();
        puppy.eat();
        puppy.jugando();
        puppy.travesuras();
    }
}
class Animal {
    void eat (){
        System.out.println("comiendo...");
    }
}

class Perro extends Animal {
    void jugando (){
        System.out.println("jugando...");
    }
}
class Cachorro extends Perro {
    void travesuras(){
        System.out.println("se lo comieron los gatos ");
    }
}
