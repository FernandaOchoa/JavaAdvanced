package com.fernandaochoa.Lunes;
/*
        * Realizar los siguientes ejercicios
        * A) Serie de Fibonacci
        * Verificar si un numero es primo
        * Calcular el factorial de un numero
*/
public class EjerciciosPropuestos3 {


    public static void main(String[] args) {
        factorialNormal();

        //Recursivo
        int i, fact=1;
        int numero = 4;
        fact= factorial(numero);
        System.out.println("El factorial de "+numero+fact);
    }

    private static void factorialNormal() {
        int i, fact =1;
        int numero = 5;

        for (i=1; i<= numero; i++){
            fact = fact * i;
        }
        System.out.println("El factorial de "+numero+"es: "+fact);
    }

    //Metodo Recursivo
    static int factorial(int n){
        if (n==0)
        return 1;
        else
            return (n*factorial((n-1)));
    }
}