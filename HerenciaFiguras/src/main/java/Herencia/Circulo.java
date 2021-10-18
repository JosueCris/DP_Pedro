package Herencia;

public class Circulo extends Figura {
    public double radio;
    public Circulo(String nombre, String color, double base, double radio) {
        super(nombre, color, base);
        this.radio = radio;
    }

    @Override
    public void area() {
        double area = 3.1416*(radio*radio);
        System.out.print("El area del circulo es: "+area);
    }
}
