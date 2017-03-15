package com.fernandaochoa.Martes;

//Declaracion de la interface definida por el usuario
interface Drawable{
    void draw();
}
//Implementacion por un segundo usuario
class Rec1 implements Drawable {
    public void draw(){
        System.out.println("Dibujando un rectangulo");
    }
}
class Cir implements Drawable {
    public void draw(){
        System.out.println("Dibujando un circulo");
    }
}

//Usando las interfaces por un 3er usuario
public class TestInterface1 {
    public static void main(String[] args) {
        Drawable d = new Cir();
        //En un escenario real, el objeto provee el metodo
        //getDrawable
        d.draw();
    }
}
