package com.fernandaochoa.Martes;
/*
Si una clase tiene diferentes metodos con el mismo nombre pero diferentes
parametros se conoce como Sobrecarga de metodos

Ventajas de la Sobrecarga de metodos
Incrementa la legibilidad del programa

Diferentes formas de sobrecargar un metodo
    1.- Cambiando el numero de argumentos
    2.- Cambiando el tipo de datos

 */

class Añadido{
    //Caso 1
    static int add(int a, int b ){
        return a+ b;
    }

    static int add (int a, int b, int c){
        return a+b+c;
    }

    //Caso 2
    static int suma(int c, int d){
        return c+d;
    }

    static double suma(double c, double d){
        return c + d;
    }
    /*
    En java no es posible sobrecargar un metodo cambiando solamente el
    tipo de retorno
    static int add(int a, int b){return lo que sea}
    static double add(int a, int b){return lo que sea}
    Ambigüedad
     */
}
public class OverloadingTest {
    public static void main(String[] args) {
        //  Caso 1
        System.out.println(Añadido.add(111,111));
        System.out.println(Añadido.add(11,111,1111));

        //Caso 2
        System.out.println(Añadido.suma(12,12));
        System.out.println(Añadido.suma(12.5,17.8));
    }

    /*
    El metodo main se puede sobrecargar y tener cualquier cantidad de metodos
    main, sin embargo la JVM solo va a ejecutar el que tiene como argumento
    un arreglo de strings

    class overload{
        public static void main(String [] args){ System.out.println("main con String[]");
        public static void main(String args){ System.out.println("main con args");
        public static void main(){ System.out.println("main sin args");
        Solo imprime el main 1
     */
}
