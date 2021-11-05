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

    public void shellSort(int [] array, int n) {
        int intervalo, i, j, k;
        intervalo = n/2;
        while (intervalo > 0) {
            for (i=intervalo; i<n; i++) {
                j = i-intervalo;
                while (j >= 0) {
                    k = j+intervalo;
                    if (array[j] <= array[k])
                        j = -1;
                    else {
                        int temp;
                        temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo/2;
        }
    }

    public void quickSort(int [] array, int left, int right) {
        int i, j, central, aux, pivote;
        central = (left + right)/2;
        pivote = array[central];
        i = left;
        j = right;
        do {
            while (array[i] < pivote)
                i++;
            while (array[j] > pivote)
                j--;
            if (i <= j) {
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;        /* intercambia a[i] con a[j] */
                i++;
                j--;
            }
        }while (i <= j);
        if (left < j)
            quickSort(array, left, j);          /* mismo proceso con sublista izqda */
        if (i < right)
            quickSort(array, i, right);           /* mismo proceso con sublista drcha */
    }
}
