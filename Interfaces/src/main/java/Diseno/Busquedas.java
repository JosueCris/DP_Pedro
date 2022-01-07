package Diseno;

public class Busquedas {

    public boolean secuencial(int [] array, int number) {
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if (number == array[i])
                count++;
                return true;
        }
        System.out.println("Numero de ciclos: "+count);
        return false;
    }

    public void binario(int [] array, int number) {
        int centro, inicio = 0, fin = array.length-1, count = 0;
        while(inicio <= fin) {
            centro = (inicio + fin) / 2;
            count++;
            if (array[centro] == number) {
                System.out.println("Dato encontrado");
                break;
            }
            else if (number < array[centro])
                fin = centro - 1;
            else
                inicio = centro + 1;
        }
            if (inicio > fin)
                System.out.println("Dato NO encontrado");
            System.out.println("Total de iteraciones: " + count);
    }

    public int binario_recursivo(int [] array, int number, int inicio, int fin) {
        int centro = (inicio+fin)/2;
        if (fin < inicio)
            return -1;
        if (number < array[centro])
            return binario_recursivo(array, number, inicio, centro-1);
        if (number > array[centro])
            return binario_recursivo(array, number, centro+1, fin);
        if (number == array[centro])
            return centro;
        return -1;
    }
}
