package Diseno;

import java.util.Scanner;

public class Ordenamientos {
    public int [] vector = {6, 5, 4, 8, 1, 9, 7, 2};

    public void imprime(int array []) {
        for (int i : array)
            System.out.print(i + " -> ");
    }

    public void bubbleSort(int [] array) {
        int aux, ciclos = 0;
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j] = aux;
                }
                ciclos++;
            }
        }
        System.out.println("Numero de ciclos: " + ciclos);
    }

    public void selectionSort(int [] array) {
        int aux, masChico, ciclos = 0;
        for(int i=0; i<array.length; i++) {
            masChico = i;
            for(int j=i+1; j<array.length; j++) {
                if (array[j] < array[masChico])
                    masChico = j;
                ciclos++;
            }
                aux = array[i];
                array[i] = array [masChico];
                array [masChico] = aux;
        }
        System.out.println("Numero de ciclos: " + ciclos);
    }

    public void insertionSort(int [] array) {
        int i, j, aux, ciclos = 0;
        for (i=0; i<array.length; i++) {
            aux = array[i];
            for (j=i; j>0 && array[j-1]>aux; j--) {
                array[j] = array[j-1];
                ciclos++;
            }
//                array[j+1] = array[j];
            array[j] = aux;
        }
        System.out.println("Numero de ciclos: " + ciclos);
    }

    public void quickSort(int [] array) {

    }
}
