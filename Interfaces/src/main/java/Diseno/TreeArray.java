package Diseno;

import java.io.*;
import Diseno.Tree;
import java.util.Scanner;

public class TreeArray {
    File file;
    Tree root = null;
    int array[] = new int[1000];

    public TreeArray() {
        String aux;
        try {
            file = new File("Numeros1000.txt");
            file.createNewFile();
            if (!file.exists()) {
                System.out.println("File doesn't exist");
                return;
            }
            FileReader fr = new FileReader(file);
            BufferedReader buff = new BufferedReader(fr);

            int i = 0;
            aux = buff.readLine();
            while (aux != null) {
                if (aux == null)
                    break;
                int data = Integer.parseInt(aux);
                array[i] = data;
                if (root == null)
                    root = new Tree(data);
                else root.add(data);
                aux = buff.readLine();
                if (aux == null)
                    break;
                i++;
            }
            insertionSort();
        }catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public void insertionSort() {
        int i, j, aux;
        for (i=0; i<array.length; i++) {
            aux = array[i];
            for (j=i; j>0 && array[j-1]>aux; j--) {
                array[j] = array[j-1];
            }
            array[j] = aux;
        }
    }

    public void binarySearch(int data) {
        int center, start = 0, finish = array.length-1, count = 0;
        while(start <= finish) {
            center = (start + finish) / 2;
            count++;
            if (array[center] == data) {
                System.out.println("Found item");
                break;
            }
            else if (data < array[center])
                finish = center - 1;
            else
                start = center + 1;
        }
        if (start > finish)
            System.out.println("Item not found");
        System.out.println("Cycles: " + count);
    }

    public void print() {
        for(int i : array)
            System.out.print(i+" -> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeArray treeArray = new TreeArray();

        System.out.println("Tree:");
        treeArray.root.inOrden();
        System.out.println("\nArray:");
        treeArray.print();

        System.out.print("\n\nEnter your item to search: ");
        int item = sc.nextInt();

        System.out.println("\nSearch in the Tree");
        treeArray.root.treeSearch(item, 0);
        System.out.println("\nSearch in the Array");
        treeArray.binarySearch(item);

    }
}
