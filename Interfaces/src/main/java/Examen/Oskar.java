package Examen;

import java.io.*;

public class Oskar {
    int [] arr;
    File archivo;

    public Oskar() {
        arr = new int[12];
        archivo = new File("Exab21 1.txt");
    }

    public String obtenCadena(int index, String cad){
        int cont = 0;
        String cadena = "";
        for (int i = 0; i < cad.length(); i++){
            if (cad.charAt(i) == '|')
                cont++;
            if (index == cont && cad.charAt(i) != '|')
                cadena+= cad.charAt(i);
            if (index < cont)
                break;
        }
        return cadena;
    }

    public Oskar cargar(Oskar arreglo) {
        String aux;
        try {
            if (!archivo.exists()) {
                System.out.println("El archivo no existe");
                return arreglo;
            }
            FileReader fr = new FileReader(archivo);
            BufferedReader buff = new BufferedReader(fr);

            int i = 0;
            aux = buff.readLine();
            while (aux != null) {
//                System.out.println(aux);
                arr[i] = Integer.parseInt(obtenCadena(1, aux));
                aux = buff.readLine();
                if (aux == null)
                    break;
                i++;
            }
        } catch (IOException ioe) {
            System.err.println("El archivo no existe " + ioe);
        }
        return arreglo;
    }

    public static void main(String[] args) {
        Oskar mano = new Oskar();
        mano.cargar(mano);
    }

}