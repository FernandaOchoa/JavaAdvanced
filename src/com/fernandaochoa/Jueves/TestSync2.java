package com.fernandaochoa.Jueves;

class Tab {
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
class MyTab extends Thread {
    Tab t;
    MyTab(Tab t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }
}
class MyTab2 extends Thread {
    Tab t;
    MyTab2(Tab t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class TestSync2 {
    public static void main(String[] args) {
        //Solo un objeto
        Tab ob1 = new Tab();

        MyTab t1 = new MyTab(ob1);
        MyTab2 t2 = new MyTab2(ob1);

        t1.start();
        t2.start();
    }
}
