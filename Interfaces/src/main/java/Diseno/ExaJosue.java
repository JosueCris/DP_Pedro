package Diseno;

/*
Cambiar los metodos de carga e imprime para que sean recursivos.
Implementa el metodo de manera recursiva para obtener el promedio del arreglo
 *
 * @author Pedro Díaz
 */
public class ExaJosue {
    int arr [] = new int [10];
    int con=0;

    public void carga(){
        for(int con=0; con<arr.length; con++){
            arr[con] = (int) (Math.random()*10+1);
        }
    }

    public void imprime(){
        for(int con = 0; con<arr.length; con++){
            System.out.println(con+" [ "+arr[con]+" ]");
        }
    }

    // Metodo recursivo que obtenga el promedio de todas las calificaciones
    public float promedio(int array[], int index){
        if(index == array.length)
            return 0;
        return array[index]+promedio(array, index+1);

    }

    public static void main(String[] args) {
        ExaJosue xx = new ExaJosue();
        xx.carga();
        xx.imprime();
        float prom = xx.promedio(xx.arr, 0);
        float promedio = prom/ args.length;
        System.out.println(promedio);
    }
}