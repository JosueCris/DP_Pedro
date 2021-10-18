package Diseno;

import java.util.Scanner;

public class ListTest {

    public static void main(String[] args) {
        int option = 9, item;
        List start = null;
        Scanner sc = new Scanner(System.in);
        while(option != 0) {
            try {
                System.out.print("Selected your option:\n\t[1]: Ups\n\t[2]: Downs\n\t[3]: Top\n\t[4]: Print\n\t[5]: Search\n\t[0]: Exit\n> ");
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("\nInsert your number in the list:\n> ");
                        item = sc.nextInt();
                        if (start == null){
                            start = new List(item);
                        }
                        else
                        if (item < start.data)
                            start = start.add(item);
                        start.add(item);
                        break;
                    case 2:
                        System.out.print("\nInsert the item to delete:\n> ");
                        item = sc.nextInt();
                        if(item == start.data)
                            start = start.next;
                        else
                        start.delete(item);
                        break;
                    case 3:
                         System.out.println("\nThe item first of the list is: " + start.data + "\n");
                        break;
                    case 4:
                        System.out.println("\nItems of the list:");
                        start.print();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("\nInsert your item to search:");
                        item = sc.nextInt();
                        if (item != start.search(item))
                            System.out.println("\nItem not found!!!\n");
                        else
                            System.out.println("\nFound Item: "+start.search(item)+"!!!\n");
                        break;
                    case 0:
                        System.out.println("\nThank You :D!!!");
                        return;
                    default:
                        System.out.println("\nTry Again!!!");
                        break;
                }
            }catch(NullPointerException npe) {
                System.out.println("\nList Underflow!!!");
                start = null;
            }
        }
    }
}
