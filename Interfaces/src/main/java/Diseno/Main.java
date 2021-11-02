package Diseno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del archivo: ");
        String file = sc.next();
        System.out.print("Longitud del arreglo: ");
        int longitud = sc.nextInt();

        Arreglo arreglos = new Arreglo(file, longitud);
        //arreglos.cargar(arreglos);
        arreglos.CreaNumeros();

//        System.out.println("\nArreglo Original:");
//        arreglos.imprime(arreglos.array);

//        System.out.println("\nBubble Sort:");
//        long start = System.currentTimeMillis();
//        arreglos.bubbleSort(arreglos.array);
//        arreglos.imprime(arreglos.array);
//        long finish = System.currentTimeMillis();

//        System.out.println("\nSelection Sort:");
//        long start = System.currentTimeMillis();
//        arreglos.selectionSort(arreglos.array);
//        arreglos.imprime(arreglos.array);
//        long finish = System.currentTimeMillis();

//        System.out.println("\nInsertion Sort:");
//        long start = System.currentTimeMillis();
//        arreglos.insertionSort(arreglos.array);
//        arreglos.imprime(arreglos.array);
//        long finish = System.currentTimeMillis();
//
//        System.out.println("\nTime: "+(finish-start)+" ms");
    }
}

// Bubble -> 68 ms / 445 ms / 27050 ms
// Selection -> 59 ms / 322 ms / 11585 ms
// Insertion -> 52 ms / 288 ms / 2142 ms