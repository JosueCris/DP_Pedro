package Ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int A = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int B = sc.nextInt();
        System.out.print("Ingrese el tercero numero: ");
        int C = sc.nextInt();

        Metodos m = new Metodos(A, B, C);
        m.mayor(m);

        System.out.print("\nIngrese un numero: ");
        int num = sc.nextInt();
        m.ParImpar(num);

        System.out.print("\n");
        m.ordenar(m);
    }
}
