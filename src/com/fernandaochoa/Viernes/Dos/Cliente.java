package com.fernandaochoa.Viernes.Dos;

import java.io.*;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("localhost",6666);

        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dot = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";

        while(!str.equals("stop")){
            str = br.readLine();

            dot.writeUTF(str);
            dot.flush();
            str2 = din.readUTF();
            System.out.println("El servidor dice: "+str2);
        }
        dot.close();
        s.close();

    }
}
