package com.fernandaochoa.Martes.Excepciones;

/*
Diferencia entre final, finally, finalize
final
    1.- Es usado para aplicar restricciones en una clase, metodo y variables.
    Una clase final no puede ser heredada, un metodo final no puede ser
     redefinido y una variable no puede ser cambiada de valor.

     2.- final es una palabra reservada.

finally
    1.- Es un bloque
    2.- Es usado para terminar el manejo de una excepcion, es el bloque de
    codigo implicito que siempre se ejecuta.

finalize
    1.- Es usado para realizar el proceso de limpieza justo antes de que
    llegue el recolector de basura de java.
    2.- Es un metodo.
 */
class FinalTest{
    public static void main(String args) {
        final int x = 100;
        //x= 200;
    }
}
class FinallyTest {
    public static void main(String args) {
        try {
            int b = 300;
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Se ejecuta el bloque finally");
        }
    }
}
public class TestF {
    public void finalize(){
        System.out.println("llamada a finalize");
    }

    public static void main(String[] args) {
        FinalTest f1 = new FinalTest(), f2 = new FinalTest();
        f1 = null;
        f2= null;
        System.gc();
    }
}
