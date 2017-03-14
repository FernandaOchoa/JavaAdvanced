package com.fernandaochoa.Martes;

class Persona{
    int id;
    String nombre;
    Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}
class Emp extends Persona{
    float salario;
    Emp(int id, String nombre, float salario){
        super(id,nombre);
        this.salario = salario;
    }
    void display(){
        System.out.println(id+" "+nombre+" "+salario);
    }
}

public class SuperTest2 {
    public static void main(String[] args) {
        Emp e = new Emp(1,"David",4500f);
        e.display();
    }
}
