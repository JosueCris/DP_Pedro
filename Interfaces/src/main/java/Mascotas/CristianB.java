package Mascotas;

import java.io.*;
import java.util.Scanner;

public class CristianB {
    File file;
    int array[];

    public CristianB() {
        array = new int[12];
        file = new File("Exab21.txt");
    }

    public void crearArchivo() {
        try {
            file.createNewFile();
        } catch (IOException ioe) {
            System.err.println("Error, no se pudo crear el archivo: " + ioe);
        }
    }

    public String obtenCadena(int index, String cad) {
        int cont = 0;
        String cadena = "";
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == '|')
                cont++;
            if (index == cont && cad.charAt(i) != '|')
                cadena += cad.charAt(i);
            if (index < cont)
                break;
        }
        return cadena;
    }

    public CristianB cargar(CristianB arreglo) {
        String aux;
        try {
            if (!file.exists()) {
                System.out.println("No existe el archivo");
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while (true) {
                aux = br.readLine();
                if (aux == null)
                    break;
                array[i] = Integer.parseInt(obtenCadena(2, aux));
                i++;
            }
        } catch (IOException e) {
            System.out.println("SINTAX ERROR: " + e);
        }
        return arreglo;
    }

    public void ordenInsercion() {
        int i, j, aux;
        for (i=0; i<array.length; i++) {
            aux = array[i];
            for (j=i; j>0 && array[j-1]>aux; j--) {
                array[j] = array[j-1];
            }
            array[j] = aux;
        }
    }

    public void binarySearch(int dato){
        int inicio = 0, fin = array.length-1, count = 0, cto;
        while (inicio <= fin){
            cto = (inicio + fin) / 2;
            count++;
            if (array[cto] == dato){
                System.out.println("Encontrado en: "+"["+(cto+1)+"]");
                break;
            } else {
                if (dato > array[cto])
                    inicio = cto + 1;
                else
                    fin = cto - 1;
            }
        }
        if (inicio > fin)
            System.out.println("Numero no encontrado");
        System.out.println("Iteraciones: "+count);
    }


    public void imprime(){
        for (int i = 0; i <array.length; i++){
            System.out.println("["+(i+1)+"]: "+array[i]);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CristianB cristian = new CristianB();

        cristian.cargar(cristian);

        System.out.println("Numeros:");
        cristian.imprime();

        cristian.ordenInsercion();

        System.out.print("\nIngresa el numero a buscar: ");
        int buscar = sc.nextInt();
        cristian.binarySearch(buscar);

        System.out.println("\nNumeros:");
        cristian.imprime();

    }
}
