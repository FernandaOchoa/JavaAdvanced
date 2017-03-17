package com.fernandaochoa.Viernes;
/*
Networking es un concepto de conectividad entre 2
o mas dispositivos  juntos, que comparten recursos

Programacion de sockets proporciona la facilidad para compartir
datos entre diferentes dispositivos

Ventajas de Networking en Java
    Comparten recursos
    Centralizan la gestion del software

Conceptos
    Direccion ip: Numero dinamico asignado a un nodo de una red
    compuesto pos octetos que van del 0 al 255
    Es una direccion logica que puede ser cambiada

   Protocolo: Conjunto de reglas que se establecen para la
   comunicacion. EJ: FTP, TCP, Telnet,SMTP,POP,etc

   Puerto: Esta asociado con la direccion ip para la comunicacion
   entre aplicaciones.

   MAC: (Media Access Control) Identificador unico de NIC
   NIC( Network Interface Controller). Un nodo de red puede
   tener multiples NIC pero solo un MAC unico.
   Direccion fisica estatica.

   Protocolo Orientado a la Comunicacion
   Connection -Oriented

    Es un protocolo de tipo TCP, TCP/IP, confiable pero lento
    El acuse de recibo es enviado por el receptor

   Connection-Less El receptor no envia, el acuse de recibo.
   Es rapido, sin embargo no es confiable. Ej UDP

   Socket: Punto final en una conexion bidireccional.

        La programacion de sockets se utiliza para la comunicacion
        entre las aplicaciones que se ejecutan entre diferentes
        JRE. Java Runtime Enviroment

        La programacion de Java Socket puede estar orientada a la conexion
        o sin conexion.

        Las clases Java Socket y ServerSocket
        Son usadas para la programacion orientada a la conexion

        Las clases DatagramSocket y DatagramPacket
        Son usadas para la programacion de socket sin conexion

        El cliente en la programacion necesita saber:
            IP Address del Server
            Port Number
            Socket class

      Un socket es un punto final para las comunicaciones entre
      dispositivos.

       Socket Class
       Metodos
            public InputStream getInputStream()
                regresa el is adjunto con el socket
            public OutputStream getOutputStream()
                regresa el os adjunto al socket
            public synchronized void close()
                cierra el socket
       Server Socket
       Metodos
            public Socket accept()
                Establece la conexion entrante
           public synchronized void close()
                Cierra la conexion del servidor.
 */

public class Teoria {

}
