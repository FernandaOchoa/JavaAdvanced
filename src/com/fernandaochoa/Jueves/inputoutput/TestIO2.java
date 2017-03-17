package com.fernandaochoa.Jueves.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

//Para escribir una cadena
public class TestIO2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\cadena.txt");
            String s= "Que magico";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Listo...");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
