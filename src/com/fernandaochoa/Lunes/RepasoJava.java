package com.fernandaochoa.Lunes;

public class RepasoJava {

    public static void main(String[] args) {
        int a = 3;
        String hola = "Hola COPPEL";
        int marca = 65, numero = 20;

        System.out.println("hOLA COPPEL");
        System.out.println(hola);
        System.out.println(a);

        //If statement
        int edad = 23;
        if (edad > 18)
            System.out.println("Tu edad es mayor 18");
        if (edad > 21) {
            System.out.println(edad);
        } else
            System.out.println("Eres joven");

        if (marca < 50) {
            System.out.println("error");
        } else if (marca >= 50 && marca < 60) {
            System.out.println("Grado D");
        } else if (marca >= 60 && marca < 70) {
            System.out.println("Grado C");
        } else if (marca >= 70 && marca < 80) {
            System.out.println("Grado B");
        } else if (marca >= 80 && marca < 90) {
            System.out.println("Grado A");
        } else if (marca >= 90 && marca < 100) {
            System.out.println("Grado A+");
        } else System.out.println("invalido");

        //Switch Statement
        switch (numero) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("No es 10,20 ni 30");
        }

        //For Bucle
        //Desde, hasta, incrementa o decrementa
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //For each
        int arreglo[] = {1, 22, 33, 44, 56};

        for (int loQueSea : arreglo) {
            System.out.println(loQueSea);
        }

        //While
        //Mientras la condicion se cumpla -haz lo que sea e incrementa 1
        int b = 1;
        while (b <= 10) {
            System.out.println(b);
            b++;
        }

        //Do While
        //Primero l hace, luego evalua si debia hacerlo
        int n = 1;
        do {
            System.out.println("Hago algo");
            n++;
        } while (n <= 10);

        //Break
        for (int l = 1; l <= 10; l++) {
            if (l == 5) {
                break;
            }
            System.out.println(l);
        }

        //Continue Statement
        for (int l = 1; l <= 10; l++) {
            if (l == 5) {
                continue;
            }
            System.out.println(l);
        }
    }
}