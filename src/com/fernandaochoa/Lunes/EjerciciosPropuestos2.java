package com.fernandaochoa.Lunes;

/*
        *  Realizar los siguientes ejercicios
        * A) Serie de Fibonacci
        * B) Verificar si un numero es primo
        * C) Calcular el factorial de un numero
*/

public class EjerciciosPropuestos2 {
    public static void main(String[] args) {
        int i, m = 0, bandera = 0;
        //Numero a probar
        int n=2;
        m = n/2;

        for (i=2; i<= m; i++){
            if (n%i ==0){
                System.out.println("El numero no es primo");
                bandera = 1;
                break;
            }
        } if (bandera==0)
            System.out.println("El numero es primo");
    }
}