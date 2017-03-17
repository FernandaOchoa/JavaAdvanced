package com.fernandaochoa.Viernes.Uno;


import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("mensaje: "+str);

            ss.close();

        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
