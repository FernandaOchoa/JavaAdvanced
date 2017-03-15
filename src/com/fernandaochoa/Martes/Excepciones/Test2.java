package com.fernandaochoa.Martes.Excepciones;


import java.io.IOException;

public class Test2 {
    void m()throws IOException {
        throw new IOException("device error");
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.p();
        System.out.println("Normal Flow");
    }




    static void validate(int age){
        if (age <18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("Welcome to vote");
    }

    public static void main(String args) {
        validate(13);
        System.out.println("resto del codigo");
    }
}
