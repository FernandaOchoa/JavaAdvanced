package com.fernandaochoa.Jueves;


import java.io.FileOutputStream;
import java.io.IOException;

public class TestMulti4 extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                cadena();
                System.out.println("Tarea uno");
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                escribe();
                System.out.println("Tarea dos");
            }
        };
        t1.start();
        t2.start();
    }
    static void cadena (){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\cadena.txt");
            String s= "Ultra magico!! :D";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Listo...");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    static void escribe(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\escribe.txt");
            fos.write(65);
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
