package com.fernandaochoa.Martes.Banco3;


abstract class Banco {
    abstract int getRateOfInterest();
}
class Bancomer extends Banco {
    int getRateOfInterest(){
        return 7;
    }
}
class HSBC extends Banco {
    int getRateOfInterest(){
        return 8;
    }
}
class BancCoppel extends Banco {
    int getRateOfInterest(){
        return 7;
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
