package Diseno;

import java.io.*;
import java.util.Scanner;

public class Josue_Prac2 {
    public String [] array;
    public File archivo;

    public Josue_Prac2() {
        array = new String[1406];
        archivo = new File("Nombres.txt");
    }

    public void crearArchivo() {
        try {
            archivo.createNewFile();
        }catch(IOException ioe) {
            System.err.println("Error, no se pudo crear el archivo: "+ioe);
        }
    }

    public Josue_Prac2 cargar(Josue_Prac2 arreglo) {
        String aux;
        try {
            if (!archivo.exists()) {
                System.out.println("No existe el archivo");
                return arreglo;
            }
            FileReader fr = new FileReader(archivo);
            BufferedReader buff = new BufferedReader(fr);

            int i = 0;
            aux = buff.readLine();
            while (aux != null) {
//                System.out.println(aux);
                array[i] = aux;
                aux = buff.readLine();
                if (aux == null)
                    break;
                i++;
            }
        }catch (IOException ioe) {
            System.err.println("No existe el archivo: " + ioe);
        }
        return arreglo;
    }

    public void bubbleNames() {
        String aux;
        int ciclos = 0;
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1-i; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
                ciclos++;
            }
        }
        for(String i : array)
            System.out.println(i);
    }

    public int binarySearch(String[] array, int inicio, int fin, String name) {
        int centro = inicio+fin/2;

        if(array[centro].compareTo(name) == 0){
            return centro;
        }
        if(array[centro].compareTo(name) > 0){
            return binarySearch(array, inicio, fin-1, name);
        }else if(array[centro].compareTo(name) < 0){
            return binarySearch(array, centro+1, fin, name);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Josue_Prac2 file = new Josue_Prac2();
        file.cargar(file);
        file.bubbleNames();

        System.out.print("\nIngresa un nombre: ");
        String nombre = sc.nextLine();
       if(file.binarySearch(file.array, 0, file.array.length-1, nombre) != -1)
           System.out.println("Encontrado");
       else
           System.out.println("Not found");


    }
}
