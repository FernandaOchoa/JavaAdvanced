package com.fernandaochoa.Jueves.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

/*
Java I/O
Entrada y Salida
Se utiliza para procesar la entrada y la salida .
Java utiliza el concepto de flujo (stream) para hacer que la operacion
E/S sea rapida.
El paquete java.io contiene todas las clases necesarias para las operaciones
de entrada y salida.

Podemos realizar el manejo de archivos a traves de Java I/O API

STREAM
    Es un flujo de datos, compuesto por bytes.
    Se llama stream por que es como un flujo de agua que sigue corriendo.

    En java existen 3 streams que se crean para nuestro uso automaticamente
        1.- System.out: flujo de salida estandar
        2.- System.in: flujo de entrada estandar
        3.- System.err: flujo de errores estandar

        System.out.print("Error");
        System.err.print("Error");

     OutputStream vs InputStream
     Input: Lee
     Output: Escribe
 */
//FileOutputStream
public class TestIO {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                    new FileOutputStream("C:\\hola.txt");

            fos.write(65);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
