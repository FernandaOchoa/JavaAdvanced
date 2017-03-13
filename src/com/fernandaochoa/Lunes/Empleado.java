package com.fernandaochoa.Lunes;
/*
Herencia: Es un mecanismo en el cual los objetos adquieren
todas las propiedades y comportamientos de la clase padre

La idea detras de la herencia es que puedas crear nuevas clases
construidas a partir de ya existentes como base.
Cuando heredas de una clase existente puedes añadir tambien
nuevos metodos

Por que usar herencia...
Para sobreescritura de metodos
Para reutilizar codigo

Sintaxis Basica
class Subclass-nombre extends Superclass-nombre{
metodos y atributos
}

La palabra reservada extends indica que estas haciendo una nueva
clase derivada de la que ya existe. El significado de la palabra extends
es incrementar la funcionalidad
En terminologias de java una clase que hereda a otras clases es
llamada super class o clase padre, las clases derivadas son
llamadas clases hijas o subclases.
 */

public class Empleado{
    float salario = 40000;
}
class Programador extends Empleado {
    int bono = 10000;

    public static void main(String[] args) {
        Programador p = new Programador();
        System.out.println("El salario es: "+p.salario);
        System.out.println("El bono es: "+p.bono);
    }
}
