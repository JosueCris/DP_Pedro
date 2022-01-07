package Structs;

import java.util.Scanner;

public class Cristian5Test {

    public static void main(String[] args) {
        Cristian5 lista = new Cristian5();
        int op;
        double calificacion;
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Selecciona una opcion:\n\t[1]: Agregar a la lista\n\t[2]: Eliminar de la lista\n\t[3]: Cantidad de elementos de la lista\n\t[4]: Primero y ultimo de la lista\n\t[5]: Imprimir Lista\n\t[6]: Salir\n> ");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.print("\nInserta tu calificacion en la lista: \n> ");
                        calificacion = sc.nextDouble();
                        lista.insertar(calificacion);
                        break;
                    case 2:
                        System.out.print("\nElimina tu calificacion de la lista: \n> ");
                        calificacion = sc.nextDouble();
                        lista.eliminar(calificacion);
                        break;
                    case 3:
                        System.out.println("Numero de calificaciones: "+lista.cantidad());
                        break;
                    case 4:
                        lista.primero_ultimo();
                        break;
                    case 5:
                        lista.imprime();
                        break;
                    case 6:
                        System.out.println("\nGarcias :D!!! \n");
                        return;
                    default:
                        System.out.println("\nItentalo de nuez!!! \n");
                        break;
                }
            } while (op != 6);
        } catch (NullPointerException npe) {
            System.out.println("List Underflow");
        }
    }
}
