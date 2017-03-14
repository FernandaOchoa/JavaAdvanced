package com.fernandaochoa.Martes;
/*
Super es una palabra reservada en java como una variable referencia
la cual es usada para servir de intermediario entre la clase padre y la
subclase

Usos de Super
    1.- Se puede utilizar para referir la variable de instancia de la clase
     padre inmediata
     2.- Se puede utilizar para invocar el metodo de la clase padre inmediato.
     3.- Se puede utilizar para invocar al constructor de la clase padre
     inmediata.

 */
//Caso 1
class Animal{

    //Caso 3
    Animal(){
        System.out.println("El animal fue creado");
    }

    //Caso 1
    String color ="Blanco";

    void eat(){
        System.out.println("Comiendo...");
    }

}
class Perro extends Animal{
    //Caso 3
    Perro(){
        super();
        System.out.println("Se ha creado el perro");
    }

    //Caso 1
    String color = "Negro";

    void printColor(){
        //Imprime el color de la clase perro
        System.out.println(color);

        //Imprime el color de la clase animal
        System.out.println(super.color);
    }

    //Caso 2

   void eat(){
       System.out.println("Comiendo Croquetas");
   }
    void sleep(){
        System.out.println("Durmiendo");
    }
    void run(){
        System.out.println("Corriendo");
    }
    void ladrar(){
        System.out.println("guao");
    }
    /*Importante*/
    void llamar(){
        super.eat();
        ladrar();
    }
}

public class SuperTest {
    public static void main(String[] args) {
        //Caso 1
        Perro perro = new Perro();
        perro.printColor();

        //Caso2
        Perro otroPerro = new Perro();
        otroPerro.llamar();
    }
}
