package Herencia;

public abstract class Figura {
    public String nombre;
    public String color;
    public double base;


    public Figura(String nombre, String color, double base) {
        this.nombre = nombre;
        this.color = color;
        this.base = base;
    }

    public void imprime(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Lado: "+base);
    }

    public abstract void area();
}
