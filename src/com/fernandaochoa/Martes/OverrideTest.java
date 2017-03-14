package com.fernandaochoa.Martes;
/*
Si una subclase tiene el mismo metodo declarado en la clase padre
se le conoce como un metodo redefinido (Sobreescrito)

En otras palabras si la subclase provee una implementacion
especifica de un metodo que ya esta provisto en la clase padre
es por que esta redefinido.

Usos de la redefinicion de metodos
    Para proveer una implementacion especifica de un metodo
    previamente existente en la super clase

    Es usado para el polimorfismo en tiempo de ejecucion

Reglas de la Redefinicion de Metodos en Java
    1.- El metodo debe tener el mismo nombre como en la clase
    padre
    2.- El metodo debe tener los mismos parametros como en la
    super clase
    3.- Debe ser una relacion de tipo Is A (Heredado).
 */
class Vehiculo{
    void  run(){
        System.out.println("El vehiculo esta corriendo...");
    }
}

public class OverrideTest extends Vehiculo {

    public static void main(String[] args) {
        OverrideTest bicicleta = new OverrideTest();
        bicicleta.run();
    }

    void run(){
        System.out.println("La bicicleta esta corriendo...");
    }

}
