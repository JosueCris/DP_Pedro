package Mascotas;

import java.util.Scanner;

public class Main implements Metodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main tradicional = new Main();
        Metodos herencia = new Main();
        float n1, n2, n3;

        System.out.print("Ingresa el primer numero: ");
        n1 = sc.nextFloat();
        System.out.print("Ingresa el segundo numero: ");
        n2 = sc.nextFloat();
        System.out.print("Ingresa el tercer numero: ");
        n3 = sc.nextFloat();

        Metodos anonimo = new Metodos() {
            @Override
            public float promedio(float n1, float n2, float n3) {
                float promedio = ((n1 + n2 + n3) / 3);
                return promedio;
            }
        };

        Metodos lambda = (a, b, c) -> {
            float promedio = ((a + b + c) / 3);
            return promedio;
        };

        System.out.println("\nPromedio Tradicional: "+tradicional.promedio(n1, n2, n3));
        System.out.println("Promedio Herencia: "+herencia.promedio(n1, n2, n3));
        System.out.println("Promedio Anonimo: "+anonimo.promedio(n1, n2, n3));
        System.out.println("Promedio Lambda: "+lambda.promedio(n1, n2, n3));

    }

    @Override
    public float promedio(float n1, float n2, float n3) {
        float promedio= ((n1 + n2 + n3) / 3);
        return promedio;
    }
}
