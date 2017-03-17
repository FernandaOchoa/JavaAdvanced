package com.fernandaochoa.Viernes.chat.Cliente;

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
    private final PrincipalCliente ventanaCliente;
    private ObjectOutputStream salida;
    private String mensaje;
    private Socket conexion;

    //Constructor
    public HiloEnviar(Socket conexion, final PrincipalCliente ventana) {
        this.conexion = conexion;
        this.ventanaCliente = ventana;

        //Evento que ocurre al escribir en el areaTexto
        ventanaCliente.ingresoMensaje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                mensaje = event.getActionCommand();
                enviarMensaje(mensaje); //se envia el mensaje
                ventanaCliente.ingresoMensaje.setText(""); //el area donde se ingresa el texto se lo borra para poder ingresar el nuevo texto
            }
        });
    }

    //enviar objeto a cliente
    private void enviarMensaje(String mensaje) {
        try {
            salida.writeObject(ventanaCliente.usuario + " dice: " + mensaje);
            salida.flush(); //flush salida a cliente //borra el buffer
            ventanaCliente.mostrarMensaje("YO: " + mensaje);
        } catch (IOException ioException) {
            ventanaCliente.mostrarMensaje("Servidor Perdido");
        }
    }

    //manipula areaPantalla en el hilo despachador de eventos
    public void mostrarMensaje(String mensaje) {
        ventanaCliente.pantallaChat.append(mensaje);
    }

    public void run() {
        try {
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush();
        } catch (SocketException ex) {
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (NullPointerException ex) {
        }
    }

}
