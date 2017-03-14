package com.fernandaochoa.Martes.Banco2;

class Banco {
    float getRateOfInterest() {
        return 0;
    }
}
class Bancomer extends Banco {
    float getRateOfInterest(){
        return 8.4f;
    }
}
class HSBC extends Banco {
    float getRateOfInterest(){
        return 7.3f;
    }
}
class BanCoppel extends Banco {
    float getRateOfInterest(){
        return 9.7f;
    }
}
class TestPolimorfismo {
    public static void main(String[] args) {
        Banco b;
        b = new Bancomer();
        System.out.println("La tasa de interes de Bancomer es:"+b.getRateOfInterest());

        b = new HSBC();
        System.out.println("La tasa de interes de HSBC es:"+b.getRateOfInterest());

        b = new BanCoppel();
        System.out.println("La tasa de interes de BanCoppel es:"+b.getRateOfInterest());
    }
}
