package com.fernandaochoa.Miercoles;

class TestCall extends  Thread{
    public void run(){
        System.out.println("Running");
    }
}

public class TestCallRun extends Thread{
    public void run (){
        for (int i=1; i<= 5; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
        }
    }

    public static void main(String[] args) {
        TestCallRun t1 = new TestCallRun(), t2= new TestCallRun();
        t1.start();
        t2.start();
    }
}











