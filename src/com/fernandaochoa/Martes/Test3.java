package com.fernandaochoa.Martes;
/*
Diferencias entre trhow y throws en Java
throw
1.- palabra reservada usada para manejar una excepcion explicita
2.- Es usada sin un metodo
3.- No puede manejar excepciones multiples
throws
1.- palabra reservada para declarar una excepcion
2.- Es usado en la signatura de un metodo
3.- Puede manejar multiples excepciones usando una coma
 */

public class Test3 {
    public static void main(String[] args) {
        try {
            int dato = 25/5;
            System.out.println(dato);
        }catch (NullPointerException npe){
            System.out.println(npe);
        }finally {
            System.out.println("Este bloque SIEMPRE SE EJECUTA");
        }
        System.out.println("lo que sea");
    }
    //Ejemplo de throw
    void l(){
        throw new ArithmeticException("la excepcion es aritmetica");
    }

    //Ejemplo con throws
    void j ()throws ArithmeticException{
        //body
    }

    //Ejemplo juntos
    void h () throws ArithmeticException {
        throw new ArithmeticException("hola");
    }
}
