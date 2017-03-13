package com.fernandaochoa.Lunes;

/*
THIS
Hay un monton de usos para la palabra this.
En java es una variable de referencia, que
hace referencia a el objeto actual.

Usos de la palabra this.
Hay 6 usos comunes de la palabra reservada
    1.- this puede ser usado para referenciar una variable de instancia
    a una clase
    2.- this puede ser usado para invocar el metodo en la clase actual
    3.- this() puede ser usado para invocar el constructor de la
    clase actual
    4.- this puede ser pasado como argumento en una llamada a un
    metodo
    5.- this puede ser pasado como argumento en una llamada al
    constructor
    6.- this puede ser usado para retornar instancia de la clase actual
    desde el metodo.

 */
public class Autoreferencia {
    public static void main(String[] args) {
        estudiante s = new estudiante(111,"paloma",21);
        s.display();

        A a = new A();
        a.n();

        D d = new D(10);
    }
}
class estudiante {
    int id;
    String nombre;
    int edad;

    estudiante(int id, String nombre, int edad){
        this.id= id;
        this.nombre = nombre;
        this.edad= edad;
    }
    void display(){
        System.out.println(id+" "+nombre+" "+edad);
    }

}

class A{
    void m(){
        System.out.println("Hola soy una m");
    }
    void n(){
        System.out.println("Hola soy una n");
        this.m();
    }
}
class D{
    D(){
        System.out.println("Hola soy una D");
    }
    D(int e){
        //Invocar el constructor de la clase actual
        this();
        System.out.println(e);
    }
}