package com.fernandaochoa.Lunes;

/**
 * Created by monsh on 13/03/2017.
 */
public class Calculos {
    void fact(int n ){
        int fact = 1;
        for (int i= 1; i<=n; i++ ){
            fact = fact*i;
        }
        System.out.println("factorial es: "+fact);
    }

    public static void main(String[] args) {
        new Calculos().fact(3);
    }
}
