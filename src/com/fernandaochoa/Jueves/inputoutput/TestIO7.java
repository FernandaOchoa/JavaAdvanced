package com.fernandaochoa.Jueves.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
SequenceInputStream
    Es usada para leer datos de multiples streams
    Lee los datos secuencialmente uno por uno

    Constructores
        SequenceInputStream(InputStream s1, InputStream s2)
            Crea un nuevo stream de entrada para leer los datos de 2 streams
            en orden, primero s1 y luego s2

       SequenceInputStream(Enumeration e)
            Crea un nuevo stream de entrada leyendo los datos de un
            enumeration cuyo tipo es input stream

   Metodos de clase
        read() Lee el siguiente byte de datos del stream

        int read(byte[] arr, int off, int len) Lee len bytes de datos de un stream en una matriz

        int available() Es usado para devolver el numero maximo de bytes que se
        pueden leer en un flujo de entrada.

        close() Se utiliza para cerrar el stream de entrada
 */
public class TestIO7 {
    public static void main(String[] args) throws IOException {
        FileInputStream i1 = new FileInputStream("C:\\cadena.txt");
        FileInputStream i2 = new FileInputStream("C:\\hola.txt");
        SequenceInputStream sis = new SequenceInputStream(i1,i2);

        int j;
        while ((j= sis.read())!=-1){
            System.out.print((char)j);
        }
        sis.close();
        i1.close();
        i2.close();

    }
}
