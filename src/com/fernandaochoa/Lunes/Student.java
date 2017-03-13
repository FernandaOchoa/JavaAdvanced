package com.fernandaochoa.Lunes;

/*
Constructor: Tipo especial de metodo usado para inicializar los
objetos.
En java un constructor es invocado en el tiempo de ejecucion.
Reglas para crear un constructor en java
     Basicamente son dos reglas para definir un constructor
     1.- Constructor tiene SIEMPRE el MISMO Nombre de la Clase
     2.- Constructor no tiene un tipo de retorno explicito.

     Tipos de Constructores
     1.- Default (No parametrizados)
     2.- Parametrizados

     Constructor por default: No tiene parametros asi que es el
     default
     Sintaxis base
     <class_name>(){}
     El constructor por default provee los valores de inicio de los objetos
     tales como 0, null, etc dependiendo de el tipo.

     Diferencias entre un Constructor y un Metodo
     Constructor
        Es usado para inicializar el estado de un objeto
        No tiene tipo de retorno
        Es invocado implicitamente
        El compilador de java provee un constructor por default
        si no tienes uno
        El nombre del constructor es el mismo que el de la clase

     Metodo
        Es usado para exponer el COMPORTAMIENTO del objeto
        Tiene un valor de retorno
        Es invocado explicitamente
        No lo provee el compilador en ningun caso
        Puede o no tener el mismo nombre de la clase

    Un constructor puede realizar otras tareas ademas de la
    inicializacion como, crear objetos, iniciar un hilo, llamar
    un metodo. Puedes realizar cualquier operacion como en los
    metodos
 */
public class Student {
    int id;
    String nombre;
    int edad;

    //Default
    Student(){
        System.out.println("Soy un constructor por default");
    }
    //Con 2 parametros
    Student(int i, String n){
        id = i;
        nombre = n;
    }
    //Con 3 parametros
    Student(int a, String b, int c){
        id= a;
        nombre = b;
        edad = c;
    }

    void display(){
        System.out.println(id+" "+nombre);
    }

    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student(111, "Paloma");
        Student student3 = new Student(222,"David",16);

        student.display();
        student2.display();
        student3.display();

    }
}
