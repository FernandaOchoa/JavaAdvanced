package com.fernandaochoa.Viernes.tres;

import java.net.InetAddress;

public class URLDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del Host: " + ip.getHostName());
            System.out.println("Direccion IP: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }

/*
        try{

            URL url = new URL("https://codigofacilito.com/articulos/buenas-practicas-en-commits-de-git");
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
        }catch (MalformedURLException mur){
            mur.printStackTrace();
        }
        */
    }
}
