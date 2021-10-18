package Herencia;

public class Cuadrado extends Figura {

    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color, lado);
    }

    public void pintar(){

    }

    @Override
    public void area() {
        double area = base*base;
        System.out.print("El area del cuadrado es: "+area);
    }
}
