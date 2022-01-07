package Diseno;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class josueTarea4 {
    public String[] array;
    public File file;

    public josueTarea4() {
        array = new String[200000];
        file = new File("Nombres200000.txt");
    }

    public void crearArchivo() {
        try {
            file.createNewFile();
        } catch (IOException ioe) {
            System.err.println("Error, no se pudo crear el archivo: " + ioe);
        }
    }

    public josueTarea4 cargar(josueTarea4 arreglo) {
        String aux;
        try {
            if (!file.exists()) {
                System.out.println("File don't exists");
                return arreglo;
            }
            FileReader fr = new FileReader(file);
            BufferedReader buff = new BufferedReader(fr);

            int i = 0;
            aux = buff.readLine();
            while (aux != null) {
//                System.out.println(aux);
                array[i] = aux;
                aux = buff.readLine();
                if (aux == null)
                    break;
                i++;
            }
        } catch (IOException ioe) {
            System.err.println("File don't exists " + ioe);
        }
        return arreglo;
    }

    public void imprime() {
        for (String names : array)
            System.out.println(names);
    }

    public void quickNames(int left, int right) {
        int i, j, center;
        String pivote;
        center = (left + right) / 2;
        pivote = array[center];
        i = left;
        j = right;
        do {

            while (array[i].compareTo(pivote) < 0) {
                i++;
            }
            while (array[j].compareTo(pivote) > 0) {
                j--;
            }
            if (i <= j) {
                String aux;
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;

                i++;
                j--;
            }

        } while (i <= j);
        if (left < j) {
            quickNames(left, j);
        }
        if (i < right) {
            quickNames(i, right);
        }
    }

    public void shellNames(int N) {
        int intervalo, i, j, k;
        intervalo = N / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < N; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (array[j].compareTo(array[k]) <= 0)
                        j = -1;
                    else {
                        String temp;
                        temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                        j -= intervalo;
                    }
                }
            }
            intervalo /= 2;
        }
    }

/* Es gracioso como supe de este ordenamiento ya que lo vi en un meme de facebook, este metodo es un algoritmo de
   ordenamiento externo y se basa en la tecnica de divide y venceras. Este metodo funciona dividiendo el arreglo
   en dos sublistas de la mitad del tamaño. Despues se van ordenando por mezcla, una vez quede hecho, las dos
   sublistas se deben unir nuevamente

   Este metodo hace lo contario al quicksort, mientras que el quicksort divide el arreglo en dos partes y ordena
   cada mitad, el mergesort lo que hace es unir dos estructuras ordenadas para formar uan sola estructura bien
   ordenada */
    public void mergeSort(int left, int right){
        if(left < right){
            // Aqui lo que hacemos es identificar la mitad del arreglo para su division recursivamente
            int center = (left + right) / 2;
            mergeSort(left, center);
            mergeSort(center+1, right);

            // Unimos las mitades.
            merge(left, center, right);
        }
    }
    /*Todo este metodo es para unir las mitades ya ordenadas correctamente*/
    public void merge(int left, int center, int right) {
        // Encuentra el tamaño de los sub-arrays para unirlos.
        int n1 = center - left + 1;
        int n2 = right - center;
        // Aqui creamos un par de arrays auxiliares.
        String leftArray[] = new String [n1];
        String rightArray[] = new String [n2];
        // Pasamos los datos a los arrays temporales.
        for (int i=0; i < n1; i++) {
            leftArray[i] = array[left+i];
        }
        for (int j=0; j < n2; j++) {
            rightArray[j] = array[center + j + 1];
        }
        // Lo que haremos ahora sera unir los arrays auxiliares.
        // Estos son los index del primer y segundo sub-vector.
        int i = 0, j = 0;
        // Y este es el index del sub-array.
        int k = left;
        // Procedemos a ordenar.
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j])<=0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // Si llegan a sobrar elementos, o los anexamos a la izquierda o la derecha
        // Copiamos los elementos restantes de leftArray[].
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        // Copiamos los elementos restantes de rightArray[].
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) throws InterruptedException {

/*  Estos son los tiempos originales sin nada de hilos
    Ranking: MergeSort->412 ms / QuickSort->471 ms / ShellSort->1491 ms

    Y estos son los tiempos implementados con hilos
    Ranking: MergeSort->1380 ms / QuickSort->1427 ms / ShellSort->1926 ms
    */
       josueTarea4 mano = new josueTarea4();
//  Cargamos el array pasandole el objeto de la clase josueTarea4
       mano.cargar(mano);
/*  En esta parte quise hacer mas notorio la diferencia de tiempos usando hilos para lanzarlos al mismo tiempo.
    Se puede apreciar que el mergeSort finaliza mas rapido que los otros dos pero por alguna razon tardan mas
    de lo que deberia al implementarlo con hilos que sin ellos y la diferencia es menos notoria :| */

//  Para habilitar los hilos descomente las lineas 196, 202, 204, 210, 212, 218, 220, 221 y 222

       Thread taskShell =  new Thread(() -> {
           try {
               long start1 = System.currentTimeMillis();
               mano.shellNames(200000);
    //           mano.imprime();
               long finish1 = System.currentTimeMillis();
               System.out.println("ShellSort Time: " + (finish1 - start1) + " ms");
               Thread.sleep(finish1-start1);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       });

        Thread taskQuick =  new Thread(() -> {
            try {

                long start2 = System.currentTimeMillis();
                mano.quickNames(0, mano.array.length - 1);
                long finish2 = System.currentTimeMillis();
                //           mano.imprime();
                System.out.println("QuickSort Time: " + (finish2 - start2) + " ms");
                Thread.sleep(finish2 - start2);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread taskMerge =  new Thread(() -> {
            try {
                long start3 = System.currentTimeMillis();
                mano.mergeSort(0, mano.array.length-1);
//                mano.imprime();
                long finish3 = System.currentTimeMillis();
                System.out.println("MergeSort Time: "+(finish3-start3)+" ms");
                Thread.sleep(finish3-start3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
//  En esta parte arrojo los tres hilos, una por cada metodo de ordenamiento con el mismo array del archivo de nombres
        taskShell.start();
        taskQuick.start();
        taskMerge.start();

    }
}

