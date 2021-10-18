package Diseno;

import java.util.Scanner;

public class QueueTest {

    public static void main(String[] args) {
        int option, number;
        Scanner sc = new Scanner(System.in);
        Queue start = new Queue();

        try {
            do {
                System.out.print("Selected your option:\n\t[1]: Insert\n\t[2]: Print\n\t[3]: Tell\n\t[4]: Delete\n\t[0]: Exit\n> ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("\nInsert your item in the queue: \n> ");
                        number = sc.nextInt();
                        start.insert(number);
                        break;
                    case 2:
                        System.out.println("\nItems of the queue:\n");
                        System.out.println(start.toString());
                        break;
                    case 3:
                        System.out.println(start.tell()+"\n");
                        break;
                    case 4:
                        start.delete();
                        System.out.println("\nThe item was deleted\n");
                        break;
                    case 0:
                        System.out.println("\nThank You!!!\n");
                        return;
                    default:
                        System.out.println("\nTry Again!!!\n");
                        break;
                }
            }while(option != 0);
        } catch (NullPointerException npe){
            System.out.println("SINTAX ERROR!!!");
        }
    }
}
