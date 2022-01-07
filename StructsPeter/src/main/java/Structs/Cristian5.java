package Structs;

import java.util.ArrayList;
import java.util.Collections;


public class Cristian5 {
    ArrayList<Double> lista = new ArrayList<>();

    // Completo
    public void insertar(double calificacion) {
        lista.add(calificacion);
        Collections.sort(lista);
    }

    // Completo
    public void eliminar(double calificacion) {
        if (!lista.isEmpty()) {
            if (lista.contains(calificacion))
                lista.remove(calificacion);
            else
                System.out.println("No esta en el cardex");
        }
        else
            System.out.println("Lista vacia");
    }

    // Completo
    public void imprime(){
        for (int i= lista.size()-1; i>=0; i--)
            System.out.print(lista.get(i)+" -> ");
        System.out.println();
    }
    // Completo
    public int cantidad() {
        return lista.size();
    }

    // Completo
    public void primero_ultimo() {
        System.out.println("Primer elemento: "+lista.get(lista.size()-1));
        System.out.println("Ultimo elemento: "+lista.get(0));
    }
}
