package Diseno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nombre del archivo: ");
//        String file = sc.next();
//        System.out.print("Longitud del arreglo: ");
//        int longitud = sc.nextInt();
//
        Arreglo arreglos = new Arreglo("Numeros1000.txt", 1000);
//        arreglos.cargar(arreglos);

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

//        System.out.println("\nShell Sort:");
//        long start = System.currentTimeMillis();
//        arreglos.shellSort(arreglos.array, 25000);
//        arreglos.imprime(arreglos.array);
//        long finish = System.currentTimeMillis();

//        System.out.println("\nQuick Sort:");
//        long start = System.currentTimeMillis();
//        arreglos.quickSort(arreglos.array, 0, arreglos.array.length-1);
//        arreglos.imprime(arreglos.array);
//        long finish = System.currentTimeMillis();
//
//        System.out.println("\nTime: "+(finish-start)+" ms");

        long start = System.currentTimeMillis();
        //arreglos.binario(arreglos.vector, 2);
        if(arreglos.binario_recursivo(arreglos.vector, 8, 0, arreglos.vector.length-1) != -1)
            System.out.println("Dato encontrado");
        else
            System.out.println("Dato NO encontrado");
        long finish = System.currentTimeMillis();

        System.out.println("Time: "+(finish-start)+" ms");
    }
}

// Bubble -> 68 ms / 445 ms / 27050 ms
// Selection -> 59 ms / 322 ms / 11585 ms
// Insertion -> 52 ms / 288 ms / 2142 ms
// Shell -> 109 ms / 372 ms / 1042 ms
// Quick -> 78 ms / 277 ms / 921 ms

// Numeros1000.txt = Insertion -> Selection -> Bubble -> Quick -> Shell
// Numeros10000.txt = Quick -> Insertion -> Selection -> Shell -> Bubble
// Numeros100000.txt = Quick -> Shell -> Insertion -> Selection -> Bubble