package poo2;

/*
    @autor: Vega Martinez Cristian -> S18021147
*/

public class CristianRan implements Runnable {
    long LIMITE = 100000;
    long password, passRan;

    CristianRan(long pass){
        Thread BusRan = new Thread( this, "Busqueda Random");
        password = pass;
        BusRan.start();
    }

    public void run (){
        int intent = 0;
        do {
            passRan = (long) (Math.random() * 100000);
            if (passRan == password){
                System.out.println(Thread.currentThread().getName()+" Finalizada: La contraseña "+password+" se encontro en el intento "+intent);
                return;
            }else {
                intent++;
            }
        }while ((passRan != password) && (intent < LIMITE));
        System.out.println(Thread.currentThread().getName()+" Finalizada: Ninguna contraseña generada fue correcta");
    }
}