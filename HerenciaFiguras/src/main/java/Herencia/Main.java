package Herencia;

public class Main {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("cuadrado", "azul", 8.5);
        cuadrado.imprime();
        cuadrado.area();

        System.out.println("\n");

        Rectangulo rectangulo = new Rectangulo("rectangulo", "negro", 8, 5);
        rectangulo.imprime();
        rectangulo.area();

        System.out.println("\n");

        Circulo circulo = new Circulo("circulo", "morado", 0, 4);
        circulo.imprime();
        circulo.area();

        Figura circulo1 = new Circulo("circulo", "gris", 0, 7);

        cast(circulo1);


    }

    static void cast(Figura item){
        if (!(item instanceof Circulo)) {
            Circulo c = (Circulo) item;
        }
    }
}
