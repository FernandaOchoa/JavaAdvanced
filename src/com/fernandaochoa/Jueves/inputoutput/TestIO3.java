package com.fernandaochoa.Jueves.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;

public class TestIO3 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\escribe.txt");

            int i = fis.read();
            System.out.print((char)i);
            fis.close();

        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
