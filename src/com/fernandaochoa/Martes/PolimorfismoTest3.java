package com.fernandaochoa.Martes;

class Animal1{
    void eat(){
        System.out.println("Comiendo...");
    }
}
class Dog extends Animal1 {
    void eat(){
        System.out.println("comiendo croquetas...");
    }
}
class Cachorro extends Dog {
    void eat(){
        System.out.println("Tomando leche");
    }
}

public class PolimorfismoTest3  {
    public static void main(String[] args) {
        Animal1 a;
        a = new Animal1();
        a.eat();
        a= new Dog();
        a.eat();
        a = new Cachorro();
        a.eat();
    }
}
