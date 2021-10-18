package Diseno;

import java.util.Scanner;

public class TreeTest {

    public static void main(String[] args) {
        int option = 9, number = 0;
        Scanner sc = new Scanner(System.in);
        Tree root = null;

        while(option != 0) {
            try {
                System.out.print("Selected your option:\n\t[1]: Insert\n\t[2]: Pre-Orden\n\t[3]: In-Orden\n\t[4]: Post-Orden\n\t[5]: Tell\n\t[6]: Delete\n\t[7]: Higher\n\t[8]: Search\n\t[9]: Family\n\t[0]: Exit\n> ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("\nInsert your item in the tree: \n> ");
                        number = sc.nextInt();
                        if(root == null)
                            root = new Tree(number);
                        else
                            root.add(number);
                        break;
                    case 2:
                        System.out.println("\nItems of the tree:");
                        root.preOrden();
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("\nItems of the tree:");
                        root.inOrden();
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("\nItems of the tree:");
                        root.postOrden();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Roots: "+root.tell()+"\n");
                        break;
//                    case 6:
//                        start.delete();
//                        System.out.println("\nThe item was deleted\n");
//                        break;
                    case 7:
                        System.out.println("Higher root: "+root.higherNode()+"\n");
                        break;
                    case 8:
                        try {
                            System.out.print("\nInsert your item to search: \n> ");
                            number = sc.nextInt();
                            if (root.search(number))
                                System.out.println("\nFound item!!!\n");
                            else
                                System.out.println("\nItem wasn't founded!!!\n");
                        } catch (NullPointerException npe) {
                            System.out.println("\nThe root wasn't founded!!!\n");
                            root = null;
                        }
                        break;
                    case 9:
                        System.out.println("\nInsert your item to search the family: \n> ");
                        number = sc.nextInt();
                        root.FatherAndSon(number);
                        break;
                    case 0:
                        System.out.println("\nThank You!!!\n");
                        return;
                    default:
                        System.out.println("\nTry Again!!!\n");
                        break;
                }
            } catch (NullPointerException npe){
                 System.out.println("\nTree Underflow!!!\n");
                 root = null;
             }
        }
    }
}
