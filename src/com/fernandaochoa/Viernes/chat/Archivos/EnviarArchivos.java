package com.fernandaochoa.Viernes.chat.Archivos;

import java.io.*;
import java.net.Socket;

/**
 * Created by monsh on 17/03/2017.
 */
public class EnviarArchivos extends Thread {
    int indicador;
    byte[] vectorDatos;
    Socket client;
    String ipServidor;
    String nombreArchivo;
    BufferedInputStream bufferIngreso;    //Nuevo objeto BufferedInputStream
    BufferedOutputStream bufferSalida;

    //constructor
    public EnviarArchivos(String chatServer, String pat) {
        this.ipServidor = chatServer;
        this.nombreArchivo = pat;
    }

    public void run() {

        try {
            //Nuevo archivo con el path correspondiente
            final File localFile = new File(nombreArchivo);

            //Nuevo socket con la direccion IP (chatServer) de la computadora a la que se enviara el archivo
            //Y con el puerto por el que se realizara el envio
            client = new Socket(ipServidor, 35557);

            //Instancia los objetos para leer el archivo a enviar y para escribirlo y enviarlo como bytes
            bufferIngreso = new BufferedInputStream(new FileInputStream(localFile));
            bufferSalida = new BufferedOutputStream(client.getOutputStream());

            //Enviamos el nombre del archivo
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            dos.writeUTF(localFile.getName());

            vectorDatos = new byte[8192];
            //Realiza la lectura del archivo a enviar y lo escribe en bytes
            while ((indicador = bufferIngreso.read(vectorDatos)) != -1) {
            //Escribe como bytes el archivo a enviar
                bufferSalida.write(vectorDatos, 0, indicador);
            }

            //Muestra el mensaje de que el archivo se envio
            bufferIngreso.close();    //Cierra el objeto BufferedInputStream
            bufferSalida.close();    //Cierra el objeto BufferedOutputStream

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
