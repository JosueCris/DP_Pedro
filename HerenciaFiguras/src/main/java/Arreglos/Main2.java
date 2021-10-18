package Arreglos;

public class Main2 {

    public static void main(String[] args) {
        Arreglo calificaciones = new Arreglo();

        System.out.println("Calificaciones:");
        calificaciones.imprime();
        System.out.print("\nCalificacion mayor: " + calificaciones.getMayor() +"\n");
        System.out.print("Reprobados: "+calificaciones.getReprobados());
        System.out.println("\nCalificaciones de menor a mayor:");
        calificaciones.ordenar();
    }

}
