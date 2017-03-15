package com.fernandaochoa.Martes;
/*
Una interface es un plano de una clase.
Tiene constantes estaticas y metodos abstractos.

Interface en java es un mecanismo que permite lograr la abstraccion.
Solo puede haber metodos abstractos en la interfaz, osea metodos sin
cuerpo. Permiten la Herencia Multiple.
La interfaz representa la relacion IS-A
No se puede instanciar como una clase abstracta

3 razones para usar interfaces.
    1.- Para lograr la abstraccion
    2.- Para soportar la funcionalidad de herencia multiple
    3.- Para lograr (loose coupling) desacoplamiento.
En java 8 una interface tiene por default metodos estaticos

interface Printable{         |             |  interface Printable{
int Min = 5;                 |  COMPILADOR |    public static final int MIN = 5;
void print();                |             |    public abstract void print();
}                            |             |  }
Printable.java                                Printable.class
 */

interface printable{
    void print();
}

class Hola implements printable{
    public void print(){
        System.out.println("Hola");
    }

    public static void main(String[] args) {
        Hola saludo = new Hola();
        saludo.print();
    }
}
public class InterfacesTest {


}
