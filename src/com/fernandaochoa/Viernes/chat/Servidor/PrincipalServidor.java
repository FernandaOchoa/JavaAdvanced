package com.fernandaochoa.Viernes.chat.Servidor;

import com.fernandaochoa.Viernes.chat.Archivos.EnviarArchivos;
import com.fernandaochoa.Viernes.chat.Archivos.RecibirArchivos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by monsh on 17/03/2017.
 */
public class PrincipalServidor extends JFrame {
    public JTextField ingresoMensaje;
    public JTextArea pantallaChat;
    public JMenuItem adjuntar;
    private static ServerSocket servidor;
    private static Socket cliente;
    private static String ipCliente;// = "10.0.0.4";
    public static String usuario;
    public static PrincipalServidor ventanaServidor;

    //Creamos la ventana del chat del servidor
    public PrincipalServidor() {
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

        //Crea opciones de Salir y Adjuntar Archivos
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
                    ventanaServidor.mostrarMensaje("Enviando Archivo...");
                    RecibirArchivos recibirArchivo = new RecibirArchivos(path, usuario, 35557, "localhost");
                    recibirArchivo.start();
                    EnviarArchivos enviarArchivo = new EnviarArchivos(ipCliente, path);
                    enviarArchivo.start();
                    ventanaServidor.mostrarMensaje("Archivo Enviado Existosamente");
//                    PrincipalCliente.ventanaCliente.recibirArchivo(path,11112);
                }
            }
        });
        ipCliente = JOptionPane.showInputDialog(null, "Introduzca numero IP del Cliente: ");
        setSize(320, 500);//tamano de la ventana del chat
        setVisible(true); //hace visible a la ventana

    }

    public static void main(String[] args) {
        ventanaServidor = new PrincipalServidor();
        ventanaServidor.setLocationRelativeTo(null);
        ventanaServidor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        usuario = JOptionPane.showInputDialog(null, "Introduzca su nombre: ");// intrduce el nombre del usuario o el nick

        try {
            //Crear el socket Servidor
            servidor = new ServerSocket(11111, 100);
            ventanaServidor.mostrarMensaje("Esperando Cliente ...");
            //Bucle infinito para esperar conexiones de los clientes
            while (true) {
                try {
                    connectCliente();
                    startThread();

                } catch (IOException ex) {
                    Logger.getLogger(PrincipalServidor.class.getName()).log(Level.SEVERE, null, ex);
                    ventanaServidor.mostrarMensaje("No se puede conectar con el cliente");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(PrincipalServidor.class.getName()).log(Level.SEVERE, null, ex);
            ventanaServidor.mostrarMensaje("No se encuentra IP del Servidor");
        }
    }

    private static void startThread() {
        //Correr los hilos de enviar y recibir
        HiloEnviar hiloEnviarServidor = new HiloEnviar(cliente, ventanaServidor);
        hiloEnviarServidor.start();
        HiloRecibir hiloRecibirServidor = new HiloRecibir(cliente, ventanaServidor);
        hiloRecibirServidor.start();
    }

    private static void connectCliente() throws IOException {
        //Conexion con el cliente
        cliente = servidor.accept();
        ventanaServidor.mostrarMensaje("Conectado a : " + cliente.getInetAddress().getHostName());
        ventanaServidor.habilitar(true);
    }

    public void mostrarMensaje(String mensaje) {
        pantallaChat.append(mensaje + "\n");
    }

    public void habilitar(boolean editable) {
        ingresoMensaje.setEditable(editable);
        adjuntar.setEnabled(editable);
    }

}