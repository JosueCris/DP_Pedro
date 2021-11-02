package Cine;

public class Cine {
    String nombre;
    int salas;

    public Cine(String nombre, int salas) {
        this.nombre = nombre;
        this.salas = salas;
    }

    public float aforo(int asientos) {
        return ((salas/asientos)*100);
    }
}
