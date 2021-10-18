package poo2;

/*
    @autor: Vega Martinez Cristian -> S18021147
*/

public class CristianSec implements Runnable {
    public final long LIMITE = 100000;
    long password;

    CristianSec(long contrasenia){
        Thread BusSec = new Thread(this, "Busqueda secuencial");
        password = contrasenia;
        BusSec.start();
    }

    public void run (){
        for (int i = 0; i <= LIMITE; i++){
            if (password == i){
                System.out.println(Thread.currentThread().getName()+" Finalizada: La contraseña "+password+" se encontro en el intento "+i);
                return;
            }
        }
        System.out.println(Thread.currentThread().getName()+" Finalizada: Ninguna contraseña generada fue correcta");
    }
}