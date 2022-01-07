package Examen;/*
 *
 *
 * @author Josue Cristofer Tellez Huerta
 */
import java.io.*;
import java.util.ArrayList;

public class JosueB {

    public static void main(String[] args) {
        try {
            File file = new File("Numeros100.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader buff = new BufferedReader(fileReader);

            String number = buff.readLine();
            Tree root = new Tree(Integer.parseInt(number));

            ArrayList<String> arrayList = new ArrayList<>();
            
            while (number != null) {
                arrayList.add(number);
                number = buff.readLine();
            }
            for (String item : arrayList) {
                if (root == null) {
                    root = new Tree(Integer.parseInt(item));
                }
                else {
                    root.add(Integer.parseInt(item));
                }
            }

            root.inOrden();
            String exists = root.search(54) ? "Exist" : "Don't exist";
            System.out.println(exists);
            root.small();

            buff.close();
            fileReader.close();

        } catch (IOException ioe) {
            System.out.println("SINTAX ERROR :(");
        }
    }
}

