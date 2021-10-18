package Alumnos;

import java.io.*;

public class Files {
    File file;

    public void createFile() {
        try {
            file = new File("chapters.txt");
            if (file.createNewFile())
                System.out.println("Created new file!!!");
        } catch(IOException ioe) {
            System.out.println("Don't created file :(");
        }
    }

    public void TextWrite() {
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("737");
            fw.write("\nGrilled");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("Can't writer in this file :(");
        }
    }

    public void addText() {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("\nOver");
            fw.write("\nMandala");
            fw.write("\nPhoenix");
            fw.write("\nABQ");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("Can't writer in this file :(");
        }
    }

    public void TextRead() {
        String cadena;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader buff = new BufferedReader(fr);

            cadena = buff.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                cadena = buff.readLine();
            }

        } catch (FileNotFoundException fnfe) {
            System.err.println("Can't reader this file :(");
        } catch (IOException e) {
            System.err.println("Can't reader this file :(");
        }
    }
//    public void createDirectory() {
//        file = new File("TestFolder");
//        if (file.mkdir())
//            System.out.println("Created new directory!!!");
//        else
//            System.err.println("Don't created file :(");
//    }
}
