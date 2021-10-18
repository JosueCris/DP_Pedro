/*
Agregar al arbol:
1.- El metodo guarda guardar en el archivo Datos.txt Guardarlo en PreOrden
//2.- Un metodo que retorne la altura del arbol
//3.- Un metodo para dar de baja el dato que solicite. Si no se encuntra poner el letrero de no Existe
*/
package Diseno;

import java.io.*;

public class Arbol {
    private int dato;
    private Arbol izq;
    private Arbol der;
    public File archivo;

    public Arbol(int valor) {
        this.dato = valor;
        this.izq = null;
        this.der = null;
        archivo = new File("Datos.txt");
    }

    public void add(int valor) {
        if (valor < this.dato) {
            if (izq == null)
                izq = new Arbol(valor);
            else
                izq.add(valor);
        }
        else {
            if (der == null)
                der = new Arbol(valor);
            else
                der.add(valor);
        }
    }

    public void preOrden() {
        System.out.print(dato+" -> ");
        if(izq != null)
            izq.preOrden();
        if(der != null)
            der.preOrden();
    }

    public void inOrden() {
        if(izq != null)
            izq.inOrden();
        System.out.print(dato+" -> ");
        if(der != null)
            der.inOrden();
    }

    public boolean buscar(int valor){
        Arbol aux = this;
        if (aux == null) {
            return false;
        }
        else
        if(valor == aux.dato) {
            return  true;
        }
        else
        if (valor < aux.dato) {
            return izq.buscar(valor);
        }
        else {
            return der.buscar(valor);
        }
    }

    int maxima(int izq, int der){
        if (der>izq)
            return der;
        else
            return izq;
    }

    public int altura(Arbol raiz) {
        if(raiz == null)
            return 0;
        if(raiz.izq == null && raiz.der == null)
            return 1;
        else
            return 1+maxima(altura(raiz.izq), altura(raiz.der));
    }

    public Arbol masIzquierda() {
        if(this == null)
            return null;
        if(this.izq == null)
            return this;
        return izq.masIzquierda();
    }

    public Arbol masDerecha() {
        if(this == null)
            return null;
        if(this.der == null)
            return this;
        return der.masDerecha();
    }

    public Arbol delete(int valor) {
        Arbol temp = this;
        if (valor < this.dato) {
            this.izq = this.izq.delete(valor);        }
        else
            if (valor > this.dato) {
                this.der = this.der.delete(valor);
            }
            else {
                if (this.izq != null && this.der != null) {
                    Arbol aux = this;
                    Arbol masIzq = this.izq.masIzquierda();
                    this.dato = masIzq.dato;
                    aux.izq = temp.izq.delete(masIzq.dato);
                }
                else
                    if (this.izq != null) {
                        temp = this.izq;
                    }
                    else
                        if (this.der != null) {
                            temp = this.der;
                        }
                        else {
                            temp = null;
                        }
            }
            return temp;
    }

//    public boolean borrar(int valor) {
//        Arbol aux = this, p;
//        if(this == null)
//            return false;
//        if(valor < this.dato)
//            return izq.borrar(valor);
//        if(valor > aux.dato)
//            return der.borrar(valor);
//        if(aux.izq == null)
//		this = aux.der;
//	    else
//            if(aux.der == null)
//			    this = aux.izq;
//		    else
//            {
//                p = masDerecha();
//			    this = p;
//                p = p.izq;
//                this.izq = aux.izq;
//                this.der = aux.der;
//            }
//        aux = null;
//        return true;
//    }

    public void crearArchivo() {
        try {
            archivo.createNewFile();
        }catch(IOException ioe) {
            System.err.println("Error, no se pudo crear el archivo: "+ioe);
        }
    }

    public Arbol carga(Arbol raiz) {
        String aux;
        int dato;
        try {
            if (!archivo.exists()) {
                System.out.println("No existe el archivo");
                return raiz;
            }
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            aux = bufferedReader.readLine();
            while (aux != null) {
                System.out.println(aux);
                dato = Integer.parseInt(aux);
                if (raiz == null)
                    raiz = new Arbol(dato);
                else
                    raiz.add(dato);
                aux = bufferedReader.readLine();
            }
        }catch (IOException ioe) {
            System.err.println("No existe el archivo: " + ioe);
        }
        return raiz;
    }

    public void guarda(int valor) {
        try {
            if (!archivo.exists())
                crearArchivo();

            FileOutputStream fos = new FileOutputStream(archivo, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");

            BufferedWriter bw = new BufferedWriter(osw);

            bw.write(valor+"\r\n");
            bw.close();
        }catch (IOException ioe) {
            System.err.println("No existe el archivo");
        }
    }
}
