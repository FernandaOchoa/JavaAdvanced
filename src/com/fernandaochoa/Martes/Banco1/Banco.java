package com.fernandaochoa.Martes.Banco1;


public class Banco {
    int getRateOfInterest(){
        return 0;
    }
}
class Bancomer extends Banco {

    int getRateOfInterest(){
        return 8;
    }
}
class HSBC extends  Banco {

    int getRateOfInterest(){
        return 7;
    }
}
class BanCoppel extends Banco {

    int getRateOfInterest(){
        return 9;
    }
}
class Prueba {
    public static void main(String[] args) {
        Bancomer bancomer = new Bancomer();
        HSBC hsbc = new HSBC();
        BanCoppel banCoppel = new BanCoppel();

        System.out.println("En Bancomer la tasa de interes es: "+bancomer.getRateOfInterest());
        System.out.println("En HSBC la tasa de interes es: "+hsbc.getRateOfInterest());
        System.out.println("En BanCoppel la tasa de interes es: "+banCoppel.getRateOfInterest());

    }
}
/*
Un metodo estatico no puede ser redefinido por que el metodo estatico
esta enlazado con la clase, mientras que el metodo de la instancia
esta enlazado con el objeto.

OVERRIDE: (SOBREESCRIBIR) REDEFINIR -> Un metodo ya existente para
cambiar su implementacion
OVERLOAD: SOBRECARGA -> Cambiar argumentos y tipos en la
signatura del metodo
 */



