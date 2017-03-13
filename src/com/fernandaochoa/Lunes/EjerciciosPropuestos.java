package com.fernandaochoa.Lunes;

/*
        * Realizar los siguientes ejercicios
        * A) Serie de Fibonacci
        * Verificar si un numero es primo
        * Calcular el factorial de un numero
*/
public class EjerciciosPropuestos {
    static int n1 =0, n2=1, n3 =0;

    //Fibonacci Recursivo
    static void printFibonacci(int count){
        if (count>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        //Normal
        Fibonnaci();

        //Para el recursivo
        int count = 10;
        //imprimo 0 y 1
        System.out.println(n1 +" "+n2);
        printFibonacci(count-2);
    }

    private static void Fibonnaci() {
        //Serie de Fibonacci
        int n1 = 0, n2 = 1, n3, i, count = 10;

        //Imprime 0 y 1
        System.out.println(n1 + " " + n2);

        for (i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2= n3;
        }
    }
}