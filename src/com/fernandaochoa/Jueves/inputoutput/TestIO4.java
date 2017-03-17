package com.fernandaochoa.Jueves.inputoutput;


import java.io.FileInputStream;
import java.io.IOException;

public class TestIO4 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\cadena.txt");
            int i = 0;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
