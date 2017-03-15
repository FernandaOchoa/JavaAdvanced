package com.fernandaochoa.Martes.Excepciones;
/*
5 Palabras usadas en el manejo de excepciones
    1.- Try
    2.- Catch
    3.- Finally
    4.- throw
    5.- throws
 */

public class Test {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Vamos a dividir");
                int b = 39/0;
            } catch (ArithmeticException ae){
                System.out.println(ae);
            }
            try {
                int a[] = new int[4];
                a[5] = 4;
            }catch (ArrayIndexOutOfBoundsException aiobe){
                System.out.println("Cachado");
            }
        } catch (Exception e){
            System.out.println("Otra excepcion");
        }
        System.out.println("FLUJO NORMAL");
    }






    public static void main(String args) {
        try {
            int a[]= new int[5];
            a[5]=30/0;
            //int dato = 50/0;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println(aiobe);
        } catch (Exception e){
            System.out.println("Las tareas comunes se completaron");
        }
        System.out.println("resto del codigo");
    }

}
