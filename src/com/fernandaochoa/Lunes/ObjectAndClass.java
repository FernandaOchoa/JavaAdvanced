package com.fernandaochoa.Lunes;

/*
* Objeto: Entidad del mundo real que posee Identidad, Estado y Comportamiento
* Estado: Representa el valor de un objeto
* Comportamiento: Representa la funcionalidad de un objeto
* Identidad: Un identificador unico como un ID
*
* Objeto es una instancia de una clase
*
* Clase en Java: Un grupo de objetos que tienen propiedades comunes
* Es una plantilla para modelar caracteristicas que cumplan con los
* objetos
* Clase contiene
*   Campos
*   Metodos
*   Constructores
*   Bloques
*   Clases anindadas e interfaces
*
*   3 formas de inicializar un objeto
*       1: Por una variable referencia
*       2: Por un metodo
*       3: Por un constructor
* */
//estudiante
public class ObjectAndClass {
    public static void main(String[] args) {
        //Creo un objeto llamado es1, de tipo Estudiante
        Estudiante es1 = new Estudiante();

        //Imprimir por medio del objeto las caracteristicas
        System.out.println(es1.id);
        System.out.println(es1.nombre);

        //Por referencia
        es1.id=5;
        es1.nombre = "Fer";

        System.out.print("El id de mi objeto es: "+es1.id+" ");
        System.out.println("y el nombre es: "+es1.nombre);

        //Por metodo
        Estudiante es2 = new Estudiante();
        es2.insertarRegistro(111, "Paloma");
        es2.displayInfo();
    }
}

class Estudiante {
    int id ;
    String nombre;

    //Por metodo
    void insertarRegistro(int r, String n){
        id = r;
        nombre = n;
    }
    void displayInfo(){
        System.out.println(id + " "+nombre);
    }
}
