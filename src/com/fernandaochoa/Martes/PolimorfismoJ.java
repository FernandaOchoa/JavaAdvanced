package com.fernandaochoa.Martes;

/*
Polimorfismo: Concepto mediante el cual podemos realizar una tara o accion de
distintas maneras.
Se deriva de dos palabras griegas: Poly y morphos poly= muchos y morphos= formas
Polimorfismos muchas formas

Tipos de polimorfismo
    1.- Runtime Polymorphism:(Polimorfismo en Tiempo de compilacion)
    2.- Dynamic Method Disrpach(Polimorfismo en Tiempo de ejecucion)

    Podemos realizar el polimorfismo en java por sobrecarga de metodo y
    redefinicion de metodo.

 */

class Bike{
    void run(){
        System.out.println("running...");
    }
}
public class PolimorfismoJ  extends Bike{
    void run(){
        System.out.println("running safely woth 60km");
    }

    public static void main(String[] args) {
        Bike b = new PolimorfismoJ();
        /*Upcasting-> Cuando la variable de referencia de la superclase se
        refiere al objeto de la clase hija
        class A{}
        class B extends A{}
        A a = new B();
        */
        b.run();
    }
}
