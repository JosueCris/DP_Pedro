package Diseno;

import java.util.Scanner;

public class ArchivosTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matricula, nombre, telefono, carrera;
        double promedio;
        Archivos miarchivo = new Archivos("prueba.txt");

        System.out.print("Ingrese su matricula: ");
        matricula = sc.nextLine();
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su telefono: ");
        telefono = sc.nextLine();
        System.out.print("Ingrese su carrera: ");
        carrera = sc.nextLine();
        System.out.print("Ingrese su promedio: ");
        promedio = sc.nextDouble();

        miarchivo.escribirArchivo(matricula+"|"+nombre+"|"+telefono+"|"+carrera+"|"+promedio);
        miarchivo.leerArchivo();
        miarchivo.promedio();

    }
}
