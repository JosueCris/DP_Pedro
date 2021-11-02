package Cine;

public class Main {

    public static void main(String[] args) {

        Salas sala1 = new Salas("Cinepolis", 15,1, 109);
        Salas sala2 = new Salas("Cinepolis", 15, 2, 100);
        Salas sala3 = new Salas("Cinepolis", 15, 3, 80);

        sala1.imprime();
        int precio = sala1.montoSalas(109, 2000);
        System.out.println("El precio por entrada es: $" +precio);
        float porcentaje = sala1.aforo(109);
        System.out.println("El pordentaje de aforo es: " +porcentaje+ "% \n");

        sala2.imprime();
        int precio2 = sala1.montoSalas(100, 2000);
        System.out.println("El precio por entrada es: $" +precio2);
        float porcentaje2 = sala2.aforo(100);
        System.out.println("El pordentaje de aforo es: " +porcentaje2+ "% \n");

        sala3.imprime();
        int precio3 = sala1.montoSalas(80, 2000);
        System.out.println("El precio por entrada es: $" +precio3);
        float porcentaje3 = sala3.aforo(80);
        System.out.println("El pordentaje de aforo es: " +porcentaje3+ "% \n");
    }
}
