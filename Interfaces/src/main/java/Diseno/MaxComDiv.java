package Diseno;

import java.util.Scanner;

public class MaxComDiv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N1, N2, res, mcd=0;
//        System.out.println("Ingresa el primer numero:");
//        N1 = sc.nextInt();
//        System.out.println("Ingresa el segundo numero:");
//        N2 = sc.nextInt();
//
//        do {
//            res = N1 % N2;
//            if (res != 0) {
//                N1 = N2;
//                N2 = res;
//            }
////            else
////                mcd = N2;
//        }while(res != 0);
//
//        System.out.println("El M.C.D es: " +N2);
        System.out.println("Ingresa un numero:");
        int number = sc.nextInt();
        System.out.println("Numeros:");
        imprime(number);
//        System.out.println("El factorial de " +number+ " es: " +factorial(number));
//        System.out.println("El factorial de " +number+ " es: " +factorialRecursivo(number));
    }

    static int factorial(int N) {
        int r = 1;
        for(int i=N; i>1; r=r*i--);
        return r;
    }

    static int factorialRecursivo(int N) {
        if (N == 0)
            return 1;
        return N*factorialRecursivo(N-1);
    }

    static void imprime(int N) {
        if(N>0) {
            imprime(N - 1);
            System.out.print(N+" -> ");
        }
    }

}
