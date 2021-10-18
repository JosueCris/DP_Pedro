package ClasesPedro;

import java.util.Scanner;

public class Pedro1Test {

    public static void main(String[] args) {
    // EJERCICIO 1
        Scanner sc = new Scanner(System.in);
        System.out.println("METODO 1");
        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int n3 = sc.nextInt();

        Pedro1 hellopeter = new Pedro1(n1, n2, n3);
        hellopeter.numMayor(hellopeter);

    // EJERCICIO 2
        System.out.println("\nMETODO 2");
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        hellopeter.numParImpar(num);

    // EJERCICIO 3
        System.out.println("\nMETODO 3");
        hellopeter.ordenar(hellopeter);
    }
}
