package com.fernandaochoa.Jueves.inputoutput;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestIO8 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis1 = new FileInputStream("C:\\cadena.txt");
        FileInputStream fis2 = new FileInputStream("C:\\hola.txt");

        FileOutputStream fos = new FileOutputStream("C:\\todosjuntos.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

        int i;

        while ((i= sis.read())!=-1){
            fos.write(i);
        }
        close(fis1, fis2, fos, sis);
        System.out.println("Listo...");
    }

    private static void close(FileInputStream fis1, FileInputStream fis2, FileOutputStream fos, SequenceInputStream sis) throws IOException {
        sis.close();
        fos.close();
        fis1.close();
        fis2.close();
    }

}
