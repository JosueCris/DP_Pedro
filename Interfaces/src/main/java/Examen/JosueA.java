package Examen;/*
Ordenar un arreglo por el metodo de burbuja

/**
 *
 * @author Josue Cristofer Tellez Huerta
 */

import java.io.*;

public class JosueA {

    public int arr[] = new int[100];
    File f;

    public JosueA() {
        System.out.println("INICIO");
        leeArch();
    }

    public void leeArch() {
        File f = new File("Numeros100.txt");
        String aux;
        double num;
        int con = 0;
        try {
            if (!f.exists()) {
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while (true) {
                aux = br.readLine();
                if (aux == null) {
                    break;
                }
                arr[con++] = Integer.parseInt(aux);
            }
            System.out.println("COntador = " + con);
        } catch (IOException e) {
            System.out.println("No existe el archivo");
        }
    }

    public void imprime() {
        for (int con = 0; con < arr.length; con++) {
            System.out.println(arr[con] + ", ");
        }
        System.out.println("");
    }

    public void ordenQuickort(int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = arr[central];
        i = primero;
        j = ultimo;
        do {
            while (arr[i] > pivote) {
                i++;
            }
            while (arr[j] < pivote) {
                j--;
            }
            if (i <= j) {
                int tmp;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            ordenQuickort(primero, j);
        }
        if (i < ultimo) {
            ordenQuickort(i, ultimo);
        }
    }

    public void bubbleSort() {
        int aux, ciclos = 0;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    aux = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = aux;
                }
                ciclos++;
            }
        }
        System.out.println("Numero de ciclos: " + ciclos);
    }

    //Cambiar por busqueda binaria
    public void busquedaSecuencial(int num){
        boolean encontro=false;
        for(int i=0; i<arr.length;i++){
            if (arr[i]==num){
                System.out.println(num+" esta en la posicion "+i);
                encontro=true;
                break;
            }
        }
        if (!encontro) System.out.println("Numero no existe");

    }

    public void binarySearch(int N){
        int start = 0, finish = arr.length-1, iter = 0;
        while (start <= finish){
            int med = (start + finish) / 2;
            iter++;
            if (arr[med] == (N)){
                System.out.println("Dato encontrado");
                break;
            } else {
                if (N > (arr[med]))
                    start = med + 1;
                else
                    finish = med - 1;
            }
        }
        if (start > finish)
            System.out.println("El dato no existe");
        System.out.println("Iteraciones: "+iter);
    }

    public static void main(String[] args) {
        JosueA xx = new JosueA();
        xx.ordenQuickort(0,xx.arr.length-1);
//        xx.bubbleSort();
//        xx.busquedaSecuencial(841);
        xx.binarySearch(841);
        xx.imprime();
    }
}
