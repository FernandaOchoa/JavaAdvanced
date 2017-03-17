package com.fernandaochoa.Jueves;
class Tabla {
    synchronized void printTable(int n){
        //Metodo sincronizado
        for(int i=1; i<=5; i++){
            System.out.println(n*i);

            try{
                Thread.sleep(400);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
public class TestSync3 {
    public static void main(String[] args) {
        //Solo un objeto
        final Tabla tabla = new Tabla();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                tabla.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                tabla.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}







