package Diseno;

public class NodoCola {
    public int dato;
    public NodoCola next;

    public NodoCola(int xdato){
        dato = xdato;
        next = null;
    }

    public NodoCola add(int xdato){
        NodoCola atras = this;
        NodoCola aux = atras;
        aux = new NodoCola(xdato);
        atras.next = aux;
        return aux;
    }

    public int top(){
        return dato;
    }

    public NodoCola delete(){
        return this.next;
    }

    public void imprime(){
        System.out.print(dato+" -> ");
        if (next==null)
            return;
        next.imprime();
    }

}