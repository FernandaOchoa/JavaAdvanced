package com.fernandaochoa.Viernes.chat.Cliente;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by monsh on 17/03/2017.
 */
public class HiloRecibir extends Thread{
    private final PrincipalCliente ventanaCliente;
    private String mensaje;
    private ObjectInputStream entrada;
    private Socket cliente;

    //Constructor del Hilo
    public HiloRecibir(Socket cliente, PrincipalCliente ventana) {
        this.cliente = cliente;
        this.ventanaCliente = ventana;
    }

    //metodo para mostrar el mensaje
    public void mostrarMensaje(String mensaje) {
        ventanaCliente.pantallaChat.append(mensaje);
    }

    public void run() {
        try {
            entrada = new ObjectInputStream(cliente.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(HiloRecibir.class.getName()).log(Level.SEVERE, null, ex);
        }

        do {
            //leer el mensaje y mostrarlo
            try {
                mensaje = (String) entrada.readObject();
                ventanaCliente.mostrarMensaje(mensaje);
            } catch (SocketException ex) {
            } catch (EOFException eofException) {
                ventanaCliente.mostrarMensaje("Conexion Servidor Perdida");
                mensaje ="xxxx";
            } catch (IOException ex) {
                Logger.getLogger(HiloRecibir.class.getName()).log(Level.SEVERE, null, ex);
                ventanaCliente.mostrarMensaje("Conexion Servidor Perdida");
                mensaje ="xxxx";
            } catch (ClassNotFoundException classNotFoundException) {
                ventanaCliente.mostrarMensaje("Objeto desconocido");
                mensaje ="xxxx";
            }

        } while (!mensaje.equals("xxxx")); //Ejecuta hasta que el server escriba TERMINATE

        try {
            entrada.close();//cierra la entrada
            cliente.close();//cierra el socket
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        ventanaCliente.mostrarMensaje("Fin de la conexion");
    }

}