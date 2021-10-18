package ClasesPedro;

// Crear un metodo que regrese el numero mayor
public class Pedro1 {
    int n1;
    int n2;
    int n3;

// CONSTRUCTOR DE LA CLASE PEDRO1
    public Pedro1(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

// METODO PARA EL NUMERO MAYOR
    public void numMayor(Pedro1 peter){
        if(n1>n2 && n1>n3) {
            System.out.println("El numero mayor es: "+n1);
        }
        else {
            if (n2>n1 && n2>n3) {
                System.out.println("El numero mayor es: " + n2);
            } else {
                if (n3>n1 && n3>n2)
                {
                    System.out.println("El numero mayor es: "+n3);
                }
            }
        }
    }
// METODO PARA EL NUMERO SI ES PAR O IMPAR
    public void numParImpar(int numero) {
        if (numero %2 == 0)
            System.out.println("El " +numero+ " es un numero PAR");
        else
            System.out.println("El " +numero+ " es un numero IMPAR");
    }

// METODO PARA EL ORDENAMIENTO DE LOS NUMEROS
    public void ordenar(Pedro1 peter) {
        if (n1 > n2 && n2 > n3) {
            System.out.print("Orden: " + n1 + " -> " + n2 + " -> " + n3);
        } else {
            if (n1 > n3 && n3 > n2) {
                System.out.print("Orden: " + n1 + " -> " + n3 + " -> " + n2);
            } else {
                if (n2 > n1 && n1 > n3) {
                    System.out.print("Orden: " + n2 + " -> " + n1 + " -> " + n3);
                } else {
                    if (n2 > n3 && n3 > n1) {
                        System.out.print("Orden: " + n2 + " -> " + n3 + " -> " + n1);
                    } else {
                        if (n3 > n2 && n2 > n1) {
                            System.out.print("Orden: " + n3 + " -> " + n2 + " -> " + n1);
                        } else {
                            System.out.print("Orden: " + n3 + " -> " + n1 + " -> " + n2);
                        }

                    }
                }
            }
        }
    }
}