package com.fernandaochoa.Martes.Banco4;
/*
Abstract Class                                   |   Interface
1.- Tiene metodos abstractos y no abstractos     |   1.- Solo tiene metodos abstractos, Desde Java 8 tiene metodos default y estaticos
2.- No soportan herencia multiple                |   2.- Soportan herencia multiple
3.- Tienen variables finales, estaticas y no     |   3.- Solo tienen variables estaticas y finales
    estaticas                                    |
4.- Puede proveer la implementacion de una       |   4.- No puede proveer una implementacion de una clase abstracta
    interface
5.- La palabra abstract declara una clase        |   5.- La palabra interface es usada para declarar una interface
    abstracta

    public abstract class Shape{                        public interface Drawable{
        public abstract void draw();                        void draw();
   }                                                    }
 */

interface Banco {
    float getRateOfInterest();
}
class Bancomer implements Banco {
    public float getRateOfInterest(){
        return 7.5f;
    }
}
class HSBC implements Banco {
    public float getRateOfInterest(){
        return 8.6f;
    }
}
class BancCoppel implements Banco {
    public float getRateOfInterest(){
        return 9.3f;
    }
}
class TestBanco {
    public static void main(String[] args) {
        Banco b;
        b= new Bancomer();
        System.out.println("La tasa de interes de Bancomer es: "+b.getRateOfInterest()+" %");
        b = new HSBC();
        System.out.println("La tasa de interes de HSBC es: "+b.getRateOfInterest()+" %");
        b = new BancCoppel();
        System.out.println("La tasa de interes de BanCoppel es: "+b.getRateOfInterest()+" %");
    }
}
