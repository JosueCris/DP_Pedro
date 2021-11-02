package Cine;

public class Salas extends Cine implements Ingresos {
    int idSala;
    int numeroAsientos;

    public Salas(String nombre, int salas, int idSala, int numeroAsientos) {
        super(nombre, salas);
        this.idSala = idSala;
        this.numeroAsientos = numeroAsientos;
    }

    public void imprime() {
        System.out.println("Nombre del cine: "+nombre);
        System.out.println("Nombre de sala: "+idSala);
        System.out.println("Numeros de asientos: "+nombre);
    }

    @Override
    public int montoSalas(int asientos, int monto) {
        int precioEntrada = monto/asientos;
        return precioEntrada;
    }
}
