package Diseno;

import java.io.*;
import java.lang.NumberFormatException;

public class Archivos {
    private File archivo;

    public Archivos(String fichero) {
        archivo = new File(fichero);
    }

    public void crearArchivo() {
        try {
            archivo.createNewFile();
        }catch (IOException ioe) {
            System.err.println("Error, no se pudo crear el archivo: "+ioe);
        }
    }

    public String obten(int inicio, String cadena) {
        int c = 0;
        String cade = "";
        for(int i=0; i<cadena.length(); i++) {
            if (cadena.charAt(i) == '|')
                c++;
            if (inicio == c && cadena.charAt(i) != '|')
                cade += cadena.charAt(i);
            if (inicio < c)
                break;
        }
        return cade;
    }

    public void escribirArchivo(String cadena) {
        try {
            if (!archivo.exists())
                crearArchivo();

            FileOutputStream fos = new FileOutputStream(archivo, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");

            BufferedWriter bw = new BufferedWriter(osw);

            bw.write(cadena+"\r\n");
            bw.close();
        }catch (IOException ioe) {
            System.err.println("No existe el archivo");
        }
    }

    public void leerArchivo()
    {
        String aux, matricula, nombre, telefono, carrera;
        double promedio;
        try {
            if (!archivo.exists()) {
                System.out.println("No existe el archivo");
                return;
            }
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            aux = bufferedReader.readLine();
            while (aux != null) {
//                aux = bufferedReader.readLine();
//                if (aux == null)
//                    break;
                System.out.println(aux);
                matricula = obten(0, aux);
                nombre = obten(1, aux);
                telefono = obten(2, aux);
                carrera = obten(3, aux);
                promedio = Double.parseDouble(obten(4, aux));
                System.out.println("Matricula: " + matricula);
                System.out.println("Nombre: " + nombre);
                System.out.println("Telefono: " + telefono);
                System.out.println("Carrera: " + carrera);
                System.out.println("Promedio: " + promedio);
                System.out.println("--------------------------------------");
                aux = bufferedReader.readLine();
            }
        }catch (NumberFormatException nfe) {
            System.out.println("Error, no se pudo convertir: "+nfe);
        }catch (IOException ioe) {
            System.err.println("No existe el archivo: "+ioe);
        }
    }

    public void promedio() {
        String aux;
        double promedio, total = 0.0;
        int count = 0;
        try {
            if (!archivo.exists()) {
                System.out.println("No existe el archivo");
                return;
            }
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            aux = bufferedReader.readLine();
            while (aux != null) {
                promedio = Double.parseDouble(obten(4, aux));
                total += promedio;
                count++;
                aux = bufferedReader.readLine();
            }
            System.out.println("El promedio general de los alumnos es: "+(total/count));
        }catch (IOException ioe) {
            System.err.println("No existe el archivo: "+ioe);
        }
    }
}
