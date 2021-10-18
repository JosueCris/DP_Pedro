package poo2;
import java.util.Scanner;

/*
    @autor: Vega Martinez Cristian -> S18021147
*/

public class CristianBuscaTest {
    private static int TIEMPO = 60;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un PIN como contrasenia: ");
        long password = sc.nextLong();

        new CristianSec(password);
        new CristianRan(password);

        for(int i = 1; i <= TIEMPO; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("Tiempo: "+i+" segundos.");
        }
        System.out.println("Finalizado el proceso");
    }
}
