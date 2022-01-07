package Diseno;

import java.io.*;
import java.util.Scanner;

public class HashTest {
    int longitud = 1406;
    public Hash [] array = new Hash[longitud];
    public Hash [] arrayHash = new Hash[3000];
    File file;

    public HashTest() {
        for(int i=0; i<longitud; i++) {
            array[i] = new Hash();
            array[i].next = -1;
        }
        for(int i=0; i<arrayHash.length; i++) {
            arrayHash[i] = new Hash();
            if(i<1500)
                arrayHash[i].next = -1;
            else
                arrayHash[i].next = i+1;
        }
        arrayHash[0].next = 1500;
        cargar();
    }

    public void cargar() {
        File fichero = new File("Nombres.txt");
        String aux;
        double num;
        try {
            if (!fichero.exists()) {
                System.out.println("File don't exists");
                return;
            }
            FileReader fr = new FileReader(fichero);
            BufferedReader buff = new BufferedReader(fr);

            int i = 0;
            aux = buff.readLine();
            while (aux != null) {
//                System.out.println(aux);
                array[i].data = aux;
                array[i].next = -1;
                aux = buff.readLine();
                if (aux == null)
                    break;
                i++;
            }
        } catch (IOException ioe) {
            System.err.println("File don't exists " + ioe);
        }
    }

    public void print() {
        for(int i=0; i<longitud; i++)
            System.out.println(i+" "+array[i].data+ " next-> "+array[i].next);
    }

    public void printHash() {
        for(int i=0; i<2000; i++)
            System.out.println(i+" "+arrayHash[i].data+ " next-> "+arrayHash[i].next);
    }

//    public int funcionHash1(String data) {
//        int i=0, total=0;
//        String name;
//        while(i<data.length())
//            total += data.charAt(i++);
//        total = total%1498+1;
//        return total;
//    }

    public int funcionHash2(String data) {
        int ascii=0;
        for (int i=0; i<data.length(); i++)
            ascii += (Math.pow(data.charAt(i), 2) + (i+1));
        return (ascii%1499);
    }

//    public int funcionHash3(String data) {
//        int i = 0, num = 0, total = 0;
//        String name;
//        while (i < data.length()) {
//            num = data.charAt(i) * (i + 3);
//            if (i < data.length() && i < 3)
//                num += Math.pow(data.charAt(i), i);
//            total += num;
//            i++;
//        }
//        num = total % 1499 + 1;
//        return num;
//    }

        public void convierteHash() {
        String aux = "";
        int index=0, collision=0;
        for(int i=1; i<longitud; i++) {
            aux = array[i].data;
            index = funcionHash2(aux);
            if(arrayHash[index].data.equals(""))
                arrayHash[index].data = aux;
            else
                collision++;
        }
        System.out.println("Collisions: "+collision);
    }

    public static void main(String[] args) {
        HashTest struct = new HashTest();
       // struct.printHash();
        struct.convierteHash();
    }
}
