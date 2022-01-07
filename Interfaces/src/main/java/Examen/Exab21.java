package Examen;

import java.util.ArrayList;

public class Exab21 {
    ArrayList<String> pila = new ArrayList<>();
    String cadena;

    public Exab21(String cadena) {
        this.cadena = cadena;
    }

    public void mete(String dato) {
        pila.add(dato);
    }

    public void imprime() {
        for (int i = 0; i<pila.size(); i++)
            System.out.println(pila.get(i)) ;
    }

    public String vacia() {
        if (pila.isEmpty())
            return ("Pila Vacia");
        else
            return "Pila NO Vacía";
    }

    public void saca() {
        if (pila.isEmpty())
            System.out.println("Pila Vacia");
        else
            pila.remove(pila.size() - 1);

    }

    public static void main(String[] args) {
        Exab21 pila = new Exab21("Pila");
        pila.mete("Lola");
        pila.mete("Ana");
        System.out.println(pila.vacia());
        pila.saca();
        pila.imprime();
        pila.saca();
        pila.saca();

    }
}
