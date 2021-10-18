package Ejercicios;

public class Metodos {
    int N1;
    int N2;
    int N3;

    public Metodos(int N1, int N2, int N3){
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
    }

    public void mayor(Metodos box){
        if (N1>N2 && N1>N3)
            System.out.println("El numero mayor es: "+N1);
        else {
            if (N2>N1 && N2>N3)
                System.out.println("El numero mayor es: "+N2);
            else {
                if (N3>N1 && N3>N2)
                    System.out.println("El numero mayor es: "+N3);
            }
        }
    }

    public void ParImpar(int N){
        if (N %2 == 0)
            System.out.println("Es PAR");
        else
            System.out.println("Es IMPAR");
    }

    public void ordenar(Metodos box) {
        if (N1>N2 && N2>N3)
            System.out.print("Orden: "+N1+" -> "+N2+" -> "+N3);
        else {
            if (N1>N3 && N3>N2)
                System.out.print("Orden: "+N1+" -> "+N3+" -> "+N2);
            else {
                if (N2>N1 && N1>N3) // 2 -> 1 -> 3
                    System.out.print("Orden: "+N2+" -> "+N1+" -> "+N3);
                else {
                    if (N2>N3 && N3>N1)
                        System.out.print("Orden: "+N2+" -> "+N3+" -> "+N1);
                    else {
                        if (N3>N1 && N1>N2)
                            System.out.print("Orden: "+N3+" -> "+N1+" -> "+N2);
                        else
                            System.out.print("Orden: "+N3+" -> "+N2+" -> "+N1);
                    }
                }
            }
        }
    }
}
