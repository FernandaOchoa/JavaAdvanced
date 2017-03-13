package com.fernandaochoa.Lunes;

class Rectangulo{
    int lenght, width;

    public void agregar(int l, int w){
        lenght = l;
        width = w;
    }
    public void calcularArea(){
        System.out.println(lenght*width);
    }
}

public class PruebaRectangulo {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(), r2= new Rectangulo();
        r.agregar(11,5);
        r2.agregar(3,15);

        r.calcularArea();
        r2.calcularArea();
    }
}
