package com.fernandaochoa.Viernes.chat.Cliente;

import com.fernandaochoa.Viernes.chat.Archivos.EnviarArchivos;
import com.fernandaochoa.Viernes.chat.Archivos.RecibirArchivos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by monsh on 17/03/2017.
 */
public class PrincipalCliente extends JFrame {

    public JTextField ingresoMensaje;
    public JTextArea pantallaChat;
    public JMenuItem adjuntar;
    private static ServerSocket servidor;
    private static Socket cliente;
    private static String ipServidor;// = "127.0.0.1";
    public static PrincipalCliente ventanaCliente;
    public static String usuario;
    public boolean recibir;

    //Creamos la ventana del chat del cliente
    public PrincipalCliente() {
        super("Chat");
        //Campo de Texto en la parte inferior
        ingresoMensaje = new JTextField();
        ingresoMensaje.setEditable(false);
        add(ingresoMensaje, BorderLayout.SOUTH);

        //Hoja del chat centrado
        pantallaChat = new JTextArea();
        pantallaChat.setEditable(false);
        add(new JScrollPane(pantallaChat), BorderLayout.CENTER);
        pantallaChat.setBackground(Color.white);
        pantallaChat.setForeground(Color.black);
        ingresoMensaje.setForeground(Color.blue);

        //Crea opciones de Salir, Adjuntar Archivos y Aceptar Archivos
        JMenuItem salir = new JMenuItem("Salir");
        adjuntar = new JMenuItem("Adjuntar Archivo");
        adjuntar.setEnabled(false);
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra);
        barra.add(salir);
        barra.add(adjuntar);

        //Accion que se realiza Salir
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //Sale de la aplicacion
            }
        });

        //Accion que se realiza Adjuntar Archivo
        adjuntar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser ventanaEscojer = new JFileChooser();
                int seleccion = ventanaEscojer.showOpenDialog(ventanaEscojer);// Se abre el cuadro para escoger el archivo
                String path = ventanaEscojer.getSelectedFile().getAbsolutePath();//Se obtiene la direccion completa del archivo

                //bucle para realizar la comparacion del archivo y poderlo enviar
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    //JOptionPane.showMessageDialog(null, path);
                    ventanaCliente.mostrarMensaje("Enviando Archivo...");
                    RecibirArchivos recibirArchivo = new RecibirArchivos(path, usuario, 35557, "localhost");
                    recibirArchivo.start();
                    EnviarArchivos enviarArchivo = new EnviarArchivos(ipServidor, path);
                    enviarArchivo.start();
                    ventanaCliente.mostrarMensaje("Archivo Enviado Existosamente");
                }
            }
        });
        ipServidor = JOptionPane.showInputDialog(null, "Introduzca IP del servidor: ");
        setSize(320, 500);//tamano de la ventana del chat
        setVisible(true);//hace visible a la ventana
    }

    public static void main(String[] args) {
        ventanaCliente = new PrincipalCliente();
        ventanaCliente.setLocationRelativeTo(null);
        ventanaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        usuario = JOptionPane.showInputDialog(null, "Introduzca su nombre: ");// intrduce el nombre del usuario o el nick

        try {
            //Coneccion con el cliente
            ventanaCliente.mostrarMensaje("Buscando Servidor ...");
            cliente = new Socket(InetAddress.getByName(ipServidor), 11111);
            ventanaCliente.mostrarMensaje("Conectado a :" + cliente.getInetAddress().getHostName());
            ventanaCliente.habilitar(true);

            //Correr los hilos de enviar y recibir
            HiloEnviar hiloEnviarCliente = new HiloEnviar(cliente, ventanaCliente);
            hiloEnviarCliente.start();
            HiloRecibir hiloRecibirCliente = new HiloRecibir(cliente, ventanaCliente);
            hiloRecibirCliente.start();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalCliente.class.getName()).log(Level.SEVERE, null, ex);
            ventanaCliente.mostrarMensaje("No se encuentra al Servidor");
        }
    }

    public void mostrarMensaje(String mensaje) {
        pantallaChat.append(mensaje + "\n");
    }

    public void habilitar(boolean editable) {
        ingresoMensaje.setEditable(editable);
        adjuntar.setEnabled(editable);
    }

}
