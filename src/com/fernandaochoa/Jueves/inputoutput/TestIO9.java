package com.fernandaochoa.Jueves.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class TestIO9 {

    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("C:\\a.txt");
        FileOutputStream fos2 = new FileOutputStream("C:\\b.txt");
        FileOutputStream fos3= new FileOutputStream("C:\\c.txt");
        FileOutputStream fos4= new FileOutputStream("C:\\d.txt");

        FileOutputStream f = new FileOutputStream("C:\\todos.txt");

        FileInputStream fis = new FileInputStream("C:\\a.txt");
        FileInputStream fis2 = new FileInputStream("C:\\b.txt");
        FileInputStream fis3= new FileInputStream("C:\\c.txt");
        FileInputStream fis4= new FileInputStream("C:\\d.txt");

        String a = "Mensaje 1 ";
        String b = "Mensaje 2 ";
        String c = "Mensaje 3 ";
        String d = "Mensaje 4 ";

        writeFile(fos, fos2, fos3, fos4, a, b, c, d);

        Vector todos = getVector(fis, fis2, fis3, fis4);

        Enumeration e = todos.elements();
        SequenceInputStream sis = new SequenceInputStream(e);

        leer(sis,f);
        close(fis, fis2, fis3, fis4, sis);
    }

    private static void writeFile(FileOutputStream fos, FileOutputStream fos2, FileOutputStream fos3, FileOutputStream fos4, String a, String b, String c, String d) throws IOException {
        byte as[] =a.getBytes();
        fos.write(as);
        byte bs[] = b.getBytes();
        fos2.write(bs);
        byte cs[]= c.getBytes();
        fos3.write(cs);
        byte ds[] = d.getBytes();
        fos4.write(ds);
    }

    private static void leer(SequenceInputStream sis, FileOutputStream f) throws IOException {
        int i = 0;
        while ((i = sis.read())!=-1){
            f.write(i);
            System.out.print((char)i);
        }
    }

    private static Vector getVector(FileInputStream fis, FileInputStream fis2, FileInputStream fis3, FileInputStream fis4) {
        Vector todos = new Vector();
        todos.add(fis);
        todos.add(fis2);
        todos.add(fis3);
        todos.add(fis4);
        return todos;
    }

    private static void close(FileInputStream fis, FileInputStream fis2, FileInputStream fis3, FileInputStream fis4, SequenceInputStream sis) throws IOException {
        sis.close();
        fis.close();
        fis2.close();
        fis3.close();
        fis4.close();
    }
}
