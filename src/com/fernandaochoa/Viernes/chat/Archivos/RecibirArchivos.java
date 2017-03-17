package com.fernandaochoa.Viernes.chat.Archivos;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by monsh on 17/03/2017.
 */
public class RecibirArchivos  extends Thread{
    private String path, ipServidor, nombreServidor;
    private int puerto;
    private Socket clienteArchivos;

    //constructor
    public RecibirArchivos(String ficher, String serv, int port, String ipServ) {
        this.path = ficher;
        this.puerto = port;
        this.nombreServidor = serv;
        this.ipServidor = ipServ;
    }

    public void run() {

        ServerSocket server;    //Crea un nuevo ServerSocket
        Socket receptor;        //Crea un Socket receptor

        //Crea los objetos Buffered para la lectura del archivo recibido y la escritura del mismo
        BufferedInputStream bis;
        BufferedOutputStream bos;
        byte[] receivedData;    //Vector de bytes para recibir el archivo
        int indicador;          //Indicador para leer el archivo hasta que se complete
        String file;            //Path donde se va a colocar el archivo recibido y tambien recibe el nombre

        try {
            server = new ServerSocket(35557);

            //Se ejecuta indefinidamente para poder recibir siempre archivos
            while (true) {
                receptor = server.accept();

                //Obtiene el archivo como bytes
                receivedData = new byte[1024];
                bis = new BufferedInputStream(receptor.getInputStream());
                DataInputStream dis = new DataInputStream(receptor.getInputStream());

                //Recibimos el nombre del fichero e indicamos que se va a colocar
                file = dis.readUTF();
                file = file.substring(file.indexOf('/') + 1, file.length());

                //Escribe nuevamente el archivo recibido en bytes, ahora lo escribe en su formato
                bos = new BufferedOutputStream(new FileOutputStream(file));
                while ((indicador = bis.read(receivedData)) != -1) {
                    bos.write(receivedData, 0, indicador);
                }

                bos.close();
                dis.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}