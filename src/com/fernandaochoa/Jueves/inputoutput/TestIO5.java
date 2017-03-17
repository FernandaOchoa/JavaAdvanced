package com.fernandaochoa.Jueves.inputoutput;
/*
La clase Java BufferedUotputStream se utiliza para almacenar en bufer un stream
de salida. Internamente utiliza un buffer para almacenar datos directamente en
un stream. Añade mas eficiencia que escribir datos de manera directa en un flujo.
Por lo tanto logra un mejor rendimiento.

Tiene 2 constructores
    BufferedOutputStream(OutputStream os) : Crea un nuevo flujo de salida
    almacenado en bufer que se utiliza para escribir los datos en el stream
    especificado.

    BufferedOutputStream(OutputStream os, int size): Crea el nuevo flujo de
    salida que sera almacenado en bufer que se utiliza para escribir los datos
    en el stream especificando el tamaño del bufer.

    Metodos
        void write(int b): Escribe el byte especificado en el stream de
        salida almacenado en bufer.
        void write(byte[]b, int off, int len): Escribe los bytes de la
         secuencia de stream de bytes especificada en un arreglo de bytes.
         Comienza con el desplazamiento dado.
         void flush(): Borra el flujo de salida almacenado en bufer

         Vacia los datos de una secuencia y la envia a otra. Se necesita
         si se ha conectado una secuencia con otra.

 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO5 {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\cadena.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fos);

        String s = "Hola Amigos :D \n a todos";
        byte b[] = s.getBytes();

        bout.write(b);
        bout.flush();

        bout.close();
        fos.close();

        System.out.println("Listo");
    }
}
