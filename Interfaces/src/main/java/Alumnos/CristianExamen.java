package Alumnos;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class CristianExamen {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {6,8,0,5,2};
        int a1;
        int resul=0;


            FileInputStream entrada = null; // Esta linea esta bien no lleva modificacion
            try {
            entrada = new FileInputStream("fich1.txt"); // Esta linea esta bien no lleva modificacion
            } catch (FileNotFoundException fnfe) {
                System.err.println("No existe el archivo: "+fnfe);
            }

            while(true) {
                try {
                    System.out.print("Inserta numero: ");
                    a1 = sc.nextInt();

                    resul = arr[a1];
                    System.out.println("El dato dentro del arreglo es: " + resul);
                } catch (ArrayIndexOutOfBoundsException aiobe) {
                    System.err.println("Error, el indice esta fuera del rango: " + aiobe);
                    continue;
                } catch (InputMismatchException ime) {
                    System.err.println("Error, el valor es incorrecto: " + ime);
                }
            }
//          catch (IOException ioe) {
//            System.out.println("No se pudo abrir el archivo"+ioe);
//        }

    }
}


