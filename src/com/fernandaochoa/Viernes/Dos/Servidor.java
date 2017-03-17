package com.fernandaochoa.Viernes.Dos;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dot = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String  str = "",str2 ="" ;

        while(!str.equals("stop")){
            str= din.readUTF();
            System.out.println("El cliente dice: "+str);
            str2 = br.readLine();
            dot.writeUTF(str2);
            dot.flush();
        }
        din.close();
        s.close();
        ss.close();
    }
}
