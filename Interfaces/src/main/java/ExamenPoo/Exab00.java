package ExamenPoo;

public class Exab00 implements Runnable {
    public final int LIMIT = 10000;
    int arreglo[] = new int[(int) LIMIT], menor, mayor;

    public Exab00(String name, int men, int may){
        Thread hilo = new Thread(this, name);
        for (int i = 0; i < LIMIT; i++){
            arreglo[i] = (int) (Math.random() * 1001);
        }
        menor = men;
        mayor = may;
        hilo.start();
    }

    public void run() {
        long count = 0;
        for (int i = 0; i < LIMIT; i++){
            try {
                Thread.sleep(2);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            if (arreglo[i] >= menor && arreglo[i] <= mayor){
                count++;
            }
        }
        System.out.println("Hay "+count+" numeros en el hilo "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" finalizado");
    }
}