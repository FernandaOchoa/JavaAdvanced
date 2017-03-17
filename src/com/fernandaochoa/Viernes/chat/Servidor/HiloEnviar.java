package com.fernandaochoa.Viernes.chat.Servidor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created by monsh on 17/03/2017.
 */
public class HiloEnviar extends Thread {
    private final PrincipalServidor ventanaServidor;
    private ObjectOutputStream salida;
    private String mensaje;
    private Socket conexion;

    //Constructor
    public HiloEnviar(Socket conexion, final PrincipalServidor ventana) {
        this.conexion = conexion;
        this.ventanaServidor = ventana;

        //Evento que ocurre al escribir en el areaTexto
        ventanaServidor.ingresoMensaje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                mensaje = event.getActionCommand();
                enviarMensaje(mensaje); //se envia el mensaje
                ventanaServidor.ingresoMensaje.setText(""); //el area donde se ingresa el texto se lo borra para poder ingresar el nuevo texto
            }
        });
    }

    //enviar objeto a cliente
    private void enviarMensaje(String mensaje) {
        try {
            salida.writeObject(ventanaServidor.usuario + " dice: " + mensaje);
            salida.flush(); //flush salida a cliente //borra el buffer
            ventanaServidor.mostrarMensaje("YO: " + mensaje);
        } catch (IOException ioException) {
            ventanaServidor.mostrarMensaje("Cliente perdido");
        }
    }

    //manipula areaPantalla en el hilo despachador de eventos
    public void mostrarMensaje(String mensaje) {
        ventanaServidor.pantallaChat.append(mensaje);
    }

    public void run() {
        try {
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush(); //flush salida a cliente //borra el buffer
        } catch (SocketException ex) {
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NullPointerException ex) {
        }
    }

}
