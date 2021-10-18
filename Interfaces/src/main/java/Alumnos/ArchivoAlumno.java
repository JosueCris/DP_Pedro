package Alumnos;

/*
Imprimir el nombre de los alumnos que estudien informatica.
Un metodo que indique el nombre(s) del(os) alumno(s) con mayor promedio
Un metodo que me obtenga el promedio de los alumnos de la carrera que le pases
como parametro
Un metodo que indique cuantos alumnos han reprobado (Calif <6)
*
* @author Pedro Díaz Abascal

*/
import java.io.*;

public class ArchivoAlumno {

    public File f;

    public ArchivoAlumno(String xnom){
        f = new File(xnom);
    }

    public void creaArch(){
        try{
            f.createNewFile();
        }catch(IOException e){}
    }

    public String obten(int inicio, String cadena){
        int c = 0;
        String cade = "";
        for(int i=0; i<cadena.length();i++){
            if (cadena.charAt(i)=='|' ) c++;
            if (inicio==c && cadena.charAt(i)!='|')
                cade += cadena.charAt(i);
            if (inicio<c) break;
        }
        return cade;
    }

    public void alumCarr(String xcarr){
        String aux,mat,nom,tel,carr;
        double prom;
        try{
            if (!f.exists()){
                System.out.println("No existe el archivo");
                return;
            }
            FileReader r = new FileReader(f);
            BufferedReader br = new BufferedReader(r);
            while(true){
                aux=br.readLine();
                if (aux==null) break;
                if (obten(3,aux).equals(xcarr)) System.out.println(obten(1,aux));
            }
        }catch(IOException e){System.out.println("No existe el archivo");}
    }

    public void grabaArch(String cadena){
        try{
            if (!f.exists()) creaArch();
            FileOutputStream fos = new FileOutputStream(f,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(cadena+"\r\n");//escribimos en el archivo alt-92
            bw.close();
        }catch(IOException e){}
    }
}