package com.fernandaochoa.Jueves.inputoutput;

/*
BufferedInputStream se utiliza para leer la infornacion del
strea. Utiliza internamente el mecanismo del almacenador
intermedio para hacer el funcionamiento rapido.

Puntos a tomar en cuenta
    Cuando se omiten o se leen los bytes del flujo, el bufer
    interno se rellena automaticamente del flujo de entrada,
    conteniendo muchos bytes a la vez.

    Cuando se crea un BufferedInputStream, se crea un array
    interno.

    Metodos
        int available(): Devuelve un numero estimado de bytes, que
        se pueden leer sin bloquear por el metodo next invocation
        para el stream de entrada.

        int read() Lee el siguiente byte de datos del stream

        int read(byte[], int off, in ln): Lee los bytes de la secuencia
        de entrada.
        void close(): Cierra el stream de entrada y libera cualquiera
        de los recursos asociados al flujo

        void reset() Reposiciona el stream en una posicion donde metodo
        mark fue llamado por ultima vez.

        void mark(int readlimit) Ve el limite general del metodo para el stream

        long skip() Se salta y descarta x bytes de datos del stream

        boolean markSupported() Comprueba si el stream admite los metodos de marca
        y reset
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestIO6 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\cadena.txt");
        BufferedInputStream bin = new BufferedInputStream(fis);

        int i;
        while ((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fis.close();
    }

}
