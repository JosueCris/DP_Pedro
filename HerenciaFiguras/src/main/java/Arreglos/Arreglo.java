package Arreglos;

public class Arreglo {
    int [] array = new int[10];

    public Arreglo() {
        for(int i=0; i<array.length; i++)
            array[i] = (int) (Math.random()*11);
    }

    public void imprime(){
        for(int i=0; i<array.length; i++)
            System.out.print("\t"+array[i]+"  ");
    }

    public int getMayor(){
        int mayor = 0;
        for (int i=0; i< array.length; i++)
            if (array[i]>mayor)
                mayor = array[i];
        return mayor;
    }

    public int getReprobados(){
    int failed = 0;

    for (int i=0; i<array.length; i++)
        if (array[i] < 6)
            failed++;
    return failed;
    }

    public void ordenar(){
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<9-i; j++){
                if (array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i=0; i<array.length; i++)
            System.out.print("\t"+array[i]+"  ");
    }
}
