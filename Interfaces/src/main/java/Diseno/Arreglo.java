package Diseno;
import java.io.*;

public class Arreglo extends Ordenamientos {
    public int [] array;
    public File archivo;

    public Arreglo(String fichero, int indice) {
        array = new int[indice];
        archivo = new File(fichero);
    }

    public int getArray(int index) {
        return array[index];
    }

    public void crearArchivo() {
        try {
            archivo.createNewFile();
        }catch(IOException ioe) {
            System.err.println("Error, no se pudo crear el archivo: "+ioe);
        }
    }

    public void readFile(String cadena) {
        try{
            if (!archivo.exists())
                crearArchivo();
            FileOutputStream fos = new FileOutputStream(archivo, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
            BufferedWriter buffw = new BufferedWriter(osw);
            buffw.write(cadena+"\r\n");
            buffw.close();
        }catch(IOException e){}
    }

    public void CreaNumeros(){
        archivo = new File("Numeros200000.txt");
        String numS;
        int num;
        for(int con = 0;con<200000;con++){
            num = (int) (Math.random()*1000+1);
            numS = Integer.toString(num);
            readFile(Integer.toString(con));
            //System.out.println(con);
        }
    }

    public Arreglo cargar(Arreglo arreglo) {
        String aux;
        int dato;
        try {
            if (!archivo.exists()) {
                System.out.println("No existe el archivo");
                return arreglo;
            }
            FileReader fr = new FileReader(archivo);
            BufferedReader buff = new BufferedReader(fr);

            int i = 0;
            aux = buff.readLine();
            while (aux != null) {
                //System.out.println(aux);
//                dato = Integer.parseInt(aux);
//                array[i] = dato;
                array[i] = Integer.parseInt(aux);
                aux = buff.readLine();
                i++;
            }
        }catch (IOException ioe) {
            System.err.println("No existe el archivo: " + ioe);
        }
        return arreglo;
    }
}
