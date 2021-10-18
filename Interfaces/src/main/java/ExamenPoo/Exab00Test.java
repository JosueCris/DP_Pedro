package ExamenPoo;

import java.util.Scanner;

public class Exab00Test {
    public static void main(String[] args) {
        int menor1, mayor1, menor2, mayor2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el menor rango 1: ");
        menor1 = sc.nextInt();
        System.out.print("Ingrese el mayor rango 1: ");
        mayor1 = sc.nextInt();
        System.out.print("Ingrese el menor rango 2: ");
        menor2 = sc.nextInt();
        System.out.print("Ingrese el mayor rango 2: ");
        mayor2 = sc.nextInt();

        new Exab00("Rango 1", menor1, mayor1);
        new Exab00("Rango 2", menor2, mayor2);

        for (int i = 0; i < 10000; i++){
            try {
                Thread.sleep(300);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Tiempo: "+i*300+" ms");
        }
    }
}
