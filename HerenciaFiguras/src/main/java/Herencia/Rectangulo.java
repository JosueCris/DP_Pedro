package Herencia;

public class Rectangulo extends Figura{
    public double altura;

    public Rectangulo(String nombre, String color, double base, double altura) {
        super(nombre, color, base);
        this.altura = altura;
    }

    @Override
    public void area() {
        double area = base*altura;
        System.out.print("El area del rectangulo es: "+area);
    }

    @Override
    public void imprime() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
    }
}
