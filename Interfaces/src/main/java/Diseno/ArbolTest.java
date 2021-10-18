package Diseno;

import java.io.*;
import java.util.Scanner;

public class ArbolTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File archivo = new File("Datos.txt");
        Arbol raiz = null;
        int op = 9, numero;

        while(op != 0) {
            try {
                System.out.print("Selecciona tu opcion:\n\t[1]: Alta\n\t[2]: Baja\n\t[3]: In-Orden\n\t[4]: Buscar\n\t[5]: Carga\n\t[6]: Guardar\n\t[7]: Altura\n\t[0]: Salir\n> ");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.print("\nIngresa un numero en el arbol: \n> ");
                        numero = sc.nextInt();
                        if(raiz == null)
                            raiz = new Arbol(numero);
                        else
                            raiz.add(numero);
                        break;
                    case 2:
                        System.out.print("\nIngresa un numero a eliminar del arbol: \n> ");
                        numero = sc.nextInt();
                        raiz.borrar(numero);
                        System.out.println("\nThe item was deleted\n");
                        break;
                    case 3:
                        System.out.println("\nElementos en el arbol:");
                        raiz.inOrden();
                        System.out.println();
                        break;
                    case 4:
                        try {
                            System.out.print("\nIngresa el elemento a buscar: \n> ");
                            numero = sc.nextInt();
                            if (raiz.buscar(numero))
                                System.out.println("\nElemento encontrado!!!\n");
                            else
                                System.out.println("\nElemento inexistente!!!\n");
                        } catch (NullPointerException npe) {
                            System.out.println("\nLa raiz no fue encontrada!!!\n");
                            raiz = null;
                        }
                        break;
                    case 5:
                        String aux;
                        int dato;
                        try {
                            if (!archivo.exists()) {
                                System.out.println("No existe el archivo");
                                return;
                            }
                            FileReader fileReader = new FileReader(archivo);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);

                            aux = bufferedReader.readLine();
                            while (aux != null) {
                                System.out.println(aux);
                                dato = Integer.parseInt(aux);
                                if (raiz == null)
                                    raiz = new Arbol(dato);
                                else
                                    raiz.add(dato);
                                aux = bufferedReader.readLine();
                            }
                        }catch (IOException ioe) {
                            System.err.println("No existe el archivo: " + ioe);
                        }
                        break;
                    case 6:
//                        raiz.guarda();
                        break;
                    case 7:
                        System.out.println("Altura del arbol: "+raiz.altura(raiz));
                        break;
                    case 8:
                        System.out.println("Derecha: "+raiz.masDerecha());
                        break;
                    case 9:
                        System.out.println("Izquierda: "+raiz.masIzquierda());
                        break;
                    case 0:
                        System.out.println("\nGracias!!!\n");
                        return;
                    default:
                        System.out.println("\nIntentalo de nuevo!!!\n");
                        break;
                }
            } catch (NullPointerException npe){
                System.out.println("\nArbol vacio!!!\n");
                raiz = null;
            }
        }
    }
}
