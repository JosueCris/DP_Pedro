package Alumnos;

import java.io.*;

public class BinaryFiles {

    public void BinaryWrite() {
        try {
            FileOutputStream fos = new FileOutputStream("peoples.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            People people1 = new People("Josue", 21);
            People people2 = new People("Cristian", 22);
            People people3 = new People("Oscar", 24);

            oos.writeObject(people1);
            oos.writeObject(people2);
            oos.writeObject(people3);

            oos.close();

        } catch (FileNotFoundException fnfe) {
            System.err.println("Don't create file");
        } catch (IOException ioe) {
            System.err.println("Don't create file");
        }

    }
}
